package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class x7l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2l0 f40419a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final u2l0 e;

    public x7l0(c2l0 c2l0Var, int i, boolean z, boolean z2) {
        this.f40419a = c2l0Var;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = new u2l0(mpe.f22175a, i, z, z2, null);
    }

    @Override // a.b8l0
    public final u1l0 a() {
        return null;
    }

    @Override // a.b8l0
    public final g3l0 b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7l0)) {
            return false;
        }
        x7l0 x7l0Var = (x7l0) obj;
        return this.f40419a.equals(x7l0Var.f40419a) && this.b == x7l0Var.b && this.c == x7l0Var.c && this.d == x7l0Var.d;
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f40419a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(twn.a(this.b, this.f40419a.hashCode() * 31, 961), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultChampionshipCounterWithListCheckbox(title=");
        sb.append(this.f40419a);
        sb.append(", counterValue=");
        sb.append(this.b);
        sb.append(", customBadgeStyle=null, active=");
        return ohs0.p(", enabled=", Separators.RPAREN, sb, this.c, this.d);
    }
}
