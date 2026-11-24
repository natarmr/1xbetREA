package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class yg20 {
    public static final xg20 Companion = new xg20();
    public static final a8z[] r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42566a;
    public final long b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final double g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final String l;
    public final long m;
    public final boolean n;
    public final List o;
    public final List p;
    public final int q;

    static {
        wez wezVar = wez.f39042a;
        r = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new sv10((byte) 18)), maz.a(wezVar, new sv10((byte) 19)), null};
    }

    public /* synthetic */ yg20(int i, long j, long j2, String str, boolean z, String str2, String str3, double d, int i2, int i3, int i4, int i5, String str4, long j3, boolean z2, List list, List list2, int i6) {
        if (122879 != (i & 122879)) {
            m2x.I(i, 122879, wg20.f39092a.getDescriptor());
            throw null;
        }
        this.f42566a = j;
        this.b = j2;
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = str3;
        this.g = d;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = str4;
        this.m = j3;
        this.n = (i & 8192) == 0 ? true : z2;
        this.o = list;
        this.p = list2;
        this.q = i6;
    }

    public yg20(long j, long j2, String str, boolean z, String str2, double d, int i, int i2, String str3, long j3, ArrayList arrayList, List list, int i3) {
        str.getClass();
        list.getClass();
        this.f42566a = j;
        this.b = j2;
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = "0";
        this.g = d;
        this.h = 22;
        this.i = 1;
        this.j = i;
        this.k = i2;
        this.l = str3;
        this.m = j3;
        this.n = true;
        this.o = arrayList;
        this.p = list;
        this.q = i3;
    }
}
