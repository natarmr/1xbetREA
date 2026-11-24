package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class i5t0 implements k5t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f14209a;

    public i5t0(mdm mdmVar) {
        this.f14209a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i5t0) && this.f14209a.equals(((i5t0) obj).f14209a);
    }

    public final int hashCode() {
        return this.f14209a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f14209a, Separators.RPAREN);
    }
}
