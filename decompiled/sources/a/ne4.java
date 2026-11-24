package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ne4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23365a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ne4(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f23365a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne4)) {
            return false;
        }
        ne4 ne4Var = (ne4) obj;
        return this.f23365a == ne4Var.f23365a && this.b == ne4Var.b && this.c == ne4Var.c && this.d == ne4Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(Boolean.hashCode(this.f23365a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", isDragEnable=", Separators.RPAREN, f140.q("AuthLoginSimpleContentDialogState(isVisible=", ", isTouchEnable=", ", isBackgroundClickable=", this.f23365a, this.b), this.c, this.d);
    }
}
