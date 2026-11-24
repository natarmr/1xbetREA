package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class be20 implements ce20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f2428a;

    public be20(ank0 ank0Var) {
        this.f2428a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof be20) && this.f2428a.equals(((be20) obj).f2428a);
    }

    public final int hashCode() {
        return this.f2428a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("Value(possibleWin=", this.f2428a, Separators.RPAREN);
    }
}
