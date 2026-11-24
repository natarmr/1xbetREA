package a;

/* JADX INFO: loaded from: classes.dex */
public final class hlz implements kmf0, qvj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final glz f13283a;
    public final bby b;

    public hlz(glz glzVar, bby bbyVar) {
        this.f13283a = glzVar;
        this.b = bbyVar;
    }

    @Override // a.kmf0
    public final void b() {
        this.f13283a.f(this);
    }

    @Override // a.kmf0
    public final void c() {
        this.f13283a.a(this);
    }

    @Override // a.kmf0
    public final Object d(fbe0 fbe0Var) {
        return x1x.v(this.f13283a, fbe0Var);
    }

    @Override // a.qvj
    public final void onDestroy(clz clzVar) {
        this.b.cancel(null);
    }
}
