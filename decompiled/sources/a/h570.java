package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class h570 implements k570 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dd50 f12467a;
    public final h3b b;
    public final jn5 c;
    public final ijl d;
    public final vdt e;

    public h570(dd50 dd50Var, h3b h3bVar, jn5 jn5Var, ijl ijlVar, vdt vdtVar) {
        this.f12467a = dd50Var;
        this.b = h3bVar;
        this.c = jn5Var;
        this.d = ijlVar;
        this.e = vdtVar;
    }

    @Override // a.k570
    public final dd50 a() {
        return this.f12467a;
    }

    @Override // a.k570
    public final jn5 b() {
        return this.c;
    }

    @Override // a.k570
    public final ijl c() {
        return this.d;
    }

    @Override // a.k570
    public final h3b d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h570)) {
            return false;
        }
        h570 h570Var = (h570) obj;
        return this.f12467a.equals(h570Var.f12467a) && this.b.equals(h570Var.b) && this.c.equals(h570Var.c) && this.d == h570Var.d && this.e.equals(h570Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f12467a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Content(navigationBarUiState=" + this.f12467a + ", categoriesUiState=" + this.b + ", balanceUiState=" + this.c + ", accountSelectionStyle=" + this.d + ", gamesUiState=" + this.e + Separators.RPAREN;
    }
}
