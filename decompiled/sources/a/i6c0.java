package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i6c0 implements r6c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14233a;

    public i6c0(String str) {
        this.f14233a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6c0) && this.f14233a.equals(((i6c0) obj).f14233a);
    }

    public final int hashCode() {
        return this.f14233a.hashCode();
    }

    public final String toString() {
        return kng0.l("BetExistsError(errorMessage=", this.f14233a, Separators.RPAREN);
    }
}
