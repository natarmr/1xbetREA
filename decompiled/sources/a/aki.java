package a;

/* JADX INFO: loaded from: classes5.dex */
public final class aki implements rz00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gii0 f1024a;
    public final knf0 b;
    public final cad c;
    public final n5d0 d;
    public final n5d0 e;
    public final n5d0 f;
    public final n5d0 g;
    public final n5d0 h;
    public final n5d0 i;
    public final n5d0 j;
    public final n5d0 k;
    public final n5d0 l;

    public aki(cad cadVar, knf0 knf0Var, gii0 gii0Var) {
        this.f1024a = gii0Var;
        this.b = knf0Var;
        this.c = cadVar;
        byte b = 17;
        this.d = n0k0.a(new rii(this, 2, b));
        this.e = mbl.b(new rii(this, 1, b));
        this.f = n0k0.a(new rii(this, 0, b));
        this.g = mbl.b(new rii(this, 3, b));
        this.h = mbl.b(new rii(this, 4, b));
        this.i = n0k0.a(new rii(this, 5, b));
        this.j = mbl.b(new rii(this, 6, b));
        this.k = mbl.b(new rii(this, 7, b));
        this.l = mbl.b(new rii(this, 8, b));
    }

    @Override // a.rz00
    public final iju a() {
        return (iju) this.f.get();
    }

    @Override // a.rz00
    public final rju b() {
        return (rju) this.i.get();
    }

    @Override // a.rz00
    public final lju c() {
        return (lju) this.g.get();
    }

    @Override // a.rz00
    public final cju d() {
        return (cju) this.h.get();
    }

    @Override // a.rz00
    public final oju e() {
        return (oju) this.j.get();
    }

    @Override // a.rz00
    public final fju f() {
        return (fju) this.l.get();
    }

    public final stb0 g() {
        return (stb0) this.k.get();
    }

    public final ugf0 h() {
        f310 f310Var = (f310) this.e.get();
        f310Var.getClass();
        ugf0 ugf0Var = new ugf0();
        ugf0Var.f35622a = f310Var;
        return ugf0Var;
    }
}
