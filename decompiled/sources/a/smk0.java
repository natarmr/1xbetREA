package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class smk0 implements f83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8q0 f32451a;
    public final long b;
    public final psq c;
    public final lsq d;
    public final msq e;
    public final nrq f;
    public final String g;
    public final long h;
    public final j56 i;
    public final f8q0 j;
    public final rs00 k;
    public final long l;
    public final k5q0 m;
    public final ljj0 n;
    public final agc o;

    public smk0(long j, long j2, psq psqVar, lsq lsqVar, msq msqVar, nrq nrqVar, String str, long j3, j56 j56Var, f8q0 f8q0Var, rs00 rs00Var, long j4, k5q0 k5q0Var, ljj0 ljj0Var, agc agcVar, int i) {
        this((i & 1) != 0 ? y3d.g : j, (i & 2) != 0 ? daq0.c : j2, (i & 4) != 0 ? null : psqVar, (i & 8) != 0 ? null : lsqVar, (i & 16) != 0 ? null : msqVar, (i & 32) != 0 ? null : nrqVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? daq0.c : j3, (i & 256) != 0 ? null : j56Var, (i & 512) != 0 ? null : f8q0Var, (i & 1024) != 0 ? null : rs00Var, (i & 2048) != 0 ? y3d.g : j4, (i & 4096) != 0 ? null : k5q0Var, (i & 8192) != 0 ? null : ljj0Var, (i & 32768) != 0 ? null : agcVar);
    }

    public static smk0 a(smk0 smk0Var, long j, j56 j56Var, int i) {
        long jH = (i & 1) != 0 ? smk0Var.f32451a.h() : j;
        long j2 = smk0Var.b;
        psq psqVar = smk0Var.c;
        lsq lsqVar = smk0Var.d;
        msq msqVar = smk0Var.e;
        nrq nrqVar = (i & 32) != 0 ? smk0Var.f : null;
        String str = smk0Var.g;
        long j3 = smk0Var.h;
        j56 j56Var2 = (i & 256) != 0 ? smk0Var.i : j56Var;
        f8q0 f8q0Var = smk0Var.j;
        rs00 rs00Var = smk0Var.k;
        long j4 = smk0Var.l;
        k5q0 k5q0Var = smk0Var.m;
        ljj0 ljj0Var = smk0Var.n;
        smk0Var.getClass();
        agc agcVar = smk0Var.o;
        e8q0 g5dVar = smk0Var.f32451a;
        long jH2 = g5dVar.h();
        int i2 = y3d.h;
        if (!h2t0.a(jH, jH2)) {
            g5dVar = jH != 16 ? new g5d(jH) : pek0.d;
        }
        return new smk0(g5dVar, j2, psqVar, lsqVar, msqVar, nrqVar, str, j3, j56Var2, f8q0Var, rs00Var, j4, k5q0Var, ljj0Var, agcVar);
    }

    public final boolean b(smk0 smk0Var) {
        if (this == smk0Var) {
            return true;
        }
        if (!daq0.a(this.b, smk0Var.b) || !Intrinsics.d(this.c, smk0Var.c) || !Intrinsics.d(this.d, smk0Var.d) || !Intrinsics.d(this.e, smk0Var.e) || !Intrinsics.d(this.f, smk0Var.f) || !Intrinsics.d(this.g, smk0Var.g) || !daq0.a(this.h, smk0Var.h) || !Intrinsics.d(this.i, smk0Var.i) || !Intrinsics.d(this.j, smk0Var.j) || !Intrinsics.d(this.k, smk0Var.k)) {
            return false;
        }
        long j = smk0Var.l;
        int i = y3d.h;
        return h2t0.a(this.l, j);
    }

    public final boolean c(smk0 smk0Var) {
        return Intrinsics.d(this.f32451a, smk0Var.f32451a) && Intrinsics.d(this.m, smk0Var.m) && Intrinsics.d(this.n, smk0Var.n) && Intrinsics.d(this.o, smk0Var.o);
    }

    public final smk0 d(smk0 smk0Var) {
        if (smk0Var == null) {
            return this;
        }
        e8q0 e8q0Var = smk0Var.f32451a;
        return tmk0.a(this, e8q0Var.h(), e8q0Var.l(), e8q0Var.g(), smk0Var.b, smk0Var.c, smk0Var.d, smk0Var.e, smk0Var.f, smk0Var.g, smk0Var.h, smk0Var.i, smk0Var.j, smk0Var.k, smk0Var.l, smk0Var.m, smk0Var.n, smk0Var.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smk0)) {
            return false;
        }
        smk0 smk0Var = (smk0) obj;
        return b(smk0Var) && c(smk0Var);
    }

    public final int hashCode() {
        e8q0 e8q0Var = this.f32451a;
        long jH = e8q0Var.h();
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iHashCode = Long.hashCode(jH) * 31;
        t89 t89VarL = e8q0Var.l();
        int iHashCode2 = (Float.hashCode(e8q0Var.g()) + ((iHashCode + (t89VarL != null ? t89VarL.hashCode() : 0)) * 31)) * 31;
        eaq0[] eaq0VarArr = daq0.b;
        int iB = rw2.b(iHashCode2, 31, this.b);
        psq psqVar = this.c;
        int i2 = (iB + (psqVar != null ? psqVar.f27526a : 0)) * 31;
        lsq lsqVar = this.d;
        int iHashCode3 = (i2 + (lsqVar != null ? Integer.hashCode(lsqVar.f20592a) : 0)) * 31;
        msq msqVar = this.e;
        int iHashCode4 = (iHashCode3 + (msqVar != null ? Integer.hashCode(msqVar.f22332a) : 0)) * 31;
        nrq nrqVar = this.f;
        int iHashCode5 = (iHashCode4 + (nrqVar != null ? nrqVar.hashCode() : 0)) * 31;
        String str = this.g;
        int iB2 = rw2.b((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        j56 j56Var = this.i;
        int iHashCode6 = (iB2 + (j56Var != null ? Float.hashCode(j56Var.f15918a) : 0)) * 31;
        f8q0 f8q0Var = this.j;
        int iHashCode7 = (iHashCode6 + (f8q0Var != null ? f8q0Var.hashCode() : 0)) * 31;
        rs00 rs00Var = this.k;
        int iB3 = rw2.b((iHashCode7 + (rs00Var != null ? rs00Var.f31011a.hashCode() : 0)) * 31, 31, this.l);
        k5q0 k5q0Var = this.m;
        int i3 = (iB3 + (k5q0Var != null ? k5q0Var.f17733a : 0)) * 31;
        ljj0 ljj0Var = this.n;
        int iHashCode8 = (i3 + (ljj0Var != null ? ljj0Var.hashCode() : 0)) * 961;
        agc agcVar = this.o;
        return iHashCode8 + (agcVar != null ? agcVar.hashCode() : 0);
    }

    public final String toString() {
        e8q0 e8q0Var = this.f32451a;
        String strI = y3d.i(e8q0Var.h());
        t89 t89VarL = e8q0Var.l();
        float fG = e8q0Var.g();
        String strF = daq0.f(this.b);
        String strF2 = daq0.f(this.h);
        String strI2 = y3d.i(this.l);
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append(strI);
        sb.append(", brush=");
        sb.append(t89VarL);
        sb.append(", alpha=");
        sb.append(fG);
        sb.append(", fontSize=");
        sb.append(strF);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        f140.v(sb, this.g, ", letterSpacing=", strF2, ", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append(strI2);
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.o);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public smk0(e8q0 e8q0Var, long j, psq psqVar, lsq lsqVar, msq msqVar, nrq nrqVar, String str, long j2, j56 j56Var, f8q0 f8q0Var, rs00 rs00Var, long j3, k5q0 k5q0Var, ljj0 ljj0Var, agc agcVar) {
        this.f32451a = e8q0Var;
        this.b = j;
        this.c = psqVar;
        this.d = lsqVar;
        this.e = msqVar;
        this.f = nrqVar;
        this.g = str;
        this.h = j2;
        this.i = j56Var;
        this.j = f8q0Var;
        this.k = rs00Var;
        this.l = j3;
        this.m = k5q0Var;
        this.n = ljj0Var;
        this.o = agcVar;
    }

    public smk0(long j, long j2, psq psqVar, lsq lsqVar, msq msqVar, nrq nrqVar, String str, long j3, j56 j56Var, f8q0 f8q0Var, rs00 rs00Var, long j4, k5q0 k5q0Var, ljj0 ljj0Var, agc agcVar) {
        e8q0 g5dVar;
        if (j != 16) {
            g5dVar = new g5d(j);
        } else {
            g5dVar = pek0.d;
        }
        this(g5dVar, j2, psqVar, lsqVar, msqVar, nrqVar, str, j3, j56Var, f8q0Var, rs00Var, j4, k5q0Var, ljj0Var, agcVar);
    }
}
