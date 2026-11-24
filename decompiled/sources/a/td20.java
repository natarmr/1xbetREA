package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class td20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33745a;

    public td20(String str) {
        this.f33745a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof td20) && this.f33745a.equals(((td20) obj).f33745a);
    }

    public final int hashCode() {
        return this.f33745a.hashCode();
    }

    public final String toString() {
        return kng0.l("InsufficientFundsError(errorMessage=", this.f33745a, Separators.RPAREN);
    }
}
