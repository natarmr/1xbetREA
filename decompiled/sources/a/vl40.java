package a;

/* JADX INFO: loaded from: classes.dex */
public final class vl40 extends eg60 {
    public final vne d;
    public final t33 e;
    public final np30 f;

    public vl40(vne vneVar, t33 t33Var, np30 np30Var) {
        super(true);
        this.d = vneVar;
        this.e = t33Var;
        this.f = np30Var;
    }

    @Override // a.eg60
    public final void a() {
        qjj.W(this.d, null, null, new w620((Object) this, (yje) null, (byte) 14), 3);
    }

    @Override // a.eg60
    public final void b() {
        this.f.invoke();
    }

    @Override // a.eg60
    public final void c(pb5 pb5Var) {
        qjj.W(this.d, null, null, new ul40(this, pb5Var, null, (byte) 0), 3);
    }

    @Override // a.eg60
    public final void d(pb5 pb5Var) {
        qjj.W(this.d, null, null, new ul40(this, pb5Var, null, (byte) 1), 3);
    }
}
