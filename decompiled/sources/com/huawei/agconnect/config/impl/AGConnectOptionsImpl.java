package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.AGCRoutePolicy;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.agconnect.JsonProcessingFactory;
import com.huawei.agconnect.config.ConfigReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AGConnectOptionsImpl implements AGConnectOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45678a;
    public final Context b;
    public final String c;
    public final AGCRoutePolicy d;
    public final ConfigReader e;
    public final DecryptExclamationMark f;
    public final HashMap g;
    public final ArrayList h;
    public final HashMap i = new HashMap();

    public AGConnectOptionsImpl(Context context, InputStream inputStream, HashMap map, ArrayList arrayList) {
        String str;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.b = context;
        String packageName = context.getPackageName();
        this.c = packageName;
        if (inputStream != null) {
            this.e = new InputStreamReader(inputStream, packageName);
            try {
                inputStream.close();
            } catch (IOException unused) {
                Log.e("Utils", "Exception when closing the 'Closeable'.");
            }
            str = "use InputStreamReader";
        } else {
            this.e = new SecurityResourcesReader(context, packageName);
            str = "use SecurityResourcesReader";
        }
        Log.i("AGConnectOptionsImpl", str);
        ConfigReader configReader = this.e;
        this.f = new DecryptExclamationMark(configReader);
        AGCRoutePolicy aGCRoutePolicyB = Utils.b(configReader.getString("/region", null), this.e.getString("/agcgw/url", null));
        Log.i("AGConnectOptionsImpl", "getRoutePolicyFromJson");
        this.d = aGCRoutePolicyB;
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(Utils.a((String) entry.getKey()), entry.getValue());
        }
        this.g = map2;
        this.h = arrayList;
        this.f45678a = String.valueOf(("{packageName='" + this.c + "', routePolicy=" + this.d + ", reader=" + this.e.toString().hashCode() + ", customConfigMap=" + new JSONObject(map2).toString().hashCode() + '}').hashCode());
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public final String a() {
        return this.f45678a;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public final AGCRoutePolicy b() {
        AGCRoutePolicy aGCRoutePolicy = this.d;
        return aGCRoutePolicy == null ? AGCRoutePolicy.b : aGCRoutePolicy;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public final Context getContext() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b A[RETURN] */
    @Override // com.huawei.agconnect.AGConnectOptions
    public final String getString(String str) {
        String str2;
        String string;
        String str3;
        if (str == null) {
            Log.w("AGConnectOptionsImpl", "getString path is null");
            return null;
        }
        String strA = Utils.a(str);
        String strA2 = (String) this.g.get(strA);
        if (strA2 != null) {
            str3 = "use customValue";
        } else {
            HashMap map = JsonProcessingFactory.f45676a;
            if (map.containsKey(strA)) {
                HashMap map2 = this.i;
                if (map2.containsKey(strA)) {
                    strA2 = (String) map2.get(strA);
                } else {
                    JsonProcessingFactory.JsonProcessor jsonProcessor = (JsonProcessingFactory.JsonProcessor) map.get(strA);
                    if (jsonProcessor == null) {
                        str2 = "processors is null: ";
                    } else {
                        strA2 = jsonProcessor.a(this);
                        map2.put(strA, strA2);
                    }
                }
                if (strA2 != null) {
                    string = this.e.getString(strA, null);
                    if (DecryptExclamationMark.b(string)) {
                        return this.f.c(string);
                    }
                    return string;
                }
                str3 = "use processValue";
            } else {
                str2 = "processors not containsKey: ";
            }
            Log.w("AGConnectOptionsImpl", str2.concat(strA));
            strA2 = null;
            if (strA2 != null) {
                string = this.e.getString(strA, null);
                if (DecryptExclamationMark.b(string)) {
                    return this.f.c(string);
                }
                return string;
            }
            str3 = "use processValue";
        }
        Log.i("AGConnectOptionsImpl", str3);
        return strA2;
    }
}
