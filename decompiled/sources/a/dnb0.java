package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class dnb0 implements enb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f6360a;

    public dnb0(ank0 ank0Var) {
        this.f6360a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnb0) && this.f6360a.equals(((dnb0) obj).f6360a);
    }

    public final int hashCode() {
        return this.f6360a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("Value(possibleWin=", this.f6360a, Separators.RPAREN);
    }
}
