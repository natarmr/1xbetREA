package a;

/* JADX INFO: loaded from: classes5.dex */
public final class wmq0 extends w46 {
    public static final g9i0 i = g9i0.DAY;
    public final vzg0 b;
    public final i1w0 c;
    public final f5a d;
    public final duj e;
    public final p7m0 f = q7m0.a(Boolean.FALSE);
    public final p7m0 g;
    public final ol60 h;

    public wmq0(vzg0 vzg0Var, i1w0 i1w0Var, f5a f5aVar, duj dujVar) {
        this.b = vzg0Var;
        this.c = i1w0Var;
        this.d = f5aVar;
        this.e = dujVar;
        g9i0 g9i0Var = (g9i0) vzg0Var.a("CURRENT_SELECTED_LIMIT_BUNDLE_KEY");
        this.g = q7m0.a(g9i0Var == null ? i : g9i0Var);
        this.h = new ol60(1, i99.b);
    }

    public final void w(umq0 umq0Var) {
        sac.V(jiu0.a(this), new t6q0((byte) 17), null, null, new ssl0((Object) this, (Object) umq0Var, (yje) null, (byte) 26), 14);
    }
}
