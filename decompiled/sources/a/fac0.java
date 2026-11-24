package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fac0 implements gac0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9202a;

    public fac0(String str) {
        this.f9202a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fac0) && this.f9202a.equals(((fac0) obj).f9202a);
    }

    public final int hashCode() {
        return this.f9202a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowPromoCheckErrorSnackbar(message=", this.f9202a, Separators.RPAREN);
    }
}
