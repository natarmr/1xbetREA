package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16665a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public jke(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f16665a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jke)) {
            return false;
        }
        jke jkeVar = (jke) obj;
        return this.f16665a == jkeVar.f16665a && this.b == jkeVar.b && this.c == jkeVar.c && this.d == jkeVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(Boolean.hashCode(this.f16665a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", isPlusEnabled=", Separators.RPAREN, f140.q("ControlsUiState(showMinusButton=", ", showPlusButton=", ", isMinusEnabled=", this.f16665a, this.b), this.c, this.d);
    }
}
