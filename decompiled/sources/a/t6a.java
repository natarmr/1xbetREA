package a;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class t6a implements yz5 {
    public static final s6a Companion = new s6a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6a f33407a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;

    public /* synthetic */ t6a(int i, g6a g6aVar, String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, String str7, String str8, String str9, String str10) {
        if (6655 != (i & 6655)) {
            m2x.I(i, 6655, r6a.f29925a.getDescriptor());
            throw null;
        }
        this.f33407a = g6aVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i2;
        this.h = i3;
        this.i = str6;
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str7;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str8;
        }
        this.l = str9;
        this.m = str10;
    }

    public t6a(g6a g6aVar, String str, String str2, String str3, String str4) {
        String str5 = Build.VERSION.RELEASE;
        str5.getClass();
        this.f33407a = g6aVar;
        this.b = "";
        this.c = "";
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = 1;
        this.h = 22;
        this.i = "";
        this.j = null;
        this.k = str4;
        this.l = "Android";
        this.m = str5;
    }
}
