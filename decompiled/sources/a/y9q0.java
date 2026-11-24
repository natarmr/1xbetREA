package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y9q0 {
    public static final y9q0 d = new y9q0(0, 0, null, null, 0, null, 0, 0, 0, 16777215);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final smk0 f42262a;
    public final eo80 b;
    public final rw90 c;

    public y9q0(long j, long j2, psq psqVar, nrq nrqVar, long j3, ljj0 ljj0Var, int i, int i2, long j4, int i3) {
        this(new smk0((i3 & 1) != 0 ? y3d.g : j, (i3 & 2) != 0 ? daq0.c : j2, (i3 & 4) != 0 ? null : psqVar, (lsq) null, (msq) null, (i3 & 32) != 0 ? null : nrqVar, (i3 & 64) != 0 ? null : "kern off", (i3 & 128) != 0 ? daq0.c : j3, (j56) null, (f8q0) null, (rs00) null, y3d.g, (k5q0) null, (i3 & 8192) != 0 ? null : ljj0Var, (agc) null), new eo80((32768 & i3) != 0 ? 0 : i, (65536 & i3) != 0 ? 0 : i2, (i3 & 131072) != 0 ? daq0.c : j4, null, null, null, 0, 0, null), null);
    }

    public static y9q0 a(y9q0 y9q0Var, long j, long j2, psq psqVar, lsq lsqVar, nrq nrqVar, long j3, j56 j56Var, k5q0 k5q0Var, int i, int i2, long j4, rw90 rw90Var, m600 m600Var, int i3) {
        e8q0 g5dVar;
        long jH = (i3 & 1) != 0 ? y9q0Var.f42262a.f32451a.h() : j;
        long j5 = (i3 & 2) != 0 ? y9q0Var.f42262a.b : j2;
        psq psqVar2 = (i3 & 4) != 0 ? y9q0Var.f42262a.c : psqVar;
        lsq lsqVar2 = (i3 & 8) != 0 ? y9q0Var.f42262a.d : lsqVar;
        smk0 smk0Var = y9q0Var.f42262a;
        msq msqVar = smk0Var.e;
        nrq nrqVar2 = (i3 & 32) != 0 ? smk0Var.f : nrqVar;
        String str = smk0Var.g;
        long j6 = (i3 & 128) != 0 ? smk0Var.h : j3;
        j56 j56Var2 = (i3 & 256) != 0 ? smk0Var.i : j56Var;
        f8q0 f8q0Var = smk0Var.j;
        long j7 = j5;
        rs00 rs00Var = smk0Var.k;
        long j8 = smk0Var.l;
        k5q0 k5q0Var2 = (i3 & 4096) != 0 ? smk0Var.m : k5q0Var;
        ljj0 ljj0Var = smk0Var.n;
        agc agcVar = smk0Var.o;
        int i4 = (i3 & 32768) != 0 ? y9q0Var.b.f8127a : i;
        int i5 = (i3 & 65536) != 0 ? y9q0Var.b.b : i2;
        long j9 = (i3 & 131072) != 0 ? y9q0Var.b.c : j4;
        eo80 eo80Var = y9q0Var.b;
        long j10 = j9;
        g8q0 g8q0Var = eo80Var.d;
        rw90 rw90Var2 = (i3 & 524288) != 0 ? y9q0Var.c : rw90Var;
        m600 m600Var2 = (i3 & 1048576) != 0 ? eo80Var.f : m600Var;
        int i6 = eo80Var.g;
        int i7 = eo80Var.h;
        i9q0 i9q0Var = eo80Var.i;
        m600 m600Var3 = m600Var2;
        long jH2 = smk0Var.f32451a.h();
        int i8 = y3d.h;
        if (h2t0.a(jH, jH2)) {
            g5dVar = smk0Var.f32451a;
        } else {
            g5dVar = jH != 16 ? new g5d(jH) : pek0.d;
        }
        return new y9q0(new smk0(g5dVar, j7, psqVar2, lsqVar2, msqVar, nrqVar2, str, j6, j56Var2, f8q0Var, rs00Var, j8, k5q0Var2, ljj0Var, agcVar), new eo80(i4, i5, j10, g8q0Var, rw90Var2 != null ? rw90Var2.f31208a : null, m600Var3, i6, i7, i9q0Var), rw90Var2);
    }

    public static y9q0 e(y9q0 y9q0Var, long j, long j2, psq psqVar, lsq lsqVar, nrq nrqVar, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 1) != 0 ? y3d.g : j;
        long j6 = (i2 & 2) != 0 ? daq0.c : j2;
        psq psqVar2 = (i2 & 4) != 0 ? null : psqVar;
        lsq lsqVar2 = (i2 & 8) != 0 ? null : lsqVar;
        nrq nrqVar2 = (i2 & 32) != 0 ? null : nrqVar;
        long j7 = (i2 & 128) != 0 ? daq0.c : j3;
        long j8 = y3d.g;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j9 = (i2 & 131072) != 0 ? daq0.c : j4;
        smk0 smk0VarA = tmk0.a(y9q0Var.f42262a, j5, null, Float.NaN, j6, psqVar2, lsqVar2, null, nrqVar2, null, j7, null, null, null, j8, null, null, null);
        eo80 eo80VarA = fo80.a(y9q0Var.b, i3, 0, j9, null, null, null, 0, 0, null);
        return (y9q0Var.f42262a == smk0VarA && y9q0Var.b == eo80VarA) ? y9q0Var : new y9q0(smk0VarA, eo80VarA);
    }

    public final long b() {
        return this.f42262a.f32451a.h();
    }

    public final boolean c(y9q0 y9q0Var) {
        if (this != y9q0Var) {
            return Intrinsics.d(this.b, y9q0Var.b) && this.f42262a.b(y9q0Var.f42262a);
        }
        return true;
    }

    public final y9q0 d(y9q0 y9q0Var) {
        return (y9q0Var == null || y9q0Var.equals(d)) ? this : new y9q0(this.f42262a.d(y9q0Var.f42262a), this.b.a(y9q0Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9q0)) {
            return false;
        }
        y9q0 y9q0Var = (y9q0) obj;
        return Intrinsics.d(this.f42262a, y9q0Var.f42262a) && Intrinsics.d(this.b, y9q0Var.b) && Intrinsics.d(this.c, y9q0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f42262a.hashCode() * 31)) * 31;
        rw90 rw90Var = this.c;
        return iHashCode + (rw90Var != null ? rw90Var.hashCode() : 0);
    }

    public final String toString() {
        String strI = y3d.i(b());
        smk0 smk0Var = this.f42262a;
        t89 t89VarL = smk0Var.f32451a.l();
        float fG = smk0Var.f32451a.g();
        String strF = daq0.f(smk0Var.b);
        psq psqVar = smk0Var.c;
        lsq lsqVar = smk0Var.d;
        msq msqVar = smk0Var.e;
        nrq nrqVar = smk0Var.f;
        String str = smk0Var.g;
        String strF2 = daq0.f(smk0Var.h);
        j56 j56Var = smk0Var.i;
        f8q0 f8q0Var = smk0Var.j;
        rs00 rs00Var = smk0Var.k;
        String strI2 = y3d.i(smk0Var.l);
        k5q0 k5q0Var = smk0Var.m;
        ljj0 ljj0Var = smk0Var.n;
        agc agcVar = smk0Var.o;
        eo80 eo80Var = this.b;
        String strA = f2q0.a(eo80Var.f8127a);
        String strA2 = n5q0.a(eo80Var.b);
        String strF3 = daq0.f(eo80Var.c);
        g8q0 g8q0Var = eo80Var.d;
        m600 m600Var = eo80Var.f;
        String strA3 = p500.a(eo80Var.g);
        String strA4 = fuw.a(eo80Var.h);
        i9q0 i9q0Var = eo80Var.i;
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(strI);
        sb.append(", brush=");
        sb.append(t89VarL);
        sb.append(", alpha=");
        sb.append(fG);
        sb.append(", fontSize=");
        sb.append(strF);
        sb.append(", fontWeight=");
        sb.append(psqVar);
        sb.append(", fontStyle=");
        sb.append(lsqVar);
        sb.append(", fontSynthesis=");
        sb.append(msqVar);
        sb.append(", fontFamily=");
        sb.append(nrqVar);
        sb.append(", fontFeatureSettings=");
        f140.v(sb, str, ", letterSpacing=", strF2, ", baselineShift=");
        sb.append(j56Var);
        sb.append(", textGeometricTransform=");
        sb.append(f8q0Var);
        sb.append(", localeList=");
        sb.append(rs00Var);
        sb.append(", background=");
        sb.append(strI2);
        sb.append(", textDecoration=");
        sb.append(k5q0Var);
        sb.append(", shadow=");
        sb.append(ljj0Var);
        sb.append(", drawStyle=");
        sb.append(agcVar);
        sb.append(", textAlign=");
        sb.append(strA);
        sb.append(", textDirection=");
        f140.v(sb, strA2, ", lineHeight=", strF3, ", textIndent=");
        sb.append(g8q0Var);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(m600Var);
        sb.append(", lineBreak=");
        sb.append(strA3);
        sb.append(", hyphens=");
        sb.append(strA4);
        sb.append(", textMotion=");
        sb.append(i9q0Var);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y9q0(smk0 smk0Var, eo80 eo80Var) {
        smk0Var.getClass();
        ew90 ew90Var = eo80Var.e;
        this(smk0Var, eo80Var, ew90Var == null ? null : new rw90(ew90Var));
    }

    public y9q0(smk0 smk0Var, eo80 eo80Var, rw90 rw90Var) {
        this.f42262a = smk0Var;
        this.b = eo80Var;
        this.c = rw90Var;
    }
}
