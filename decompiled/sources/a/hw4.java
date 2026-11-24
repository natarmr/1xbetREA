package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hw4 implements iw4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13753a;

    public hw4(String str) {
        this.f13753a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hw4) && this.f13753a.equals(((hw4) obj).f13753a);
    }

    public final int hashCode() {
        return this.f13753a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInsufficientFundsErrorDialog(errorMessage=", this.f13753a, Separators.RPAREN);
    }
}
