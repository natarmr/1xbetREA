package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFd1oSDK {
    final String AFKeystoreWrapper;
    public final Map<String, String> AFLogger;
    public final String d;
    final boolean e;
    public boolean force;
    boolean i;
    final boolean registerClient;
    public final byte[] unregisterClient;
    public int v;
    public boolean w;

    private AFd1oSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z, byte b) {
        this.i = true;
        this.force = false;
        this.w = true;
        this.v = -1;
        this.d = str;
        this.unregisterClient = bArr;
        this.AFKeystoreWrapper = str2;
        this.AFLogger = map;
        this.registerClient = z;
        this.e = true;
    }

    public AFd1oSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z) {
        this(str, bArr, str2, map, z, (byte) 0);
    }

    public AFd1oSDK(String str, String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
