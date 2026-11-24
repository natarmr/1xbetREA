package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mf8 f23422a;
    public final String b;

    public nf8(mf8 mf8Var, String str) {
        mf8Var.getClass();
        this.f23422a = mf8Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf8)) {
            return false;
        }
        nf8 nf8Var = (nf8) obj;
        return this.f23422a == nf8Var.f23422a && this.b.equals(nf8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23422a.hashCode() * 31);
    }

    public final String toString() {
        return "BonusInfoItemUiModel(bonusInfoItemModel=" + this.f23422a + ", gamesTitle=" + this.b + Separators.RPAREN;
    }
}
