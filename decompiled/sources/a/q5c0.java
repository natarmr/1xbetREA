package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class q5c0 implements s5c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28146a;

    public final boolean equals(Object obj) {
        if (obj instanceof q5c0) {
            return this.f28146a.equals(((q5c0) obj).f28146a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28146a.hashCode();
    }

    public final String toString() {
        return kng0.l("PromoUnit(value=", this.f28146a, Separators.RPAREN);
    }
}
