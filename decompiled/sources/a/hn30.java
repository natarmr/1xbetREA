package a;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class hn30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f13332a = new HashSet();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        if (f13332a.add(str)) {
            b += ", " + str;
        }
    }
}
