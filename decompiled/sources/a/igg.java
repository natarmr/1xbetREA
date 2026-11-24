package a;

import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;

/* JADX INFO: loaded from: classes4.dex */
public final class igg extends i3t0 {
    public static final /* synthetic */ int I = 0;
    public final mne A;
    public final cxt B;
    public final ih5 C;
    public final zr1 D;
    public long E;
    public bby F;
    public bby G;
    public c4m0 H;
    public final CyberChampParams o;
    public final m1e p;
    public final mne q;
    public final yfm0 r;
    public final gr00 s;
    public final pv00 t;
    public final ctf0 u;
    public final zwt v;
    public final cxt w;
    public final fvt x;
    public final pmi y;
    public final oeg0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igg(CyberChampParams cyberChampParams, m1e m1eVar, mne mneVar, yfm0 yfm0Var, gr00 gr00Var, g2v g2vVar, pv00 pv00Var, ctf0 ctf0Var, zwt zwtVar, cxt cxtVar, fvt fvtVar, pmi pmiVar, oeg0 oeg0Var, mne mneVar2, cxt cxtVar2, r9u r9uVar, wgu wguVar, pru pruVar, ih5 ih5Var, zr1 zr1Var) {
        super(new ggg(wguVar, pruVar, r9uVar, (byte) 0), cvm0.p(mneVar.c, mneVar.f22085a), new o20(ctf0Var, g2vVar, (byte) 3), (yzn0) null);
        m1eVar.getClass();
        ctf0Var.getClass();
        oeg0Var.getClass();
        wguVar.getClass();
        this.o = cyberChampParams;
        this.p = m1eVar;
        this.q = mneVar;
        this.r = yfm0Var;
        this.s = gr00Var;
        this.t = pv00Var;
        this.u = ctf0Var;
        this.v = zwtVar;
        this.w = cxtVar;
        this.x = fvtVar;
        this.y = pmiVar;
        this.z = oeg0Var;
        this.A = mneVar2;
        this.B = cxtVar2;
        this.C = ih5Var;
        this.D = zr1Var;
    }

    public final void M() {
        e3c.n(this.H);
        this.H = slb.U(new fnq(i120.W(this.p.b()), new u88(this, null, (byte) 9), (byte) 4), d5c.S(jiu0.a(this), this.q.f22085a));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        sfg sfgVar = (sfg) obj;
        sfgVar.getClass();
        super.x(sfgVar);
        yje yjeVar = null;
        if (!(sfgVar instanceof nfg)) {
            if (!(sfgVar instanceof rfg)) {
                t9f.b();
                return;
            }
            rfg rfgVar = (rfg) sfgVar;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.E;
            ymx ymxVar = ymx.INTERVAL_100;
            if (j > 200) {
                bby bbyVar = this.F;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.F = i3t0.K(this, null, null, new r72(rfgVar, this, yjeVar, (byte) 8), 3);
                this.E = jCurrentTimeMillis;
                return;
            }
            return;
        }
        nfg nfgVar = (nfg) sfgVar;
        if (nfgVar.equals(mfg.f21692a)) {
            M();
            return;
        }
        if (!nfgVar.equals(lfg.f19954a)) {
            if (nfgVar.equals(kfg.f18193a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        c4m0 c4m0Var = this.H;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        bby bbyVar2 = this.G;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
    }
}
