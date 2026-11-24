package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class jx4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hx4 f17284a;
    public final boolean b;

    public jx4(hx4 hx4Var, boolean z) {
        this.f17284a = hx4Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx4)) {
            return false;
        }
        jx4 jx4Var = (jx4) obj;
        return this.f17284a.equals(jx4Var.f17284a) && this.b == jx4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f17284a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoBetTabKeyModel(autoBetState=" + this.f17284a + ", forceLoading=" + this.b + Separators.RPAREN;
    }
}
