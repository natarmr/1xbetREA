package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ch80 implements hh80 {
    public final /* synthetic */ hh80 b;
    public final /* synthetic */ hh80 c;

    public ch80(hh80 hh80Var, hh80 hh80Var2) {
        this.b = hh80Var;
        this.c = hh80Var2;
    }

    @Override // a.hh80
    public final float a() {
        return this.c.a() + this.b.a();
    }

    @Override // a.hh80
    public final float b(k6z k6zVar) {
        return this.c.b(k6zVar) + this.b.b(k6zVar);
    }

    @Override // a.hh80
    public final float c(k6z k6zVar) {
        return this.c.c(k6zVar) + this.b.c(k6zVar);
    }

    @Override // a.hh80
    public final float d() {
        return this.c.d() + this.b.d();
    }
}
