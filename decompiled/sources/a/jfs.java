package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jfs extends mfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f16443a;

    public jfs(ank0 ank0Var) {
        this.f16443a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jfs) && this.f16443a.equals(((jfs) obj).f16443a);
    }

    public final int hashCode() {
        return this.f16443a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("MatchPeriodChanged(matchPeriodInfo=", this.f16443a, Separators.RPAREN);
    }
}
