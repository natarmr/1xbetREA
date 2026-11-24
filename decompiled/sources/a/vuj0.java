package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vuj0 implements wuj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38051a;

    public vuj0(String str) {
        this.f38051a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vuj0) && this.f38051a.equals(((vuj0) obj).f38051a);
    }

    public final int hashCode() {
        return this.f38051a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInsufficientFundsErrorDialog(errorMessage=", this.f38051a, Separators.RPAREN);
    }
}
