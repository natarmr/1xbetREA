package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class zi0 implements gj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44417a;
    public final ti0 b;

    public zi0(String str, ti0 ti0Var) {
        this.f44417a = str;
        this.b = ti0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi0)) {
            return false;
        }
        zi0 zi0Var = (zi0) obj;
        return this.f44417a.equals(zi0Var.f44417a) && this.b.equals(zi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44417a.hashCode() * 31);
    }

    public final String toString() {
        return "LoyaltyWidgetModel(id=" + this.f44417a + ", headerModel=" + this.b + Separators.RPAREN;
    }
}
