package a;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class h7a implements yz5 {
    public static final g7a Companion = new g7a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6a f12566a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;

    public /* synthetic */ h7a(int i, g6a g6aVar, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i3, int i4, String str9, String str10, String str11, String str12, String str13) {
        if (106483 != (i & 106483)) {
            m2x.I(i, 106483, f7a.f9051a.getDescriptor());
            throw null;
        }
        this.f12566a = g6aVar;
        this.b = i2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = i3;
        this.l = i4;
        this.m = str9;
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str10;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str11;
        }
        this.p = str12;
        this.q = str13;
    }

    public h7a(g6a g6aVar, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9 = Build.VERSION.RELEASE;
        cs0.x(str3, str4, str8, str9);
        this.f12566a = g6aVar;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = "";
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = 1;
        this.l = 22;
        this.m = str8;
        this.n = "";
        this.o = null;
        this.p = "Android";
        this.q = str9;
    }
}
