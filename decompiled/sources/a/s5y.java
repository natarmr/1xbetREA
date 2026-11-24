package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s5y implements w5y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31678a;

    public s5y(String str) {
        this.f31678a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5y) && this.f31678a.equals(((s5y) obj).f31678a);
    }

    public final int hashCode() {
        return this.f31678a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInsufficientFundsErrorDialog(errorMessage=", this.f31678a, Separators.RPAREN);
    }
}
