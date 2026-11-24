package a;

/* JADX INFO: loaded from: classes6.dex */
public final class g7l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2l0 f10821a;
    public final int b;
    public final Integer c;
    public final t1l0 d;
    public final w2l0 e;

    public g7l0(a2l0 a2l0Var, int i, Integer num) {
        this.f10821a = a2l0Var;
        this.b = i;
        this.c = num;
        p1l0 p1l0Var = p1l0.CHAMPIONSHIP_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.d = new t1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), null, num, null, null, 192);
        this.e = new w2l0(i, new kpe());
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
        if (!(obj instanceof g7l0)) {
            return false;
        }
        g7l0 g7l0Var = (g7l0) obj;
        return this.f10821a.equals(g7l0Var.f10821a) && this.b == g7l0Var.b && this.c.equals(g7l0Var.c);
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f10821a;
    }

    public final int hashCode() {
        return (this.c.hashCode() + twn.a(this.b, this.f10821a.hashCode() * 31, 961)) * 961;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultChampionshipCounter(title=");
        sb.append(this.f10821a);
        sb.append(", counterValue=");
        sb.append(this.b);
        sb.append(", iconUrl=null, iconResId=");
        return dw9.q(sb, this.c, ", iconColor=null, badgeStyle=null)");
    }
}
