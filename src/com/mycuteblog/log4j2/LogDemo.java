/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycuteblog.log4j2;

import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

/**
 *
 * @author terex
 */
public class LogDemo {
    
    private static final Logger logger = LogManager.getLogger(LogDemo.class);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here                
        
//        System.setProperty("log4j.configurationFile", "resources/log4j2_conf.xml");
//        <context-param>
//            <param-name>log4jConfiguration</param-name>
//            <param-value>log4j2.xml</param-value>
//        </context-param>
        
        LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
        File file = new File("D:\\workspace_git\\log4j2\\log4j2.xml");
        context.setConfigLocation(file.toURI());
        
        int i=0;
        while(i <2000){
            i++;
            
            logger.debug("Hello world- debug log");
            logger.info("Hello world - info log");
            logger.warn("Hello world - warn log");
            logger.error("Hello world - error log");
            
        }
        
        
        
        
        LogManager.shutdown();
    }
    
}
