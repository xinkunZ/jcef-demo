package com.demo;


import com.google.common.collect.Lists;
import com.jetbrains.cef.JCefAppConfig;
import org.cef.CefApp;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefRendering;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangxinkun
 */
public class Test {

    public static void main(String[] args) {
        final JCefAppConfig instance = JCefAppConfig.getInstance();
        final String[] appArgs = instance.getAppArgs();

        final List<String> allArgs = Lists.newArrayList();
        allArgs.addAll(Arrays.asList(appArgs));
        allArgs.addAll(Arrays.asList(args));

        final String[] array = allArgs.toArray(String[]::new);
        CefApp.startup(array);
        final CefApp app = CefApp.getInstance(array, instance.getCefSettings());

        String url = "http://172.31.238.181";
        final CefBrowser browser = app.createClient().createBrowser(url, CefRendering.DEFAULT, false);
        JFrame frame = new JFrame();
        frame.getContentPane().add(browser.getUIComponent(), BorderLayout.CENTER);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                app.dispose();
                frame.dispose();
            }
        });

        frame.setTitle("demo");
        frame.setSize(1000, 600);
        frame.setVisible(true);
    }

}
