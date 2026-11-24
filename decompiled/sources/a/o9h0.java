package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class o9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24880a;
    public final boolean b;

    public o9h0(boolean z, boolean z2) {
        this.f24880a = z;
        this.b = z2;
    }

    public static o9h0 a(o9h0 o9h0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = o9h0Var.f24880a;
        }
        if ((i & 2) != 0) {
            z2 = o9h0Var.b;
        }
        o9h0Var.getClass();
        return new o9h0(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9h0)) {
            return false;
        }
        o9h0 o9h0Var = (o9h0) obj;
        return this.f24880a == o9h0Var.f24880a && this.b == o9h0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f24880a) * 31);
    }

    public final String toString() {
        return hne.n("ScreenUiState(selectAllState=", ", applyFilterState=", Separators.RPAREN, this.f24880a, this.b);
    }
}
