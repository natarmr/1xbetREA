package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.config.ConfigReader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
class SecurityResourcesReader implements ConfigReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f45687a = new ConcurrentHashMap();
    public final ReaderStrategy b;

    public SecurityResourcesReader(Context context, String str) {
        this.b = new ReaderStrategy(context, str);
    }

    @Override // com.huawei.agconnect.config.ConfigReader
    public final String getString(String str, String str2) {
        ConcurrentHashMap concurrentHashMap = this.f45687a;
        String str3 = (String) concurrentHashMap.get(str);
        if (str3 != null) {
            return str3;
        }
        String strA = this.b.f45686a.a(str);
        if (strA == null) {
            Log.e("SecurityResourcesReader", "value is null");
            return null;
        }
        concurrentHashMap.put(str, strA);
        return strA;
    }

    public final String toString() {
        return "SecurityResourcesReader{mKey=, encrypt=true}";
    }
}
