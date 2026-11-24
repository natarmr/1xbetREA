package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zas implements dbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44082a;

    public zas(String str) {
        this.f44082a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zas) && this.f44082a.equals(((zas) obj).f44082a);
    }

    public final int hashCode() {
        return this.f44082a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPlayerClicked(playerId=", this.f44082a, Separators.RPAREN);
    }
}
