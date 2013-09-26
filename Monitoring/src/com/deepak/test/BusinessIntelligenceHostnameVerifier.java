package com.deepak.test;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class BusinessIntelligenceHostnameVerifier implements HostnameVerifier {

    public boolean verify(String arg0, SSLSession arg1) {
        return true;
    }
}
