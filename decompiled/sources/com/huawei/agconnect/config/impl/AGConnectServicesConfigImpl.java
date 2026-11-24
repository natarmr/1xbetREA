package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.util.Log;
import com.huawei.agconnect.AGCRoutePolicy;
import com.huawei.agconnect.JsonProcessingFactory;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.agconnect.config.ConfigReader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class AGConnectServicesConfigImpl extends AGConnectServicesConfig {
    public final Context c;
    public final String d;
    public volatile ConfigReader e;
    public final Object f = new Object();
    public AGCRoutePolicy g = AGCRoutePolicy.b;
    public final HashMap h = new HashMap();
    public volatile DecryptExclamationMark i;

    public AGConnectServicesConfigImpl(Context context, String str) {
        this.c = context;
        this.d = str;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public final String a() {
        return "DEFAULT_INSTANCE";
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public final AGCRoutePolicy b() {
        AGCRoutePolicy aGCRoutePolicy = AGCRoutePolicy.b;
        Log.d("AGC_ConfigImpl", "getRoutePolicy");
        if (this.g == aGCRoutePolicy && this.e == null) {
            d();
        }
        return this.g;
    }

    public final void d() {
        Log.d("AGC_ConfigImpl", "initConfigReader");
        if (this.e == null) {
            synchronized (this.f) {
                try {
                    if (this.e == null) {
                        this.e = new SecurityResourcesReader(this.c, this.d);
                        this.i = new DecryptExclamationMark(this.e);
                    }
                    if (this.g == AGCRoutePolicy.b) {
                        if (this.e != null) {
                            this.g = Utils.b(((SecurityResourcesReader) this.e).getString("/region", null), ((SecurityResourcesReader) this.e).getString("/agcgw/url", null));
                        } else {
                            Log.w("AGConnectServiceConfig", "get route fail , config not ready");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public final Context getContext() {
        return this.c;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public final String getString(String str) {
        JsonProcessingFactory.JsonProcessor jsonProcessor;
        String str2;
        if (this.e == null) {
            d();
        }
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        String strConcat = Separators.SLASH.concat(str.substring(i));
        String strA = (String) this.h.get(strConcat);
        if (strA != null) {
            str2 = "use customValue";
        } else {
            HashMap map = JsonProcessingFactory.f45676a;
            strA = (map.containsKey(strConcat) && (jsonProcessor = (JsonProcessingFactory.JsonProcessor) map.get(strConcat)) != null) ? jsonProcessor.a(this) : null;
            if (strA == null) {
                String string = ((SecurityResourcesReader) this.e).getString(strConcat, null);
                return DecryptExclamationMark.b(string) ? this.i.c(string) : string;
            }
            str2 = "use processValue";
        }
        Log.i("AGC_ConfigImpl", str2);
        return strA;
    }
}
