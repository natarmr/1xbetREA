package a;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class iw00 implements yz5 {
    public static final hw00 Companion = new hw00();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15466a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public /* synthetic */ iw00(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, String str7, String str8, String str9, String str10) {
        if (3327 != (i & 3327)) {
            m2x.I(i, 3327, gw00.f12001a.getDescriptor());
            throw null;
        }
        this.f15466a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i2;
        this.g = i3;
        this.h = str6;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str7;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str8;
        }
        this.k = str9;
        this.l = str10;
    }

    public iw00(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9 = Build.VERSION.RELEASE;
        brm0.B(str, str6, str9);
        this.f15466a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = 1;
        this.g = 22;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = "Android";
        this.l = str9;
    }
}
