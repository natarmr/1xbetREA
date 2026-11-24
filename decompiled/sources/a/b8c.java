package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class b8c {
    public static final a8c Companion = new a8c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z7c f2149a;
    public final vwp0 b;

    public /* synthetic */ b8c(int i, z7c z7cVar, vwp0 vwp0Var) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, w7c.f38665a.getDescriptor());
            throw null;
        }
        this.f2149a = z7cVar;
        this.b = vwp0Var;
    }

    public b8c(String str, swp0 swp0Var) {
        str.getClass();
        swp0Var.getClass();
        z7c z7cVar = new z7c(str);
        vwp0 vwp0Var = new vwp0(swp0Var);
        this.f2149a = z7cVar;
        this.b = vwp0Var;
    }
}
