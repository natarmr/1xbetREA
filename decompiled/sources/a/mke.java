package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21939a;
    public final boolean b;
    public final boolean c;

    public mke(boolean z, boolean z2, boolean z3) {
        this.f21939a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mke)) {
            return false;
        }
        mke mkeVar = (mke) obj;
        return this.f21939a == mkeVar.f21939a && this.b == mkeVar.b && this.c == mkeVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f21939a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(f140.q("ControlsUiState(isMinusEnabled=", ", isPlusEnabled=", ", showControls=", this.f21939a, this.b), this.c, Separators.RPAREN);
    }
}
