package a;

import androidx.work.OverwritingInputMerger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ppv0 {
    public static final String z = wv00.h("WorkSpec");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27390a;
    public zov0 b;
    public final String c;
    public final String d;
    public maj e;
    public final maj f;
    public long g;
    public long h;
    public long i;
    public o4e j;
    public final int k;
    public final af5 l;
    public final long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public od80 r;
    public final int s;
    public final int t;
    public final long u;
    public final int v;
    public final int w;
    public String x;
    public final Boolean y;

    public /* synthetic */ ppv0(String str, zov0 zov0Var, String str2, String str3, maj majVar, maj majVar2, long j, long j2, long j3, o4e o4eVar, int i, af5 af5Var, long j4, long j5, long j6, long j7, boolean z2, od80 od80Var, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? zov0.f44733a : zov0Var, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? maj.b : majVar, (i5 & 32) != 0 ? maj.b : majVar2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? o4e.j : o4eVar, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? af5.f761a : af5Var, (i5 & 4096) != 0 ? 30000L : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z2, (131072 & i5) != 0 ? od80.f25065a : od80Var, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public static ppv0 b(ppv0 ppv0Var, String str, zov0 zov0Var, String str2, maj majVar, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str3 = (i5 & 1) != 0 ? ppv0Var.f27390a : str;
        zov0 zov0Var2 = (i5 & 2) != 0 ? ppv0Var.b : zov0Var;
        String str4 = (i5 & 4) != 0 ? ppv0Var.c : str2;
        String str5 = ppv0Var.d;
        maj majVar2 = (i5 & 16) != 0 ? ppv0Var.e : majVar;
        maj majVar3 = ppv0Var.f;
        long j3 = ppv0Var.g;
        long j4 = ppv0Var.h;
        long j5 = ppv0Var.i;
        o4e o4eVar = ppv0Var.j;
        int i6 = (i5 & 1024) != 0 ? ppv0Var.k : i;
        af5 af5Var = ppv0Var.l;
        long j6 = ppv0Var.m;
        long j7 = (i5 & 8192) != 0 ? ppv0Var.n : j;
        long j8 = ppv0Var.o;
        long j9 = ppv0Var.p;
        boolean z2 = ppv0Var.q;
        od80 od80Var = ppv0Var.r;
        int i7 = (i5 & 262144) != 0 ? ppv0Var.s : i2;
        int i8 = (i5 & 524288) != 0 ? ppv0Var.t : i3;
        long j10 = (i5 & 1048576) != 0 ? ppv0Var.u : j2;
        int i9 = (i5 & 2097152) != 0 ? ppv0Var.v : i4;
        int i10 = ppv0Var.w;
        String str6 = ppv0Var.x;
        Boolean bool = ppv0Var.y;
        str3.getClass();
        zov0Var2.getClass();
        str4.getClass();
        str5.getClass();
        majVar2.getClass();
        majVar3.getClass();
        o4eVar.getClass();
        af5Var.getClass();
        od80Var.getClass();
        return new ppv0(str3, zov0Var2, str4, str5, majVar2, majVar3, j3, j4, j5, o4eVar, i6, af5Var, j6, j7, j8, j9, z2, od80Var, i7, i8, j10, i9, i10, str6, bool);
    }

    public final long a() {
        return ipm0.e(this.b == zov0.f44733a && this.k > 0, this.k, this.l, this.m, this.n, this.s, c(), this.g, this.i, this.h, this.u);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppv0)) {
            return false;
        }
        ppv0 ppv0Var = (ppv0) obj;
        return Intrinsics.d(this.f27390a, ppv0Var.f27390a) && this.b == ppv0Var.b && Intrinsics.d(this.c, ppv0Var.c) && Intrinsics.d(this.d, ppv0Var.d) && Intrinsics.d(this.e, ppv0Var.e) && Intrinsics.d(this.f, ppv0Var.f) && this.g == ppv0Var.g && this.h == ppv0Var.h && this.i == ppv0Var.i && Intrinsics.d(this.j, ppv0Var.j) && this.k == ppv0Var.k && this.l == ppv0Var.l && this.m == ppv0Var.m && this.n == ppv0Var.n && this.o == ppv0Var.o && this.p == ppv0Var.p && this.q == ppv0Var.q && this.r == ppv0Var.r && this.s == ppv0Var.s && this.t == ppv0Var.t && this.u == ppv0Var.u && this.v == ppv0Var.v && this.w == ppv0Var.w && Intrinsics.d(this.x, ppv0Var.x) && Intrinsics.d(this.y, ppv0Var.y);
    }

    public final int hashCode() {
        int iA = twn.a(this.w, twn.a(this.v, rw2.b(twn.a(this.t, twn.a(this.s, (this.r.hashCode() + brm0.e(rw2.b(rw2.b(rw2.b(rw2.b((this.l.hashCode() + twn.a(this.k, (this.j.hashCode() + rw2.b(rw2.b(rw2.b((this.f.hashCode() + ((this.e.hashCode() + ua80.b(ua80.b((this.b.hashCode() + (this.f27390a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31, 31), 31), 31, this.u), 31), 31);
        String str = this.x;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.y;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return kng0.l("{WorkSpec: ", this.f27390a, "}");
    }

    public ppv0(String str, zov0 zov0Var, String str2, String str3, maj majVar, maj majVar2, long j, long j2, long j3, o4e o4eVar, int i, af5 af5Var, long j4, long j5, long j6, long j7, boolean z2, od80 od80Var, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        zov0Var.getClass();
        str2.getClass();
        str3.getClass();
        majVar.getClass();
        majVar2.getClass();
        o4eVar.getClass();
        af5Var.getClass();
        od80Var.getClass();
        this.f27390a = str;
        this.b = zov0Var;
        this.c = str2;
        this.d = str3;
        this.e = majVar;
        this.f = majVar2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = o4eVar;
        this.k = i;
        this.l = af5Var;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z2;
        this.r = od80Var;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
        this.y = bool;
    }
}
