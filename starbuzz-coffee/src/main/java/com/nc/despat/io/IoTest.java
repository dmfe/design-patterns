package com.nc.despat.io;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

@Slf4j
public class IoTest {

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