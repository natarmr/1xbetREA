package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class e6l0 implements k6l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7291a;
    public final qzl b;
    public final String c;
    public final d280 d;
    public final d280 e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final j83 j;
    public final int k;
    public final int l;
    public final j83 m;

    public e6l0(long j, qzl qzlVar, String str, d280 d280Var, d280 d280Var2, String str2, String str3, int i, int i2, j83 j83Var, int i3, int i4, j83 j83Var2) {
        this.f7291a = j;
        this.b = qzlVar;
        this.c = str;
        this.d = d280Var;
        this.e = d280Var2;
        this.f = str2;
        this.g = str3;
        this.h = i;
        this.i = i2;
        this.j = j83Var;
        this.k = i3;
        this.l = i4;
        this.m = j83Var2;
    }

    @Override // a.k6l0
    public final long a() {
        return this.f7291a;
    }

    @Override // a.k6l0
    public final qzl c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6l0)) {
            return false;
        }
        e6l0 e6l0Var = (e6l0) obj;
        return this.f7291a == e6l0Var.f7291a && this.b.equals(e6l0Var.b) && this.c.equals(e6l0Var.c) && this.d.equals(e6l0Var.d) && this.e.equals(e6l0Var.e) && this.f.equals(e6l0Var.f) && this.g.equals(e6l0Var.g) && this.h == e6l0Var.h && this.i == e6l0Var.i && this.j.equals(e6l0Var.j) && this.k == e6l0Var.k && this.l == e6l0Var.l && this.m.equals(e6l0Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + twn.a(this.l, twn.a(this.k, brm0.f(this.j, twn.a(this.i, twn.a(this.h, ua80.b(ua80.b(twn.e(this.e, twn.e(this.d, ua80.b((this.b.hashCode() + (Long.hashCode(this.f7291a) * 31)) * 31, 31, this.c), 31), 31), 31, this.f), 31, this.g), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cyber(gameId=");
        sb.append(this.f7291a);
        sb.append(", bottomBlock=");
        sb.append(this.b);
        sb.append(", opponentOneName=");
        sb.append(this.c);
        sb.append(", opponentOneLogo=");
        sb.append(this.d);
        sb.append(", opponentTwoLogo=");
        sb.append(this.e);
        sb.append(", opponentTwoName=");
        sb.append(this.f);
        axq.s(this.h, ", infoLabel=", this.g, ", opponentOneTotalCount=", sb);
        sb.append(", opponentOneWinCount=");
        sb.append(this.i);
        sb.append(", opponentOneScoreResult=");
        sb.append((Object) this.j);
        rw2.s(this.k, this.l, ", opponentTwoTotalCount=", ", opponentTwoWinCount=", sb);
        sb.append(", opponentTwoScoreResult=");
        sb.append((Object) this.m);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
