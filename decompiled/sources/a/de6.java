package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class de6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5933a;
    public final boolean b;

    public de6(boolean z, boolean z2) {
        this.f5933a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de6)) {
            return false;
        }
        de6 de6Var = (de6) obj;
        return this.f5933a == de6Var.f5933a && this.b == de6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f5933a) * 31);
    }

    public final String toString() {
        return hne.n("ButtonEnableUiState(enable=", ", loading=", Separators.RPAREN, this.f5933a, this.b);
    }
}
