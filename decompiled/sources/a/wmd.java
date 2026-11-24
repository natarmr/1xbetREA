package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class wmd extends xmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f39401a;

    public wmd(ank0 ank0Var) {
        this.f39401a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wmd) && this.f39401a.equals(((wmd) obj).f39401a);
    }

    public final int hashCode() {
        return this.f39401a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("ScoreChanged(score=", this.f39401a, Separators.RPAREN);
    }
}
