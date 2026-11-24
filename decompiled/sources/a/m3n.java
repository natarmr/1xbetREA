package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m3n implements n3n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f21124a;
    public final j83 b;
    public final o9l0 c;
    public final jal0 d;
    public final jal0 e;
    public final aal0 f;

    public m3n(j83 j83Var, j83 j83Var2, o9l0 o9l0Var, jal0 jal0Var, jal0 jal0Var2, aal0 aal0Var) {
        this.f21124a = j83Var;
        this.b = j83Var2;
        this.c = o9l0Var;
        this.d = jal0Var;
        this.e = jal0Var2;
        this.f = aal0Var;
    }

    @Override // a.n3n
    public final j83 a() {
        return this.f21124a;
    }

    @Override // a.n3n
    public final j83 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3n)) {
            return false;
        }
        m3n m3nVar = (m3n) obj;
        return this.f21124a.equals(m3nVar.f21124a) && this.b.equals(m3nVar.b) && this.c.equals(m3nVar.c) && this.d.equals(m3nVar.d) && this.e.equals(m3nVar.e) && this.f.equals(m3nVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + brm0.f(this.b, this.f21124a.hashCode() * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Table(topInfo=" + ((Object) this.f21124a) + ", bottomInfo=" + ((Object) this.b) + ", header=" + this.c + ", teamOne=" + this.d + ", teamTwo=" + this.e + ", score=" + this.f + Separators.RPAREN;
    }
}
