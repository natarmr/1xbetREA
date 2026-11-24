package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class krq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f18779a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;

    public krq(ArrayList arrayList, char c, double d, String str, String str2) {
        this.f18779a = arrayList;
        this.b = c;
        this.c = d;
        this.d = str;
        this.e = str2;
    }

    public static int a(char c, String str, String str2) {
        return str2.hashCode() + ua80.b(c * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.b, this.e, this.d);
    }
}
