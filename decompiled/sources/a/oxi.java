package a;

/* JADX INFO: loaded from: classes4.dex */
public final class oxi implements n5r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final viu f26013a;
    public final vqc b;
    public final gii0 c;
    public final s5r0 d;
    public final knf0 e;
    public final x2c0 f;
    public final lsn g;
    public final gst0 h;
    public final iw20 i;
    public final nr00 j;

    public oxi(lsn lsnVar, nr00 nr00Var, iw20 iw20Var, vqc vqcVar, s5r0 s5r0Var, gii0 gii0Var, knf0 knf0Var, x2c0 x2c0Var, gst0 gst0Var, viu viuVar) {
        this.f26013a = viuVar;
        this.b = vqcVar;
        this.c = gii0Var;
        this.d = s5r0Var;
        this.e = knf0Var;
        this.f = x2c0Var;
        this.g = lsnVar;
        this.h = gst0Var;
        this.i = iw20Var;
        this.j = nr00Var;
    }

    @Override // a.n5r0
    public final ani0 a() {
        return new ani0(e());
    }

    @Override // a.n5r0
    public final spc b() {
        return new spc(e());
    }

    @Override // a.n5r0
    public final daf c() {
        azt aztVar = new azt(((cih) this.b.b).a(), (byte) 0);
        yfu yfuVar = new yfu(e());
        n4u n4uVar = new n4u(e(), (byte) 20);
        spc spcVar = new spc(e());
        h0q0 h0q0VarE = e();
        v7i v7iVarK = ((gbi) this.g.f20589a).k();
        gst0 gst0Var = this.h;
        return new daf(this.f26013a, aztVar, yfuVar, n4uVar, spcVar, h0q0VarE, v7iVarK, new x4v(gst0Var, (byte) 0), new ocl(e()), new t4v(gst0Var, (byte) 1), new wsc(gst0Var, (byte) 4), ((uii) this.i.f15470a).r());
    }

    @Override // a.n5r0
    public final tzi d() {
        xsu xsuVar = new xsu(e());
        gst0 gst0Var = this.h;
        return new tzi(xsuVar, new x4v(gst0Var, (byte) 0), ((uii) this.i.f15470a).r(), new azt(((cih) this.b.b).a(), (byte) 0), this.f26013a, new yfu(e()), new n4u(e(), (byte) 20), ((ru) this.j.f23980a).h(), new t4v(gst0Var, (byte) 1), new wsc(gst0Var, (byte) 4), (byte) 7);
    }

    public final h0q0 e() {
        w4p0 w4p0Var = new w4p0(this.c, (byte) 2);
        s5r0 s5r0Var = this.d;
        s5r0Var.getClass();
        knf0 knf0Var = this.e;
        knf0Var.getClass();
        x2c0 x2c0Var = this.f;
        x2c0Var.getClass();
        h0q0 h0q0Var = new h0q0();
        h0q0Var.f12247a = w4p0Var;
        h0q0Var.b = s5r0Var;
        h0q0Var.c = knf0Var;
        h0q0Var.d = x2c0Var;
        return h0q0Var;
    }
}
