package com.sample;

import java.util.*;
import java.text.*;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
        	room room1 = new room("Manuel", 26.0);
        	room room2 = new room("José", 12.0);
        	room room3 = new room("Joaquim", 50.0);
        	
        	kSession.insert(room1);
        	kSession.insert(room2);
        	kSession.insert(room3);
        	
        	kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
