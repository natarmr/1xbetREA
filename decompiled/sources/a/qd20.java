package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qd20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28514a;

    public qd20(String str) {
        this.f28514a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qd20) && this.f28514a.equals(((qd20) obj).f28514a);
    }

    public final int hashCode() {
        return this.f28514a.hashCode();
    }

    public final String toString() {
        return kng0.l("BetExistsError(errorMessage=", this.f28514a, Separators.RPAREN);
    }
}
