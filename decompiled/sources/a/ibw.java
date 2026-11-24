package a;

import androidx.media3.common.DrmInitData;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ibw extends nbw {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final DrmInitData q;
    public final b4x r;
    public final b4x s;
    public final wcf0 t;
    public final long u;
    public final hbw v;
    public final b4x w;
    public final fbw x;

    public ibw(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, DrmInitData drmInitData, List list2, List list3, hbw hbwVar, Map map, List list4, fbw fbwVar) {
        long j6;
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = drmInitData;
        this.r = b4x.o(list2);
        this.s = b4x.o(list3);
        this.t = wcf0.b(map);
        this.w = b4x.o(list4);
        this.x = fbwVar;
        if (!list3.isEmpty()) {
            dbw dbwVar = (dbw) g8x.H(list3);
            j6 = dbwVar.e + dbwVar.c;
            this.u = j6;
        } else if (list2.isEmpty()) {
            this.u = 0L;
            j6 = 0;
        } else {
            fbw fbwVar2 = (fbw) g8x.H(list2);
            j6 = fbwVar2.e + fbwVar2.c;
            this.u = j6;
        }
        this.e = j != -9223372036854775807L ? j >= 0 ? Math.min(j6, j) : Math.max(0L, j6 + j) : -9223372036854775807L;
        this.f = j >= 0;
        this.v = hbwVar;
    }
}
