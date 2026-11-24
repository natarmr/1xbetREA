package a;

/* JADX INFO: loaded from: classes4.dex */
public final class zzh0 extends i3t0 {
    public static final /* synthetic */ int C = 0;
    public bby A;
    public long B;
    public final mne o;
    public final hzg p;
    public final duj q;
    public final m1e r;
    public final gud s;
    public final cr t;
    public final xzp u;
    public final esg0 v;
    public final e1u w;
    public final rrd x;
    public bby y;
    public c4m0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh0(mne mneVar, hzg hzgVar, duj dujVar, m1e m1eVar, ctf0 ctf0Var, svu svuVar, gud gudVar, cr crVar, xzp xzpVar, esg0 esg0Var, e1u e1uVar, rrd rrdVar, pru pruVar) {
        super(new p2e0(pruVar, (byte) 3), cvm0.p(mneVar.c, mneVar.f22085a), new cfw(ctf0Var, svuVar, (byte) 1), (yzn0) null);
        m1eVar.getClass();
        ctf0Var.getClass();
        this.o = mneVar;
        this.p = hzgVar;
        this.q = dujVar;
        this.r = m1eVar;
        this.s = gudVar;
        this.t = crVar;
        this.u = xzpVar;
        this.v = esg0Var;
        this.w = e1uVar;
        this.x = rrdVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        fzh0 fzh0Var = (fzh0) obj;
        fzh0Var.getClass();
        super.x(fzh0Var);
        boolean z = fzh0Var instanceof ezh0;
        byte b = 0;
        mne mneVar = this.o;
        yje yjeVar = null;
        if (z) {
            ezh0 ezh0Var = (ezh0) fzh0Var;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.B;
            ymx ymxVar = ymx.INTERVAL_100;
            if (j > 200) {
                bby bbyVar = this.y;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.y = sac.V(jiu0.a(this), new wzh0(this, (byte) 0), null, mneVar.f22085a, new tye0(ezh0Var, this, yjeVar, (byte) 26), 10);
                this.B = jCurrentTimeMillis;
                return;
            }
            return;
        }
        if (!(fzh0Var instanceof xyh0)) {
            t9f.b();
            return;
        }
        xyh0 xyh0Var = (xyh0) fzh0Var;
        if (xyh0Var instanceof wyh0) {
            e3c.n(this.z);
            this.z = sac.T(new fnq(i120.W(this.r.b()), new yzh0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), foe.h);
            return;
        }
        if (xyh0Var instanceof vyh0) {
            e3c.n(this.A);
            e3c.n(this.z);
            return;
        }
        if (xyh0Var instanceof tyh0) {
            E();
            return;
        }
        if (xyh0Var instanceof uyh0) {
            uyh0 uyh0Var = (uyh0) xyh0Var;
            sac.V(jiu0.a(this), new wzh0(this, (byte) 2), null, mneVar.b, new xzh0(this, uyh0Var.f36489a, uyh0Var.b, yjeVar, (byte) 2), 10);
            return;
        }
        if (!(xyh0Var instanceof ryh0)) {
            if (xyh0Var instanceof syh0) {
                sac.V(jiu0.a(this), new wzh0(this, (byte) 1), null, mneVar.b, new yng0(this, yjeVar, (byte) 8), 10);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        ryh0 ryh0Var = (ryh0) xyh0Var;
        m0k0 m0k0Var = ryh0Var.f31315a;
        zxj0 zxj0Var = ryh0Var.b;
        sac.V(jiu0.a(this), new nxh0(1, this.q, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 2), null, mneVar.b, new xzh0(this, m0k0Var, zxj0Var, yjeVar, (byte) 0), 10);
    }
}
