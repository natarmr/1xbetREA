package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s3y implements w3y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31579a;

    public s3y(String str) {
        this.f31579a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3y) && this.f31579a.equals(((s3y) obj).f31579a);
    }

    public final int hashCode() {
        return this.f31579a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInsufficientFundsErrorDialog(errorMessage=", this.f31579a, Separators.RPAREN);
    }
}
