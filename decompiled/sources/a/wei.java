package a;

/* JADX INFO: loaded from: classes4.dex */
public final class wei implements ogh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7d0 f39020a;
    public final vby b;
    public final n5d0 c;
    public final n5d0 d;
    public final n5d0 e;
    public final n5d0 f;
    public final n5d0 g;
    public final n5d0 h;

    public wei(vby vbyVar, q7d0 q7d0Var) {
        this.f39020a = q7d0Var;
        this.b = vbyVar;
        byte b = 11;
        this.c = n0k0.a(new dci(this, 2, b));
        this.d = n0k0.a(new dci(this, 1, b));
        this.e = n0k0.a(new dci(this, 0, b));
        this.f = n0k0.a(new dci(this, 3, b));
        this.g = n0k0.a(new dci(this, 4, b));
        this.h = n0k0.a(new dci(this, 5, b));
    }

    @Override // a.ogh
    public final dwu a() {
        return (dwu) this.e.get();
    }

    @Override // a.ogh
    public final ewu b() {
        return (ewu) this.f.get();
    }

    @Override // a.ogh
    public final zsi0 c() {
        return (zsi0) this.g.get();
    }

    @Override // a.ogh
    public final qgh d() {
        return (qgh) this.h.get();
    }
}
