package com.demo;


import com.jetbrains.cef.JCefAppConfig;
import org.cef.CefApp;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefRendering;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author zhangxinkun
 */
public class Test {

    public static void main(String[] args)  {
//        -Djava.library.path="C:\Users\zhang\AppData\Local\Temp\journey-78"
//        JourneyBrowserView browser = new JourneyBrowserView("https://google.com");
        final JCefAppConfig instance = JCefAppConfig.getInstance();
        final CefApp app = CefApp.getInstance(instance.getAppArgs(),instance.getCefSettings());
//        "http://172.31.239.153"
        String url="https://www.apple.com";
        final CefBrowser browser = app.createClient().createBrowser(url, CefRendering.DEFAULT, false);
        JFrame frame = new JFrame();
        frame.getContentPane().add(browser.getUIComponent(),BorderLayout.CENTER);
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
