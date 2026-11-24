package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class m97 implements Serializable {
    public static final a8z[] A;
    public static final k97 Companion = new k97();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21398a;
    public final int b;
    public final izc c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final String g;
    public final long h;
    public final long i;
    public final double j;
    public final double k;
    public final double l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final long t;
    public final long u;
    public final boolean v;
    public final zfa0 w;
    public final boolean x;
    public final double y;
    public final String z;

    static {
        wez wezVar = wez.f39042a;
        A = new a8z[]{null, null, maz.a(wezVar, new t07((byte) 8)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new t07((byte) 9)), null, null, null};
    }

    public /* synthetic */ m97(int i, long j, int i2, izc izcVar, boolean z, boolean z2, long j2, String str, long j3, long j4, double d, double d2, double d3, String str2, String str3, String str4, String str5, boolean z3, boolean z4, boolean z5, long j5, long j6, boolean z6, zfa0 zfa0Var, boolean z7, double d4, String str6) {
        if ((i & 1) == 0) {
            this.f21398a = 0L;
        } else {
            this.f21398a = j;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = izc.d;
        } else {
            this.c = izcVar;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        if ((i & 32) == 0) {
            this.f = 0L;
        } else {
            this.f = j2;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str;
        }
        if ((i & 128) == 0) {
            this.h = 0L;
        } else {
            this.h = j3;
        }
        if ((i & 256) == 0) {
            this.i = 0L;
        } else {
            this.i = j4;
        }
        if ((i & 512) == 0) {
            this.j = 0.0d;
        } else {
            this.j = d;
        }
        if ((i & 1024) == 0) {
            this.k = 0.0d;
        } else {
            this.k = d2;
        }
        if ((i & 2048) == 0) {
            this.l = 0.0d;
        } else {
            this.l = d3;
        }
        if ((i & 4096) == 0) {
            this.m = "";
        } else {
            this.m = str2;
        }
        if ((i & 8192) == 0) {
            this.n = "";
        } else {
            this.n = str3;
        }
        if ((i & 16384) == 0) {
            this.o = "";
        } else {
            this.o = str4;
        }
        if ((32768 & i) == 0) {
            this.p = "";
        } else {
            this.p = str5;
        }
        if ((65536 & i) == 0) {
            this.q = false;
        } else {
            this.q = z3;
        }
        if ((131072 & i) == 0) {
            this.r = false;
        } else {
            this.r = z4;
        }
        if ((262144 & i) == 0) {
            this.s = false;
        } else {
            this.s = z5;
        }
        if ((524288 & i) == 0) {
            this.t = 0L;
        } else {
            this.t = j5;
        }
        if ((1048576 & i) == 0) {
            this.u = 0L;
        } else {
            this.u = j6;
        }
        if ((2097152 & i) == 0) {
            this.v = false;
        } else {
            this.v = z6;
        }
        this.w = (4194304 & i) == 0 ? yfa0.INSTANCE : zfa0Var;
        if ((8388608 & i) == 0) {
            this.x = false;
        } else {
            this.x = z7;
        }
        if ((16777216 & i) == 0) {
            this.y = 0.0d;
        } else {
            this.y = d4;
        }
        if ((i & 33554432) == 0) {
            this.z = "";
        } else {
            this.z = str6;
        }
    }

    public static m97 a(m97 m97Var, izc izcVar, boolean z, long j, double d, String str, String str2, String str3, zfa0 zfa0Var, double d2, String str4, int i) {
        long j2 = m97Var.f21398a;
        int i2 = m97Var.b;
        izc izcVar2 = (i & 4) != 0 ? m97Var.c : izcVar;
        boolean z2 = (i & 8) != 0 ? m97Var.d : z;
        boolean z3 = m97Var.e;
        boolean z4 = z2;
        long j3 = m97Var.f;
        String str5 = m97Var.g;
        long j4 = m97Var.h;
        long j5 = (i & 256) != 0 ? m97Var.i : j;
        izc izcVar3 = izcVar2;
        double d3 = m97Var.j;
        double d4 = m97Var.k;
        double d5 = (i & 2048) != 0 ? m97Var.l : d;
        String str6 = (i & 4096) != 0 ? m97Var.m : str;
        String str7 = m97Var.n;
        String str8 = (i & 16384) != 0 ? m97Var.o : str2;
        String str9 = (32768 & i) != 0 ? m97Var.p : str3;
        boolean z5 = m97Var.q;
        boolean z6 = m97Var.r;
        boolean z7 = m97Var.s;
        long j6 = m97Var.t;
        long j7 = m97Var.u;
        boolean z8 = m97Var.v;
        zfa0 zfa0Var2 = (i & 4194304) != 0 ? m97Var.w : zfa0Var;
        boolean z9 = m97Var.x;
        double d6 = (i & 16777216) != 0 ? m97Var.y : d2;
        String str10 = (i & 33554432) != 0 ? m97Var.z : str4;
        m97Var.getClass();
        izcVar3.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        zfa0Var2.getClass();
        str10.getClass();
        return new m97(j2, i2, izcVar3, z4, z3, j3, str5, j4, j5, d3, d4, d5, str6, str7, str8, str9, z5, z6, z7, j6, j7, z8, zfa0Var2, z9, d6, str10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m97)) {
            return false;
        }
        m97 m97Var = (m97) obj;
        return this.f21398a == m97Var.f21398a && this.b == m97Var.b && this.c == m97Var.c && this.d == m97Var.d && this.e == m97Var.e && this.f == m97Var.f && Intrinsics.d(this.g, m97Var.g) && this.h == m97Var.h && this.i == m97Var.i && Double.compare(this.j, m97Var.j) == 0 && Double.compare(this.k, m97Var.k) == 0 && Double.compare(this.l, m97Var.l) == 0 && Intrinsics.d(this.m, m97Var.m) && Intrinsics.d(this.n, m97Var.n) && Intrinsics.d(this.o, m97Var.o) && Intrinsics.d(this.p, m97Var.p) && this.q == m97Var.q && this.r == m97Var.r && this.s == m97Var.s && this.t == m97Var.t && this.u == m97Var.u && this.v == m97Var.v && Intrinsics.d(this.w, m97Var.w) && this.x == m97Var.x && Double.compare(this.y, m97Var.y) == 0 && Intrinsics.d(this.z, m97Var.z);
    }

    public final int hashCode() {
        return this.z.hashCode() + brm0.d(this.y, brm0.e((this.w.hashCode() + brm0.e(rw2.b(rw2.b(brm0.e(brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(brm0.d(this.l, brm0.d(this.k, brm0.d(this.j, rw2.b(rw2.b(ua80.b(rw2.b(brm0.e(brm0.e((this.c.hashCode() + twn.a(this.b, Long.hashCode(this.f21398a) * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31), 31), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v)) * 31, 31, this.x), 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f21398a, "BetInfo(gameId=", ", kind=");
        sbQ.append(", coefState=");
        sbQ.append(this.c);
        sbQ.append(", blocked=");
        sbQ.append(this.d);
        rz4.A(sbQ, ", relation=", this.e, ", playerId=");
        kng0.z(sbQ, this.f, ", playerName=", this.g);
        kng0.A(sbQ, ", betId=", this.h, ", groupId=");
        sbQ.append(this.i);
        ohs0.A(sbQ, this.j, ", betParam=", ", param=");
        sbQ.append(this.k);
        ohs0.A(sbQ, this.l, ", betCoef=", ", betCoefV=");
        f140.v(sbQ, this.m, ", coefViewName=", this.n, ", betName=");
        f140.v(sbQ, this.o, ", groupName=", this.p, ", startingPrice=");
        ua80.u(", isTracked=", ", finishedGame=", sbQ, this.q, this.r);
        rw2.v(this.t, ", subSportId=", sbQ, this.s);
        kng0.A(sbQ, ", gameTypeId=", this.u, ", notValid=");
        sbQ.append(this.v);
        sbQ.append(", playersDuelModel=");
        sbQ.append(this.w);
        sbQ.append(", bannedExpress=");
        sbQ.append(this.x);
        sbQ.append(", optionLowerCf=");
        sbQ.append(this.y);
        return rw2.o(sbQ, ", optionLowerCfView=", this.z, Separators.RPAREN);
    }

    public m97(long j, int i, izc izcVar, boolean z, boolean z2, long j2, String str, long j3, long j4, double d, double d2, double d3, String str2, String str3, String str4, String str5, boolean z3, boolean z4, boolean z5, long j5, long j6, boolean z6, zfa0 zfa0Var, boolean z7, double d4, String str6) {
        izcVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        zfa0Var.getClass();
        str6.getClass();
        this.f21398a = j;
        this.b = i;
        this.c = izcVar;
        this.d = z;
        this.e = z2;
        this.f = j2;
        this.g = str;
        this.h = j3;
        this.i = j4;
        this.j = d;
        this.k = d2;
        this.l = d3;
        this.m = str2;
        this.n = str3;
        this.o = str4;
        this.p = str5;
        this.q = z3;
        this.r = z4;
        this.s = z5;
        this.t = j5;
        this.u = j6;
        this.v = z6;
        this.w = zfa0Var;
        this.x = z7;
        this.y = d4;
        this.z = str6;
    }

    public /* synthetic */ m97(long j, int i, izc izcVar, boolean z, boolean z2, long j2, String str, long j3, long j4, double d, double d2, double d3, String str2, String str3, String str4, String str5, boolean z3, boolean z4, boolean z5, long j5, boolean z6, zfa0 zfa0Var, boolean z7, double d4, String str6, int i2) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? izc.d : izcVar, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? 0L : j2, (i2 & 64) != 0 ? "" : str, (i2 & 128) != 0 ? 0L : j3, (i2 & 256) != 0 ? 0L : j4, (i2 & 512) != 0 ? 0.0d : d, (i2 & 1024) != 0 ? 0.0d : d2, (i2 & 2048) != 0 ? 0.0d : d3, (i2 & 4096) != 0 ? "" : str2, (i2 & 8192) != 0 ? "" : str3, (i2 & 16384) != 0 ? "" : str4, (32768 & i2) != 0 ? "" : str5, (65536 & i2) != 0 ? false : z3, (131072 & i2) != 0 ? false : z4, (262144 & i2) != 0 ? false : z5, (524288 & i2) != 0 ? 0L : j5, 0L, (2097152 & i2) != 0 ? false : z6, (4194304 & i2) != 0 ? yfa0.INSTANCE : zfa0Var, (8388608 & i2) != 0 ? false : z7, (16777216 & i2) != 0 ? 0.0d : d4, (i2 & 33554432) != 0 ? "" : str6);
    }
}
