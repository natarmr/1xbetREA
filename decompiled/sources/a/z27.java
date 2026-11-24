package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class z27 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43656a;

    public final boolean equals(Object obj) {
        if (obj instanceof z27) {
            return this.f43656a.equals(((z27) obj).f43656a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43656a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSaleConfirmed(betId=", this.f43656a, Separators.RPAREN);
    }
}
