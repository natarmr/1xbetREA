package a;

/* JADX INFO: loaded from: classes5.dex */
public final class vti implements o2j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vwb0 f38008a;
    public final wdd0 b;
    public final dzu c;
    public final pyu d;
    public final iw20 e;
    public final n5d0 f = mbl.b(new psi(this, 0, (byte) 7));
    public final n5d0 g = mbl.b(new psi(this, 1, (byte) 7));
    public final n5d0 h = mbl.b(new psi(this, 2, (byte) 7));

    public vti(wdd0 wdd0Var, iw20 iw20Var, dzu dzuVar, vwb0 vwb0Var, pyu pyuVar) {
        this.f38008a = vwb0Var;
        this.b = wdd0Var;
        this.c = dzuVar;
        this.d = pyuVar;
        this.e = iw20Var;
    }

    @Override // a.o2j0
    public final vyt a() {
        return new vyt((hm7) this.h.get(), (byte) 0);
    }

    @Override // a.o2j0
    public final y3j0 b() {
        return (y3j0) this.f.get();
    }

    @Override // a.o2j0
    public final lpc c() {
        return new lpc((hm7) this.h.get(), (byte) 0);
    }

    @Override // a.o2j0
    public final pmi0 d() {
        return new pmi0((hm7) this.h.get());
    }

    @Override // a.o2j0
    public final daf e() {
        n5d0 n5d0Var = this.h;
        vyt vytVar = new vyt((hm7) n5d0Var.get(), (byte) 0);
        vpt vptVarE = this.b.e();
        x1x.x(vptVarE);
        n5d0 n5d0Var2 = this.g;
        return new daf(vytVar, vptVarE, new pyu((ost0) n5d0Var2.get()), new dnv((hm7) n5d0Var.get(), (byte) 0), new czu((ost0) n5d0Var2.get(), (byte) 1), new env((ost0) n5d0Var2.get(), (byte) 0), this.c, new czu((ost0) n5d0Var2.get(), (byte) 0), new g2v((ost0) n5d0Var2.get()), new fnv((ost0) n5d0Var2.get(), (byte) 0), this.d, ((uii) this.e.f15470a).r());
    }

    @Override // a.o2j0
    public final lpc f() {
        return new lpc((hm7) this.h.get(), (byte) 1);
    }

    @Override // a.o2j0
    public final xsu g() {
        return new xsu((hm7) this.h.get());
    }

    @Override // a.o2j0
    public final dnv h() {
        return new dnv((hm7) this.h.get(), (byte) 1);
    }

    @Override // a.o2j0
    public final vyt i() {
        return new vyt((hm7) this.h.get(), (byte) 1);
    }

    @Override // a.o2j0
    public final dnv j() {
        return new dnv((hm7) this.h.get(), (byte) 0);
    }

    @Override // a.o2j0
    public final czu k() {
        return new czu((ost0) this.g.get(), (byte) 0);
    }
}
