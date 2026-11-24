package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vb50 implements zb50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bm5 f37125a;

    public vb50(bm5 bm5Var) {
        bm5Var.getClass();
        this.f37125a = bm5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vb50) && this.f37125a == ((vb50) obj).f37125a;
    }

    public final int hashCode() {
        return this.f37125a.hashCode();
    }

    public final String toString() {
        return "NavigateToSelectWallet(balanceScreenType=" + this.f37125a + Separators.RPAREN;
    }
}
