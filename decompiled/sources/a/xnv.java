package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xnv implements bov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41188a;

    public final boolean equals(Object obj) {
        if (obj instanceof xnv) {
            return this.f41188a.equals(((xnv) obj).f41188a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41188a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondTeamWinTitle(value=", this.f41188a, Separators.RPAREN);
    }
}
