package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class t4y implements x4y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33344a;

    public t4y(String str) {
        this.f33344a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t4y) && this.f33344a.equals(((t4y) obj).f33344a);
    }

    public final int hashCode() {
        return this.f33344a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInsufficientFundsErrorDialog(errorMessage=", this.f33344a, Separators.RPAREN);
    }
}
