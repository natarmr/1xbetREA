package a;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qmy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f29008a = new HashMap();
    public final int b;

    public qmy(int i) {
        this.b = i;
    }

    public static String a(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str, String str2) {
        boolean zEquals;
        String strA = a(this.b, str);
        if (this.f29008a.size() >= 64 && !this.f29008a.containsKey(strA)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: 64", null);
            return false;
        }
        String strA2 = a(this.b, str2);
        String str3 = (String) this.f29008a.get(strA);
        if (str3 == null) {
            zEquals = strA2 == null;
        } else {
            zEquals = str3.equals(strA2);
        }
        if (zEquals) {
            return false;
        }
        HashMap map = this.f29008a;
        if (str2 == null) {
            strA2 = "";
        }
        map.put(strA, strA2);
        return true;
    }

    public final synchronized void c(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strA = a(this.b, str);
                if (this.f29008a.size() < 64 || this.f29008a.containsKey(strA)) {
                    String str2 = (String) entry.getValue();
                    this.f29008a.put(strA, str2 == null ? "" : a(this.b, str2));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: 64", null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
