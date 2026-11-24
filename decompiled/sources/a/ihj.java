package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ihj implements khj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3h0 f14782a;

    public ihj(j3h0 j3h0Var) {
        this.f14782a = j3h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ihj) && this.f14782a.equals(((ihj) obj).f14782a);
    }

    public final int hashCode() {
        return this.f14782a.hashCode();
    }

    public final String toString() {
        return "ScoresInfo(value=" + this.f14782a + Separators.RPAREN;
    }
}
