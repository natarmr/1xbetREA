package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class heo0 implements jeo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12933a;

    public heo0(String str) {
        this.f12933a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof heo0) && this.f12933a.equals(((heo0) obj).f12933a);
    }

    public final int hashCode() {
        return this.f12933a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPlayerClick(playerId=", this.f12933a, Separators.RPAREN);
    }
}
