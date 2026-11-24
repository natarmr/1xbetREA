package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bfs extends hfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f2517a;

    public bfs(ank0 ank0Var) {
        this.f2517a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfs) && this.f2517a.equals(((bfs) obj).f2517a);
    }

    public final int hashCode() {
        return this.f2517a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("MatchPeriodChanged(matchPeriodInfo=", this.f2517a, Separators.RPAREN);
    }
}
