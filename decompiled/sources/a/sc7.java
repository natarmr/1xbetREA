package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sc7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31972a;
    public final double b;
    public final String c;
    public final String d;
    public final l0d e;
    public final boolean f;
    public final boolean g;
    public final vzc h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final Double l;
    public final String m;
    public final l0d n;

    public sc7(long j, double d, String str, String str2, l0d l0dVar, boolean z, boolean z2, vzc vzcVar, boolean z3, boolean z4, String str3, Double d2, String str4, l0d l0dVar2) {
        this.f31972a = j;
        this.b = d;
        this.c = str;
        this.d = str2;
        this.e = l0dVar;
        this.f = z;
        this.g = z2;
        this.h = vzcVar;
        this.i = z3;
        this.j = z4;
        this.k = str3;
        this.l = d2;
        this.m = str4;
        this.n = l0dVar2;
    }

    public static sc7 a(sc7 sc7Var, long j, double d, String str, String str2, l0d l0dVar, boolean z, boolean z2, vzc vzcVar, boolean z3, boolean z4, String str3, Double d2, String str4, l0d l0dVar2, int i) {
        long j2 = (i & 1) != 0 ? sc7Var.f31972a : j;
        double d3 = (i & 2) != 0 ? sc7Var.b : d;
        String str5 = (i & 4) != 0 ? sc7Var.c : str;
        String str6 = (i & 8) != 0 ? sc7Var.d : str2;
        l0d l0dVar3 = (i & 16) != 0 ? sc7Var.e : l0dVar;
        boolean z5 = (i & 32) != 0 ? sc7Var.f : z;
        boolean z6 = (i & 64) != 0 ? sc7Var.g : z2;
        vzc vzcVar2 = (i & 128) != 0 ? sc7Var.h : vzcVar;
        boolean z7 = (i & 256) != 0 ? sc7Var.i : z3;
        boolean z8 = (i & 512) != 0 ? sc7Var.j : z4;
        String str7 = (i & 1024) != 0 ? sc7Var.k : str3;
        Double d4 = (i & 2048) != 0 ? sc7Var.l : d2;
        long j3 = j2;
        String str8 = (i & 4096) != 0 ? sc7Var.m : str4;
        l0d l0dVar4 = (i & 8192) != 0 ? sc7Var.n : l0dVar2;
        sc7Var.getClass();
        sc7Var.getClass();
        str5.getClass();
        return new sc7(j3, d3, str5, str6, l0dVar3, z5, z6, vzcVar2, z7, z8, str7, d4, str8, l0dVar4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc7)) {
            return false;
        }
        sc7 sc7Var = (sc7) obj;
        return this.f31972a == sc7Var.f31972a && Double.compare(this.b, sc7Var.b) == 0 && this.c.equals(sc7Var.c) && Intrinsics.d(this.d, sc7Var.d) && this.e == sc7Var.e && this.f == sc7Var.f && this.g == sc7Var.g && this.h == sc7Var.h && this.i == sc7Var.i && this.j == sc7Var.j && Intrinsics.d(this.k, sc7Var.k) && Intrinsics.d(this.l, sc7Var.l) && Intrinsics.d(this.m, sc7Var.m) && this.n == sc7Var.n;
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.d(this.b, Long.hashCode(this.f31972a) * 31, 31), 31, this.c);
        String str = this.d;
        int iE = brm0.e(brm0.e((this.h.hashCode() + brm0.e(brm0.e((this.e.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f), 31, this.g)) * 31, 31, this.i), 31, this.j);
        String str2 = this.k;
        int iHashCode = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.l;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.m;
        return Boolean.hashCode(true) + ((this.n.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f31972a, "BetInfoUiModel(eventCount=", ", currentCoefValue=");
        hne.w(sbQ, this.b, ", currentCoefView=", this.c);
        sbQ.append(", oldCoefValue=");
        sbQ.append(this.d);
        sbQ.append(", coefState=");
        sbQ.append(this.e);
        w6x.A(", needAnimate=", ", coefIsVisible=", sbQ, this.f, this.g);
        sbQ.append(", coefViewType=");
        sbQ.append(this.h);
        sbQ.append(", isLoadingCoef=");
        sbQ.append(this.i);
        hne.u(", hasAutoSub=", ", oldOptiCoefView=", this.k, sbQ, this.j);
        sbQ.append(", optiCoefValue=");
        sbQ.append(this.l);
        sbQ.append(", optiCoefView=");
        sbQ.append(this.m);
        sbQ.append(", optiCoefState=");
        sbQ.append(this.n);
        sbQ.append(", isOptiCoefToggleEnanble=true)");
        return sbQ.toString();
    }
}
