package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j4k0 implements l4k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15888a;

    public final boolean equals(Object obj) {
        if (obj instanceof j4k0) {
            return this.f15888a.equals(((j4k0) obj).f15888a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15888a.hashCode();
    }

    public final String toString() {
        return kng0.l("TournamentDescription(value=", this.f15888a, Separators.RPAREN);
    }
}
