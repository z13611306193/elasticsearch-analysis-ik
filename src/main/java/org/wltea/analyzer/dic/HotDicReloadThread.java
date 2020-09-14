package org.wltea.analyzer.dic;

import org.wltea.analyzer.help.ESPluginLoggerFactory;

public class HotDicReloadThread implements Runnable{

    private static final org.apache.logging.log4j.Logger logger = ESPluginLoggerFactory.getLogger(Dictionary.class.getName());

    @Override
    public void run() {

        while (true){
            logger.info("-------重新加载mysql词典--------");

            Dictionary.getSingleton().reLoadMainDict();
        }

    }
}
