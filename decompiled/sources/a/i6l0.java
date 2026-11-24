package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class i6l0 implements k6l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14246a;
    public final qzl b;
    public final String c;
    public final d280 d;
    public final d280 e;
    public final String f;
    public final String g;
    public final j83 h;
    public final j83 i;

    public i6l0(long j, qzl qzlVar, String str, d280 d280Var, d280 d280Var2, String str2, String str3, j83 j83Var, j83 j83Var2) {
        this.f14246a = j;
        this.b = qzlVar;
        this.c = str;
        this.d = d280Var;
        this.e = d280Var2;
        this.f = str2;
        this.g = str3;
        this.h = j83Var;
        this.i = j83Var2;
    }

    @Override // a.k6l0
    public final long a() {
        return this.f14246a;
    }

    @Override // a.k6l0
    public final qzl c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6l0)) {
            return false;
        }
        i6l0 i6l0Var = (i6l0) obj;
        return this.f14246a == i6l0Var.f14246a && this.b.equals(i6l0Var.b) && this.c.equals(i6l0Var.c) && this.d.equals(i6l0Var.d) && this.e.equals(i6l0Var.e) && this.f.equals(i6l0Var.f) && this.g.equals(i6l0Var.g) && this.h.equals(i6l0Var.h) && this.i.equals(i6l0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + brm0.f(this.h, ua80.b(ua80.b(twn.e(this.e, twn.e(this.d, ua80.b((this.b.hashCode() + (Long.hashCode(this.f14246a) * 31)) * 31, 31, this.c), 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        return "TwoOpponents(gameId=" + this.f14246a + ", bottomBlock=" + this.b + ", opponentOneName=" + this.c + ", opponentOneLogo=" + this.d + ", opponentTwoLogo=" + this.e + ", opponentTwoName=" + this.f + ", infoLabel=" + this.g + ", opponentOneScore=" + ((Object) this.h) + ", opponentTwoScore=" + ((Object) this.i) + Separators.RPAREN;
    }
}
