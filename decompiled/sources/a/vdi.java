package a;

/* JADX INFO: loaded from: classes3.dex */
public final class vdi implements y4g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gii0 f37234a;
    public final n5d0 b;
    public final n5d0 c;
    public final n5d0 d;
    public final n5d0 e;
    public final n5d0 f;

    public vdi(gii0 gii0Var) {
        this.f37234a = gii0Var;
        byte b = 6;
        this.b = n0k0.a(new dci(this, 0, b));
        this.c = mbl.b(new dci(this, 2, b));
        this.d = mbl.b(new dci(this, 1, b));
        this.e = mbl.b(new dci(this, 4, b));
        this.f = mbl.b(new dci(this, 3, b));
    }

    @Override // a.y4g
    public final ul9 a() {
        return (ul9) this.d.get();
    }

    @Override // a.y4g
    public final ul9 b() {
        return (ul9) this.f.get();
    }

    @Override // a.y4g
    public final y9g c() {
        return (y9g) this.b.get();
    }
}
