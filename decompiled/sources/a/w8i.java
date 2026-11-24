package a;

/* JADX INFO: loaded from: classes3.dex */
public final class w8i implements hn4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gst0 f38723a;
    public final us00 b;
    public final vwb0 c;
    public final h760 d;
    public final pru e;
    public final v6j0 f;
    public final ik4 g;
    public final rrc h;
    public final kt2 i;
    public final knf0 j;
    public final peg0 k;
    public final n5d0 l = mbl.b(new p8i((byte) 1));

    public w8i(h760 h760Var, us00 us00Var, gst0 gst0Var, rrc rrcVar, pru pruVar, v6j0 v6j0Var, ik4 ik4Var, vwb0 vwb0Var, kt2 kt2Var, knf0 knf0Var, peg0 peg0Var) {
        this.f38723a = gst0Var;
        this.b = us00Var;
        this.c = vwb0Var;
        this.d = h760Var;
        this.e = pruVar;
        this.f = v6j0Var;
        this.g = ik4Var;
        this.h = rrcVar;
        this.i = kt2Var;
        this.j = knf0Var;
        this.k = peg0Var;
    }

    @Override // a.hn4
    public final wsf0 a() {
        return new wsf0(i(), (byte) 18);
    }

    @Override // a.hn4
    public final nhf0 b() {
        gst0 gst0Var = this.f38723a;
        return new nhf0(new gqt(gst0Var, (byte) 1), new gqt(gst0Var, (byte) 0), new lrc(i(), (byte) 24), new ort(gst0Var, (byte) 1));
    }

    @Override // a.hn4
    public final uyn c() {
        return new uyn(i());
    }

    @Override // a.hn4
    public final g860 d() {
        return new g860(this.f38723a);
    }

    @Override // a.hn4
    public final sek e() {
        i();
        return new sek();
    }

    @Override // a.hn4
    public final owp0 f() {
        return new owp0(i(), (byte) 7);
    }

    @Override // a.hn4
    public final nw20 g() {
        return new nw20(new sqt(i()), new c5c(i(), this.h, this.g), new gqt(this.f38723a, (byte) 1));
    }

    @Override // a.hn4
    public final esg0 h() {
        gst0 gst0Var = this.f38723a;
        gqt gqtVar = new gqt(gst0Var, (byte) 1);
        dzt dztVar = new dzt(this.f, (byte) 1);
        gqt gqtVar2 = new gqt(gst0Var, (byte) 0);
        on4 on4VarI = i();
        nr nrVar = new nr(this.i, this.j, this.k);
        ik4 ik4Var = this.g;
        gst0 gst0Var2 = this.f38723a;
        rrc rrcVar = this.h;
        return new esg0(this.e, gqtVar, dztVar, gqtVar2, new w5z(on4VarI, ik4Var, gst0Var2, rrcVar, nrVar), new c5c(i(), rrcVar, ik4Var));
    }

    public final on4 i() {
        ln4 ln4Var = new ln4(this.b);
        rn4 rn4Var = (rn4) this.l.get();
        t760 t760VarA = this.d.a();
        x1x.x(t760VarA);
        return new on4(ln4Var, rn4Var, this.c, t760VarA);
    }
}
