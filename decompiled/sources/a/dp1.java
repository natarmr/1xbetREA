package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class dp1 extends i3t0 {
    public static final /* synthetic */ int G = 0;
    public final s91 A;
    public final eyg0 B;
    public final c4m0 C;
    public bby D;
    public bby E;
    public final c4m0 F;
    public final vzg0 o;
    public final wdu p;
    public final ali q;
    public final ouu r;
    public final pw70 s;
    public final ctf0 t;
    public final kb0 u;
    public final s31 v;
    public final cyu w;
    public final duj x;
    public final mne y;
    public final xr z;

    /* JADX WARN: Illegal instructions before constructor call */
    public dp1(vzg0 vzg0Var, String str, String str2, wdu wduVar, ali aliVar, ouu ouuVar, pw70 pw70Var, ctf0 ctf0Var, kb0 kb0Var, s31 s31Var, cyu cyuVar, duj dujVar, m1e m1eVar, bzt bztVar, mne mneVar, kc60 kc60Var, xr xrVar, iqt iqtVar, s91 s91Var, eyg0 eyg0Var, pru pruVar) {
        pw70Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        s91Var.getClass();
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        yje yjeVar = null;
        super(new pg1(pruVar, vzg0Var, ctf0Var, iqtVar, str, str2, bztVar), cvm0.p(vs10Var, rwjVar), new uc(ctf0Var, (byte) 15), (yzn0) null);
        this.o = vzg0Var;
        this.p = wduVar;
        this.q = aliVar;
        this.r = ouuVar;
        this.s = pw70Var;
        this.t = ctf0Var;
        this.u = kb0Var;
        this.v = s31Var;
        this.w = cyuVar;
        this.x = dujVar;
        this.y = mneVar;
        this.z = xrVar;
        this.A = s91Var;
        this.B = eyg0Var;
        dvj dvjVar = mneVar.b;
        i3t0.A(this, kb0Var, bb0.f2283a, dvjVar, null, 4);
        byte b = 2;
        byte b2 = 4;
        i3t0.F(this, kb0Var, null, new ko1(this, b), new xg1(b2), 117);
        e3c.n(this.C);
        gmq gmqVarB = m1eVar.b();
        p7m0 p7m0VarA = kc60Var.a();
        String str3 = (String) vzg0Var.a("AGGREGATOR_SEARCH_QUERY_KEY");
        xae0 xae0VarC = vzg0Var.c(str3 == null ? "" : str3, "AGGREGATOR_SEARCH_QUERY_KEY");
        byte b3 = 0;
        this.C = sac.T(dub.f0(gmqVarB, p7m0VarA, new c00(i120.W(new le0(new eu4(new ymq(new dj1(b2), xae0VarC, yjeVar, b3), (byte) 9), (byte) 2)), this, b), new xo1(this, yjeVar, b3)), d5c.S(jiu0.a(this), rwjVar), yo1.h);
        c4m0 c4m0Var = this.F;
        if (c4m0Var != null) {
            e3c.n(c4m0Var);
        }
        this.F = sac.T(new fnq(i120.W(aoq.c(i120.W(new lr(kc60Var.a(), (byte) 11)), new zo1(yjeVar, this, b3))), new qa(this, yjeVar, (byte) 22), (byte) 4), d5c.S(jiu0.a(this), dvjVar), cp1.h);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(boolean z, zje zjeVar) {
        no1 no1Var;
        Object objZ;
        if (zjeVar instanceof no1) {
            no1Var = (no1) zjeVar;
            int i = no1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                no1Var.k = i - Integer.MIN_VALUE;
            } else {
                no1Var = new no1(this, zjeVar);
            }
        } else {
            no1Var = new no1(this, zjeVar);
        }
        Object obj = no1Var.i;
        wne wneVar = wne.f39444a;
        int i2 = no1Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            boolean z2 = ((bo1) D()).d;
            no1Var.k = 1;
            objZ = this.p.z(z2, false, z, 8, false, true, no1Var);
            if (objZ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objZ = ((j0g0) obj).f15681a;
        }
        z1x.P(objZ);
        return objZ;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    public final String N(mlr mlrVar, long j) {
        Iterable iterable;
        Object next;
        Integer numE;
        List listA;
        List list;
        long j2 = mlrVar.f22006a;
        h9h0 h9h0Var = ((bo1) D()).b;
        if (h9h0Var instanceof c9h0) {
            iterable = ((c9h0) h9h0Var).f3963a;
        } else if (h9h0Var instanceof f8h0) {
            iterable = ((f8h0) h9h0Var).f9104a;
        } else {
            iterable = h9h0Var instanceof j8h0 ? ((j8h0) h9h0Var).f16084a : iun.f15405a;
        }
        Iterator it = iterable.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((j8b) next).f16074a != j);
        j8b j8bVar = (j8b) next;
        if (j8bVar == null || (list = j8bVar.c) == null) {
            numE = null;
        } else {
            Iterator it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                if (((mlr) it2.next()).f22006a == j2) {
                    break;
                }
                i++;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (i < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                numE = kng0.e(1, numValueOf);
            } else {
                numE = null;
            }
        }
        h9h0 h9h0Var2 = ((bo1) D()).b;
        long j3 = 0;
        if (h9h0Var2 instanceof c9h0) {
            listA = tx3.z(new g3z[]{new g3z(0L, mlrVar.q ? "smart_search" : "search"), j8bVar != null ? new g3z(j8bVar.f16074a, "partition") : null});
        } else if ((h9h0Var2 instanceof f8h0) || (h9h0Var2 instanceof j8h0)) {
            lc00 lc00VarB = kotlin.collections.a.b();
            lc00VarB.add(new g3z(0L, ((bo1) D()).k ? "placeholder_auth" : "placeholder_unauth"));
            if (j8bVar != null) {
                long j4 = j8bVar.f;
                long j5 = j8bVar.f16074a;
                s0s s0sVar = s0s.ONE_X_LIVE_AGGREGATOR;
                lc00VarB.add(new g3z((j5 == -1 || j4 == -1) ? 824L : j4, "category"));
                if (j5 != -1 && j4 != -1) {
                    j3 = j8bVar.d;
                }
                lc00VarB.add(new g3z(j3, "partition"));
            }
            listA = kotlin.collections.a.a(lc00VarB);
        } else {
            listA = iun.f15405a;
        }
        return this.B.k(new lu0(0L, numE, "search_aggregator", listA));
    }

    /* JADX WARN: Code duplicated, block: B:48:0x013f A[LOOP:0: B:46:0x0139->B:48:0x013f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0159  */
    /* JADX WARN: Code duplicated, block: B:54:0x0168  */
    /* JADX WARN: Code duplicated, block: B:57:0x017e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0182  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object O(boolean z, boolean z2, boolean z3, zje zjeVar) throws zhi0 {
        to1 to1Var;
        boolean z4;
        boolean z5;
        Object value;
        ArrayList arrayList;
        List list;
        boolean z6 = z;
        boolean z7 = z2;
        if (zjeVar instanceof to1) {
            to1Var = (to1) zjeVar;
            int i = to1Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                to1Var.n = i - Integer.MIN_VALUE;
            } else {
                to1Var = new to1(this, zjeVar);
            }
        } else {
            to1Var = new to1(this, zjeVar);
        }
        Object obj = to1Var.l;
        wne wneVar = wne.f39444a;
        int i2 = to1Var.n;
        boolean z8 = false;
        Object[] objArr = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z9 = to1Var.k;
                z7 = to1Var.j;
                boolean z10 = to1Var.i;
                z1x.P(obj);
                z4 = z9;
                z6 = z10;
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z5 = to1Var.k;
                z1x.P(obj);
            }
            Iterable<j8b> iterable = (Iterable) obj;
            arrayList = new ArrayList(r3d.q(iterable, 10));
            for (j8b j8bVar : iterable) {
                arrayList.add(j8b.a(j8bVar, CollectionsKt.D0(j8bVar.c, 10)));
            }
            if (arrayList.isEmpty()) {
                list = ((bo1) D()).o;
                if (!list.isEmpty()) {
                    H(new lo1(list, z8));
                }
                if (((bo1) D()).o.isEmpty()) {
                    P(z5, false);
                }
            } else {
                H(new mo1(arrayList, (byte) (objArr == true ? 1 : 0)));
            }
            return Unit.f46060a;
        }
        z1x.P(obj);
        if (z6 && !z7) {
            to1Var.i = z6;
            to1Var.j = z7;
            z4 = z3;
            to1Var.k = z4;
            to1Var.n = 1;
            if (qcc.O(500L, to1Var) != wneVar) {
            }
            return wneVar;
        }
        z4 = z3;
        String str = ((bo1) D()).f2910a;
        h9h0 h9h0Var = ((bo1) D()).b;
        int length = str.length();
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (length == 0) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, bo1.a((bo1) value, null, null, "", null, false, null, false, false, null, null, false, 0L, 1048571)));
            P(z4, false);
            return Unit.f46060a;
        }
        if (((bo1) D()).c.equals(str) && !z7 && !(h9h0Var instanceof l8h0)) {
            return Unit.f46060a;
        }
        p7m0 p7m0Var2 = ocjVar.f25029a;
        while (true) {
            Object value2 = p7m0Var2.getValue();
            value2.getClass();
            oyg0 oyg0Var2 = oyg0Var;
            oyg0Var2.getClass();
            if (p7m0Var2.m(value2, bo1.a((bo1) value2, null, null, str, null, false, null, false, false, null, null, false, 0L, 1048571))) {
                break;
            }
            oyg0Var = oyg0Var2;
        }
        to1Var.i = z6;
        to1Var.j = z7;
        to1Var.k = z4;
        to1Var.n = 2;
        Object objB = this.r.B(10, to1Var, str, false);
        if (objB != wneVar) {
            boolean z11 = z4;
            obj = objB;
            z5 = z11;
            Iterable<j8b> iterable2 = (Iterable) obj;
            arrayList = new ArrayList(r3d.q(iterable2, 10));
            while (r3.hasNext()) {
                arrayList.add(j8b.a(j8bVar, CollectionsKt.D0(j8bVar.c, 10)));
            }
            if (arrayList.isEmpty()) {
                list = ((bo1) D()).o;
                if (!list.isEmpty()) {
                    H(new lo1(list, z8));
                }
                if (((bo1) D()).o.isEmpty()) {
                    P(z5, false);
                }
            } else {
                H(new mo1(arrayList, (byte) (objArr == true ? 1 : 0)));
            }
            return Unit.f46060a;
        }
        return wneVar;
    }

    public final void P(boolean z, boolean z2) {
        if (!((bo1) D()).o.isEmpty() && ((bo1) D()).r == z) {
            List list = ((bo1) D()).o;
            if (list.isEmpty()) {
                return;
            }
            H(new lo1(list, z2));
            return;
        }
        bby bbyVar = this.D;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        this.D = sac.V(jiu0.a(this), new ko1(this, (byte) 3), null, this.y.b, new vo1(this, z, z2, null), 10);
    }

    public final void Q(boolean z, boolean z2) {
        bby bbyVar = this.E;
        boolean z3 = bbyVar == null;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        this.E = sac.V(jiu0.a(this), new ko1(this, (byte) 4), null, this.y.b, new wo1(this, z, z3, z2, null), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        fn1 fn1Var = (fn1) obj;
        fn1Var.getClass();
        super.x(fn1Var);
        boolean z = fn1Var instanceof bn1;
        byte b = 0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        mne mneVar = this.y;
        if (!z) {
            byte b2 = 1;
            if (fn1Var instanceof an1) {
                an1 an1Var = (an1) fn1Var;
                long j = an1Var.f1128a;
                long j2 = an1Var.b;
                boolean z2 = an1Var.c;
                sac.V(jiu0.a(this), new ko1(this, b2), null, mneVar.b, new mo0(this, j, z2, j2, null, (byte) 1), 10);
                return;
            }
            if (fn1Var.equals(vm1.f37654a)) {
                G(wn1.f39427a);
                return;
            }
            if (fn1Var instanceof zm1) {
                this.o.e("AGGREGATOR_SEARCH_QUERY_KEY", ((zm1) fn1Var).f44602a);
                return;
            }
            boolean zEquals = fn1Var.equals(wm1.f39382a);
            vn1 vn1Var = vn1.f37694a;
            if (zEquals) {
                G(vn1Var);
                return;
            }
            if (fn1Var instanceof dn1) {
                if (((bo1) D()).f2910a.length() >= 3) {
                    Q(false, ((bo1) D()).k);
                    return;
                }
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value, bo1.a((bo1) value, null, r8h0.f30026a, null, null, false, null, false, false, null, null, false, 0L, 1048573)));
                P(((bo1) D()).k, true);
                return;
            }
            if (fn1Var instanceof ym1) {
                j8b j8bVar = ((ym1) fn1Var).f42865a;
                sac.V(jiu0.a(this), so1.f32520a, null, mneVar.f22085a, new qa(this, j8bVar, null, (byte) 21), 10);
                return;
            }
            if (fn1Var instanceof en1) {
                G(vn1Var);
                return;
            }
            if (fn1Var.equals(xm1.f41099a)) {
                i3t0.A(this, this.u, new cb0(((bo1) D()).n, ((bo1) D()).m), null, null, 6);
                return;
            } else if (fn1Var instanceof cn1) {
                i3t0.A(this, this.u, eb0.f7494a, null, null, 6);
                return;
            } else if (fn1Var.equals(um1.f35898a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        bn1 bn1Var = (bn1) fn1Var;
        long j3 = bn1Var.f2859a;
        long j4 = bn1Var.b;
        mlr mlrVar = (mlr) ((bo1) D()).g.get(Long.valueOf(j3));
        if (mlrVar == null) {
            return;
        }
        p7m0 p7m0Var2 = ocjVar.f25029a;
        while (true) {
            Object value2 = p7m0Var2.getValue();
            value2.getClass();
            oyg0Var.getClass();
            long j5 = j4;
            if (p7m0Var2.m(value2, bo1.a((bo1) value2, null, null, null, null, false, null, false, false, null, null, false, j5, 524287))) {
                I(mneVar.f22085a, new ko1(this, b), new sr((i3t0) this, (Object) mlrVar, j5, (yje) null, (byte) 3));
                return;
            }
            j4 = j5;
        }
    }
}
