package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class fmd extends lmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f9775a;

    public fmd(ank0 ank0Var) {
        this.f9775a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fmd) && this.f9775a.equals(((fmd) obj).f9775a);
    }

    public final int hashCode() {
        return this.f9775a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("MatchBaseInfoChanged(matchBaseInfo=", this.f9775a, Separators.RPAREN);
    }
}
