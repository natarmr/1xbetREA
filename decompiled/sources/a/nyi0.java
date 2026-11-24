package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nyi0 implements czi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rvs0 f24332a;

    public nyi0(rvs0 rvs0Var) {
        this.f24332a = rvs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nyi0) && this.f24332a.equals(((nyi0) obj).f24332a);
    }

    public final int hashCode() {
        return this.f24332a.hashCode();
    }

    public final String toString() {
        return "OnOtpConfirmationResult(result=" + this.f24332a + Separators.RPAREN;
    }
}
