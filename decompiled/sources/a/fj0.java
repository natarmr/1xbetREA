package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class fj0 implements gj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9613a;
    public final ti0 b;

    public fj0(String str, ti0 ti0Var) {
        this.f9613a = str;
        this.b = ti0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj0)) {
            return false;
        }
        fj0 fj0Var = (fj0) obj;
        return this.f9613a.equals(fj0Var.f9613a) && this.b.equals(fj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9613a.hashCode() * 31);
    }

    public final String toString() {
        return "VirtualCarouselsModel(id=" + this.f9613a + ", headerModel=" + this.b + Separators.RPAREN;
    }
}
