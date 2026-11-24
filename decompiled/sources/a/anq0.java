package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class anq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1167a;
    public final boolean b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final znq0 h;
    public final boolean i;
    public final boolean j;

    public anq0(boolean z, boolean z2, String str, long j, long j2, long j3, long j4, znq0 znq0Var, boolean z3, boolean z4) {
        this.f1167a = z;
        this.b = z2;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = znq0Var;
        this.i = z3;
        this.j = z4;
    }

    public static anq0 a(anq0 anq0Var, long j, znq0 znq0Var, int i) {
        boolean z = anq0Var.f1167a;
        boolean z2 = anq0Var.b;
        String str = anq0Var.c;
        long j2 = (i & 8) != 0 ? anq0Var.d : j;
        long j3 = anq0Var.e;
        long j4 = j2;
        long j5 = anq0Var.f;
        long j6 = anq0Var.g;
        znq0 znq0Var2 = (i & 128) != 0 ? anq0Var.h : znq0Var;
        boolean z3 = anq0Var.i;
        boolean z4 = (i & 512) != 0 ? anq0Var.j : true;
        anq0Var.getClass();
        return new anq0(z, z2, str, j4, j3, j5, j6, znq0Var2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anq0)) {
            return false;
        }
        anq0 anq0Var = (anq0) obj;
        return this.f1167a == anq0Var.f1167a && this.b == anq0Var.b && this.c.equals(anq0Var.c) && znq0.e(this.d, anq0Var.d) && znq0.e(this.e, anq0Var.e) && znq0.e(this.f, anq0Var.f) && znq0.e(this.g, anq0Var.g) && Intrinsics.d(this.h, anq0Var.h) && this.i == anq0Var.i && this.j == anq0Var.j;
    }

    public final int hashCode() {
        int iB = rw2.b(rw2.b(rw2.b(rw2.b(ua80.b(brm0.e(Boolean.hashCode(this.f1167a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        znq0 znq0Var = this.h;
        return Boolean.hashCode(this.j) + brm0.e((iB + (znq0Var == null ? 0 : Long.hashCode(znq0Var.f44687a))) * 31, 31, this.i);
    }

    public final String toString() {
        String strH = znq0.h(this.d);
        String strH2 = znq0.h(this.e);
        String strH3 = znq0.h(this.f);
        String strH4 = znq0.h(this.g);
        StringBuilder sbQ = f140.q("TimerModel(matchIsBreak=", ", timeBackDirection=", ", dopTimeStr=", this.f1167a, this.b);
        f140.v(sbQ, this.c, ", timerValue=", strH, ", eventTime=");
        f140.v(sbQ, strH2, ", startMatchTime=", strH3, ", beforeMatchTime=");
        sbQ.append(strH4);
        sbQ.append(", beforeSimulationTime=");
        sbQ.append(this.h);
        sbQ.append(", timeRun=");
        return ohs0.p(", live=", Separators.RPAREN, sbQ, this.i, this.j);
    }
}
