package org.apache.catalina.startup;

import org.apache.catalina.Globals;

public class BootStartTs {
    
    
    public static void main(String[] args) {
        System.setProperty(Globals.CATALINA_HOME_PROP, System.getProperty("user.dir"));
        Bootstrap b = new Bootstrap();
        b.main(args);
    }

}
