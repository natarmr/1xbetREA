package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lqb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20480a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final String h;

    public lqb0(boolean z, int i, int i2, String str, int i3, int i4, int i5, String str2) {
        this.f20480a = z;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqb0)) {
            return false;
        }
        lqb0 lqb0Var = (lqb0) obj;
        return this.f20480a == lqb0Var.f20480a && this.b == lqb0Var.b && this.c == lqb0Var.c && this.d.equals(lqb0Var.d) && this.e == lqb0Var.e && this.f == lqb0Var.f && this.g == lqb0Var.g && this.h.equals(lqb0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + twn.a(this.g, twn.a(this.f, twn.a(this.e, ua80.b(twn.a(this.c, twn.a(this.b, Boolean.hashCode(this.f20480a) * 31, 31), 31), 31, this.d), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = ohs0.t(this.b, "PowerOfPowerTableModel(baseDestroyed=", ", deaths=", ", kills=", this.f20480a);
        kng0.w(this.c, ", playerName=", this.d, ", place=", sbT);
        axq.r(this.e, this.f, ", planted=", ", defused=", sbT);
        return rw2.k(this.g, ", lifetime=", this.h, Separators.RPAREN, sbT);
    }
}
