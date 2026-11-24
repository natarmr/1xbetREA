package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class gz80 extends i3t0 {
    public static final /* synthetic */ int M = 0;
    public final h3c A;
    public final ctf0 B;
    public final poq0 C;
    public final ih5 D;
    public final zr1 E;
    public final bn6 F;
    public final je G;
    public c4m0 H;
    public bby I;
    public bby J;
    public bby K;
    public long L;
    public final String o;
    public final long p;
    public final boolean q;
    public final hzg r;
    public final oeg0 s;
    public final cad t;
    public final m1e u;
    public final mne v;
    public final dq00 w;
    public final y3v x;
    public final duj y;
    public final reu z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz80(String str, long j, boolean z, hzg hzgVar, oeg0 oeg0Var, cad cadVar, m1e m1eVar, mne mneVar, dq00 dq00Var, y3v y3vVar, g2v g2vVar, duj dujVar, reu reuVar, h3c h3cVar, ctf0 ctf0Var, poq0 poq0Var, ih5 ih5Var, zr1 zr1Var, bn6 bn6Var, je jeVar) {
        super(new i280((byte) 17), cvm0.p(mneVar.c, mneVar.f22085a), new o20(ctf0Var, g2vVar, (byte) 17), (yzn0) null);
        oeg0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        this.o = str;
        this.p = j;
        this.q = z;
        this.r = hzgVar;
        this.s = oeg0Var;
        this.t = cadVar;
        this.u = m1eVar;
        this.v = mneVar;
        this.w = dq00Var;
        this.x = y3vVar;
        this.y = dujVar;
        this.z = reuVar;
        this.A = h3cVar;
        this.B = ctf0Var;
        this.C = poq0Var;
        this.D = ih5Var;
        this.E = zr1Var;
        this.F = bn6Var;
        this.G = jeVar;
    }

    public final void M(by80 by80Var) {
        if (((az80) D()).d.containsKey(by80Var.b)) {
            return;
        }
        sac.V(jiu0.a(this), null, null, this.v.f22085a, new wk70(this, by80Var, null, (byte) 26), 11);
    }

    public final void N() {
        e3c.n(this.H);
        this.H = sac.T(new fnq(i120.W(this.u.b()), new ez80(this, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), this.v.f22085a), foe.h);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object O(ow80 ow80Var, zje zjeVar) {
        fz80 fz80Var;
        ow80 ow80Var2 = ow80Var;
        if (zjeVar instanceof fz80) {
            fz80Var = (fz80) zjeVar;
            int i = fz80Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                fz80Var.l = i - Integer.MIN_VALUE;
            } else {
                fz80Var = new fz80(this, zjeVar);
            }
        } else {
            fz80Var = new fz80(this, zjeVar);
        }
        Object objB = fz80Var.j;
        wne wneVar = wne.f39444a;
        int i2 = fz80Var.l;
        if (i2 == 0) {
            z1x.P(objB);
            long j = ow80Var2.b;
            fz80Var.i = ow80Var2;
            fz80Var.l = 1;
            objB = this.A.b(j, fz80Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ow80Var2 = fz80Var.i;
            z1x.P(objB);
        }
        boolean zBooleanValue = ((Boolean) objB).booleanValue();
        this.F.e(ow80Var2.b, ow80Var2.c, ow80Var2.e, false, ow80Var2.g, "cybersport_partners", null, null);
        this.G.f(ow80Var2.b, ow80Var2.c, ow80Var2.e, "cybersport_partners", ow80Var2.g);
        this.s.c().d(new r91((Object) this, (Object) ow80Var2, zBooleanValue, (byte) 24));
        return Unit.f46060a;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        my80 my80Var = (my80) obj;
        my80Var.getClass();
        super.x(my80Var);
        boolean z = my80Var instanceof fy80;
        mne mneVar = this.v;
        yje yjeVar = null;
        if (!z) {
            if (!(my80Var instanceof ly80)) {
                t9f.b();
                return;
            }
            ly80 ly80Var = (ly80) my80Var;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.L;
            ymx ymxVar = ymx.INTERVAL_100;
            if (j > 200) {
                bby bbyVar = this.K;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.K = sac.V(jiu0.a(this), new dz80(this, (byte) 0), null, mneVar.f22085a, new wk70(ly80Var, this, yjeVar, (byte) 27), 10);
                this.L = jCurrentTimeMillis;
                return;
            }
            return;
        }
        fy80 fy80Var = (fy80) my80Var;
        if (fy80Var instanceof ey80) {
            N();
            bby bbyVar2 = this.J;
            if (bbyVar2 == null || !bbyVar2.isActive()) {
                this.J = sac.V(jiu0.a(this), new dz80(this, (byte) 2), null, mneVar.f22085a, new z210(this, yjeVar, (byte) 22), 10);
                return;
            }
            return;
        }
        if (!(fy80Var instanceof dy80)) {
            if (fy80Var instanceof cy80) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        c4m0 c4m0Var = this.H;
        if (c4m0Var != null) {
            e3c.n(c4m0Var);
        }
        bby bbyVar3 = this.I;
        if (bbyVar3 != null) {
            e3c.n(bbyVar3);
        }
        bby bbyVar4 = this.J;
        if (bbyVar4 != null) {
            e3c.n(bbyVar4);
        }
    }
}
