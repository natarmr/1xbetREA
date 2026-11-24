package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class k4k0 implements l4k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17673a;

    public final boolean equals(Object obj) {
        if (obj instanceof k4k0) {
            return this.f17673a.equals(((k4k0) obj).f17673a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17673a.hashCode();
    }

    public final String toString() {
        return kng0.l("TournamentTitle(value=", this.f17673a, Separators.RPAREN);
    }
}
