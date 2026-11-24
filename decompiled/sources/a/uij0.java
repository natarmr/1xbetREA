package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uij0 implements bjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35733a;

    public final boolean equals(Object obj) {
        if (obj instanceof uij0) {
            return this.f35733a.equals(((uij0) obj).f35733a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35733a.hashCode();
    }

    public final String toString() {
        return kng0.l("Background(value=", this.f35733a, Separators.RPAREN);
    }
}
