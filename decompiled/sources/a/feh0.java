package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class feh0 implements ieh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9407a;

    public final boolean equals(Object obj) {
        if (obj instanceof feh0) {
            return this.f9407a.equals(((feh0) obj).f9407a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9407a.hashCode();
    }

    public final String toString() {
        return kng0.l("PlayerTwoScore(value=", this.f9407a, Separators.RPAREN);
    }
}
