package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nt7 implements rt7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24082a;

    public final boolean equals(Object obj) {
        if (obj instanceof nt7) {
            return this.f24082a.equals(((nt7) obj).f24082a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24082a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPlayerSelect(playerId=", this.f24082a, Separators.RPAREN);
    }
}
