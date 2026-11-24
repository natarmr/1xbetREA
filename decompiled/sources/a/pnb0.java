package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pnb0 implements qnb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f27279a;

    public pnb0(ank0 ank0Var) {
        this.f27279a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pnb0) && this.f27279a.equals(((pnb0) obj).f27279a);
    }

    public final int hashCode() {
        return this.f27279a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("Value(possibleWin=", this.f27279a, Separators.RPAREN);
    }
}
