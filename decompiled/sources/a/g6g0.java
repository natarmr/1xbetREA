package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g6g0 implements h6g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10763a;

    public g6g0(String str) {
        this.f10763a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g6g0) && this.f10763a.equals(((g6g0) obj).f10763a);
    }

    public final int hashCode() {
        return this.f10763a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnTeamClicked(teamId=", this.f10763a, Separators.RPAREN);
    }
}
