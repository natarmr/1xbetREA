package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dc20 implements ad20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5831a;

    public dc20(String str) {
        this.f5831a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dc20) && this.f5831a.equals(((dc20) obj).f5831a);
    }

    public final int hashCode() {
        return this.f5831a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInsufficientFundsErrorDialog(errorMessage=", this.f5831a, Separators.RPAREN);
    }
}
