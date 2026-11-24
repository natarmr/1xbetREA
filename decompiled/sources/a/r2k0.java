package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class r2k0 implements u2k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final se f29739a;
    public final y2k0 b;
    public final y2k0 c;

    public r2k0(se seVar, y2k0 y2k0Var, y2k0 y2k0Var2) {
        this.f29739a = seVar;
        this.b = y2k0Var;
        this.c = y2k0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2k0)) {
            return false;
        }
        r2k0 r2k0Var = (r2k0) obj;
        return this.f29739a.equals(r2k0Var.f29739a) && this.b.equals(r2k0Var.b) && this.c.equals(r2k0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f29739a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Content(accountInfoUiModel=" + this.f29739a + ", topUpTransactionButtonUiState=" + this.b + ", withdrawalTransactionButtonUiState=" + this.c + Separators.RPAREN;
    }
}
