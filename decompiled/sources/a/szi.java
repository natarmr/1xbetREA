package a;

/* JADX INFO: loaded from: classes5.dex */
public final class szi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cad f33072a;
    public final pfv0 b;
    public final lbu c;
    public final ctf0 d;
    public final i1w0 e;
    public final ocl f;
    public final msi g;
    public final msi h;

    public szi(cad cadVar, i1w0 i1w0Var, lbu lbuVar, ctf0 ctf0Var, ocl oclVar, pfv0 pfv0Var) {
        this.f33072a = cadVar;
        this.b = pfv0Var;
        this.c = lbuVar;
        this.d = ctf0Var;
        this.e = i1w0Var;
        this.f = oclVar;
        byte b = 18;
        this.g = new msi(this, 0, b);
        this.h = new msi(this, 1, b);
    }

    public final fiu0 a() {
        iyk iykVar = new iyk(2);
        iykVar.b(kfv0.class, this.g);
        iykVar.b(mgv0.class, this.h);
        return new fiu0(iykVar.a());
    }
}
