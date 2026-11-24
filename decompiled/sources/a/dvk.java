package a;

/* JADX INFO: loaded from: classes2.dex */
public final class dvk extends vzs0 {
    public final vzs0 b;
    public final vzs0 c;

    public dvk(vzs0 vzs0Var, vzs0 vzs0Var2) {
        this.b = vzs0Var;
        this.c = vzs0Var2;
    }

    @Override // a.vzs0
    public final boolean a() {
        return this.b.a() || this.c.a();
    }

    @Override // a.vzs0
    public final boolean b() {
        return this.b.b() || this.c.b();
    }

    @Override // a.vzs0
    public final g93 c(g93 g93Var) {
        g93Var.getClass();
        return this.c.c(this.b.c(g93Var));
    }

    @Override // a.vzs0
    public final pzs0 d(wsy wsyVar) {
        wsyVar.getClass();
        pzs0 pzs0VarD = this.b.d(wsyVar);
        return pzs0VarD == null ? this.c.d(wsyVar) : pzs0VarD;
    }

    @Override // a.vzs0
    public final wsy f(wsy wsyVar, t3u0 t3u0Var) {
        wsyVar.getClass();
        t3u0Var.getClass();
        return this.c.f(this.b.f(wsyVar, t3u0Var), t3u0Var);
    }
}
