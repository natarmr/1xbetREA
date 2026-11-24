package com.huawei.hms.framework.network.grs.e;

import a.ohs0;
import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    private static final String b = "c";
    private static final Map<String, PLSharedPreferences> c = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PLSharedPreferences f45819a;

    public c(Context context, String str) {
        String packageName = context.getPackageName();
        Logger.d(b, "get pkgname from context is{%s}", packageName);
        Map<String, PLSharedPreferences> map = c;
        if (map.containsKey(str + packageName)) {
            this.f45819a = map.get(str + packageName);
        } else {
            PLSharedPreferences pLSharedPreferences = new PLSharedPreferences(context, ohs0.n(str, packageName));
            this.f45819a = pLSharedPreferences;
            map.put(str + packageName, pLSharedPreferences);
        }
        a(context);
    }

    private void a(Context context) {
        String str = b;
        Logger.i(str, "ContextHolder.getAppContext() from GRS is:" + ContextHolder.getAppContext());
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        try {
            String string = Long.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
            String strA = a("version", "");
            if (string.equals(strA)) {
                return;
            }
            Logger.i(str, "app version changed! old version{%s} and new version{%s}", strA, string);
            b();
            b("version", string);
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            Logger.w(b, "get app version failed and catch NameNotFoundException");
        }
    }

    public void b() {
        PLSharedPreferences pLSharedPreferences = this.f45819a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f45819a.clear();
        }
    }

    public Map<String, ?> a() {
        Map<String, ?> all;
        PLSharedPreferences pLSharedPreferences = this.f45819a;
        if (pLSharedPreferences == null) {
            return new HashMap();
        }
        synchronized (pLSharedPreferences) {
            all = this.f45819a.getAll();
        }
        return all;
    }

    public void b(String str, String str2) {
        PLSharedPreferences pLSharedPreferences = this.f45819a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f45819a.putString(str, str2);
        }
    }

    public String a(String str, String str2) {
        String string;
        PLSharedPreferences pLSharedPreferences = this.f45819a;
        if (pLSharedPreferences == null) {
            return str2;
        }
        synchronized (pLSharedPreferences) {
            string = this.f45819a.getString(str, str2);
        }
        return string;
    }

    public void a(String str) {
        PLSharedPreferences pLSharedPreferences = this.f45819a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f45819a.remove(str);
        }
    }
}
