package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mt7 implements rt7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22358a;

    public final boolean equals(Object obj) {
        if (obj instanceof mt7) {
            return this.f22358a.equals(((mt7) obj).f22358a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22358a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPlayerClick(playerId=", this.f22358a, Separators.RPAREN);
    }
}
