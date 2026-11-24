package a;

import org.xplatform.ufc.api.last_fights.LastFightsParams;

/* JADX INFO: loaded from: classes6.dex */
public final class ryy extends i3t0 {
    public static final /* synthetic */ int z = 0;
    public final i1w0 o;
    public final LastFightsParams p;
    public final ctf0 q;
    public final kys0 r;
    public final m1e s;
    public final j3c t;
    public final f4u u;
    public long v;
    public bby w;
    public c4m0 x;
    public bby y;

    /* JADX WARN: Illegal instructions before constructor call */
    public ryy(i1w0 i1w0Var, LastFightsParams lastFightsParams, ctf0 ctf0Var, kys0 kys0Var, m1e m1eVar, pru pruVar, g2v g2vVar, r9u r9uVar, j3c j3cVar, luu luuVar, f4u f4uVar, mne mneVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(new g8l(luuVar, pruVar, r9uVar, (byte) 18), cvm0.p(rwjVar, rwjVar), new o20(ctf0Var, g2vVar, (byte) 11), (yzn0) null);
        this.o = i1w0Var;
        this.p = lastFightsParams;
        this.q = ctf0Var;
        this.r = kys0Var;
        this.s = m1eVar;
        this.t = j3cVar;
        this.u = f4uVar;
    }

    public final void M() {
        e3c.n(this.x);
        this.x = i3t0.L(this, new fnq(i120.W(this.s.b()), new slx(this, null, (byte) 7), (byte) 4), null, null, 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        eyy eyyVar = (eyy) obj;
        eyyVar.getClass();
        super.x(eyyVar);
        if (eyyVar instanceof zxy) {
            zxy zxyVar = (zxy) eyyVar;
            if (zxyVar.equals(yxy.f43444a)) {
                M();
                return;
            }
            if (zxyVar.equals(xxy.f41680a)) {
                e3c.n(this.y);
                e3c.n(this.x);
                return;
            } else if (zxyVar.equals(wxy.f39951a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        if (!(eyyVar instanceof dyy)) {
            t9f.b();
            return;
        }
        dyy dyyVar = (dyy) eyyVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.v;
        ymx ymxVar = ymx.INTERVAL_100;
        if (j > 200) {
            bby bbyVar = this.w;
            yje yjeVar = null;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            this.w = i3t0.K(this, null, null, new r72(dyyVar, this, yjeVar, (byte) 12), 3);
            this.v = jCurrentTimeMillis;
        }
    }
}
