package a;

import java.util.LinkedHashMap;
import kotlin.Unit;
import org.xplatform.ufc.api.game.UfcPostGameParams;

/* JADX INFO: loaded from: classes6.dex */
public final class a6t0 extends i3t0 {
    public static final /* synthetic */ int K = 0;
    public final kys0 A;
    public final qgh B;
    public final dwu C;
    public final dgu D;
    public bby E;
    public bby F;
    public c4m0 G;
    public c4m0 H;
    public c4m0 I;
    public c4m0 J;
    public final String o;
    public final mne p;
    public final UfcPostGameParams q;
    public final a7q r;
    public final j3c s;
    public final m1e t;
    public final oeg0 u;
    public final ctf0 v;
    public final hqc w;
    public final hcp0 x;
    public final iqt y;
    public final ivn z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6t0(vzg0 vzg0Var, String str, mne mneVar, UfcPostGameParams ufcPostGameParams, a7q a7qVar, j3c j3cVar, m1e m1eVar, oeg0 oeg0Var, ctf0 ctf0Var, hqc hqcVar, hcp0 hcp0Var, iqt iqtVar, ivn ivnVar, kys0 kys0Var, qgh qghVar, dwu dwuVar, dgu dguVar, g2v g2vVar, r9u r9uVar) {
        super(new yip0((Object) r9uVar, (Object) ufcPostGameParams, (byte) 26), cvm0.p(mneVar.c, mneVar.f22085a), new cls0(ctf0Var, g2vVar, (byte) 1), (yzn0) null);
        m1eVar.getClass();
        oeg0Var.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        this.o = str;
        this.p = mneVar;
        this.q = ufcPostGameParams;
        this.r = a7qVar;
        this.s = j3cVar;
        this.t = m1eVar;
        this.u = oeg0Var;
        this.v = ctf0Var;
        this.w = hqcVar;
        this.x = hcp0Var;
        this.y = iqtVar;
        this.z = ivnVar;
        this.A = kys0Var;
        this.B = qghVar;
        this.C = dwuVar;
        this.D = dguVar;
    }

    public final void M() {
        if (((s5t0) D()).b != n5t0.b) {
            bby bbyVar = this.F;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.F = sac.V(jiu0.a(this), null, null, this.p.f22085a, new x5t0(this, null, (byte) 0), 11);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object N(long j, zje zjeVar) {
        z5t0 z5t0Var;
        Object g0g0Var;
        if (zjeVar instanceof z5t0) {
            z5t0Var = (z5t0) zjeVar;
            int i = z5t0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                z5t0Var.k = i - Integer.MIN_VALUE;
            } else {
                z5t0Var = new z5t0(this, zjeVar);
            }
        } else {
            z5t0Var = new z5t0(this, zjeVar);
        }
        z5t0 z5t0Var2 = z5t0Var;
        Object obj = z5t0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = z5t0Var2.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                boolean zI = jpm0.i(((s5t0) D()).g, j, 189L, 0L);
                e0g0 e0g0Var = j0g0.b;
                hcp0 hcp0Var = this.x;
                z5t0Var2.k = 1;
                if (hcp0Var.p(j, zI, 189L, 0L, z5t0Var2) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            g0g0Var = Unit.f46060a;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            this.z.f(thA, new w5t0(this, (byte) 0));
        }
        return Unit.f46060a;
    }

    @Override // a.diu0
    public final void v() {
        LinkedHashMap linkedHashMap = g5t0.f10733a;
        String str = this.o;
        str.getClass();
        g5t0.f10733a.remove(str);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        e5t0 e5t0Var = (e5t0) obj;
        e5t0Var.getClass();
        super.x(e5t0Var);
        yje yjeVar = null;
        if (!(e5t0Var instanceof u4t0)) {
            if (!(e5t0Var instanceof d5t0)) {
                t9f.b();
                return;
            }
            d5t0 d5t0Var = (d5t0) e5t0Var;
            long jCurrentTimeMillis = System.currentTimeMillis();
            ymx ymxVar = ymx.INTERVAL_100;
            if (jCurrentTimeMillis > 200) {
                bby bbyVar = this.E;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.E = i3t0.K(this, null, null, new r72(d5t0Var, this, yjeVar, (byte) 20), 3);
                return;
            }
            return;
        }
        u4t0 u4t0Var = (u4t0) e5t0Var;
        if (!(u4t0Var instanceof t4t0)) {
            if (!(u4t0Var instanceof s4t0)) {
                if (u4t0Var instanceof r4t0) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            bby bbyVar2 = this.F;
            if (bbyVar2 != null) {
                e3c.n(bbyVar2);
            }
            c4m0 c4m0Var = this.G;
            if (c4m0Var != null) {
                e3c.n(c4m0Var);
            }
            c4m0 c4m0Var2 = this.H;
            if (c4m0Var2 != null) {
                e3c.n(c4m0Var2);
            }
            c4m0 c4m0Var3 = this.I;
            if (c4m0Var3 != null) {
                e3c.n(c4m0Var3);
            }
            c4m0 c4m0Var4 = this.J;
            if (c4m0Var4 != null) {
                e3c.n(c4m0Var4);
                return;
            }
            return;
        }
        bvc bvcVarA = jiu0.a(this);
        mne mneVar = this.p;
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        byte b = 2;
        sac.V(bvcVarA, null, null, vs10Var, new x5t0(this, yjeVar, b), 11);
        c4m0 c4m0Var5 = this.H;
        if (c4m0Var5 != null) {
            e3c.n(c4m0Var5);
        }
        byte b2 = 1;
        fnq fnqVar = new fnq(this.r.a(189L, 0L), new y5t0(this, yjeVar, b2), (byte) 4);
        sje sjeVarS = d5c.S(jiu0.a(this), rwjVar);
        foe foeVar = foe.h;
        this.H = sac.T(fnqVar, sjeVarS, foeVar);
        c4m0 c4m0Var6 = this.G;
        if (c4m0Var6 != null) {
            e3c.n(c4m0Var6);
        }
        this.G = sac.T(new fnq(this.t.b(), new x5t0(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foeVar);
        c4m0 c4m0Var7 = this.I;
        if (c4m0Var7 != null) {
            e3c.n(c4m0Var7);
        }
        this.I = sac.T(new fnq(this.w.a(), new y5t0(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foeVar);
        c4m0 c4m0Var8 = this.J;
        if (c4m0Var8 != null) {
            e3c.n(c4m0Var8);
        }
        this.J = sac.T(new fnq(this.C.a(((s5t0) D()).i, dam0.b), new y5t0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foeVar);
    }
}
