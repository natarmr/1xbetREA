package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rih implements sih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30543a;

    public rih(String str) {
        this.f30543a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rih) && this.f30543a.equals(((rih) obj).f30543a);
    }

    public final int hashCode() {
        return this.f30543a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSwissMatchClick(matchId=", this.f30543a, Separators.RPAREN);
    }
}
