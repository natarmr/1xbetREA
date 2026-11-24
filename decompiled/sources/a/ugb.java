package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ugb implements ygb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35617a;

    public final boolean equals(Object obj) {
        if (obj instanceof ugb) {
            return this.f35617a.equals(((ugb) obj).f35617a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35617a.hashCode();
    }

    public final String toString() {
        return kng0.l("ChampLogo(value=", this.f35617a, Separators.RPAREN);
    }
}
