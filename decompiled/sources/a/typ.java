package a;

import org.xplatform.ufc.api.fighter.FighterParams;

/* JADX INFO: loaded from: classes4.dex */
public final class typ extends i3t0 {
    public static final /* synthetic */ int E = 0;
    public bby A;
    public bby B;
    public bby C;
    public c4m0 D;
    public final FighterParams o;
    public final ctf0 p;
    public final mne q;
    public final a6u r;
    public final rtu s;
    public final i1w0 t;
    public final hjd u;
    public final m1e v;
    public final uxs0 w;
    public final kys0 x;
    public final j3c y;
    public long z;

    /* JADX WARN: Illegal instructions before constructor call */
    public typ(FighterParams fighterParams, g2v g2vVar, ctf0 ctf0Var, mne mneVar, a6u a6uVar, rtu rtuVar, i1w0 i1w0Var, pru pruVar, y78 y78Var, lbu lbuVar, luu luuVar, r9u r9uVar, hjd hjdVar, m1e m1eVar, uxs0 uxs0Var, kys0 kys0Var, j3c j3cVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        super(new mr0(pruVar, lbuVar, luuVar, r9uVar, (byte) 13), g090VarP, new mlb(g2vVar, ctf0Var, y78Var, (byte) 6), (yzn0) null);
        this.o = fighterParams;
        this.p = ctf0Var;
        this.q = mneVar;
        this.r = a6uVar;
        this.s = rtuVar;
        this.t = i1w0Var;
        this.u = hjdVar;
        this.v = m1eVar;
        this.w = uxs0Var;
        this.x = kys0Var;
        this.y = j3cVar;
        i3t0.K(this, null, null, new epp(this, null, (byte) 2), 3);
    }

    public final void M() {
        e3c.n(this.D);
        this.D = i3t0.L(this, new fnq(i120.W(this.v.b()), new hij(this, null, (byte) 22), (byte) 4), null, null, 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        lvp lvpVar = (lvp) obj;
        lvpVar.getClass();
        super.x(lvpVar);
        if (!(lvpVar instanceof bvp)) {
            if (!(lvpVar instanceof kvp)) {
                t9f.b();
                return;
            }
            kvp kvpVar = (kvp) lvpVar;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.z;
            ymx ymxVar = ymx.INTERVAL_100;
            if (j > 200) {
                bby bbyVar = this.A;
                yje yjeVar = null;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.A = i3t0.K(this, null, null, new r72(kvpVar, this, yjeVar, (byte) 10), 3);
                this.z = jCurrentTimeMillis;
                return;
            }
            return;
        }
        bvp bvpVar = (bvp) lvpVar;
        if (bvpVar.equals(avp.f1537a)) {
            M();
            bby bbyVar2 = this.B;
            if (bbyVar2 == null || !bbyVar2.isActive()) {
                this.B = i3t0.F(this, this.u, this.q.f22085a, null, new jbp((byte) 14), 118);
                return;
            }
            return;
        }
        if (bvpVar.equals(zup.f45019a)) {
            e3c.n(this.C);
            e3c.n(this.B);
            e3c.n(this.D);
        } else if (bvpVar.equals(yup.f43278a)) {
            E();
        } else {
            t9f.b();
        }
    }
}
