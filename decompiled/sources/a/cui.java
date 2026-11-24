package a;

/* JADX INFO: loaded from: classes5.dex */
public final class cui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cad f4987a;
    public final gii0 b;
    public final knf0 c;
    public final gst0 d;
    public final viu e;
    public final lsn f;
    public final vqc g;
    public final b3c0 h;
    public final pru i;
    public final n5d0 j;
    public final n5d0 k;
    public final n5d0 l;
    public final n5d0 m;
    public final n5d0 n;
    public final n5d0 o;
    public final n5d0 p;
    public final n5d0 q;
    public final n5d0 r;
    public final n5d0 s;
    public final n5d0 t;
    public final n5d0 u;
    public final n5d0 v;
    public final n5d0 w;

    public cui(cad cadVar, vqc vqcVar, lsn lsnVar, viu viuVar, gii0 gii0Var, knf0 knf0Var, gst0 gst0Var, b3c0 b3c0Var, pru pruVar) {
        this.f4987a = cadVar;
        this.b = gii0Var;
        this.c = knf0Var;
        this.d = gst0Var;
        this.e = viuVar;
        this.f = lsnVar;
        this.g = vqcVar;
        this.h = b3c0Var;
        this.i = pruVar;
        byte b = 9;
        this.j = mbl.b(new psi(this, 0, b));
        this.k = mbl.b(new psi(this, 1, b));
        this.l = mbl.b(new psi(this, 2, b));
        this.m = mbl.b(new psi(this, 3, b));
        this.n = mbl.b(new psi(this, 4, b));
        this.o = mbl.b(new psi(this, 5, b));
        this.p = n0k0.a(new psi(this, 6, b));
        this.q = n0k0.a(new psi(this, 7, b));
        this.r = n0k0.a(new psi(this, 8, b));
        this.s = n0k0.a(new psi(this, b, b));
        this.t = n0k0.a(new psi(this, 10, b));
        this.u = mbl.b(new psi(this, 12, b));
        this.v = mbl.b(new psi(this, 13, b));
        this.w = mbl.b(new psi(this, 11, b));
    }

    public final b6t a() {
        return (b6t) this.r.get();
    }

    public final yhi b() {
        mne mneVarH = ((psc) this.f4987a.b).h();
        x1x.x(mneVarH);
        n5d0 n5d0Var = this.q;
        p6t p6tVar = (p6t) n5d0Var.get();
        viu viuVar = this.e;
        gst0 gst0Var = this.d;
        khf0 khf0Var = new khf0(p6tVar, gst0Var, viuVar);
        n5d0 n5d0Var2 = this.p;
        lbu lbuVar = new lbu((u6t) n5d0Var2.get(), gst0Var);
        n5d0 n5d0Var3 = this.r;
        n4u n4uVar = new n4u((b6t) n5d0Var3.get());
        gbi gbiVar = (gbi) this.f.f20589a;
        v7i v7iVarK = gbiVar.k();
        v7i v7iVarK2 = gbiVar.k();
        aqx aqxVar = new aqx((p6t) n5d0Var.get(), (byte) 1);
        bqx bqxVar = new bqx((u6t) n5d0Var2.get(), (byte) 1);
        zpx zpxVar = new zpx((b6t) n5d0Var3.get(), (byte) 1);
        bqx bqxVar2 = new bqx((u6t) n5d0Var2.get(), (byte) 0);
        aqx aqxVar2 = new aqx((p6t) n5d0Var.get(), (byte) 0);
        zpx zpxVar2 = new zpx((b6t) n5d0Var3.get(), (byte) 0);
        uzc uzcVarA = ((cih) this.g.b).a();
        rou rouVar = new rou(this.h, (byte) 0);
        iqt iqtVar = new iqt(gst0Var);
        n5d0 n5d0Var4 = this.s;
        return new yhi(mneVarH, khf0Var, lbuVar, n4uVar, aqxVar, bqxVar, zpxVar, bqxVar2, aqxVar2, zpxVar2, uzcVarA, rouVar, iqtVar, new cnv((aag0) n5d0Var4.get()), new fmt0((aag0) n5d0Var4.get()), v7iVarK, v7iVarK2, this.i);
    }
}
