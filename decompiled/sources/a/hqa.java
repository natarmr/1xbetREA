package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hqa extends jqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f13475a;

    public hqa(ank0 ank0Var) {
        this.f13475a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hqa) && this.f13475a.equals(((hqa) obj).f13475a);
    }

    public final int hashCode() {
        return this.f13475a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("ScoreChanged(score=", this.f13475a, Separators.RPAREN);
    }
}
