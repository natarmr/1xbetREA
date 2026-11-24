package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class inb0 implements jnb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f15066a;

    public inb0(ank0 ank0Var) {
        this.f15066a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof inb0) && this.f15066a.equals(((inb0) obj).f15066a);
    }

    public final int hashCode() {
        return this.f15066a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("Value(possibleWin=", this.f15066a, Separators.RPAREN);
    }
}
