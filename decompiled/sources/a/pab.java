package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk50 f26648a;
    public final mk50 b;
    public final mim0 c;
    public final v5l0 d;

    public pab(lk50 lk50Var, mk50 mk50Var, mim0 mim0Var, v5l0 v5l0Var) {
        this.f26648a = lk50Var;
        this.b = mk50Var;
        this.c = mim0Var;
        this.d = v5l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pab)) {
            return false;
        }
        pab pabVar = (pab) obj;
        return this.f26648a.equals(pabVar.f26648a) && this.b.equals(pabVar.b) && this.c.equals(pabVar.c) && this.d == pabVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f26648a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CellUiModel(netCellModel=" + this.f26648a + ", uiModel=" + this.b + ", cardModel=" + this.c + ", style=" + this.d + Separators.RPAREN;
    }
}
