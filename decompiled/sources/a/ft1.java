package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ft1 implements ot1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gw1 f10089a;
    public final kw1 b;

    public ft1(gw1 gw1Var, kw1 kw1Var) {
        this.f10089a = gw1Var;
        this.b = kw1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft1)) {
            return false;
        }
        ft1 ft1Var = (ft1) obj;
        return this.f10089a == ft1Var.f10089a && this.b.equals(ft1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10089a.hashCode() * 31);
    }

    public final String toString() {
        return "PrizesUiModel(style=" + this.f10089a + ", uiModel=" + this.b + Separators.RPAREN;
    }
}
