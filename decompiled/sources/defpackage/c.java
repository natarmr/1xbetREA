package defpackage;

import a.nr;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static int a(int i, float f, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static String b(int i, String str, String str2, String str3, String str4) {
        return str + i + str2 + str3 + str4;
    }

    public static String c(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
        return sb.toString();
    }

    public static String d(String str, String str2, boolean z) {
        return str + z + str2;
    }

    public static String e(StringBuilder sb, Boolean bool, String str) {
        sb.append(bool);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder f(String str, String str2, String str3, List list, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(list);
        sb.append(str4);
        return sb;
    }

    public static void g(nr nrVar, long j) {
        nrVar.i().i();
        nrVar.H(j);
    }

    public static void h(Boolean bool, String str, String str2, String str3, StringBuilder sb) {
        sb.append(bool);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void i(StringBuilder sb, long j, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        sb.append(j);
    }

    public static void j(StringBuilder sb, Boolean bool, String str, Boolean bool2, String str2) {
        sb.append(bool);
        sb.append(str);
        sb.append(bool2);
        sb.append(str2);
    }
}
