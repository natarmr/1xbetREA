package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23677a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public nke(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f23677a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nke)) {
            return false;
        }
        nke nkeVar = (nke) obj;
        return this.f23677a == nkeVar.f23677a && this.b == nkeVar.b && this.c == nkeVar.c && this.d == nkeVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(Boolean.hashCode(this.f23677a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", isPlusEnabled=", Separators.RPAREN, f140.q("ControlsUiState(showMinusButton=", ", showPlusButton=", ", isMinusEnabled=", this.f23677a, this.b), this.c, this.d);
    }
}
