package a;

import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;

/* JADX INFO: loaded from: classes4.dex */
public final class jfg extends i3t0 {
    public static final /* synthetic */ int B = 0;
    public long A;
    public final CyberChampParams o;
    public final khf0 p;
    public final hjd q;
    public final mne r;
    public final duj s;
    public final m1e t;
    public final arc u;
    public final arc v;
    public bby w;
    public bby x;
    public bby y;
    public c4m0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public jfg(vzg0 vzg0Var, CyberChampParams cyberChampParams, khf0 khf0Var, g2v g2vVar, y78 y78Var, pru pruVar, luu luuVar, lbu lbuVar, ctf0 ctf0Var, hjd hjdVar, mne mneVar, duj dujVar, m1e m1eVar, arc arcVar, r9u r9uVar, arc arcVar2) {
        ctf0Var.getClass();
        m1eVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        super(new ng0(cyberChampParams, pruVar, luuVar, lbuVar, r9uVar), g090VarP, new mlb(ctf0Var, g2vVar, y78Var, (byte) 1), (yzn0) null);
        this.o = cyberChampParams;
        this.p = khf0Var;
        this.q = hjdVar;
        this.r = mneVar;
        this.s = dujVar;
        this.t = m1eVar;
        this.u = arcVar;
        this.v = arcVar2;
        i3t0.K(this, null, null, new ifg(this, null, (byte) 0), 3);
    }

    public final void M() {
        e3c.n(this.z);
        this.z = i3t0.L(this, new fnq(i120.W(this.t.b()), new u88(this, null, (byte) 8), (byte) 4), null, null, 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        ueg uegVar = (ueg) obj;
        uegVar.getClass();
        super.x(uegVar);
        boolean z = uegVar instanceof oeg;
        mne mneVar = this.r;
        yje yjeVar = null;
        if (!z) {
            if (!(uegVar instanceof teg)) {
                t9f.b();
                return;
            }
            teg tegVar = (teg) uegVar;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.A;
            ymx ymxVar = ymx.INTERVAL_100;
            if (j > 200) {
                bby bbyVar = this.y;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.y = sac.V(jiu0.a(this), new hfg(this, (byte) 0), null, mneVar.f22085a, new e9g(tegVar, this, yjeVar, (byte) 3), 10);
                this.A = jCurrentTimeMillis;
                return;
            }
            return;
        }
        oeg oegVar = (oeg) uegVar;
        if (oegVar.equals(leg.f19900a)) {
            E();
            return;
        }
        if (oegVar.equals(meg.f21642a)) {
            bby bbyVar2 = this.w;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            bby bbyVar3 = this.x;
            if (bbyVar3 != null) {
                e3c.n(bbyVar3);
                return;
            }
            return;
        }
        if (!oegVar.equals(neg.f23384a)) {
            t9f.b();
            return;
        }
        M();
        bby bbyVar4 = this.x;
        if (bbyVar4 == null || !bbyVar4.isActive()) {
            this.x = i3t0.F(this, this.q, mneVar.f22085a, null, new jyf((byte) 19), 118);
        }
    }
}
