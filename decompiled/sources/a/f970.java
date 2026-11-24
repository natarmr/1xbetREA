package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class f970 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9142a;
    public final boolean b;
    public final boolean c;
    public final double d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public f970(boolean z, boolean z2, boolean z3, double d, boolean z4, boolean z5, boolean z6) {
        this.f9142a = z;
        this.b = z2;
        this.c = z3;
        this.d = d;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    public static f970 a(f970 f970Var, boolean z, boolean z2, boolean z3, double d, boolean z4, boolean z5, boolean z6, int i) {
        if ((i & 1) != 0) {
            z = f970Var.f9142a;
        }
        boolean z7 = z;
        if ((i & 2) != 0) {
            z2 = f970Var.b;
        }
        boolean z8 = z2;
        if ((i & 4) != 0) {
            z3 = f970Var.c;
        }
        boolean z9 = z3;
        if ((i & 8) != 0) {
            d = f970Var.d;
        }
        double d2 = d;
        if ((i & 16) != 0) {
            z4 = f970Var.e;
        }
        boolean z10 = z4;
        boolean z11 = (i & 32) != 0 ? f970Var.f : z5;
        boolean z12 = (i & 64) != 0 ? f970Var.g : z6;
        f970Var.getClass();
        return new f970(z7, z8, z9, d2, z10, z11, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f970)) {
            return false;
        }
        f970 f970Var = (f970) obj;
        return this.f9142a == f970Var.f9142a && this.b == f970Var.b && this.c == f970Var.c && Double.compare(this.d, f970Var.d) == 0 && this.e == f970Var.e && this.f == f970Var.f && this.g == f970Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.e(brm0.e(brm0.d(this.d, brm0.e(brm0.e(Boolean.hashCode(this.f9142a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("OneXGamesWebGameDemoState(demoAvailable=", ", demoEnabled=", ", demoExitButtonEnable=", this.f9142a, this.b);
        sbQ.append(this.c);
        sbQ.append(", demoTotalWinSum=");
        sbQ.append(this.d);
        w6x.A(", demoError=", ", pendingDemoDialog=", sbQ, this.e, this.f);
        return f140.n(sbQ, ", restoredDemo=", this.g, Separators.RPAREN);
    }
}
