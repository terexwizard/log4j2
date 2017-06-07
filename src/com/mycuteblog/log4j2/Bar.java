/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycuteblog.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author j.sathit
 * @create 06/06/2017
 * @modify 06/06/2017
 */
public class Bar {
    static final Logger logger = LogManager.getLogger(Bar.class.getName());
 
    public boolean doIt() {
      logger.entry();
      logger.error("Did it again!");
      return logger.exit(false);
    }
}
