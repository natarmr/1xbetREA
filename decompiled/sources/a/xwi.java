package a;

/* JADX INFO: loaded from: classes5.dex */
public final class xwi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41610a;
    public final String b;
    public final gii0 c;
    public final knf0 d;
    public final cad e;
    public final ctf0 f;
    public final ocl g;
    public final i1w0 h;
    public final duj i;
    public final m1e j;
    public final ii k;
    public final n5d0 l;
    public final psi m;
    public final psi n;
    public final psi o;
    public final psi p;

    public xwi(cad cadVar, String str, String str2, i1w0 i1w0Var, duj dujVar, gii0 gii0Var, m1e m1eVar, ocl oclVar, ctf0 ctf0Var, knf0 knf0Var, ii iiVar) {
        this.f41610a = str;
        this.b = str2;
        this.c = gii0Var;
        this.d = knf0Var;
        this.e = cadVar;
        this.f = ctf0Var;
        this.g = oclVar;
        this.h = i1w0Var;
        this.i = dujVar;
        this.j = m1eVar;
        this.k = iiVar;
        byte b = 21;
        this.l = mbl.b(new psi(this, 1, b));
        this.m = new psi(this, 0, b);
        this.n = new psi(this, 2, b);
        this.o = new psi(this, 3, b);
        this.p = new psi(this, 4, b);
    }

    public final fiu0 a() {
        iyk iykVar = new iyk(4);
        iykVar.b(x0q0.class, this.m);
        iykVar.b(y4q.class, this.n);
        iykVar.b(rg30.class, this.o);
        iykVar.b(mjh0.class, this.p);
        return new fiu0(iykVar.a());
    }
}
