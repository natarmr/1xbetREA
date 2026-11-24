package a;

/* JADX INFO: loaded from: classes.dex */
public final class kjc implements lge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18380a;
    public final b43 b;
    public final u33 c;
    public final boolean d;
    public final boolean e;

    public kjc(String str, b43 b43Var, u33 u33Var, boolean z, boolean z2) {
        this.f18380a = str;
        this.b = b43Var;
        this.c = u33Var;
        this.d = z;
        this.e = z2;
    }

    @Override // a.lge
    public final qde a(bb10 bb10Var, fa10 fa10Var, tz5 tz5Var) {
        return new dsn(bb10Var, tz5Var, this);
    }
}
