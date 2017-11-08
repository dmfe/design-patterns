package com.nc.despat.io;

import org.apache.log4j.Logger;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IoTest {
    private static final Logger log = Logger.getLogger(IoTest.class);

    public void run() {
        toLowerCaseTest();
    }

    private void toLowerCaseTest() {
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(IoTest.class.getClassLoader().getResourceAsStream("iotest.txt")));

            int c = 0;
            StringBuilder res = new StringBuilder();
            while ((c = in.read()) > 0) {
                System.out.print((char)c);
                res.append((char)c);
            }
            System.out.println();
            log.info("Result string red with LowerCaseInputStream: " + res);

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}