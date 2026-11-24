package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class fj30 {
    public static final ej30 Companion = new ej30();
    public static final a8z[] n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9617a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final double f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final long k;
    public final List l;
    public final List m;

    static {
        wez wezVar = wez.f39042a;
        n = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new n230((byte) 28)), maz.a(wezVar, new n230((byte) 29))};
    }

    public /* synthetic */ fj30(int i, long j, long j2, String str, String str2, String str3, double d, int i2, int i3, int i4, String str4, long j3, List list, List list2) {
        if (8191 != (i & 8191)) {
            m2x.I(i, 8191, dj30.f6164a.getDescriptor());
            throw null;
        }
        this.f9617a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = d;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = str4;
        this.k = j3;
        this.l = list;
        this.m = list2;
    }

    public fj30(long j, long j2, String str, String str2, double d, int i, String str3, long j3, ArrayList arrayList, List list) {
        str.getClass();
        list.getClass();
        this.f9617a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = "0";
        this.f = d;
        this.g = 22;
        this.h = 1;
        this.i = i;
        this.j = str3;
        this.k = j3;
        this.l = arrayList;
        this.m = list;
    }
}
