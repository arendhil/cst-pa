/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicamp.cst.util.viewer;

import br.unicamp.cst.core.entities.Codelet;
import br.unicamp.cst.core.entities.Memory;
import br.unicamp.cst.core.entities.MemoryContainer;
import br.unicamp.cst.core.entities.MemoryObject;
import br.unicamp.cst.core.entities.Mind;
import br.unicamp.cst.util.CodeletTrackInfo;
import br.unicamp.cst.util.InterfaceAdapter;
import br.unicamp.cst.util.TestCodelet;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import org.junit.Test;

/**
 *
 * @author rgudwin
 */
public class AnalysisPanelTest {
    
    Gson gson = new GsonBuilder().registerTypeAdapter(Memory.class, new InterfaceAdapter<MemoryObject>())
                                 .registerTypeAdapter(Memory.class, new InterfaceAdapter<MemoryContainer>())
                             .create();
    
    @Test
    public void testAnalysisPanel() {

        //Type CODELET_TYPE = new TypeToken<List<Codelet>>() { }.getType();
        JsonReader reader = null; 
        try {
            reader = new JsonReader(new FileReader("tests/Codelet2_track.json"));
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        CodeletTrackInfo[] data = gson.fromJson(reader, CodeletTrackInfo[].class); // contains the whole reviews list
        ArrayList<Codelet> codelets = new ArrayList<Codelet>(); 
        for (CodeletTrackInfo c : data) {
            System.out.println(c.codeletClass);
            try {
               Class<?> cc = Class.forName(c.codeletClass);
               Constructor<?> cons = cc.getConstructor(String.class);
               Object object = cons.newInstance("MyAttributeValue");
               codelets.add((Codelet)object);
            } catch(Exception e) {
                e.printStackTrace();
            }   
        }
        JFrame mvp = new JFrame();
            
        Mind m = createMind();
        //for (Codelet c : codelets )
        //    m.insertCodelet(c);
        AnalysisPanel ap = new AnalysisPanel(m.getCodeRack().getAllCodelets());
        JFrame testFrame = new JFrame();
        testFrame.add(ap);
        testFrame.setVisible(true);
        //DiscoverEventsToRobot der = new DiscoverEventsToRobot("rob");
        Robot rob=null;
        try
        {
            rob = new Robot();
        }
        catch (AWTException ex)
        {
            System.err.println("Can't start Robot: " + ex);
            System.exit(0);
        }
        rob.delay(60000);         //delay to let the application load
        rob.setAutoDelay(20);    // set delay that happens after every command
        //movements(rob);          // This movements are automatically generated by the DiscoverEventsToRobot
    }
    
    Mind createMind() {
        Mind m = new Mind();
        MemoryObject m1 = m.createMemoryObject("M1", 0.12);
        MemoryObject m2 = m.createMemoryObject("M2", 0.32);
        MemoryObject m3 = m.createMemoryObject("M3", 0.44);
        MemoryObject m4 = m.createMemoryObject("M4", 0.52);
        MemoryObject m5 = m.createMemoryObject("M5", 0.12);
        MemoryContainer m6 = m.createMemoryContainer("C1");
        MemoryContainer m7 = m.createMemoryContainer("C2");
        m7.setI(0.55, 0.23);
        m6.setI(0.33, 0.22);
        m6.setI(0.12, 0.13);
        m6.setI(m7);
        Codelet c = new TestCodelet("Codelet 1");
        c.addInput(m1);
        c.addInput(m2);
        c.addOutput(m3);
        c.addOutput(m4);
        c.addBroadcast(m5);
        m.insertCodelet(c);
        Codelet c2 = new TestCodelet("Codelet 2");
        c2.addInput(m4);
        c2.addInput(m5);
        c2.addOutput(m6);
        c2.addOutput(m3);
        c2.addBroadcast(m5);
        m.insertCodelet(c2);
        return(m);
    }
    
}
