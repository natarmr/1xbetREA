package com.appsflyer.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class AFa1nSDK extends HashMap<Integer, String> {
    private static AFa1nSDK d;
    private final Object AFKeystoreWrapper = new Object();

    private AFa1nSDK() {
    }

    public static synchronized AFa1nSDK afErrorLog() {
        AFa1nSDK aFa1nSDK;
        aFa1nSDK = d;
        if (aFa1nSDK == null) {
            aFa1nSDK = new AFa1nSDK();
            d = aFa1nSDK;
        }
        return aFa1nSDK;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String put(Integer num, String str) {
        String str2;
        synchronized (this.AFKeystoreWrapper) {
            str2 = (String) super.put(num, str);
        }
        return str2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String remove(Object obj) {
        String str;
        synchronized (this.AFKeystoreWrapper) {
            str = (String) super.remove(obj);
        }
        return str;
    }

    @Override // java.util.HashMap, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.AFKeystoreWrapper) {
            zRemove = super.remove(obj, obj2);
        }
        return zRemove;
    }
}
