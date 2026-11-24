package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class d1o implements f1o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5318a;

    public d1o(String str) {
        this.f5318a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1o) && this.f5318a.equals(((d1o) obj).f5318a);
    }

    public final int hashCode() {
        return this.f5318a.hashCode();
    }

    public final String toString() {
        return kng0.l("InsufficientFundsError(errorMessage=", this.f5318a, Separators.RPAREN);
    }
}
