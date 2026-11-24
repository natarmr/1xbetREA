package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class dw4 implements jw4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6778a;

    public dw4(String str) {
        this.f6778a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dw4) && this.f6778a.equals(((dw4) obj).f6778a);
    }

    public final int hashCode() {
        return this.f6778a.hashCode();
    }

    public final String toString() {
        return kng0.l("InsufficientFundsError(errorMessage=", this.f6778a, Separators.RPAREN);
    }
}
