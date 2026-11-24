package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class xg30 implements zg30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40821a;

    public final boolean equals(Object obj) {
        if (obj instanceof xg30) {
            return this.f40821a.equals(((xg30) obj).f40821a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40821a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondTeamWin(teamId=", this.f40821a, Separators.RPAREN);
    }
}
