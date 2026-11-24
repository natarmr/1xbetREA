package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iov implements jov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15133a;

    public final boolean equals(Object obj) {
        if (obj instanceof iov) {
            return this.f15133a.equals(((iov) obj).f15133a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15133a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondTeamWinCount(value=", this.f15133a, Separators.RPAREN);
    }
}
