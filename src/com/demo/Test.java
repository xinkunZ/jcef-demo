package com.demo;

import org.cef.CefApp;
import org.cef.CefClient;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefRendering;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangxinkun
 */
public class Test {

    public static void main(String[] args) {
        List<String> mySwitches = new ArrayList<>();
        mySwitches.add("--persist-session-cookies=true");
        CefApp app = CefApp.getInstance(mySwitches.toArray(new String[mySwitches.size()]));
        CefClient client = app.createClient();
        CefBrowser browser = client.createBrowser("http://www.google.com", CefRendering.DEFAULT, false);

    }

}
