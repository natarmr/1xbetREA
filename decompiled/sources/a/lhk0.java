package a;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class lhk0 implements yz5 {
    public static final khk0 Companion = new khk0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20061a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final int k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;

    public /* synthetic */ lhk0(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i3, int i4, String str9, String str10, String str11, String str12, String str13) {
        if (53241 != (i & 53241)) {
            m2x.I(i, 53241, jhk0.f16532a.getDescriptor());
            throw null;
        }
        this.f20061a = i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = i3;
        this.k = i4;
        this.l = str9;
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str10;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str11;
        }
        this.o = str12;
        this.p = str13;
    }

    public lhk0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9 = Build.VERSION.RELEASE;
        cs0.x(str3, str4, str8, str9);
        this.f20061a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = "";
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = 1;
        this.k = 22;
        this.l = str8;
        this.m = "";
        this.n = null;
        this.o = "Android";
        this.p = str9;
    }
}
