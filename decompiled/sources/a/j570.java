package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j570 implements k570 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dd50 f15921a;
    public final h3b b;
    public final jn5 c;
    public final ijl d;

    public j570(dd50 dd50Var, h3b h3bVar, jn5 jn5Var, ijl ijlVar) {
        this.f15921a = dd50Var;
        this.b = h3bVar;
        this.c = jn5Var;
        this.d = ijlVar;
    }

    @Override // a.k570
    public final dd50 a() {
        return this.f15921a;
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
        if (!(obj instanceof j570)) {
            return false;
        }
        j570 j570Var = (j570) obj;
        return this.f15921a.equals(j570Var.f15921a) && this.b.equals(j570Var.b) && this.c.equals(j570Var.c) && this.d == j570Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f15921a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Loading(navigationBarUiState=" + this.f15921a + ", categoriesUiState=" + this.b + ", balanceUiState=" + this.c + ", accountSelectionStyle=" + this.d + Separators.RPAREN;
    }
}
