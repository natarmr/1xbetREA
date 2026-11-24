package a;

/* JADX INFO: loaded from: classes.dex */
public final class uu90 extends kpb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zi80 f36289a;
    public final /* synthetic */ zi80 b;
    public final /* synthetic */ dtb c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public uu90(zi80 zi80Var, zi80 zi80Var2, dtb dtbVar, int i, int i2) {
        this.f36289a = zi80Var;
        this.b = zi80Var2;
        this.c = dtbVar;
        this.d = i;
        this.e = i2;
    }

    @Override // a.kpb
    public final int I() {
        return this.e;
    }

    @Override // a.kpb
    public final int J() {
        return this.d;
    }

    @Override // a.kpb
    public final boolean s(int i, int i2) {
        Object objC = this.f36289a.c(i);
        Object objC2 = this.b.c(i2);
        if (objC == objC2) {
            return true;
        }
        return this.c.w(objC, objC2);
    }

    @Override // a.kpb
    public final boolean t(int i, int i2) {
        Object objC = this.f36289a.c(i);
        Object objC2 = this.b.c(i2);
        if (objC == objC2) {
            return true;
        }
        return this.c.x(objC, objC2);
    }

    @Override // a.kpb
    public final Object z(int i, int i2) {
        Object objC = this.f36289a.c(i);
        Object objC2 = this.b.c(i2);
        return objC == objC2 ? Boolean.TRUE : this.c.E(objC, objC2);
    }
}
