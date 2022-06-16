package com.demo;

import org.cef.browser.CefBrowser;
import org.panda_lang.pandomium.Pandomium;
import org.panda_lang.pandomium.wrapper.PandomiumClient;

import javax.swing.*;
import java.awt.*;

/**
 * @author zhangxinkun
 */
public final class T {

    public static void main(String[] args) {
        // setting this option is paramount otherwise no cache is kept, and sesions are lost

        Pandomium pandomium = Pandomium.buildDefault();
        final CefBrowser cefBrowser = pandomium.createClient().loadURL("http://172.31.239.153");
        JFrame frame = new JFrame();
        frame.getContentPane().add(cefBrowser.getUIComponent(), BorderLayout.CENTER);
        frame.setTitle("Whatsapp");
        frame.setSize(1720, 840);
        frame.setVisible(true);
    }
}
