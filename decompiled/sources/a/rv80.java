package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class rv80 extends i3t0 {
    public static final /* synthetic */ int V = 0;
    public final ix0 A;
    public final duj B;
    public final mne C;
    public final kb0 D;
    public final s31 E;
    public final s91 F;
    public final m1e G;
    public final cyu H;
    public final kd30 I;
    public final eyg0 J;
    public final cmt K;
    public fk80 L;
    public final String M;
    public c4m0 N;
    public c4m0 O;
    public bby P;
    public bby Q;
    public bby R;
    public bby S;
    public bby T;
    public bby U;
    public final soc o;
    public final f7u p;
    public final pw70 q;
    public final zn00 r;
    public final xex s;
    public final u58 t;
    public final xmt u;
    public final pyt v;
    public final AggregatorScreenModel w;
    public final ctf0 x;
    public final nc0 y;
    public final ali z;

    /* JADX WARN: Illegal instructions before constructor call */
    public rv80(kc60 kc60Var, soc socVar, f7u f7uVar, pw70 pw70Var, zn00 zn00Var, xex xexVar, u58 u58Var, xmt xmtVar, pyt pytVar, AggregatorScreenModel aggregatorScreenModel, ctf0 ctf0Var, iqt iqtVar, nc0 nc0Var, ali aliVar, pru pruVar, ix0 ix0Var, duj dujVar, mne mneVar, bzt bztVar, kb0 kb0Var, s31 s31Var, s91 s91Var, m1e m1eVar, cyu cyuVar, dmt dmtVar, kd30 kd30Var, eyg0 eyg0Var, boolean z, cmt cmtVar) {
        pw70Var.getClass();
        ctf0Var.getClass();
        s91Var.getClass();
        m1eVar.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        yje yjeVar = null;
        super(new c36(iqtVar, bztVar, dmtVar, pruVar, aggregatorScreenModel, z), g090VarP, new iv80(ctf0Var, (byte) 0), (yzn0) null);
        this.o = socVar;
        this.p = f7uVar;
        this.q = pw70Var;
        this.r = zn00Var;
        this.s = xexVar;
        this.t = u58Var;
        this.u = xmtVar;
        this.v = pytVar;
        this.w = aggregatorScreenModel;
        this.x = ctf0Var;
        this.y = nc0Var;
        this.z = aliVar;
        this.A = ix0Var;
        this.B = dujVar;
        this.C = mneVar;
        this.D = kb0Var;
        this.E = s31Var;
        this.F = s91Var;
        this.G = m1eVar;
        this.H = cyuVar;
        this.I = kd30Var;
        this.J = eyg0Var;
        this.K = cmtVar;
        this.M = ou80.class.getSimpleName();
        dvj dvjVar = mneVar.b;
        i3t0.A(this, kb0Var, bb0.f2283a, dvjVar, null, 4);
        byte b = 3;
        i3t0.F(this, kb0Var, null, new hv80(this, b), new ht80((byte) 1), 117);
        byte b2 = 2;
        byte b3 = 4;
        sac.T(new fnq(i120.W(m1eVar.b()), new pv80(this, yjeVar, b2), b3), d5c.S(jiu0.a(this), dvjVar), new lv80(this, yjeVar, b));
        sac.T(new fnq(i120.W(kc60Var.a()), new lv80(this, yjeVar, b2), b3), d5c.S(jiu0.a(this), dvjVar), qv80.h);
    }

    public final List M() {
        return q3d.j(this.P, this.Q, this.R, this.S, this.T, this.U);
    }

    public final int N() {
        long j = ((yu80) D()).l.c;
        if (j == nw80.h.getId()) {
            return 8813;
        }
        if (j == nw80.f.getId()) {
            return 8814;
        }
        if (j == nw80.k.getId()) {
            return 8815;
        }
        if (j == nw80.l.getId()) {
            return 8816;
        }
        if (j == nw80.i.getId()) {
            return 8817;
        }
        if (j == nw80.g.getId()) {
            return 8819;
        }
        if (j == nw80.e.getId()) {
            return 8820;
        }
        if (j == nw80.m.getId()) {
            return 8821;
        }
        if (j == nw80.j.getId()) {
            return 0;
        }
        if (j == nw80.s.getId()) {
            return 8822;
        }
        return j == nw80.Y.getId() ? 880 : 0;
    }

    public final void O() {
        sac.V(jiu0.a(this), new hv80(this, (byte) 1), null, this.C.b, new wg0(this, null, (byte) 7), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable P(zje zjeVar) {
        jv80 jv80Var;
        if (zjeVar instanceof jv80) {
            jv80Var = (jv80) zjeVar;
            int i = jv80Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jv80Var.k = i - Integer.MIN_VALUE;
            } else {
                jv80Var = new jv80(this, zjeVar);
            }
        } else {
            jv80Var = new jv80(this, zjeVar);
        }
        Object objK = jv80Var.i;
        wne wneVar = wne.f39444a;
        int i2 = jv80Var.k;
        if (i2 == 0) {
            z1x.P(objK);
            gmq gmqVarB = this.v.b(c9x.O(this.w.c));
            jv80Var.k = 1;
            objK = ntb.K(gmqVarB, jv80Var);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objK);
        }
        Iterable iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(hew0.W((uvc) it.next()));
        }
        return arrayList;
    }

    public final void Q() {
        Object value;
        c4m0 c4m0Var = this.O;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        if (((yu80) D()).d) {
            this.o.b();
            this.O = sac.T(new fnq(this.z.o(), new lv80(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), this.C.b), mv80.h);
            return;
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, yu80.a((yu80) value, false, false, false, false, false, null, xun.f41520a, null, null, 122879)));
    }

    public final void R() {
        c4m0 c4m0Var = this.N;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        long j = ((yu80) D()).l.c;
        iun iunVar = iun.f15405a;
        k06 k06VarO = this.p.o(j, iunVar, iunVar, "", "", this.w.h);
        bvc bvcVarA = jiu0.a(this);
        mne mneVar = this.C;
        fk80 fk80Var = new fk80(k06VarO, bvcVarA, mneVar.b);
        this.N = sac.T(new fnq(fk80Var.g, new lv80(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new nv80(this, yjeVar, (byte) 0));
        this.L = fk80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable S(zje zjeVar) {
        ov80 ov80Var;
        if (zjeVar instanceof ov80) {
            ov80Var = (ov80) zjeVar;
            int i = ov80Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ov80Var.k = i - Integer.MIN_VALUE;
            } else {
                ov80Var = new ov80(this, zjeVar);
            }
        } else {
            ov80Var = new ov80(this, zjeVar);
        }
        Object objK = ov80Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ov80Var.k;
        if (i2 == 0) {
            z1x.P(objK);
            gmq gmqVarA = this.u.a(this.w.c);
            ov80Var.k = 1;
            objK = ntb.K(gmqVarA, ov80Var);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objK);
        }
        Iterable iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(hew0.V((kr5) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x024a  */
    /* JADX WARN: Code duplicated, block: B:110:0x025d  */
    /* JADX WARN: Code duplicated, block: B:113:0x026f  */
    /* JADX WARN: Code duplicated, block: B:116:0x027d A[LOOP:2: B:111:0x0269->B:116:0x027d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        int i;
        String str;
        Iterator it;
        Object next;
        mlr mlrVar;
        Iterator it2;
        cu80 cu80Var = (cu80) obj;
        cu80Var.getClass();
        super.x(cu80Var);
        if (cu80Var.equals(pt80.f27551a)) {
            E();
            return;
        }
        boolean zEquals = cu80Var.equals(st80.f32762a);
        byte b = 1;
        yje yjeVar = null;
        mne mneVar = this.C;
        if (zEquals) {
            this.U = bww.R(jiu0.a(this), this.U, M(), mneVar.f22085a, null, null, new nv80(this, yjeVar, b), 56);
            return;
        }
        if (cu80Var.equals(zt80.f44945a)) {
            if (((yu80) D()).o.equals(eu80.f8408a)) {
                O();
            }
            Q();
            R();
            return;
        }
        if (cu80Var.equals(au80.f1466a)) {
            this.M.getClass();
            wgh0 wgh0Var = wgh0.MY_AGGREGATOR;
            this.R = bww.R(jiu0.a(this), this.R, M(), mneVar.f22085a, null, null, new nv80(this, null), 56);
            return;
        }
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (cu80Var.equals(bu80.f3220a)) {
            this.Q = bww.R(jiu0.a(this), this.Q, M(), mneVar.b, null, null, new pv80(this, yjeVar, objArr2 == true ? 1 : 0), 56);
            return;
        }
        boolean zEquals2 = cu80Var.equals(yt80.f43206a);
        eb0 eb0Var = eb0.f7494a;
        if (zEquals2) {
            i3t0.A(this, this.D, eb0Var, mneVar.b, null, 4);
            return;
        }
        if (cu80Var.equals(rt80.f31066a)) {
            this.P = bww.R(jiu0.a(this), this.P, M(), mneVar.b, null, null, new pv80(this, yjeVar, b), 56);
            return;
        }
        if (cu80Var.equals(xt80.f41453a)) {
            fk80 fk80Var = this.L;
            if (fk80Var != null) {
                fk80Var.a(false);
                return;
            }
            return;
        }
        if (cu80Var instanceof tt80) {
            int i3 = ((tt80) cu80Var).f34499a;
            gu80 gu80Var = ((yu80) D()).o;
            if (gu80Var instanceof du80) {
                this.T = bww.R(jiu0.a(this), this.T, M(), mneVar.f22085a, null, null, new mc0((Object) gu80Var, i3, (Object) this, yjeVar, (byte) 7), 56);
                return;
            }
            return;
        }
        if (cu80Var instanceof ut80) {
            ut80 ut80Var = (ut80) cu80Var;
            sac.V(jiu0.a(this), new hv80(this, objArr == true ? 1 : 0), null, mneVar.b, new j33(this, ut80Var.f36246a, ut80Var.b, (yje) null), 10);
            return;
        }
        if (!(cu80Var instanceof vt80)) {
            if (cu80Var instanceof wt80) {
                i3t0.A(this, this.D, eb0Var, null, null, 6);
                sac.V(jiu0.a(this), new ev80((byte) 6), null, mneVar.b, new pv80(this, yjeVar, (byte) 3), 10);
                return;
            } else if (cu80Var instanceof qt80) {
                i3t0.A(this, this.D, za0.f44045a, mneVar.b, null, 4);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        long j = ((vt80) cu80Var).f37993a;
        Iterator it3 = ((yu80) D()).m.iterator();
        int i4 = 0;
        while (true) {
            i = -1;
            if (!it3.hasNext()) {
                i4 = -1;
                break;
            } else if (((mlr) it3.next()).f22006a == j) {
                break;
            } else {
                i4++;
            }
        }
        Integer numValueOf = Integer.valueOf(i4);
        if (i4 < 0) {
            numValueOf = null;
        }
        Integer numE = numValueOf != null ? kng0.e(1, numValueOf) : null;
        int iN = N();
        long j2 = this.w.c;
        if (j2 == nw80.h.getId()) {
            str = "aggregator_tvgames";
        } else if (j2 == nw80.f.getId()) {
            str = "aggregator_fish_hunt";
        } else if (j2 == nw80.k.getId()) {
            str = "aggregator_crush";
        } else if (j2 == nw80.l.getId()) {
            str = "aggregator_keno";
        } else if (j2 == nw80.i.getId()) {
            str = "aggregator_tvbet";
        } else if (j2 == nw80.c.getId()) {
            str = "aggregator_bingo";
        } else if (j2 == nw80.g.getId()) {
            str = "aggregator_scratch";
        } else if (j2 == nw80.e.getId()) {
            str = "aggregator_virtual";
        } else if (j2 == nw80.m.getId()) {
            str = "aggregator_asian";
        } else {
            if (j2 != nw80.j.getId()) {
                if (j2 == nw80.Y.getId()) {
                    str = "aggregator_quick_play";
                }
                it = ((yu80) D()).m.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((mlr) next).f22006a != j);
                mlrVar = (mlr) next;
                if (mlrVar != null) {
                    it2 = ((yu80) D()).m.iterator();
                    while (it2.hasNext()) {
                        if (((mlr) it2.next()).f22006a == j) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                    this.S = bww.R(jiu0.a(this), this.S, M(), mneVar.f22085a, new hv80(this, (byte) 2), null, new d21((Object) this, i + 1, (Object) mlrVar, yjeVar, (byte) 12), 40);
                }
            }
            str = "aggregator_volcano";
        }
        String str2 = str;
        this.A.a((int) j, iN, numE, str2, null);
        this.t.q(str2, iN, j, numE, null);
        it = ((yu80) D()).m.iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((mlr) next).f22006a != j);
        mlrVar = (mlr) next;
        if (mlrVar != null) {
            it2 = ((yu80) D()).m.iterator();
            while (it2.hasNext()) {
                if (((mlr) it2.next()).f22006a == j) {
                    i = i2;
                    break;
                }
                i2++;
            }
            this.S = bww.R(jiu0.a(this), this.S, M(), mneVar.f22085a, new hv80(this, (byte) 2), null, new d21((Object) this, i + 1, (Object) mlrVar, yjeVar, (byte) 12), 40);
        }
    }
}
