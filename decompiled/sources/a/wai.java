package a;

/* JADX INFO: loaded from: classes5.dex */
public final class wai implements gh9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gii0 f38827a;
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

    public wai(cad cadVar, knf0 knf0Var, gii0 gii0Var) {
        this.f38827a = gii0Var;
        this.b = knf0Var;
        this.c = cadVar;
        byte b = 23;
        this.d = mbl.b(new r5i(this, 2, b));
        this.e = mbl.b(new r5i(this, 1, b));
        this.f = mbl.b(new r5i(this, 0, b));
        this.g = mbl.b(new r5i(this, 3, b));
        this.h = mbl.b(new r5i(this, 4, b));
        this.i = mbl.b(new r5i(this, 5, b));
        this.j = mbl.b(new r5i(this, 6, b));
        this.k = mbl.b(new r5i(this, 7, b));
    }

    @Override // a.gh9
    public final cvt a() {
        return (cvt) this.i.get();
    }

    @Override // a.gh9
    public final zut b() {
        return (zut) this.j.get();
    }

    @Override // a.gh9
    public final a7q c() {
        return new a7q((oh9) this.e.get());
    }

    @Override // a.gh9
    public final tut d() {
        return (tut) this.h.get();
    }

    @Override // a.gh9
    public final wut e() {
        return (wut) this.f.get();
    }

    @Override // a.gh9
    public final out f() {
        return (out) this.g.get();
    }

    public final ntb0 g() {
        return (ntb0) this.k.get();
    }

    public final o470 h() {
        return new o470((oh9) this.e.get());
    }
}
