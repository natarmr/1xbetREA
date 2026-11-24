package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import org.xplatform.cyber.game.mlbb.api.MlbbGameScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;

/* JADX INFO: loaded from: classes4.dex */
public final class nl40 extends i3t0 {
    public static final /* synthetic */ int a0 = 0;
    public final vpu A;
    public final hqc B;
    public final j3c C;
    public final zsr D;
    public final rpt E;
    public final kut F;
    public final iw20 G;
    public final lbu H;
    public final r8i I;
    public final m1e J;
    public final hzg K;
    public final oeg0 L;
    public final xpr M;
    public final h3c N;
    public final qv2 O;
    public final dwu P;
    public c4m0 Q;
    public c4m0 R;
    public bby S;
    public bby T;
    public c4m0 U;
    public c4m0 V;
    public c4m0 W;
    public c4m0 X;
    public c4m0 Y;
    public c4m0 Z;
    public final vzg0 o;
    public final String p;
    public final mne q;
    public final MlbbGameScreenParams r;
    public final tzi s;
    public final pmi t;
    public final a7q u;
    public final rus v;
    public final g3j w;
    public final z0s x;
    public final sbu y;
    public final drm0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl40(vzg0 vzg0Var, String str, mne mneVar, MlbbGameScreenParams mlbbGameScreenParams, tzi tziVar, pmi pmiVar, a7q a7qVar, rus rusVar, g3j g3jVar, z0s z0sVar, sbu sbuVar, drm0 drm0Var, vpu vpuVar, lbu lbuVar, hqc hqcVar, wyu wyuVar, j3c j3cVar, pru pruVar, luu luuVar, e1u e1uVar, zsr zsrVar, rpt rptVar, kut kutVar, iw20 iw20Var, lbu lbuVar2, r8i r8iVar, m1e m1eVar, hzg hzgVar, oeg0 oeg0Var, ctf0 ctf0Var, g2v g2vVar, xpr xprVar, r9u r9uVar, h3c h3cVar, qv2 qv2Var, dwu dwuVar) {
        super(new b87(lbuVar, vzg0Var, e1uVar, mlbbGameScreenParams, wyuVar, pruVar, luuVar, r9uVar, ctf0Var), cvm0.p(mneVar.c, mneVar.f22085a), new o20(ctf0Var, g2vVar, (byte) 15), (yzn0) null);
        wyuVar.getClass();
        m1eVar.getClass();
        oeg0Var.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        this.o = vzg0Var;
        this.p = str;
        this.q = mneVar;
        this.r = mlbbGameScreenParams;
        this.s = tziVar;
        this.t = pmiVar;
        this.u = a7qVar;
        this.v = rusVar;
        this.w = g3jVar;
        this.x = z0sVar;
        this.y = sbuVar;
        this.z = drm0Var;
        this.A = vpuVar;
        this.B = hqcVar;
        this.C = j3cVar;
        this.D = zsrVar;
        this.E = rptVar;
        this.F = kutVar;
        this.G = iw20Var;
        this.H = lbuVar2;
        this.I = r8iVar;
        this.J = m1eVar;
        this.K = hzgVar;
        this.L = oeg0Var;
        this.M = xprVar;
        this.N = h3cVar;
        this.O = qv2Var;
        this.P = dwuVar;
        sac.V(jiu0.a(this), null, null, mneVar.c, new ll40(this, null, (byte) 3), 11);
        i3t0.B(this, xprVar, new wpr[]{upr.f36080a});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(ats atsVar, zje zjeVar) {
        il40 il40Var;
        Object g0g0Var;
        if (zjeVar instanceof il40) {
            il40Var = (il40) zjeVar;
            int i = il40Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                il40Var.k = i - Integer.MIN_VALUE;
            } else {
                il40Var = new il40(this, zjeVar);
            }
        } else {
            il40Var = new il40(this, zjeVar);
        }
        Object objF = il40Var.i;
        wne wneVar = wne.f39444a;
        int i2 = il40Var.k;
        boolean z = true;
        try {
            if (i2 == 0) {
                z1x.P(objF);
                yws ywsVar = ((dl40) D()).q;
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
                        lbu lbuVar = this.H;
                        il40Var.k = 1;
                        objF = lbuVar.f(str, il40Var);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(zje zjeVar) {
        ml40 ml40Var;
        m9s m9sVar;
        if (zjeVar instanceof ml40) {
            ml40Var = (ml40) zjeVar;
            int i = ml40Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ml40Var.l = i - Integer.MIN_VALUE;
            } else {
                ml40Var = new ml40(this, zjeVar);
            }
        } else {
            ml40Var = new ml40(this, zjeVar);
        }
        Object obj = ml40Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ml40Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            m9s m9sVarC = d5c.C(((dl40) D()).c);
            if (m9sVarC == null) {
                return Unit.f46060a;
            }
            long j = m9sVarC.o;
            ml40Var.i = m9sVarC;
            ml40Var.l = 1;
            Object objB = this.N.b(j, ml40Var);
            if (objB == wneVar) {
                return wneVar;
            }
            m9sVar = m9sVarC;
            obj = objB;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m9sVar = ml40Var.i;
            z1x.P(obj);
        }
        GameScreenGeneralParams gameScreenGeneralParamsL = d7x.L(this.r.f46517a, m9sVar, ((Boolean) obj).booleanValue());
        if (gameScreenGeneralParamsL == null) {
            return Unit.f46060a;
        }
        FragmentScreen fragmentScreenH = this.O.h(gameScreenGeneralParamsL);
        i1w0 i1w0VarC = this.L.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new d1w0(fragmentScreenH)), i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return Unit.f46060a;
            }
            i1w0VarC.a((oe50) pawVar.next());
        }
    }

    @Override // a.diu0
    public final void v() {
        LinkedHashMap linkedHashMap = bi40.f2641a;
        String str = this.p;
        str.getClass();
        bi40.f2641a.remove(str);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:186:0x0442  */
    /* JADX WARN: Code duplicated, block: B:246:0x05e5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        List list;
        Object obj2;
        Object value2;
        Object value3;
        byte b;
        byte b2;
        fl40 fl40Var;
        List listA;
        boolean z;
        uh40 uh40Var = (uh40) obj;
        uh40Var.getClass();
        super.x(uh40Var);
        boolean z2 = uh40Var instanceof qh40;
        byte b3 = 5;
        byte b4 = 2;
        byte b5 = 1;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        MlbbGameScreenParams mlbbGameScreenParams = this.r;
        if (z2) {
            c4m0 c4m0Var = this.Y;
            if (c4m0Var != null) {
                e3c.n(c4m0Var);
            }
            byte b6 = 4;
            fnq fnqVar = new fnq(this.J.b(), new ll40(this, z12 ? 1 : 0, b5), b6);
            bvc bvcVarA = jiu0.a(this);
            rwj rwjVar = this.q.f22085a;
            sje sjeVarS = d5c.S(bvcVarA, rwjVar);
            foe foeVar = foe.h;
            this.Y = sac.T(fnqVar, sjeVarS, foeVar);
            c4m0 c4m0Var2 = this.Q;
            if (c4m0Var2 != null) {
                e3c.n(c4m0Var2);
            }
            gmq gmqVarL = this.s.l(((dl40) D()).b, ((dl40) D()).m.J1);
            pmi pmiVar = this.t;
            this.Q = sac.T(new p6d(gmqVarL, aoq.c(i120.W(new a1g(new fnq(new fc4(new i89(((b8u) pmiVar.b).d(), (byte) 22), b3), new sxk(pmiVar, z11 ? 1 : 0, (byte) 20), b6), pmiVar, (byte) 19)), new zo1((yje) (z10 ? 1 : 0), (Object) pmiVar, (byte) 23)), new eh2(this, z9 ? 1 : 0, b3), b5), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var3 = this.R;
            if (c4m0Var3 != null) {
                e3c.n(c4m0Var3);
            }
            this.R = sac.T(new fnq(this.u.a(40L, 36L), new kl40(this, z8 ? 1 : 0, b4), b6), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var4 = this.U;
            if (c4m0Var4 != null) {
                e3c.n(c4m0Var4);
            }
            this.U = sac.T(new fnq(this.A.a(), new ll40(this, z7 ? 1 : 0, b4), b6), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var5 = this.V;
            if (c4m0Var5 != null) {
                e3c.n(c4m0Var5);
            }
            this.V = sac.T(new fnq(this.B.a(), new kl40(this, z6 ? 1 : 0, b5), b6), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var6 = this.W;
            if (c4m0Var6 != null) {
                e3c.n(c4m0Var6);
            }
            this.W = sac.T(new fnq(this.E.b(), new ll40(this, z5 ? 1 : 0, (byte) 0), b6), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var7 = this.X;
            if (c4m0Var7 != null) {
                e3c.n(c4m0Var7);
            }
            this.X = sac.T(new fnq(this.F.a(), new kl40(this, z4 ? 1 : 0, (byte) 0), b6), d5c.S(jiu0.a(this), rwjVar), foeVar);
            bby bbyVar = this.S;
            if (bbyVar != null) {
                e3c.n(bbyVar);
            }
            bby bbyVar2 = this.T;
            if (bbyVar2 != null) {
                e3c.n(bbyVar2);
            }
            this.S = i3t0.F(this, this.v, null, null, new o240((byte) 11), 119);
            this.T = i3t0.F(this, this.w, null, null, new o240((byte) 12), 119);
            c4m0 c4m0Var8 = this.Z;
            if (c4m0Var8 != null) {
                e3c.n(c4m0Var8);
            }
            List list2 = ((dl40) D()).w;
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((zrs) it.next()).f44872a);
            }
            this.Z = sac.T(new fnq(this.P.a(arrayList, dam0.f5756a), new kl40(this, z3 ? 1 : 0, (byte) 3), b6), d5c.S(jiu0.a(this), rwjVar), foe.h);
            if (mlbbGameScreenParams.b && this.I.r(fk60.CYBER_EVENT)) {
                G(al40.f1051a);
                return;
            }
            return;
        }
        if (uh40Var instanceof ph40) {
            bby bbyVar3 = this.S;
            if (bbyVar3 != null) {
                e3c.n(bbyVar3);
            }
            bby bbyVar4 = this.T;
            if (bbyVar4 != null) {
                e3c.n(bbyVar4);
            }
            c4m0 c4m0Var9 = this.Q;
            if (c4m0Var9 != null) {
                e3c.n(c4m0Var9);
            }
            c4m0 c4m0Var10 = this.R;
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
            c4m0 c4m0Var16 = this.Z;
            if (c4m0Var16 != null) {
                e3c.n(c4m0Var16);
                return;
            }
            return;
        }
        if (!(uh40Var instanceof th40)) {
            if (uh40Var instanceof ih40) {
                E();
                return;
            }
            if (uh40Var instanceof lh40) {
                ims imsVar = ((lh40) uh40Var).f20037a;
                m9s m9sVarC = d5c.C(((dl40) D()).c);
                if (m9sVarC == null) {
                    return;
                }
                i3t0.B(this, this.w, new ims[]{new ems(mlbbGameScreenParams.e, mlbbGameScreenParams.d, ((dl40) D()).l, m9sVarC), imsVar});
                return;
            }
            if (uh40Var instanceof jh40) {
                hdb hdbVar = ((jh40) uh40Var).f16511a;
                jlr jlrVar = ((dl40) D()).c;
                xkr xkrVar = jlrVar instanceof xkr ? (xkr) jlrVar : null;
                m9s m9sVar = xkrVar != null ? xkrVar.d : null;
                long j = mlbbGameScreenParams.e;
                long j2 = mlbbGameScreenParams.d;
                long j3 = mlbbGameScreenParams.i;
                sff0 sff0Var = ((dl40) D()).m;
                List list3 = ((dl40) D()).n;
                ypl0 ypl0Var = ((dl40) D()).e;
                CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
                int i = mlbbGameScreenParams.j;
                boolean z13 = mlbbGameScreenParams.b;
                String str = mlbbGameScreenParams.h;
                if (str.length() == 0) {
                    String str2 = m9sVar != null ? m9sVar.f : null;
                    str = str2 == null ? "" : str2;
                }
                i3t0.B(this, this.x, new hdb[]{new ddb(i, j, j2, j3, m9sVar, sff0Var, ypl0Var, str, list3, real, z13), hdbVar});
                return;
            }
            boolean z14 = uh40Var instanceof kh40;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z14) {
                uss ussVar = ((kh40) uh40Var).f18272a;
                if (ussVar instanceof sss) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value3, dl40.a((dl40) value3, null, null, null, null, null, false, null, false, e49.a(((sss) ussVar).f32741a), null, null, null, false, null, 0L, 16744447)));
                    return;
                }
                if (!(ussVar instanceof tss)) {
                    t9f.b();
                    return;
                }
                i3t0.A(this, this.M, tpr.f34347a, null, null, 6);
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, dl40.a((dl40) value2, null, null, null, null, null, false, null, false, true, null, null, null, false, null, 0L, 16744447)));
                this.D.a();
                return;
            }
            if (uh40Var instanceof rh40) {
                rh40 rh40Var = (rh40) uh40Var;
                mi40 mi40Var = ((dl40) D()).d;
                hj40 hj40Var = mi40Var != null ? mi40Var.b : null;
                String str3 = rh40Var.f30472a;
                if (str3.equals("MLBB_FIRST_TEAM_LINEUP_ID")) {
                    if (hj40Var != null) {
                        list = hj40Var.c;
                    } else {
                        list = null;
                    }
                } else if (!str3.equals("MLBB_SECOND_TEAM_LINEUP_ID") || hj40Var == null) {
                    list = null;
                } else {
                    list = hj40Var.f;
                }
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        Object next = it2.next();
                        if (((jj40) next).f16605a.equals(rh40Var.b)) {
                            obj2 = next;
                            break;
                        }
                    }
                    jj40 jj40Var = (jj40) obj2;
                    if (jj40Var != null) {
                        H(new ba30(rh40Var, jj40Var.f16605a, (byte) 11));
                        return;
                    }
                    return;
                }
                return;
            }
            if (uh40Var instanceof nh40) {
                long j4 = ((nh40) uh40Var).f23516a;
                c0o c0oVar = vj40.c;
                if (c0oVar == null || !c0oVar.isEmpty()) {
                    Iterator it3 = c0oVar.iterator();
                    while (it3.hasNext()) {
                        if (((vj40) it3.next()).f37510a == j4) {
                            p7m0 p7m0Var3 = ocjVar.f25029a;
                            while (true) {
                                Object value4 = p7m0Var3.getValue();
                                value4.getClass();
                                oyg0Var.getClass();
                                long j5 = j4;
                                if (p7m0Var3.m(value4, dl40.a((dl40) value4, null, null, null, null, null, false, null, false, false, null, null, null, false, null, j5, 8388607))) {
                                    return;
                                } else {
                                    j4 = j5;
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (uh40Var instanceof mh40) {
                ((uzg) this.K).e(CyberGamesPage.Real.INSTANCE.f46556a, 40L, mlbbGameScreenParams.d, true);
                return;
            }
            if (uh40Var instanceof oh40) {
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value = p7m0Var4.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                    da10 da10Var = da10.DEFAULT_ERROR;
                } while (!p7m0Var4.m(value, dl40.a((dl40) value, null, null, null, null, null, false, null, false, false, null, null, null, false, null, 0L, 16777087)));
                this.G.h();
                return;
            }
            if (!(uh40Var instanceof sh40)) {
                t9f.b();
                return;
            }
            szj0 szj0Var = ((dl40) D()).r;
            if (szj0Var == null) {
                return;
            }
            i3t0.K(this, null, null, new sr((i3t0) this, (Object) szj0Var, szj0Var.f33073a.longValue(), (yje) null, (byte) 10), 3);
            return;
        }
        nus nusVar = ((th40) uh40Var).f33945a;
        List list4 = ((dl40) D()).w;
        ArrayList arrayList2 = new ArrayList(r3d.q(list4, 10));
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList2.add(Integer.valueOf(((zrs) it4.next()).f44872a.f33572a));
        }
        List<zrs> list5 = ((dl40) D()).w;
        m9s m9sVarC2 = d5c.C(((dl40) D()).c);
        mi40 mi40Var2 = ((dl40) D()).d;
        cqg cqgVar = m9sVarC2 != null ? m9sVarC2.I : null;
        el40 el40Var = cqgVar instanceof el40 ? (el40) cqgVar : null;
        if (el40Var == null) {
            ArrayList arrayList3 = new ArrayList(r3d.q(list5, 10));
            Iterator it5 = list5.iterator();
            while (it5.hasNext()) {
                arrayList3.add(Integer.valueOf(((zrs) it5.next()).f44872a.f33572a));
            }
            b = 1;
            listA = arrayList3;
        } else {
            fl40 fl40Var2 = el40Var.b;
            fl40 fl40Var3 = el40Var.f7980a;
            lc00 lc00VarB = kotlin.collections.a.b();
            for (zrs zrsVar : list5) {
                int iOrdinal = zrsVar.ordinal();
                short s = zrsVar.f44872a.f33572a;
                switch (iOrdinal) {
                    case 0:
                        b2 = b5;
                        if (vdx.S(el40Var, fl40Var3) || vdx.S(el40Var, fl40Var2)) {
                            lc00VarB.add(Integer.valueOf(s));
                            continue;
                        }
                        b5 = b2;
                        break;
                    case 1:
                        b2 = b5;
                        cl40 cl40Var = cl40.RED;
                        if (fl40Var3.b == cl40Var) {
                            fl40Var = fl40Var3;
                        } else if (fl40Var2.b == cl40Var) {
                            fl40Var = fl40Var2;
                        } else {
                            cl40 cl40Var2 = cl40.BLUE;
                            fl40Var = fl40Var3;
                        }
                        if (vdx.S(el40Var, fl40Var)) {
                            lc00VarB.add(Integer.valueOf(s));
                        } else {
                            continue;
                        }
                        b5 = b2;
                        break;
                    case 2:
                        b2 = b5;
                        if (vdx.V(el40Var)) {
                            lc00VarB.add(Integer.valueOf(s));
                        } else {
                            cl40 cl40Var3 = fl40Var3.b;
                            cl40 cl40Var4 = cl40.UNKNOWN;
                            if (cl40Var3 == cl40Var4 || fl40Var3.f9722a.size() != 5 || fl40Var2.b == cl40Var4 || fl40Var2.f9722a.size() != 5) {
                                lc00VarB.add(Integer.valueOf(s));
                            } else {
                                continue;
                            }
                        }
                        b5 = b2;
                        break;
                    case 3:
                        b2 = b5;
                        if (vdx.S(el40Var, fl40Var3.b == cl40.BLUE ? fl40Var3 : fl40Var2)) {
                            lc00VarB.add(Integer.valueOf(s));
                        } else {
                            continue;
                        }
                        b5 = b2;
                        break;
                    case 4:
                        if (vdx.V(el40Var) || vdx.P(fl40Var3) || vdx.P(fl40Var2)) {
                            lc00VarB.add(Integer.valueOf(s));
                        }
                        break;
                    case 5:
                        if (vdx.V(el40Var) || el40Var.d.isEmpty()) {
                            lc00VarB.add(Integer.valueOf(s));
                        }
                        break;
                    case 6:
                        if (vdx.Q(el40Var)) {
                            lc00VarB.add(Integer.valueOf(s));
                        }
                        break;
                    case 7:
                        if (vdx.R(el40Var)) {
                            lc00VarB.add(Integer.valueOf(s));
                        }
                        break;
                    case 8:
                        if (mi40Var2 == null || vdx.T(mi40Var2.b)) {
                            lc00VarB.add(Integer.valueOf(s));
                        }
                        break;
                    default:
                        t9f.b();
                        return;
                }
                b2 = b5;
                b5 = b2;
            }
            b = b5;
            listA = kotlin.collections.a.a(lc00VarB);
        }
        List<StatisticBlockModel> list6 = ((dl40) D()).v;
        List list7 = ass.f1405a;
        list6.getClass();
        if (list6.isEmpty()) {
            z = 0;
        } else {
            for (StatisticBlockModel statisticBlockModel : list6) {
                if (!statisticBlockModel.c || statisticBlockModel.b != Integer.MAX_VALUE) {
                    if (list6.isEmpty()) {
                        z = 0;
                    } else {
                        for (StatisticBlockModel statisticBlockModel2 : list6) {
                            if (!statisticBlockModel2.c || statisticBlockModel2.b != list6.indexOf(statisticBlockModel2)) {
                                z = b;
                            }
                        }
                        z = 0;
                    }
                }
            }
            z = 0;
        }
        jus jusVar = new jus(d5c.C(((dl40) D()).c), new owq0(arrayList2, listA, z), mlbbGameScreenParams.j);
        nus[] nusVarArr = new nus[2];
        nusVarArr[0] = jusVar;
        nusVarArr[b] = nusVar;
        i3t0.B(this, this.v, nusVarArr);
    }
}
