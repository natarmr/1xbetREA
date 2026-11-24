package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class j6c0 implements s6c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15978a;

    public j6c0(String str) {
        this.f15978a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j6c0) && this.f15978a.equals(((j6c0) obj).f15978a);
    }

    public final int hashCode() {
        return this.f15978a.hashCode();
    }

    public final String toString() {
        return kng0.l("BetExistsError(errorMessage=", this.f15978a, Separators.RPAREN);
    }
}
