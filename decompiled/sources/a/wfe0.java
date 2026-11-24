package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wfe0 extends i3t0 {
    public static final String L = bfe0.class.getSimpleName();
    public final s91 A;
    public final xr B;
    public final cmt C;
    public fk80 D;
    public c4m0 E;
    public c4m0 F;
    public bby G;
    public bby H;
    public bby I;
    public bby J;
    public bby K;
    public final soc o;
    public final cyu p;
    public final pw70 q;
    public final ctf0 r;
    public final ali s;
    public final duj t;
    public final mne u;
    public final eyg0 v;
    public final kb0 w;
    public final u58 x;
    public final ix0 y;
    public final oeg0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public wfe0(long j, soc socVar, cyu cyuVar, pw70 pw70Var, ctf0 ctf0Var, ali aliVar, iqt iqtVar, duj dujVar, mne mneVar, eyg0 eyg0Var, m1e m1eVar, kc60 kc60Var, bzt bztVar, pru pruVar, dmt dmtVar, kb0 kb0Var, u58 u58Var, ix0 ix0Var, oeg0 oeg0Var, s91 s91Var, xr xrVar, cmt cmtVar) {
        pw70Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        oeg0Var.getClass();
        s91Var.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        yje yjeVar = null;
        super(new vs80(pruVar, j, bztVar, iqtVar, dmtVar), g090VarP, new iv80(ctf0Var, (byte) 16), (yzn0) null);
        this.o = socVar;
        this.p = cyuVar;
        this.q = pw70Var;
        this.r = ctf0Var;
        this.s = aliVar;
        this.t = dujVar;
        this.u = mneVar;
        this.v = eyg0Var;
        this.w = kb0Var;
        this.x = u58Var;
        this.y = ix0Var;
        this.z = oeg0Var;
        this.A = s91Var;
        this.B = xrVar;
        this.C = cmtVar;
        dvj dvjVar = mneVar.b;
        i3t0.A(this, kb0Var, bb0.f2283a, dvjVar, null, 4);
        P();
        byte b = 1;
        sac.T(new fnq(dtb.z(new fnq(kc60Var.a(), new qfe0(this, yjeVar, b), (byte) 4), 1), new qfe0(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), dvjVar), tfe0.h);
        sac.T(new fnq(dtb.z(m1eVar.b(), 1), new coc0(this, yjeVar, (byte) 12), (byte) 4), d5c.S(jiu0.a(this), dvjVar), ufe0.h);
        i3t0.F(this, kb0Var, null, new pfe0(this, b), new k8e0((byte) 6), 117);
        O();
    }

    public final String M(mlr mlrVar) {
        List list;
        aie aieVar = ((nfe0) D()).f23433a;
        uge ugeVar = aieVar instanceof uge ? (uge) aieVar : null;
        int i = 0;
        if (ugeVar != null && (list = ugeVar.f35621a) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((mlr) it.next()).f22006a != mlrVar.f22006a) {
                    i++;
                }
            }
            i = -1;
        }
        return this.v.k(new lu0(0L, Integer.valueOf(i + 1), "aggregator_recommended", hne.r(824L, "category")));
    }

    public final List N() {
        return q3d.j(this.G, this.H, this.I, this.J, this.K);
    }

    public final void O() {
        c4m0 c4m0Var = this.E;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        fk80 fk80Var = this.D;
        if (fk80Var != null) {
            fk80Var.d();
        }
        long j = ((nfe0) D()).b;
        boolean z = ((nfe0) D()).d;
        cyu cyuVar = this.p;
        sff0 sff0VarA = ((pru) cyuVar.b).a();
        nv20 nv20Var = (nv20) cyuVar.f5196a;
        String strA = ((ntu) cyuVar.c).a();
        boolean z2 = sff0VarA.b.N;
        strA.getClass();
        kd30 kd30Var = (kd30) nv20Var.f24171a;
        byte b = 0;
        k06 k06Var = z2 ? new k06(new x860(30, false), new ffe0(kd30Var, j, z, strA, null)) : new k06(new x860(30, false), new gfe0(kd30Var, j, strA, null));
        bvc bvcVarA = jiu0.a(this);
        mne mneVar = this.u;
        fk80 fk80Var2 = new fk80(k06Var, bvcVarA, mneVar.b);
        this.E = sac.T(new fnq(fk80Var2.g, new jjc0(2, this, wfe0.class, "onPagingStateChange", "onPagingStateChange(Lorg/xplatform/aggregator/core/paging/presentation/PagingLoadState;)V", 4, (byte) 19), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new qfe0(this, yjeVar, b));
        this.D = fk80Var2;
    }

    public final void P() {
        if (((nfe0) D()).d) {
            c4m0 c4m0Var = this.F;
            yje yjeVar = null;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            this.F = sac.T(new fnq(this.s.o(), new qfe0(this, yjeVar, (byte) 3), (byte) 4), d5c.S(jiu0.a(this), this.u.b), vfe0.h);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        List list;
        Object next;
        List list2;
        Object next2;
        pee0 pee0Var = (pee0) obj;
        pee0Var.getClass();
        super.x(pee0Var);
        if (pee0Var instanceof eee0) {
            E();
            return;
        }
        boolean z = pee0Var instanceof fee0;
        byte b = 0;
        yje yjeVar = null;
        mne mneVar = this.u;
        if (z) {
            this.G = bww.R(jiu0.a(this), this.G, N(), mneVar.b, null, null, new rfe0(this, yjeVar, b), 56);
            return;
        }
        boolean z2 = pee0Var instanceof lee0;
        eb0 eb0Var = eb0.f7494a;
        if (z2) {
            i3t0.A(this, this.w, eb0Var, mneVar.b, null, 4);
            return;
        }
        if (pee0Var instanceof oee0) {
            this.H = bww.R(jiu0.a(this), this.H, N(), mneVar.b, null, null, new rfe0(this, yjeVar, (byte) 3), 56);
            return;
        }
        byte b2 = 1;
        if (pee0Var instanceof gee0) {
            this.I = bww.R(jiu0.a(this), this.I, N(), mneVar.b, null, null, new rfe0(this, yjeVar, b2), 56);
            return;
        }
        if (pee0Var instanceof hee0) {
            long j = ((hee0) pee0Var).f12920a;
            aie aieVar = ((nfe0) D()).f23433a;
            uge ugeVar = aieVar instanceof uge ? (uge) aieVar : null;
            if (ugeVar == null || (list2 = ugeVar.f35621a) == null) {
                return;
            }
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((mlr) next2).f22006a != j);
            mlr mlrVar = (mlr) next2;
            if (mlrVar == null) {
                return;
            }
            sac.V(jiu0.a(this), new pfe0(this, b), null, mneVar.b, new sfe0(this, mlrVar, yjeVar, b), 10);
            return;
        }
        if (pee0Var instanceof iee0) {
            long j2 = ((iee0) pee0Var).f14629a;
            aie aieVar2 = ((nfe0) D()).f23433a;
            uge ugeVar2 = aieVar2 instanceof uge ? (uge) aieVar2 : null;
            if (ugeVar2 == null || (list = ugeVar2.f35621a) == null) {
                return;
            }
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((mlr) next).f22006a != j2);
            mlr mlrVar2 = (mlr) next;
            if (mlrVar2 == null) {
                return;
            }
            this.J = bww.R(jiu0.a(this), this.J, N(), mneVar.f22085a, null, null, new sfe0(this, mlrVar2, yjeVar, b2), 56);
            return;
        }
        if (pee0Var instanceof jee0) {
            i3t0.A(this, this.w, eb0Var, null, null, 6);
            return;
        }
        if (pee0Var instanceof kee0) {
            fk80 fk80Var = this.D;
            if (fk80Var != null) {
                fk80Var.a(false);
                return;
            }
            return;
        }
        if (pee0Var instanceof mee0) {
            O();
        } else if (pee0Var instanceof nee0) {
            this.K = bww.R(jiu0.a(this), this.K, N(), mneVar.f22085a, null, null, new rfe0(this, yjeVar, (byte) 2), 56);
        } else {
            t9f.b();
        }
    }
}
