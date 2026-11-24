package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class bep extends i3t0 {
    public static final /* synthetic */ int I = 0;
    public final s31 A;
    public final ctf0 B;
    public final duj C;
    public final m1e D;
    public final i1w0 E;
    public final peg0 F;
    public c4m0 G;
    public c4m0 H;
    public final jdk0 o;
    public final xr p;
    public final peg0 q;
    public final ix0 r;
    public final u58 s;
    public final eyg0 t;
    public final ivn u;
    public final wdu v;
    public final w5z w;
    public final mne x;
    public final pru y;
    public final gg5 z;

    public bep(vzg0 vzg0Var, jdk0 jdk0Var, kc60 kc60Var, xr xrVar, peg0 peg0Var, ix0 ix0Var, u58 u58Var, eyg0 eyg0Var, ivn ivnVar, wdu wduVar, iqt iqtVar, w5z w5zVar, mne mneVar, pru pruVar, g2v g2vVar, gg5 gg5Var, s31 s31Var, ctf0 ctf0Var, duj dujVar, m1e m1eVar, i1w0 i1w0Var, peg0 peg0Var2) {
        ctf0Var.getClass();
        m1eVar.getClass();
        fbp fbpVar = new fbp(g2vVar, iqtVar, (byte) 1);
        bcn bcnVar = new bcn(ctf0Var, (byte) 10);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, fbpVar, bcnVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = jdk0Var;
        this.p = xrVar;
        this.q = peg0Var;
        this.r = ix0Var;
        this.s = u58Var;
        this.t = eyg0Var;
        this.u = ivnVar;
        this.v = wduVar;
        this.w = w5zVar;
        this.x = mneVar;
        this.y = pruVar;
        this.z = gg5Var;
        this.A = s31Var;
        this.B = ctf0Var;
        this.C = dujVar;
        this.D = m1eVar;
        this.E = i1w0Var;
        this.F = peg0Var2;
        yje yjeVar = null;
        sac.T(new fnq(kc60Var.a(), new sxk(this, yjeVar, (byte) 15), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foe.h);
        i3t0.K(this, null, null, new m91(this, yjeVar, (byte) 8), 3);
    }

    public final String M(mlr mlrVar) {
        List list = ((e2p) D()).i;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w3d.u(arrayList, ((j8b) it.next()).c);
        }
        Iterator it2 = CollectionsKt.q0(((e2p) D()).j, arrayList).iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (((mlr) it2.next()).f22006a == mlrVar.f22006a) {
                return this.t.k(new lu0(0L, Integer.valueOf(i), "bet_favor_other", hne.r(0L, "favorite")));
            }
            i++;
        }
        i = -1;
        return this.t.k(new lu0(0L, Integer.valueOf(i), "bet_favor_other", hne.r(0L, "favorite")));
    }

    public final void N() {
        c4m0 c4m0Var = this.H;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.H = sac.T(new fnq(new dnq(this.w.O(), new ko0((Object) this, yjeVar, (byte) 15), (byte) 1), new j0l(this, yjeVar, (byte) 20), (byte) 4), d5c.S(jiu0.a(this), this.x.f22085a), new pfl(2, this, bep.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 4, (byte) 7));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object O(boolean z, zje zjeVar) {
        zdp zdpVar;
        Object objZ;
        boolean z2;
        Object value;
        if (zjeVar instanceof zdp) {
            zdpVar = (zdp) zjeVar;
            int i = zdpVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                zdpVar.l = i - Integer.MIN_VALUE;
            } else {
                zdpVar = new zdp(this, zjeVar);
            }
        } else {
            zdpVar = new zdp(this, zjeVar);
        }
        Object obj = zdpVar.j;
        wne wneVar = wne.f39444a;
        int i2 = zdpVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            boolean z3 = ((e2p) D()).h;
            boolean z4 = ((e2p) D()).e;
            zdpVar.i = z;
            zdpVar.l = 1;
            objZ = this.v.z(z3, false, z4, 8, false, false, zdpVar);
            if (objZ == wneVar) {
                return wneVar;
            }
            z2 = z;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z5 = zdpVar.i;
            z1x.P(obj);
            objZ = ((j0g0) obj).f15681a;
            z2 = z5;
        }
        z1x.P(objZ);
        List list = (List) objZ;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, e2p.a((e2p) value, false, false, false, false, z2, false, list, iun.f15405a, null, false, 63801)));
        return Unit.f46060a;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object value2;
        qa0 qa0Var = (qa0) obj;
        qa0Var.getClass();
        super.x(qa0Var);
        boolean z = qa0Var instanceof pa0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, e2p.a((e2p) value2, false, false, false, false, false, false, null, null, null, false, 65519)));
            return;
        }
        boolean z2 = qa0Var instanceof la0;
        byte b = 1;
        mne mneVar = this.x;
        yje yjeVar = null;
        if (z2) {
            long j = ((la0) qa0Var).f19681a;
            Iterator it = ((e2p) D()).j.iterator();
            do {
                if (!it.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it.next();
            } while (((mlr) next4).f22006a != j);
            mlr mlrVar = (mlr) next4;
            if (mlrVar == null) {
                List list = ((e2p) D()).i;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    w3d.u(arrayList, ((j8b) it2.next()).c);
                }
                Iterator it3 = arrayList.iterator();
                do {
                    if (!it3.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it3.next();
                } while (((mlr) next5).f22006a != j);
                mlrVar = (mlr) next5;
                if (mlrVar == null) {
                    return;
                }
            }
            sac.V(jiu0.a(this), new k4p(1, this, bep.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 22), null, mneVar.f22085a, new aep(this, mlrVar, yjeVar, b), 10);
            return;
        }
        byte b2 = 0;
        if (qa0Var instanceof ga0) {
            long j2 = ((ga0) qa0Var).f10942a;
            List list2 = ((e2p) D()).i;
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                w3d.u(arrayList2, ((j8b) it4.next()).c);
            }
            Iterator it5 = arrayList2.iterator();
            do {
                if (!it5.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it5.next();
            } while (((mlr) next3).f22006a != j2);
            mlr mlrVar2 = (mlr) next3;
            if (mlrVar2 == null) {
                return;
            }
            sac.V(jiu0.a(this), new k4p(1, this, bep.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 20), null, mneVar.f22085a, new aep(this, mlrVar2, yjeVar, b2), 10);
            return;
        }
        if (qa0Var instanceof fa0) {
            E();
            return;
        }
        if (qa0Var instanceof ia0) {
            st0 st0Var = ((ia0) qa0Var).f14413a;
            long j3 = st0Var.f32750a;
            Iterator it6 = ((e2p) D()).j.iterator();
            do {
                if (!it6.hasNext()) {
                    next = null;
                    break;
                }
                next = it6.next();
            } while (((mlr) next).f22006a != j3);
            mlr mlrVar3 = (mlr) next;
            if (mlrVar3 == null) {
                List list3 = ((e2p) D()).i;
                ArrayList arrayList3 = new ArrayList();
                Iterator it7 = list3.iterator();
                while (it7.hasNext()) {
                    w3d.u(arrayList3, ((j8b) it7.next()).c);
                }
                Iterator it8 = arrayList3.iterator();
                do {
                    if (!it8.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it8.next();
                } while (((mlr) next2).f22006a != j3);
                mlrVar3 = (mlr) next2;
                if (mlrVar3 == null) {
                    return;
                }
            }
            sac.V(jiu0.a(this), new k4p(1, this, bep.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 21), null, mneVar.f22085a, new g6g(this, st0Var, mlrVar3, yjeVar, (byte) 13), 10);
            return;
        }
        if (qa0Var instanceof oa0) {
            c4m0 c4m0Var = this.H;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value, e2p.a((e2p) value, true, false, false, false, false, false, null, null, null, false, 65533)));
            N();
            return;
        }
        if (qa0Var instanceof ma0) {
            c4m0 c4m0Var2 = this.G;
            if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                this.G = slb.U(new dnq(new fnq(this.D.b(), new ydp(this, yjeVar, b), (byte) 4), new rj((Object) this, yjeVar, (byte) 24), (byte) 1), d5c.S(jiu0.a(this), mneVar.f22085a));
                return;
            }
            return;
        }
        if (qa0Var instanceof na0) {
            c4m0 c4m0Var3 = this.G;
            if (c4m0Var3 != null) {
                c4m0Var3.cancel(null);
            }
            c4m0 c4m0Var4 = this.H;
            if (c4m0Var4 != null) {
                c4m0Var4.cancel(null);
                return;
            }
            return;
        }
        if (qa0Var instanceof ha0) {
            this.A.c(ys2.AGGREGATOR);
            this.z.j(ldp.AGGREGATOR);
            boolean z3 = ((e2p) D()).h;
            i1w0 i1w0Var = this.E;
            if (z3) {
                i1w0Var.d(new xdp(this, b2));
                return;
            } else {
                i1w0Var.d(new xdp(this, b));
                return;
            }
        }
        if (!(qa0Var instanceof ka0)) {
            if (qa0Var instanceof ja0) {
                G(gp1.f11661a);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        sac.V(jiu0.a(this), new k4p(1, this, bep.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, mneVar.f22085a, new ydp(this, yjeVar, b2), 10);
    }
}
