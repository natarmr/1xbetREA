package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20198a;
    public final boolean b;
    public final boolean c;

    public lke(boolean z, boolean z2, boolean z3) {
        this.f20198a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lke)) {
            return false;
        }
        lke lkeVar = (lke) obj;
        return this.f20198a == lkeVar.f20198a && this.b == lkeVar.b && this.c == lkeVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f20198a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(f140.q("ControlsUiState(isMinusEnabled=", ", isPlusEnabled=", ", showControls=", this.f20198a, this.b), this.c, Separators.RPAREN);
    }
}
