package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class h3n implements n3n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f12393a;
    public final j83 b;
    public final o9l0 c;
    public final fex d;
    public final ial0 e;
    public final ial0 f;
    public final j83 g;
    public final j83 h;

    public h3n(j83 j83Var, j83 j83Var2, o9l0 o9l0Var, fex fexVar, ial0 ial0Var, ial0 ial0Var2, j83 j83Var3, j83 j83Var4) {
        this.f12393a = j83Var;
        this.b = j83Var2;
        this.c = o9l0Var;
        this.d = fexVar;
        this.e = ial0Var;
        this.f = ial0Var2;
        this.g = j83Var3;
        this.h = j83Var4;
    }

    @Override // a.n3n
    public final j83 a() {
        return this.f12393a;
    }

    @Override // a.n3n
    public final j83 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3n)) {
            return false;
        }
        h3n h3nVar = (h3n) obj;
        return this.f12393a.equals(h3nVar.f12393a) && this.b.equals(h3nVar.b) && this.c.equals(h3nVar.c) && this.d == h3nVar.d && this.e.equals(h3nVar.e) && this.f.equals(h3nVar.f) && this.g.equals(h3nVar.g) && this.h.equals(h3nVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + brm0.f(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + brm0.f(this.b, this.f12393a.hashCode() * 31, 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "Cricket(topInfo=" + ((Object) this.f12393a) + ", bottomInfo=" + ((Object) this.b) + ", header=" + this.c + ", inningType=" + this.d + ", teamOne=" + this.e + ", teamTwo=" + this.f + ", teamOneScore=" + ((Object) this.g) + ", teamTwoScore=" + ((Object) this.h) + Separators.RPAREN;
    }
}
