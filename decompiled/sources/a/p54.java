package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class p54 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xn4 f26387a;
    public final boolean b;
    public final boolean c;
    public final imm d;
    public final boolean e;

    public p54(xn4 xn4Var, boolean z, boolean z2, imm immVar, boolean z3) {
        xn4Var.getClass();
        this.f26387a = xn4Var;
        this.b = z;
        this.c = z2;
        this.d = immVar;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p54)) {
            return false;
        }
        p54 p54Var = (p54) obj;
        return this.f26387a == p54Var.f26387a && this.b == p54Var.b && this.c == p54Var.c && this.d.equals(p54Var.d) && this.e == p54Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + h97.a(this.d, brm0.e(brm0.e(this.f26387a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthDefaultUiState(authType=");
        sb.append(this.f26387a);
        sb.append(", isAnimateChanges=");
        sb.append(this.b);
        sb.append(", lottieAnimationEnable=");
        sb.append(this.c);
        sb.append(", navigationBarUiModel=");
        sb.append(this.d);
        sb.append(", isLoading=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
