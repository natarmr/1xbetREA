package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tt30 implements bv30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34493a;

    public final boolean equals(Object obj) {
        if (obj instanceof tt30) {
            return this.f34493a.equals(((tt30) obj).f34493a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34493a.hashCode();
    }

    public final String toString() {
        return kng0.l("GameEventPlayerClick(playerId=", this.f34493a, Separators.RPAREN);
    }
}
