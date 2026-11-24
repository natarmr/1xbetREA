package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dg1 implements gg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final onl f6026a;
    public final pnl b;

    public dg1(onl onlVar, pnl pnlVar) {
        this.f6026a = onlVar;
        this.b = pnlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg1)) {
            return false;
        }
        dg1 dg1Var = (dg1) obj;
        return this.f6026a == dg1Var.f6026a && this.b.equals(dg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6026a.hashCode() * 31);
    }

    public final String toString() {
        return "PromoCodeBanner(style=" + this.f6026a + ", uiModel=" + this.b + Separators.RPAREN;
    }
}
