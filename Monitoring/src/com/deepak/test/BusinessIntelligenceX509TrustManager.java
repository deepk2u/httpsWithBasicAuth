package com.deepak.test;

import javax.net.ssl.X509TrustManager;

public class BusinessIntelligenceX509TrustManager implements X509TrustManager {

    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
        // no-op
    }

    public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
        // no-op
    }
}
