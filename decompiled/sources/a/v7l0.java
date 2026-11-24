package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v7l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2l0 f36932a;
    public final int b;
    public final int c;
    public final u1m d;
    public final boolean e;
    public final boolean f;
    public final q1l0 g;
    public final u2l0 h;

    public v7l0(c2l0 c2l0Var, int i, int i2, u1m u1mVar, boolean z, boolean z2) {
        this.f36932a = c2l0Var;
        this.b = i;
        this.c = i2;
        this.d = u1mVar;
        this.e = z;
        this.f = z2;
        this.g = new q1l0(i2);
        this.h = new u2l0(mpe.f22175a, i, z, z2, u1mVar);
    }

    @Override // a.b8l0
    public final u1l0 a() {
        return this.g;
    }

    @Override // a.b8l0
    public final g3l0 b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7l0)) {
            return false;
        }
        v7l0 v7l0Var = (v7l0) obj;
        return this.f36932a.equals(v7l0Var.f36932a) && this.b == v7l0Var.b && this.c == v7l0Var.c && this.d == v7l0Var.d && this.e == v7l0Var.e && this.f == v7l0Var.f;
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f36932a;
    }

    public final int hashCode() {
        int iA = twn.a(this.c, twn.a(this.b, this.f36932a.hashCode() * 31, 31), 31);
        u1m u1mVar = this.d;
        return Boolean.hashCode(this.f) + brm0.e((iA + (u1mVar == null ? 0 : u1mVar.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampionshipCounterWithListCheckbox(title=");
        sb.append(this.f36932a);
        sb.append(", counterValue=");
        sb.append(this.b);
        sb.append(", actionIconResId=");
        sb.append(this.c);
        sb.append(", customBadgeStyle=");
        sb.append(this.d);
        sb.append(", active=");
        return ohs0.p(", enabled=", Separators.RPAREN, sb, this.e, this.f);
    }
}
