package a;

/* JADX INFO: loaded from: classes4.dex */
public final class j6b0 extends i3t0 {
    public static final /* synthetic */ int F = 0;
    public final viu A;
    public bby B;
    public bby C;
    public bby D;
    public bby E;
    public final z7z o;
    public final j3c p;
    public final qgd q;
    public final luu r;
    public final ywq0 s;
    public final b7b0 t;
    public final m1e u;
    public final bzt v;
    public final lbu w;
    public final pru x;
    public final mne y;
    public final rkt0 z;

    public j6b0(vzg0 vzg0Var, z7z z7zVar, y78 y78Var, j3c j3cVar, qgd qgdVar, luu luuVar, ywq0 ywq0Var, b7b0 b7b0Var, m1e m1eVar, bzt bztVar, lbu lbuVar, pru pruVar, mne mneVar, rkt0 rkt0Var, ctf0 ctf0Var, svu svuVar, r9u r9uVar, viu viuVar) {
        z7zVar.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        bz bzVar = new bz(r9uVar, (byte) 2);
        jl40 jl40Var = new jl40((Object) svuVar, (Object) ctf0Var, (Object) y78Var, (byte) 28);
        rwj rwjVar = mneVar.f22085a;
        super(null, bzVar, jl40Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = z7zVar;
        this.p = j3cVar;
        this.q = qgdVar;
        this.r = luuVar;
        this.s = ywq0Var;
        this.t = b7b0Var;
        this.u = m1eVar;
        this.v = bztVar;
        this.w = lbuVar;
        this.x = pruVar;
        this.y = mneVar;
        this.z = rkt0Var;
        this.A = viuVar;
        sac.V(jiu0.a(this), e6b0.f7274a, null, mneVar.f22085a, new d21(this, null, (byte) 13), 10);
    }

    public final void M(pnf0 pnf0Var) {
        pdt pdtVar = ((c6b0) D()).b;
        bby bbyVar = this.B;
        if (bbyVar == null || !bbyVar.isActive()) {
            pnf0 pnf0Var2 = pnf0.b;
            if (pnf0Var == pnf0Var2 && (pdtVar instanceof edt)) {
                Throwable th = ((edt) pdtVar).f7634a;
                if (!hic.C(th) && !(th instanceof hr30)) {
                    return;
                }
            }
            v3c.N(this.B);
            byte b = 0;
            yje yjeVar = null;
            if (pnf0Var == pnf0Var2 && ((pdtVar instanceof edt) || ((pdtVar instanceof bdt) && ((bdt) pdtVar).f2416a.isEmpty()))) {
                v3c.N(this.C);
                this.C = sac.V(jiu0.a(this), new kma0((byte) 21), null, this.y.b, new i6b0(this, yjeVar, b), 10);
            } else if (!(pdtVar instanceof bdt)) {
                N(jdt.f16344a);
            }
            this.B = sac.V(jiu0.a(this), new yr80(this, (byte) 24), null, null, new a220((Object) this, pnf0Var == pnf0.f27283a, yjeVar, (byte) 7), 14);
        }
    }

    public final void N(pdt pdtVar) {
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            pdt pdtVar2 = pdtVar;
            if (p7m0Var.m(value, c6b0.a((c6b0) value, pdtVar2, null, null, null, null, null, null, null, 1021))) {
                break;
            } else {
                pdtVar = pdtVar2;
            }
        }
        pdt pdtVar3 = ((c6b0) D()).b;
        this.z.g((pdtVar3 instanceof edt) || ((pdtVar3 instanceof bdt) && ((bdt) pdtVar3).f2416a.isEmpty()));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        w5b0 w5b0Var = (w5b0) obj;
        w5b0Var.getClass();
        super.x(w5b0Var);
        if (w5b0Var.equals(s5b0.f31648a)) {
            E();
            return;
        }
        boolean zEquals = w5b0Var.equals(t5b0.f33361a);
        z7z z7zVar = this.o;
        if (zEquals) {
            pdt pdtVar = ((c6b0) D()).b;
            byte b = 1;
            this.z.g((pdtVar instanceof edt) || ((pdtVar instanceof bdt) && ((bdt) pdtVar).f2416a.isEmpty()));
            M(((c6b0) D()).f3811a);
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
                pnf0 pnf0Var = pnf0.f27283a;
            } while (!p7m0Var.m(value, c6b0.a((c6b0) value, null, null, null, null, null, null, null, null, 1022)));
            bby bbyVar = this.D;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.D = sac.V(jiu0.a(this), new kma0((byte) 20), null, this.y.b, new i6b0(this, null, b), 10);
            }
            v3c.N(this.E);
            Object obj2 = z7zVar.get();
            obj2.getClass();
            this.E = i3t0.F(this, (j3t0) obj2, null, null, new j3b0((byte) 2), 119);
            return;
        }
        if (w5b0Var.equals(u5b0.f35085a)) {
            v3c.N(this.D);
            v3c.N(this.B);
            v3c.N(this.C);
            v3c.N(this.E);
            return;
        }
        if (w5b0Var.equals(v5b0.f36820a)) {
            v3c.N(this.B);
            M(pnf0.f27283a);
            return;
        }
        if (w5b0Var instanceof q5b0) {
            Object obj3 = z7zVar.get();
            obj3.getClass();
            i3t0.A(this, (j3t0) obj3, ((q5b0) w5b0Var).f28144a, null, null, 6);
        } else {
            if (!(w5b0Var instanceof r5b0)) {
                t9f.b();
                return;
            }
            Object obj4 = z7zVar.get();
            obj4.getClass();
            i3t0.A(this, (j3t0) obj4, ebc.n0(((r5b0) w5b0Var).f29877a), null, null, 6);
        }
    }
}
