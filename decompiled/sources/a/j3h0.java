package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j3h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15833a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;

    public j3h0(boolean z, String str, String str2, long j, long j2, int i, int i2, String str3, String str4) {
        this.f15833a = z;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = i2;
        this.h = str3;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3h0)) {
            return false;
        }
        j3h0 j3h0Var = (j3h0) obj;
        return this.f15833a == j3h0Var.f15833a && this.b.equals(j3h0Var.b) && this.c.equals(j3h0Var.c) && this.d == j3h0Var.d && this.e == j3h0Var.e && this.f == j3h0Var.f && this.g == j3h0Var.g && this.h.equals(j3h0Var.h) && this.i.equals(j3h0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ua80.b(twn.a(this.g, twn.a(this.f, rw2.b(rw2.b(ua80.b(ua80.b(Boolean.hashCode(this.f15833a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("ScoreInfo(live=", ", currentPeriodName=", this.b, this.f15833a, ", periodName=");
        defpackage.c.i(sbQ, this.d, this.c, ", timePassed=");
        kng0.A(sbQ, ", timeStart=", this.e, ", teamOneScore=");
        axq.r(this.f, this.g, ", teamTwoScore=", ", gameType=", sbQ);
        return ua80.m(sbQ, this.h, ", gameVid=", this.i, Separators.RPAREN);
    }
}
