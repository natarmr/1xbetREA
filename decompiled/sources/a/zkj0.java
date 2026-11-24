package a;

/* JADX INFO: loaded from: classes.dex */
public final class zkj0 implements lge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44537a;
    public final v33 b;
    public final v33 c;
    public final v33 d;
    public final boolean e;

    public zkj0(String str, int i, v33 v33Var, v33 v33Var2, v33 v33Var3, boolean z) {
        this.f44537a = i;
        this.b = v33Var;
        this.c = v33Var2;
        this.d = v33Var3;
        this.e = z;
    }

    @Override // a.lge
    public final qde a(bb10 bb10Var, fa10 fa10Var, tz5 tz5Var) {
        return new lrs0(tz5Var, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
