package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kfs extends mfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f18210a;

    public kfs(ank0 ank0Var) {
        this.f18210a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kfs) && this.f18210a.equals(((kfs) obj).f18210a);
    }

    public final int hashCode() {
        return this.f18210a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("ScoreChange(score=", this.f18210a, Separators.RPAREN);
    }
}
