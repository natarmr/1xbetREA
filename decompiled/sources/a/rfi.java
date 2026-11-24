package a;

/* JADX INFO: loaded from: classes5.dex */
public final class rfi implements f3l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gii0 f30389a;
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

    public rfi(cad cadVar, knf0 knf0Var, gii0 gii0Var) {
        this.f30389a = gii0Var;
        this.b = knf0Var;
        this.c = cadVar;
        byte b = 15;
        this.d = n0k0.a(new dci(this, 2, b));
        this.e = mbl.b(new dci(this, 1, b));
        this.f = n0k0.a(new dci(this, 0, b));
        this.g = mbl.b(new dci(this, 3, b));
        this.h = mbl.b(new dci(this, 4, b));
        this.i = n0k0.a(new dci(this, 5, b));
        this.j = mbl.b(new dci(this, 6, b));
        this.k = mbl.b(new dci(this, 7, b));
        this.l = mbl.b(new dci(this, 8, b));
    }

    @Override // a.f3l
    public final g6u a() {
        return (g6u) this.h.get();
    }

    @Override // a.f3l
    public final o6u b() {
        return (o6u) this.f.get();
    }

    @Override // a.f3l
    public final r6u c() {
        return (r6u) this.g.get();
    }

    @Override // a.f3l
    public final z6u d() {
        return (z6u) this.i.get();
    }

    @Override // a.f3l
    public final j6u e() {
        return (j6u) this.l.get();
    }

    @Override // a.f3l
    public final v6u f() {
        return (v6u) this.j.get();
    }

    public final otb0 g() {
        return (otb0) this.k.get();
    }

    public final roi0 h() {
        l6l l6lVar = (l6l) this.e.get();
        l6lVar.getClass();
        roi0 roi0Var = new roi0();
        roi0Var.f30839a = l6lVar;
        return roi0Var;
    }
}
