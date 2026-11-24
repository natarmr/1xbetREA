package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q0o implements r0o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27910a;

    public q0o(String str) {
        this.f27910a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0o) && this.f27910a.equals(((q0o) obj).f27910a);
    }

    public final int hashCode() {
        return this.f27910a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInsufficientFundsErrorDialog(errorMessage=", this.f27910a, Separators.RPAREN);
    }
}
