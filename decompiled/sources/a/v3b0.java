package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v3b0 extends i3t0 {
    public static final /* synthetic */ int W = 0;
    public final abu A;
    public final mne B;
    public final ouu C;
    public final rkt0 D;
    public final kc60 E;
    public final erc F;
    public final hsj G;
    public final ali H;
    public final eyg0 I;
    public final c5k J;
    public final nw20 K;
    public final jdk0 L;
    public final wsf0 M;
    public final cu N;
    public final ytt O;
    public final r8i P;
    public final LinkedHashMap Q;
    public c4m0 R;
    public c4m0 S;
    public c4m0 T;
    public final c4m0 U;
    public bby V;
    public final i1w0 o;
    public final hsj p;
    public final nek q;
    public final urt r;
    public final ctf0 s;
    public final peg0 t;
    public final m1e u;
    public final duj v;
    public final bn6 w;
    public final u58 x;
    public final gg5 y;
    public final ix0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3b0(i1w0 i1w0Var, hsj hsjVar, nek nekVar, uyu uyuVar, urt urtVar, ctf0 ctf0Var, peg0 peg0Var, m1e m1eVar, duj dujVar, bn6 bn6Var, u58 u58Var, gg5 gg5Var, ix0 ix0Var, abu abuVar, mne mneVar, ouu ouuVar, rkt0 rkt0Var, kc60 kc60Var, iqt iqtVar, erc ercVar, hsj hsjVar2, ali aliVar, bzt bztVar, eyg0 eyg0Var, c5k c5kVar, nw20 nw20Var, jdk0 jdk0Var, wsf0 wsf0Var, cu cuVar, ytt yttVar, r8i r8iVar, pru pruVar) {
        super(new a3b0(pruVar, iqtVar, bztVar), cvm0.p(mneVar.c, mneVar.f22085a), new iv80(ctf0Var, (byte) 4), (yzn0) null);
        ctf0Var.getClass();
        m1eVar.getClass();
        yje yjeVar = null;
        this.o = i1w0Var;
        this.p = hsjVar;
        this.q = nekVar;
        this.r = urtVar;
        this.s = ctf0Var;
        this.t = peg0Var;
        this.u = m1eVar;
        this.v = dujVar;
        this.w = bn6Var;
        this.x = u58Var;
        this.y = gg5Var;
        this.z = ix0Var;
        this.A = abuVar;
        this.B = mneVar;
        this.C = ouuVar;
        this.D = rkt0Var;
        this.E = kc60Var;
        this.F = ercVar;
        this.G = hsjVar2;
        this.H = aliVar;
        this.I = eyg0Var;
        this.J = c5kVar;
        this.K = nw20Var;
        this.L = jdk0Var;
        this.M = wsf0Var;
        this.N = cuVar;
        this.O = yttVar;
        this.P = r8iVar;
        this.Q = new LinkedHashMap();
        T();
        byte b = 0;
        fnq fnqVar = new fnq(dtb.z(kc60Var.a(), 1), new m3b0(this, yjeVar, b), (byte) 4);
        bvc bvcVarA = jiu0.a(this);
        dvj dvjVar = mneVar.b;
        this.U = sac.T(fnqVar, d5c.S(bvcVarA, dvjVar), n3b0.h);
        sac.T(new fnq(uyuVar.f36509a.h(), new f3b0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new st20(2, yjeVar, (byte) 14));
        Q();
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    public final String M(long j, fza0 fza0Var) {
        Object next;
        long id;
        List list;
        List list2 = ((u2b0) D()).l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof pe40) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        loop1: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            pe40 pe40Var = (pe40) next;
            w4t w4tVar = pe40Var.f26833a;
            if (w4tVar instanceof j4t) {
                if (fza0Var == fza0.b) {
                    break;
                }
            } else if (w4tVar instanceof k4t) {
                if (fza0Var == fza0.e) {
                    break;
                }
            } else if (w4tVar instanceof m4t) {
                if (fza0Var == fza0.f) {
                    break;
                }
            } else if (w4tVar instanceof n4t) {
                if (fza0Var == fza0.d) {
                    break;
                }
            } else if ((w4tVar instanceof q4t) && fza0Var == fza0.c) {
                fyx fyxVar = pe40Var.b;
                cyx cyxVar = fyxVar instanceof cyx ? (cyx) fyxVar : null;
                if (cyxVar != null && (list = (List) cyxVar.f5198a) != null && !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((mlr) it2.next()).f22006a == j) {
                            break loop1;
                        }
                    }
                }
            }
        }
        pe40 pe40Var2 = (pe40) next;
        w4t w4tVar2 = pe40Var2 != null ? pe40Var2.f26833a : null;
        if (w4tVar2 == null) {
            id = 0;
        } else if ((w4tVar2 instanceof j4t) || (w4tVar2 instanceof k4t)) {
            id = nw80.f24223a.getId();
        } else if ((w4tVar2 instanceof m4t) || (w4tVar2 instanceof n4t)) {
            id = nw80.b.getId();
        } else if (w4tVar2 instanceof q4t) {
            id = ((q4t) pe40Var2.f26833a).f28117a;
        } else {
            id = 0;
        }
        fyx fyxVar2 = pe40Var2 != null ? pe40Var2.b : null;
        cyx cyxVar2 = fyxVar2 instanceof cyx ? (cyx) fyxVar2 : null;
        List list3 = cyxVar2 != null ? (List) cyxVar2.f5198a : null;
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        Iterator it3 = list3.iterator();
        int i = 0;
        while (true) {
            if (!it3.hasNext()) {
                i = -1;
                break;
            }
            if (((mlr) it3.next()).f22006a == j) {
                break;
            }
            i++;
        }
        this.q.getClass();
        long jB = fza0Var.B();
        if (jB == 0) {
            jB = Long.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(i + 1);
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(new g3z(id, "partition"));
        if (jB != Long.MAX_VALUE) {
            lc00VarB.add(new g3z(jB, "category"));
        }
        return this.I.k(new lu0(0L, numValueOf, "popular_new_aggregator", kotlin.collections.a.a(lc00VarB)));
    }

    public final ArrayList N() {
        List list = ((u2b0) D()).l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof pe40) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fyx fyxVar = ((pe40) it.next()).b;
            cyx cyxVar = fyxVar instanceof cyx ? (cyx) fyxVar : null;
            List list2 = cyxVar != null ? (List) cyxVar.f5198a : null;
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            w3d.u(arrayList2, list2);
        }
        return arrayList2;
    }

    public final vhc0 O() {
        Object next;
        Iterator it = ((u2b0) D()).l.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((df40) next) instanceof ve40));
        ve40 ve40Var = next instanceof ve40 ? (ve40) next : null;
        if (ve40Var != null) {
            fyx fyxVar = ve40Var.f37265a;
            cyx cyxVar = fyxVar instanceof cyx ? (cyx) fyxVar : null;
            if (cyxVar != null) {
                return (vhc0) cyxVar.f5198a;
            }
        }
        return null;
    }

    public final boolean P(String str) {
        bby bbyVar = (bby) this.Q.get(str);
        return bbyVar != null && bbyVar.isActive();
    }

    public final void Q() {
        v3b0 v3b0Var;
        for (df40 df40Var : ((u2b0) D()).l) {
            if ((df40Var.getState() instanceof eyx) || (df40Var.getState() instanceof byx)) {
                boolean z = df40Var instanceof ne40;
                byte b = 1;
                byte b2 = 0;
                LinkedHashMap linkedHashMap = this.Q;
                yje yjeVar = null;
                mne mneVar = this.B;
                if (z) {
                    String key = df40Var.getKey();
                    if (!this.P(key)) {
                        linkedHashMap.put(key, sac.V(jiu0.a(this), new b3b0(this, b), new c3b0(this, key, (byte) 1), mneVar.b, new g3b0(this, yjeVar, b2), 8));
                    }
                    v3b0Var = this;
                } else if (df40Var instanceof pe40) {
                    pe40 pe40Var = (pe40) df40Var;
                    w4t w4tVar = pe40Var.f26833a;
                    if (w4tVar instanceof j4t) {
                        v3b0Var = this;
                        v3b0Var.R(pe40Var.getKey(), nw80.f24223a.getId(), 75L, (j4t) w4tVar);
                    } else {
                        v3b0Var = this;
                        if (w4tVar instanceof k4t) {
                            v3b0Var.R(pe40Var.getKey(), nw80.f24223a.getId(), 17L, (k4t) w4tVar);
                        } else if (w4tVar instanceof m4t) {
                            v3b0Var.R(pe40Var.getKey(), nw80.b.getId(), 89L, (m4t) w4tVar);
                        } else if (w4tVar instanceof n4t) {
                            v3b0Var.R(pe40Var.getKey(), nw80.b.getId(), 17L, (n4t) w4tVar);
                        } else if (w4tVar instanceof q4t) {
                            String key2 = pe40Var.getKey();
                            long j = ((q4t) w4tVar).f28117a;
                            if (!v3b0Var.P(key2)) {
                                linkedHashMap.put(key2, sac.V(jiu0.a(v3b0Var), new qi4((Object) v3b0Var, j, (byte) 12), new c3b0(v3b0Var, key2, (byte) 3), mneVar.b, new i3b0(v3b0Var, j, null), 8));
                            }
                        } else {
                            if (!(w4tVar instanceof t4t)) {
                                t9f.b();
                                return;
                            }
                            String key3 = pe40Var.getKey();
                            if (!v3b0Var.P(key3)) {
                                linkedHashMap.put(key3, sac.V(jiu0.a(v3b0Var), new b3b0(v3b0Var, (byte) 2), new c3b0(v3b0Var, key3, (byte) 4), mneVar.b, new k3b0(v3b0Var, yjeVar, b2), 8));
                            }
                        }
                    }
                } else {
                    v3b0Var = this;
                    if (df40Var instanceof ve40) {
                        String key4 = df40Var.getKey();
                        if (!v3b0Var.P(key4)) {
                            linkedHashMap.put(key4, sac.V(jiu0.a(v3b0Var), new b3b0(v3b0Var, b2), new c3b0(v3b0Var, key4, (byte) 0), mneVar.b, new g3b0(v3b0Var, yjeVar, b), 8));
                        }
                    }
                }
            } else {
                v3b0Var = this;
            }
            this = v3b0Var;
        }
    }

    public final void R(String str, long j, long j2, w4t w4tVar) {
        if (P(str)) {
            return;
        }
        this.Q.put(str, sac.V(jiu0.a(this), new zga0((Object) this, (Object) w4tVar, (byte) 12), new c3b0(this, str, (byte) 2), this.B.b, new h3b0(this, w4tVar, j, j2, null), 8));
    }

    public final void S(int i) {
        if (((u2b0) D()).c) {
            this.w.i(String.valueOf(i), "popular_new_virtual");
        }
        this.y.c(i, ((u2b0) D()).c ? y1p.POPULAR_NEW_VIRTUAL : y1p.POPULAR_NEW_AGGREGATOR);
    }

    public final void T() {
        c4m0 c4m0Var = this.R;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.R = sac.T(new fnq(this.H.o(), new f3b0(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), this.B.b), o3b0.h);
    }

    public final void U(mlr mlrVar, int i, String str) {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, u2b0.a((u2b0) value, false, false, false, false, null, new hus(mlrVar, i, str), null, 3071)));
        sac.V(jiu0.a(this), q3b0.f28045a, null, this.B.b, new fs((Object) this, (Serializable) mlrVar, i, (Object) str, (yje) null, (byte) 11), 10);
    }

    public final void V() {
        List list = ((u2b0) D()).l;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((df40) it.next()).getState() instanceof cyx) {
                    H(new jfa0((byte) 28));
                    return;
                }
            }
        }
    }

    public final void W() {
        List list = ((u2b0) D()).l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            fyx state = ((df40) obj).getState();
            state.getClass();
            if (state instanceof ayx) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bby bbyVar = (bby) this.Q.remove(((df40) it.next()).getKey());
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
        }
        H(new jfa0((byte) 22));
        Q();
    }

    @Override // a.diu0
    public final void v() {
        e3c.n(this.R);
        e3c.n(this.U);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object next;
        Object next2;
        Object next3;
        kic0 kic0Var;
        Object obj2 = (b2b0) obj;
        obj2.getClass();
        super.x(obj2);
        if (obj2 instanceof n1b0) {
            E();
            return;
        }
        boolean z = obj2 instanceof o1b0;
        erc ercVar = this.F;
        byte b = 0;
        Integer numE = 0;
        kic0Var = null;
        kic0 kic0Var2 = null;
        nw80Var = null;
        nw80 nw80Var = null;
        str = null;
        String str = null;
        if (z) {
            c4m0 c4m0Var = this.S;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            c4m0 c4m0Var2 = this.T;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            ercVar.a(false);
            return;
        }
        boolean z2 = obj2 instanceof p1b0;
        byte b2 = 4;
        byte b3 = 1;
        mne mneVar = this.B;
        if (z2) {
            this.S = sac.T(new fnq(this.E.a(), new m3b0(this, numE, b3), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), p3b0.h);
            this.T = sac.T(new fnq(this.u.b(), new k3b0(this, numE, b3), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), l3b0.h);
            bby bbyVar = this.V;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.V = sac.V(jiu0.a(this), new b3b0(this, (byte) 3), null, mneVar.f22085a, new r3b0(this, numE, b), 10);
            }
            ercVar.a(true);
            return;
        }
        byte b4 = 2;
        if (obj2 instanceof a2b0) {
            sac.V(jiu0.a(this), s3b0.f31549a, null, mneVar.b, new k3b0(this, numE, b4), 10);
            return;
        }
        if (obj2 instanceof z1b0) {
            W();
            return;
        }
        if (obj2 instanceof v1b0) {
            long j = ((v1b0) obj2).f36623a;
            vhc0 vhc0VarO = O();
            if (vhc0VarO != null) {
                kic0 kic0Var3 = vhc0VarO.f37423a;
                if (kic0Var3.d == j) {
                    kic0Var2 = kic0Var3;
                } else {
                    kic0 kic0Var4 = vhc0VarO.b;
                    if (kic0Var4.d == j) {
                        kic0Var2 = kic0Var4;
                    }
                }
            }
            if (kic0Var2 == null) {
                return;
            }
            sac.V(jiu0.a(this), new b3b0(this, b2), null, mneVar.b, new y0f(((u2b0) D()).j.contains(Long.valueOf(j)), this, j, kic0Var2, (yje) null), 10);
            return;
        }
        boolean z3 = obj2 instanceof y1b0;
        String str2 = "main_page";
        ix0 ix0Var = this.z;
        if (z3) {
            long j2 = ((y1b0) obj2).f41847a;
            vhc0 vhc0VarO2 = O();
            if (vhc0VarO2 != null) {
                kic0Var = vhc0VarO2.f37423a;
                if (kic0Var.d != j2) {
                    kic0Var = vhc0VarO2.b;
                    if (kic0Var.d != j2) {
                        kic0Var = null;
                    }
                }
            } else {
                kic0Var = null;
            }
            if (kic0Var == null) {
                return;
            }
            vhc0 vhc0VarO3 = O();
            if (vhc0VarO3 != null) {
                if (vhc0VarO3.f37423a.d == j2) {
                    nw80Var = nw80.b;
                } else if (vhc0VarO3.b.d == j2) {
                    nw80Var = nw80.f24223a;
                }
            }
            int i = nw80Var != null ? fcb0.f9304a[nw80Var.ordinal()] == 1 ? 8191 : 8190 : 0;
            long j3 = kic0Var.d;
            ix0Var.a((int) j3, i, null, "main_page", null);
            this.x.q("main_page", i, j3, null, null);
            U(jeb.Y(kic0Var), i, this.I.k(new lu0(0L, null, "popular_new_aggregator", hne.r(0L, "weekly_game"))));
            return;
        }
        boolean z4 = obj2 instanceof t1b0;
        u58 u58Var = this.x;
        gg5 gg5Var = this.y;
        i1w0 i1w0Var = this.o;
        if (z4) {
            if (((t1b0) obj2).f33162a instanceof ss5) {
                if (!((u2b0) D()).c) {
                    y1p y1pVar = y1p.MAIN;
                    ix0Var.getClass();
                    b1j.v("popular_new_aggregator", ix0Var.f15516a, 3052L);
                    i8i.D("screen", "popular_aggregator", u58Var.f35083a, "my_aggregator_call");
                }
                i1w0Var.d(new b3b0(this, (byte) 7));
                return;
            }
            vhc0 vhc0VarO4 = O();
            if (vhc0VarO4 != null) {
                foc0 foc0Var = vhc0VarO4.c;
                if (!((u2b0) D()).c) {
                    u58Var.f("popular_aggregator");
                    gg5Var.p(y1p.POPULAR_CLASSIC_AGGREGATOR);
                }
                i1w0Var.d(new zga0((Object) this, (Object) foc0Var, (byte) 13));
                return;
            }
            return;
        }
        if (obj2 instanceof r1b0) {
            sac.V(jiu0.a(this), u3b0.f34988a, null, mneVar.b, new r3b0(this, numE, b4), 10);
            return;
        }
        if (obj2 instanceof u1b0) {
            sac.V(jiu0.a(this), new b3b0(this, (byte) 6), null, mneVar.b, new wn10(this, ((u1b0) obj2).f34896a, numE, (byte) 8), 10);
            return;
        }
        if (obj2 instanceof s1b0) {
            lqv lqvVar = ((s1b0) obj2).f31448a;
            if (lqvVar instanceof dqv) {
                if (!((u2b0) D()).c) {
                    u58Var.d("popular_aggregator");
                    gg5Var.g(y1p.POPULAR_CLASSIC_AGGREGATOR);
                }
                i1w0Var.d(new b3b0(this, (byte) 5));
                return;
            }
            if (lqvVar instanceof eqv) {
                boolean z5 = ((u2b0) D()).c;
                nek nekVar = this.q;
                if (!z5) {
                    eqv eqvVar = (eqv) lqvVar;
                    fza0 fza0Var = eqvVar.f8254a;
                    long j4 = eqvVar.b;
                    nekVar.getClass();
                    long jB = fza0Var.B();
                    long j5 = jB == 0 ? Long.MAX_VALUE : jB;
                    this.w.i(String.valueOf(j5), "popular_aggregator");
                    if (fza0Var != fza0.c) {
                        y1p y1pVar2 = y1p.MAIN;
                        gg5Var.d((int) j5);
                    } else if (j4 != nw80.t.getId()) {
                        S((int) j5);
                    }
                    i1w0Var.d(new qp7((Object) this, j4, j5, (byte) 6));
                    return;
                }
                eqv eqvVar2 = (eqv) lqvVar;
                fza0 fza0Var2 = eqvVar2.f8254a;
                long j6 = eqvVar2.b;
                nekVar.getClass();
                long jB2 = fza0Var2.B();
                long j7 = jB2 != 0 ? jB2 : Long.MAX_VALUE;
                List list = ((u2b0) D()).l;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof pe40) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it.next();
                    w4t w4tVar = ((pe40) next3).f26833a;
                    if ((w4tVar instanceof q4t) && ((q4t) w4tVar).f28117a == j6) {
                        break;
                    }
                }
                pe40 pe40Var = (pe40) next3;
                if (pe40Var != null) {
                    w4t w4tVar2 = pe40Var.f26833a;
                    q4t q4tVar = w4tVar2 instanceof q4t ? (q4t) w4tVar2 : null;
                    if (q4tVar != null) {
                        str = q4tVar.b;
                    }
                }
                S((int) j7);
                i1w0Var.d(new mz0((Object) this, (Object) str, j6, (byte) 23));
                return;
            }
            return;
        }
        if (!(obj2 instanceof w1b0)) {
            if (!(obj2 instanceof x1b0)) {
                if (obj2 instanceof q1b0) {
                    sac.V(jiu0.a(this), t3b0.f33258a, null, mneVar.b, new r3b0(this, numE, b3), 10);
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            x1b0 x1b0Var = (x1b0) obj2;
            long j8 = x1b0Var.f40115a;
            fza0 fza0Var3 = x1b0Var.b;
            Integer num = x1b0Var.c;
            Iterator it2 = N().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((mlr) next).f22006a != j8);
            mlr mlrVar = (mlr) next;
            if (mlrVar == null) {
                return;
            }
            sac.V(jiu0.a(this), new b3b0(this, (byte) 8), null, mneVar.b, new al6(((u2b0) D()).j.contains(Long.valueOf(j8)), this, mlrVar, num, j8, fza0Var3, (yje) null), 10);
            return;
        }
        w1b0 w1b0Var = (w1b0) obj2;
        long j9 = w1b0Var.f38391a;
        fza0 fza0Var4 = w1b0Var.b;
        Integer num2 = w1b0Var.c;
        Iterator it3 = N().iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (((mlr) next2).f22006a != j9);
        mlr mlrVar2 = (mlr) next2;
        if (mlrVar2 != null) {
            if (((u2b0) D()).c) {
                y1p y1pVar3 = y1p.MAIN;
                str2 = "popular_new_virtual";
            } else if (fza0Var4 == fza0.b) {
                str2 = "brand_live";
            }
            String str3 = str2;
            int iIntValue = num2 != null ? num2.intValue() : 0;
            Iterator it4 = N().iterator();
            int i2 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    i2 = -1;
                    break;
                } else if (((mlr) it4.next()).f22006a == j9) {
                    break;
                } else {
                    i2++;
                }
            }
            Integer numValueOf = Integer.valueOf(i2);
            if (i2 < 0) {
                numValueOf = null;
            }
            numE = numValueOf != null ? kng0.e(1, numValueOf) : 0;
            ix0Var.a((int) j9, iIntValue, numE, str3, null);
            this.x.q(str3, iIntValue, j9, numE, null);
            U(mlrVar2, num2 != null ? num2.intValue() : 0, M(mlrVar2.f22006a, fza0Var4));
        }
    }
}
