package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jnd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f16807a;

    public jnd(ank0 ank0Var) {
        this.f16807a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jnd) && this.f16807a.equals(((jnd) obj).f16807a);
    }

    public final int hashCode() {
        return this.f16807a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("MatchBaseInfoChanged(matchBaseInfo=", this.f16807a, Separators.RPAREN);
    }
}
