package a;

/* JADX INFO: loaded from: classes3.dex */
public final class yq70 implements uq70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k6k0 f43063a;
    public final va b;

    public yq70(k6k0 k6k0Var) {
        k6k0Var.getClass();
        this.f43063a = k6k0Var;
        this.b = new va(k6k0Var.k, (byte) 19);
    }

    @Override // a.uq70
    public final void a() {
        this.f43063a.c();
    }

    @Override // a.uq70
    public final void b(xo9 xo9Var) {
        this.f43063a.e(new t5k0(xo9Var.f41204a, xo9Var.b, xo9Var.c, xo9Var.d, xo9Var.e));
    }

    @Override // a.uq70
    public final void c() {
        this.f43063a.i.f17078a.a("onCallEndedByUser", "call ended by user");
    }

    @Override // a.uq70
    public final void close() {
        this.f43063a.a();
    }

    @Override // a.uq70
    public final void d(boolean z) {
        this.f43063a.f.f34929a.setSpeakerphoneOn(z);
    }

    @Override // a.uq70
    public final void e(boolean z) {
        this.f43063a.e.e.set(!z);
    }

    @Override // a.uq70
    public final boolean f() {
        return this.f43063a.s != null;
    }

    @Override // a.uq70
    public final boolean g() {
        return ((y5k0) this.f43063a.c.d.get()).d;
    }

    @Override // a.uq70
    public final gmq h() {
        return this.b;
    }
}
