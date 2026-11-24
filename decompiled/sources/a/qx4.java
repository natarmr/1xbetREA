package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qx4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wul f29463a;
    public final hxo0 b;
    public final zv6 c;
    public final zv6 d;

    public qx4(wul wulVar, hxo0 hxo0Var, zv6 zv6Var, zv6 zv6Var2) {
        this.f29463a = wulVar;
        this.b = hxo0Var;
        this.c = zv6Var;
        this.d = zv6Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx4)) {
            return false;
        }
        qx4 qx4Var = (qx4) obj;
        return this.f29463a.equals(qx4Var.f29463a) && this.b.equals(qx4Var.b) && this.c.equals(qx4Var.c) && this.d.equals(qx4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f29463a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AutoBetTabUiState(makeBetBtnUiState=" + this.f29463a + ", taxesUiState=" + this.b + ", betSumFieldContentUiState=" + this.c + ", coefFieldUiState=" + this.d + Separators.RPAREN;
    }
}
