package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class wg30 implements zg30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39094a;

    public final boolean equals(Object obj) {
        if (obj instanceof wg30) {
            return this.f39094a.equals(((wg30) obj).f39094a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39094a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstTeamWin(teamId=", this.f39094a, Separators.RPAREN);
    }
}
