package a;

/* JADX INFO: loaded from: classes.dex */
public final class ukj0 implements lge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35829a;
    public final int b;
    public final u33 c;
    public final boolean d;

    public ukj0(String str, int i, u33 u33Var, boolean z) {
        this.f35829a = str;
        this.b = i;
        this.c = u33Var;
        this.d = z;
    }

    @Override // a.lge
    public final qde a(bb10 bb10Var, fa10 fa10Var, tz5 tz5Var) {
        return new ckj0(bb10Var, tz5Var, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.f35829a);
        sb.append(", index=");
        return brm0.n(sb, this.b, '}');
    }
}
