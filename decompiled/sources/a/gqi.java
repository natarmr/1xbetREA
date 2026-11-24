package a;

/* JADX INFO: loaded from: classes5.dex */
public final class gqi implements c1d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1d0 f11734a;
    public final gii0 b;
    public final a1d0 c;
    public final knf0 d;
    public final tgk e;
    public final cs00 f;

    public gqi(cs00 cs00Var, a1d0 a1d0Var, j1d0 j1d0Var, gii0 gii0Var, knf0 knf0Var, tgk tgkVar) {
        this.f11734a = j1d0Var;
        this.b = gii0Var;
        this.c = a1d0Var;
        this.d = knf0Var;
        this.e = tgkVar;
        this.f = cs00Var;
    }

    @Override // a.c1d0
    public final fl70 a() {
        return new fl70();
    }

    @Override // a.c1d0
    public final a1d0 b() {
        return this.c;
    }

    @Override // a.c1d0
    public final orc c() {
        return new orc(j());
    }

    @Override // a.c1d0
    public final zx10 d() {
        return new zx10(new orc(j()));
    }

    @Override // a.c1d0
    public final ylt0 e() {
        return new ylt0(new ppu(j()), this.f.d());
    }

    @Override // a.c1d0
    public final orc f() {
        return new orc(j());
    }

    @Override // a.c1d0
    public final i1d0 g() {
        return new i1d0(new iw20(j()));
    }

    @Override // a.c1d0
    public final ppu h() {
        return new ppu(j());
    }

    @Override // a.c1d0
    public final iw20 i() {
        return new iw20(j());
    }

    public final y1d0 j() {
        return new y1d0(this.f11734a, new jw20(this.b, (byte) 16), this.c, this.d, this.e);
    }
}
