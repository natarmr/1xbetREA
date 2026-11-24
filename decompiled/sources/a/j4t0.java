package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j4t0 implements l4t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15901a;

    public j4t0(String str) {
        this.f15901a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j4t0) && this.f15901a.equals(((j4t0) obj).f15901a);
    }

    public final int hashCode() {
        return this.f15901a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondTeamWin(teamId=", this.f15901a, Separators.RPAREN);
    }
}
