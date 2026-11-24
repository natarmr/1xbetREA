package a;

import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uwc {
    public static final String a(String str, String str2) {
        HttpUrl httpUrlB;
        str.getClass();
        str2.getClass();
        if (kotlin.text.c.x(str, "#deeplink_appKey#", false)) {
            return kotlin.text.c.r(str, "#deeplink_appKey#", str2, false);
        }
        try {
            httpUrlB = HttpUrl.Companion.b(str);
        } catch (IllegalArgumentException unused) {
            httpUrlB = null;
        }
        return (httpUrlB == null && !kotlin.text.c.x(str, str2, false)) ? kng0.l(str2, "://", str) : str;
    }
}
