package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class png implements vng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27284a;

    public final boolean equals(Object obj) {
        if (obj instanceof png) {
            return this.f27284a.equals(((png) obj).f27284a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27284a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstPlayerStatus(value=", this.f27284a, Separators.RPAREN);
    }
}
