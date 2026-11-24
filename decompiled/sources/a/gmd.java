package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class gmd extends lmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f11538a;

    public gmd(ank0 ank0Var) {
        this.f11538a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gmd) && this.f11538a.equals(((gmd) obj).f11538a);
    }

    public final int hashCode() {
        return this.f11538a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("ScoreChanged(score=", this.f11538a, Separators.RPAREN);
    }
}
