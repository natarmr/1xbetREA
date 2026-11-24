package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ma00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21437a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final l800 f;
    public final uaq0 g;
    public final boolean h;

    public ma00(boolean z, boolean z2, int i, int i2, int i3, l800 l800Var, uaq0 uaq0Var, boolean z3) {
        this.f21437a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = l800Var;
        this.g = uaq0Var;
        this.h = z3;
    }

    public static ma00 a(ma00 ma00Var, boolean z, boolean z2, int i, int i2, int i3, l800 l800Var, uaq0 uaq0Var, int i4) {
        if ((i4 & 1) != 0) {
            z = ma00Var.f21437a;
        }
        boolean z3 = z;
        if ((i4 & 2) != 0) {
            z2 = ma00Var.b;
        }
        boolean z4 = z2;
        if ((i4 & 4) != 0) {
            i = ma00Var.c;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = ma00Var.d;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = ma00Var.e;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            l800Var = ma00Var.f;
        }
        l800 l800Var2 = l800Var;
        uaq0 uaq0Var2 = (i4 & 64) != 0 ? ma00Var.g : uaq0Var;
        boolean z5 = ma00Var.h;
        ma00Var.getClass();
        l800Var2.getClass();
        uaq0Var2.getClass();
        return new ma00(z3, z4, i5, i6, i7, l800Var2, uaq0Var2, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma00)) {
            return false;
        }
        ma00 ma00Var = (ma00) obj;
        return this.f21437a == ma00Var.f21437a && this.b == ma00Var.b && this.c == ma00Var.c && this.d == ma00Var.d && this.e == ma00Var.e && this.f.equals(ma00Var.f) && this.g == ma00Var.g && this.h == ma00Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + twn.a(this.e, twn.a(this.d, twn.a(this.c, brm0.e(Boolean.hashCode(this.f21437a) * 31, 31, this.b), 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("LineupsState(isLoading=", ", hasError=", ", selectedTab=", this.f21437a, this.b);
        axq.r(this.c, this.d, ", firstTeamSelectedChip=", ", secondTeamSelectedChip=", sbQ);
        sbQ.append(this.e);
        sbQ.append(", lineUpModel=");
        sbQ.append(this.f);
        sbQ.append(", theme=");
        sbQ.append(this.g);
        sbQ.append(", rtlSupport=");
        sbQ.append(this.h);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
