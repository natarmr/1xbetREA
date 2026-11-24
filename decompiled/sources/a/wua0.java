package a;

/* JADX INFO: loaded from: classes.dex */
public final class wua0 implements lge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39782a;
    public final int b;
    public final v33 c;
    public final b43 d;
    public final v33 e;
    public final v33 f;
    public final v33 g;
    public final v33 h;
    public final v33 i;
    public final boolean j;
    public final boolean k;

    public wua0(String str, int i, v33 v33Var, b43 b43Var, v33 v33Var2, v33 v33Var3, v33 v33Var4, v33 v33Var5, v33 v33Var6, boolean z, boolean z2) {
        this.f39782a = str;
        this.b = i;
        this.c = v33Var;
        this.d = b43Var;
        this.e = v33Var2;
        this.f = v33Var3;
        this.g = v33Var4;
        this.h = v33Var5;
        this.i = v33Var6;
        this.j = z;
        this.k = z2;
    }

    @Override // a.lge
    public final qde a(bb10 bb10Var, fa10 fa10Var, tz5 tz5Var) {
        return new vua0(bb10Var, tz5Var, this);
    }
}
