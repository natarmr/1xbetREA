package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i7t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f14309a = q3d.j('-', '.', '\'');

    public static final String a(String str) {
        str.getClass();
        char[] charArray = str.toCharArray();
        charArray.getClass();
        for (char c : charArray) {
            if (!Character.isLetterOrDigit(c) && !Character.isSpaceChar(c) && !f14309a.contains(Character.valueOf(c))) {
                return "";
            }
        }
        return str;
    }
}
