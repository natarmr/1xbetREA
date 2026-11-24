package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class m54 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xn4 f21203a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;

    public m54(xn4 xn4Var, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        xn4Var.getClass();
        this.f21203a = xn4Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j;
    }

    public static m54 a(m54 m54Var, xn4 xn4Var, boolean z, boolean z2, long j, int i) {
        if ((i & 1) != 0) {
            xn4Var = m54Var.f21203a;
        }
        xn4 xn4Var2 = xn4Var;
        if ((i & 2) != 0) {
            z = m54Var.b;
        }
        boolean z3 = z;
        boolean z4 = m54Var.c;
        boolean z5 = m54Var.d;
        if ((i & 16) != 0) {
            z2 = m54Var.e;
        }
        boolean z6 = z2;
        if ((i & 32) != 0) {
            j = m54Var.f;
        }
        xn4Var2.getClass();
        return new m54(xn4Var2, z3, z4, z5, z6, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m54)) {
            return false;
        }
        m54 m54Var = (m54) obj;
        return this.f21203a == m54Var.f21203a && this.b == m54Var.b && this.c == m54Var.c && this.d == m54Var.d && this.e == m54Var.e && this.f == m54Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + brm0.e(brm0.e(brm0.e(brm0.e(this.f21203a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthDefaultStateModel(authType=");
        sb.append(this.f21203a);
        sb.append(", isAnimateChanges=");
        sb.append(this.b);
        sb.append(", hasAllowedAppWithoutAuth=");
        ua80.u(", lottieAnimationEnable=", ", childLoading=", sb, this.c, this.d);
        rw2.v(this.f, ", backPressTime=", sb, this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
