package com.huawei.hms.support.hwid.tools;

import a.brm0;
import a.jf4;
import a.rw2;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class NetworkTool {
    private static boolean a(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static String buildNetworkCookie(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l) {
        StringBuilder sbT = brm0.t(str, "=");
        if (!TextUtils.isEmpty(str2)) {
            sbT.append(str2);
        }
        if (a(bool)) {
            sbT.append(";HttpOnly");
        }
        if (a(bool2)) {
            sbT.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            sbT.append(";Domain=");
            sbT.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sbT.append(";Path=");
            sbT.append(str4);
        }
        if (l != null && l.longValue() > 0) {
            sbT.append(";Max-Age=");
            sbT.append(l);
        }
        return sbT.toString();
    }

    public static String buildNetworkUrl(String str, Boolean bool) {
        if (TextUtils.isEmpty(str)) {
            jf4.o("Given String is empty or null");
            return null;
        }
        String str2 = a(bool) ? "https" : "http";
        return rw2.o(new StringBuilder(String.valueOf(str).length() + str2.length() + 3), str2, "://", str);
    }
}
