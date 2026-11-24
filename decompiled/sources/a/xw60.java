package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xw60 implements bx60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f41595a;

    public xw60(ql5 ql5Var) {
        this.f41595a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xw60) && this.f41595a.equals(((xw60) obj).f41595a);
    }

    public final int hashCode() {
        return this.f41595a.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f41595a, "OnSelectBalanceClicked(balance=", Separators.RPAREN);
    }
}
