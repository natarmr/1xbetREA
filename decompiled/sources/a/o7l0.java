package a;

/* JADX INFO: loaded from: classes6.dex */
public final class o7l0 implements s7l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2l0 f24792a;
    public final int b;
    public final Integer c;
    public final t1l0 d;
    public final z2l0 e;

    public o7l0(a2l0 a2l0Var, int i, Integer num) {
        this.f24792a = a2l0Var;
        this.b = i;
        this.c = num;
        p1l0 p1l0Var = p1l0.CHAMPIONSHIP_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.d = new t1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), null, num, null, null, 192);
        this.e = new z2l0(new fpe(new y3d(s6t0.b().f33626a.getSecondary()), false, 2), i, s6t0.b().f33626a.getSecondary());
    }

    @Override // a.b8l0
    public final u1l0 a() {
        return this.d;
    }

    @Override // a.b8l0
    public final g3l0 b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7l0)) {
            return false;
        }
        o7l0 o7l0Var = (o7l0) obj;
        return this.f24792a.equals(o7l0Var.f24792a) && this.b == o7l0Var.b && this.c.equals(o7l0Var.c);
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f24792a;
    }

    public final int hashCode() {
        return (this.c.hashCode() + twn.a(this.b, this.f24792a.hashCode() * 31, 961)) * 961;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultChampionshipCounter(title=");
        sb.append(this.f24792a);
        sb.append(", counterValue=");
        sb.append(this.b);
        sb.append(", iconUrl=null, iconResId=");
        return dw9.q(sb, this.c, ", iconColor=null, badgeStyle=null)");
    }
}
