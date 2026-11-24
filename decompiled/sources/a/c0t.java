package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;
import org.xplatform.ufc.api.game.UfcGameParams;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getFighterFragmentScreen$1;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getHomeFragmentScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class c0t extends i3t0 {
    public static final /* synthetic */ int b0 = 0;
    public final e1u A;
    public final b8u B;
    public final reu C;
    public final vpu D;
    public final hqc E;
    public final j3c F;
    public final zsr G;
    public final rpt H;
    public final kut I;
    public final lbu J;
    public final m1e K;
    public final oeg0 L;
    public final kys0 M;
    public final dwu N;
    public final ctf0 O;
    public c4m0 P;
    public c4m0 Q;
    public bby R;
    public c4m0 S;
    public bby T;
    public c4m0 U;
    public c4m0 V;
    public c4m0 W;
    public c4m0 X;
    public c4m0 Y;
    public boolean Z;
    public bby a0;
    public final vzg0 o;
    public final String p;
    public final mne q;
    public final UfcGameParams r;
    public final tzi s;
    public final iw20 t;
    public final drm0 u;
    public final sbu v;
    public final a7q w;
    public final rus x;
    public final g3j y;
    public final xpr z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0t(vzg0 vzg0Var, String str, mne mneVar, UfcGameParams ufcGameParams, tzi tziVar, iw20 iw20Var, drm0 drm0Var, sbu sbuVar, a7q a7qVar, rus rusVar, g3j g3jVar, xpr xprVar, e1u e1uVar, b8u b8uVar, reu reuVar, vpu vpuVar, hqc hqcVar, j3c j3cVar, e1u e1uVar2, zsr zsrVar, rpt rptVar, kut kutVar, lbu lbuVar, m1e m1eVar, oeg0 oeg0Var, kys0 kys0Var, uxs0 uxs0Var, dwu dwuVar, r9u r9uVar, ctf0 ctf0Var, lbu lbuVar2, pru pruVar, g2v g2vVar) {
        super(new co0((Object) lbuVar2, (Object) vzg0Var, (Object) ufcGameParams, (Object) e1uVar2, pruVar, (Object) r9uVar, (byte) 5), cvm0.p(mneVar.c, mneVar.f22085a), new o20(ctf0Var, g2vVar, (byte) 10), (yzn0) null);
        m1eVar.getClass();
        oeg0Var.getClass();
        r9uVar.getClass();
        ctf0Var.getClass();
        this.o = vzg0Var;
        this.p = str;
        this.q = mneVar;
        this.r = ufcGameParams;
        this.s = tziVar;
        this.t = iw20Var;
        this.u = drm0Var;
        this.v = sbuVar;
        this.w = a7qVar;
        this.x = rusVar;
        this.y = g3jVar;
        this.z = xprVar;
        this.A = e1uVar;
        this.B = b8uVar;
        this.C = reuVar;
        this.D = vpuVar;
        this.E = hqcVar;
        this.F = j3cVar;
        this.G = zsrVar;
        this.H = rptVar;
        this.I = kutVar;
        this.J = lbuVar;
        this.K = m1eVar;
        this.L = oeg0Var;
        this.M = kys0Var;
        this.N = dwuVar;
        this.O = ctf0Var;
        sac.V(jiu0.a(this), null, null, mneVar.c, new b0t(this, null, (byte) 3), 11);
        i3t0.B(this, xprVar, new wpr[]{upr.f36080a});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(ats atsVar, zje zjeVar) {
        zzs zzsVar;
        Object g0g0Var;
        if (zjeVar instanceof zzs) {
            zzsVar = (zzs) zjeVar;
            int i = zzsVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzsVar.k = i - Integer.MIN_VALUE;
            } else {
                zzsVar = new zzs(this, zjeVar);
            }
        } else {
            zzsVar = new zzs(this, zjeVar);
        }
        Object objF = zzsVar.i;
        wne wneVar = wne.f39444a;
        int i2 = zzsVar.k;
        boolean z = true;
        try {
            if (i2 == 0) {
                z1x.P(objF);
                yws ywsVar = ((wrs) D()).m;
                if (ywsVar != null) {
                    return ywsVar;
                }
                m9s m9sVarC = d5c.C(atsVar.f1447a);
                if (m9sVarC != null) {
                    String str = m9sVarC.u;
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        e0g0 e0g0Var = j0g0.b;
                        lbu lbuVar = this.J;
                        zzsVar.k = 1;
                        objF = lbuVar.f(str, zzsVar);
                        if (objF == wneVar) {
                            return wneVar;
                        }
                    }
                }
                return null;
            }
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objF);
            g0g0Var = (String) objF;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        boolean z2 = j0g0.a(g0g0Var) instanceof lws;
        String str2 = (String) (g0g0Var instanceof g0g0 ? null : g0g0Var);
        String str3 = str2 == null ? "" : str2;
        if (!z2 && (str2 == null || str2.length() <= 0)) {
            z = false;
        }
        return new yws(z, z2, str3, 0);
    }

    @Override // a.diu0
    public final void v() {
        LinkedHashMap linkedHashMap = ocs.f25042a;
        String str = this.p;
        str.getClass();
        ocs.f25042a.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        boolean z;
        Object value5;
        Object value6;
        amr amrVar = (amr) obj;
        amrVar.getClass();
        super.x(amrVar);
        byte b = 2;
        byte b2 = 1;
        byte b3 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        if (amrVar instanceof qlr) {
            c4m0 c4m0Var = this.Y;
            if (c4m0Var != null) {
                e3c.n(c4m0Var);
            }
            byte b4 = 4;
            fnq fnqVar = new fnq(this.K.b(), new b0t(this, objArr8 == true ? 1 : 0, b2), b4);
            bvc bvcVarA = jiu0.a(this);
            rwj rwjVar = this.q.f22085a;
            sje sjeVarS = d5c.S(bvcVarA, rwjVar);
            foe foeVar = foe.h;
            this.Y = sac.T(fnqVar, sjeVarS, foeVar);
            c4m0 c4m0Var2 = this.P;
            if (c4m0Var2 != null) {
                e3c.n(c4m0Var2);
            }
            this.P = sac.T(new fnq(this.s.l(((wrs) D()).b, ((wrs) D()).s.J1), new fhq(this, objArr7 == true ? 1 : 0, (byte) 6), b4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var3 = this.Q;
            if (c4m0Var3 != null) {
                e3c.n(c4m0Var3);
            }
            this.Q = sac.T(new fnq(this.w.a(189L, 0L), new a0t(this, objArr6 == true ? 1 : 0, b), b4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var4 = this.U;
            if (c4m0Var4 != null) {
                e3c.n(c4m0Var4);
            }
            this.U = sac.T(new fnq(this.D.a(), new b0t(this, objArr5 == true ? 1 : 0, b), b4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var5 = this.V;
            if (c4m0Var5 != null) {
                e3c.n(c4m0Var5);
            }
            this.V = sac.T(new fnq(this.E.a(), new a0t(this, objArr4 == true ? 1 : 0, b2), b4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var6 = this.W;
            if (c4m0Var6 != null) {
                e3c.n(c4m0Var6);
            }
            this.W = sac.T(new fnq(this.H.b(), new b0t(this, objArr3 == true ? 1 : 0, b3), b4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var7 = this.X;
            if (c4m0Var7 != null) {
                e3c.n(c4m0Var7);
            }
            this.X = sac.T(new fnq(this.I.a(), new a0t(this, objArr2 == true ? 1 : 0, b3), b4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            bby bbyVar = this.R;
            if (bbyVar != null) {
                e3c.n(bbyVar);
            }
            bby bbyVar2 = this.T;
            if (bbyVar2 != null) {
                e3c.n(bbyVar2);
            }
            byte b5 = 28;
            this.R = i3t0.F(this, this.x, null, new g7p(this, b5), new t4s((byte) 27), 117);
            this.T = i3t0.F(this, this.y, null, null, new t4s(b5), 119);
            c4m0 c4m0Var8 = this.S;
            if (c4m0Var8 != null) {
                e3c.n(c4m0Var8);
            }
            this.S = sac.T(new fnq(this.N.a(((wrs) D()).v, dam0.f5756a), new a0t(this, objArr == true ? 1 : 0, (byte) 3), b4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            return;
        }
        if (amrVar instanceof plr) {
            bby bbyVar3 = this.R;
            if (bbyVar3 != null) {
                e3c.n(bbyVar3);
            }
            bby bbyVar4 = this.T;
            if (bbyVar4 != null) {
                e3c.n(bbyVar4);
            }
            c4m0 c4m0Var9 = this.P;
            if (c4m0Var9 != null) {
                e3c.n(c4m0Var9);
            }
            c4m0 c4m0Var10 = this.Q;
            if (c4m0Var10 != null) {
                e3c.n(c4m0Var10);
            }
            c4m0 c4m0Var11 = this.U;
            if (c4m0Var11 != null) {
                e3c.n(c4m0Var11);
            }
            c4m0 c4m0Var12 = this.V;
            if (c4m0Var12 != null) {
                e3c.n(c4m0Var12);
            }
            c4m0 c4m0Var13 = this.W;
            if (c4m0Var13 != null) {
                e3c.n(c4m0Var13);
            }
            c4m0 c4m0Var14 = this.X;
            if (c4m0Var14 != null) {
                e3c.n(c4m0Var14);
            }
            c4m0 c4m0Var15 = this.Y;
            if (c4m0Var15 != null) {
                e3c.n(c4m0Var15);
            }
            bby bbyVar5 = this.a0;
            if (bbyVar5 != null) {
                e3c.n(bbyVar5);
            }
            c4m0 c4m0Var16 = this.S;
            if (c4m0Var16 != null) {
                e3c.n(c4m0Var16);
                return;
            }
            return;
        }
        if (amrVar instanceof olr) {
            E();
            return;
        }
        boolean z2 = amrVar instanceof wlr;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z2) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value6 = p7m0Var.getValue();
                value6.getClass();
                oyg0Var.getClass();
                da10 da10Var = da10.DEFAULT_ERROR;
            } while (!p7m0Var.m(value6, wrs.a((wrs) value6, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, 0L, 0L, 66584575)));
            this.t.h();
            return;
        }
        boolean z3 = amrVar instanceof vlr;
        oeg0 oeg0Var = this.L;
        if (z3) {
            i1w0 i1w0VarC = oeg0Var.c();
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0VarC.a((oe50) pawVar.next());
                }
            }
        } else {
            if (amrVar instanceof xlr) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value5 = p7m0Var2.getValue();
                    value5.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value5, wrs.a((wrs) value5, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, 0L, 0L, 62914559)));
                return;
            }
            boolean z4 = amrVar instanceof zlr;
            byte b6 = 10;
            UfcGameParams ufcGameParams = this.r;
            if (z4) {
                nus nusVar = ((zlr) amrVar).f44594a;
                List list = ((wrs) D()).v;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((t9m0) it.next()).f33572a));
                }
                List list2 = ((wrs) D()).h;
                lov lovVar = ((wrs) D()).k;
                list2.getClass();
                lc00 lc00VarB = kotlin.collections.a.b();
                for (yrs yrsVar : yrs.c) {
                    int iOrdinal = yrsVar.ordinal();
                    short s = yrsVar.f43136a.f33572a;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            t9f.b();
                            return;
                        }
                        if (lovVar != null) {
                            List list3 = lovVar.e;
                            if (list3 == null || !list3.isEmpty()) {
                                Iterator it2 = list3.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (tlb.X((n4t0) it2.next())) {
                                        }
                                    }
                                }
                            }
                            List list4 = lovVar.f;
                            if (list4 == null || !list4.isEmpty()) {
                                Iterator it3 = list4.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (tlb.X((n4t0) it3.next())) {
                                        }
                                    }
                                }
                            }
                            List list5 = lovVar.g;
                            if (list5 == null || !list5.isEmpty()) {
                                Iterator it4 = list5.iterator();
                                do {
                                    if (it4.hasNext()) {
                                    }
                                } while (!tlb.X((n4t0) it4.next()));
                            }
                        }
                        lc00VarB.add(Integer.valueOf(s));
                        break;
                    }
                    mxp mxpVar = (mxp) CollectionsKt.W(0, list2);
                    mxp mxpVar2 = (mxp) CollectionsKt.W(1, list2);
                    if (mxpVar == null || mxpVar2 == null || (!tdc.h0(mxpVar, mxpVar2) && !tdc.a0(mxpVar, mxpVar2) && !tdc.S(mxpVar, mxpVar2))) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                }
                lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
                List<StatisticBlockModel> list6 = ((wrs) D()).u;
                list6.getClass();
                if (list6.isEmpty()) {
                    z = false;
                } else {
                    for (StatisticBlockModel statisticBlockModel : list6) {
                        if (!statisticBlockModel.c || statisticBlockModel.b != Integer.MAX_VALUE) {
                            if (!list6.isEmpty()) {
                                for (StatisticBlockModel statisticBlockModel2 : list6) {
                                    if (!statisticBlockModel2.c || statisticBlockModel2.b != list6.indexOf(statisticBlockModel2)) {
                                        z = true;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    }
                    z = false;
                }
                i3t0.B(this, this.x, new nus[]{new jus(d5c.C(((wrs) D()).c), new owq0(arrayList, lc00VarA, z), ufcGameParams.g), nusVar});
                return;
            }
            boolean z5 = amrVar instanceof ulr;
            kys0 kys0Var = this.M;
            if (z5) {
                ims imsVar = ((ulr) amrVar).f35887a;
                if (!(imsVar instanceof hms)) {
                    m9s m9sVarC = d5c.C(((wrs) D()).c);
                    if (m9sVarC == null) {
                        return;
                    }
                    i3t0.B(this, this.y, new ims[]{new ems(189L, 0L, ((wrs) D()).l, m9sVarC), imsVar});
                    return;
                }
                long j = ((hms) imsVar).f13322a;
                i1w0 i1w0VarC2 = oeg0Var.c();
                i1w0VarC2.getClass();
                k0w0 k0w0Var = new k0w0(i1w0VarC2);
                kys0Var.getClass();
                k0w0Var.h(new UfcScreensFactoryImpl$getFighterFragmentScreen$1(j));
                ListIterator listIteratorO = b1j.o(i1w0VarC2, k0w0Var.f17489a, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0VarC2.a((oe50) pawVar2.next());
                    }
                }
            } else {
                if (!(amrVar instanceof rlr)) {
                    if (amrVar instanceof slr) {
                        uss ussVar = ((slr) amrVar).f32413a;
                        if (ussVar instanceof sss) {
                            p7m0 p7m0Var3 = ocjVar.f25029a;
                            do {
                                value4 = p7m0Var3.getValue();
                                value4.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var3.m(value4, wrs.a((wrs) value4, null, null, null, null, null, null, null, null, null, null, null, false, false, e49.a(((sss) ussVar).f32741a), null, false, 0L, 0L, 66977791)));
                            return;
                        }
                        if (!(ussVar instanceof tss)) {
                            t9f.b();
                            return;
                        }
                        i3t0.A(this, this.z, tpr.f34347a, null, null, 6);
                        p7m0 p7m0Var4 = ocjVar.f25029a;
                        do {
                            value3 = p7m0Var4.getValue();
                            value3.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var4.m(value3, wrs.a((wrs) value3, null, null, null, null, null, null, null, null, null, null, null, false, false, true, null, false, 0L, 0L, 66977791)));
                        this.G.a();
                        return;
                    }
                    if (!(amrVar instanceof ylr)) {
                        if (!(amrVar instanceof tlr)) {
                            t9f.b();
                            return;
                        }
                        tlr tlrVar = (tlr) amrVar;
                        if (tlrVar.f34160a.length() == 0) {
                            G(new srs(this.O.b.a(R.string.statistics_dont_found_for_event, Arrays.copyOf(new Object[0], 0))));
                            return;
                        } else {
                            oeg0Var.c().d(new f3s(this, tlrVar, b6));
                            return;
                        }
                    }
                    ylr ylrVar = (ylr) amrVar;
                    String str = ylrVar.f42858a;
                    if (str.equals("GENERAL_STATISTIC")) {
                        p7m0 p7m0Var5 = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var5.getValue();
                            value2.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var5.m(value2, wrs.a((wrs) value2, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, ylrVar.b, 0L, 58720255)));
                        return;
                    }
                    if (str.equals("HEAD_TO_HEAD_STATISTIC")) {
                        p7m0 p7m0Var6 = ocjVar.f25029a;
                        do {
                            value = p7m0Var6.getValue();
                            value.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var6.m(value, wrs.a((wrs) value, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, 0L, ylrVar.b, 50331647)));
                        return;
                    }
                    return;
                }
                hdb hdbVar = ((rlr) amrVar).f30711a;
                if (hdbVar instanceof edb) {
                    String str2 = ufcGameParams.f;
                    if (str2.length() == 0) {
                        m9s m9sVarC2 = d5c.C(((wrs) D()).c);
                        String str3 = m9sVarC2 != null ? m9sVarC2.f : null;
                        str2 = str3 == null ? "" : str3;
                    }
                    oeg0Var.c().d(new f3s(this, str2, (byte) 11));
                    return;
                }
                if (!(hdbVar instanceof fdb)) {
                    return;
                }
                i1w0 i1w0VarC3 = oeg0Var.c();
                i1w0VarC3.getClass();
                k0w0 k0w0Var2 = new k0w0(i1w0VarC3);
                kys0Var.getClass();
                k0w0Var2.h(new UfcScreensFactoryImpl$getHomeFragmentScreen$1());
                ListIterator listIteratorO2 = b1j.o(i1w0VarC3, k0w0Var2.f17489a, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorO2;
                    if (!pawVar3.hasNext()) {
                        return;
                    } else {
                        i1w0VarC3.a((oe50) pawVar3.next());
                    }
                }
            }
        }
    }
}
