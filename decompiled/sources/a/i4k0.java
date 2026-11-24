package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i4k0 implements l4k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14150a;

    public final boolean equals(Object obj) {
        if (obj instanceof i4k0) {
            return this.f14150a.equals(((i4k0) obj).f14150a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14150a.hashCode();
    }

    public final String toString() {
        return kng0.l("TournamentDate(value=", this.f14150a, Separators.RPAREN);
    }
}
