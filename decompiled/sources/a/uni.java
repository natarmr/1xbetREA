package a;

/* JADX INFO: loaded from: classes5.dex */
public final class uni implements pp90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yp90 f35962a;
    public final imb b;
    public final knf0 c;
    public final gii0 d;
    public final wsf0 e;
    public final gst0 f;
    public final bot g;
    public final kpt h;
    public final ieu i;
    public final pmi j;

    public uni(wsf0 wsf0Var, bot botVar, knf0 knf0Var, gii0 gii0Var, yp90 yp90Var, imb imbVar, ieu ieuVar, pmi pmiVar, gst0 gst0Var, kpt kptVar) {
        this.f35962a = yp90Var;
        this.b = imbVar;
        this.c = knf0Var;
        this.d = gii0Var;
        this.e = wsf0Var;
        this.f = gst0Var;
        this.g = botVar;
        this.h = kptVar;
        this.i = ieuVar;
        this.j = pmiVar;
    }

    @Override // a.pp90
    public final gnu a() {
        return new gnu(m());
    }

    @Override // a.pp90
    public final h0q0 b() {
        c5k c5kVar = new c5k(this.c, this.d);
        dq00 dq00VarM = m();
        urt urtVarG = this.e.g();
        gst0 gst0Var = this.f;
        gst0Var.getClass();
        h0q0 h0q0Var = new h0q0();
        h0q0Var.f12247a = c5kVar;
        h0q0Var.b = dq00VarM;
        h0q0Var.c = urtVarG;
        h0q0Var.d = gst0Var;
        return h0q0Var;
    }

    @Override // a.pp90
    public final w4p0 c() {
        return new w4p0(m(), (byte) 11);
    }

    @Override // a.pp90
    public final tkt0 d() {
        return new tkt0(m());
    }

    @Override // a.pp90
    public final ali e() {
        return new ali(this.g, this.h, this.i, this.j);
    }

    @Override // a.pp90
    public final gnu f() {
        return new gnu(m());
    }

    @Override // a.pp90
    public final fnu g() {
        return new fnu(m());
    }

    @Override // a.pp90
    public final owp0 h() {
        return new owp0(m(), (byte) 8);
    }

    @Override // a.pp90
    public final tkt0 i() {
        return new tkt0(m());
    }

    @Override // a.pp90
    public final fnu j() {
        return new fnu(m());
    }

    @Override // a.pp90
    public final roi0 k() {
        return new roi0(m());
    }

    @Override // a.pp90
    public final fnu l() {
        return new fnu(m());
    }

    public final dq00 m() {
        return new dq00(this.f35962a, this.b);
    }
}
