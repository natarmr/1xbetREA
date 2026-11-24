package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ipi implements kib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7d0 f15164a;
    public final rrc b;
    public final n5d0 c;
    public final n5d0 d;
    public final n5d0 e;
    public final n5d0 f;
    public final n5d0 g;
    public final n5d0 h;
    public final n5d0 i;

    public ipi(rrc rrcVar, q7d0 q7d0Var) {
        this.f15164a = q7d0Var;
        this.b = rrcVar;
        byte b = 18;
        this.c = n0k0.a(new omi(this, 0, b));
        this.d = n0k0.a(new omi(this, 1, b));
        this.e = n0k0.a(new omi(this, 2, b));
        this.f = n0k0.a(new omi(this, 3, b));
        this.g = n0k0.a(new omi(this, 5, b));
        this.h = n0k0.a(new omi(this, 4, b));
        this.i = n0k0.a(new omi(this, 6, b));
    }

    @Override // a.kib0
    public final xrt a() {
        return (xrt) this.c.get();
    }

    @Override // a.kib0
    public final qqx b() {
        return (qqx) this.g.get();
    }

    @Override // a.kib0
    public final hou c() {
        return (hou) this.h.get();
    }

    @Override // a.kib0
    public final jbx d() {
        return (jbx) this.f.get();
    }

    @Override // a.kib0
    public final gmu e() {
        return (gmu) this.d.get();
    }

    @Override // a.kib0
    public final nrc f() {
        return (nrc) this.i.get();
    }

    @Override // a.kib0
    public final puu g() {
        return (puu) this.e.get();
    }

    public final nv20 h() {
        return new nv20(new of6(this.f15164a, (byte) 1));
    }
}
