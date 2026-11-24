package com.huawei.agconnect.config.impl;

import android.gov.nist.core.Separators;
import com.huawei.agconnect.AGCRoutePolicy;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Utils {
    public static String a(String str) {
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        return Separators.SLASH.concat(str.substring(i));
    }

    public static AGCRoutePolicy b(String str, String str2) {
        AGCRoutePolicy aGCRoutePolicy = AGCRoutePolicy.c;
        AGCRoutePolicy aGCRoutePolicy2 = AGCRoutePolicy.d;
        AGCRoutePolicy aGCRoutePolicy3 = AGCRoutePolicy.e;
        AGCRoutePolicy aGCRoutePolicy4 = AGCRoutePolicy.f;
        AGCRoutePolicy aGCRoutePolicy5 = AGCRoutePolicy.b;
        if (str == null) {
            if (str2 != null) {
                if (str2.contains("connect-drcn")) {
                    return aGCRoutePolicy;
                }
                if (str2.contains("connect-dre")) {
                    return aGCRoutePolicy2;
                }
                if (str2.contains("connect-drru")) {
                    return aGCRoutePolicy3;
                }
                if (str2.contains("connect-dra")) {
                    return aGCRoutePolicy4;
                }
            }
            return aGCRoutePolicy5;
        }
        switch (str) {
            case "CN":
                return aGCRoutePolicy;
            case "DE":
                return aGCRoutePolicy2;
            case "RU":
                return aGCRoutePolicy3;
            case "SG":
                return aGCRoutePolicy4;
            default:
                return aGCRoutePolicy5;
        }
    }

    public static String c(InputStream inputStream) throws IOException {
        StringWriter stringWriter = new StringWriter();
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream, "UTF-8");
        char[] cArr = new char[4096];
        while (true) {
            int i = inputStreamReader.read(cArr);
            if (-1 == i) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, i);
        }
    }
}
