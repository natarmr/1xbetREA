package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n1y implements r1y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22775a;

    public n1y(String str) {
        this.f22775a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1y) && this.f22775a.equals(((n1y) obj).f22775a);
    }

    public final int hashCode() {
        return this.f22775a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInsufficientFundsErrorDialog(errorMessage=", this.f22775a, Separators.RPAREN);
    }
}
