package a;

import android.os.Parcelable;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.cyber.game.counterstrike.api.Cs2GameScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;

/* JADX INFO: loaded from: classes4.dex */
public final class rnf extends i3t0 {
    public static final /* synthetic */ int e0 = 0;
    public final kut A;
    public final rus B;
    public final g3j C;
    public final r8i D;
    public final tzi E;
    public final sbu F;
    public final drm0 G;
    public final lbu H;
    public final hzg I;
    public final z0s J;
    public final zsr K;
    public final uii L;
    public final nvu M;
    public final h3c N;
    public final oeg0 O;
    public final qgh P;
    public final h3c Q;
    public final qv2 R;
    public final xpr S;
    public final j3c T;
    public c4m0 U;
    public c4m0 V;
    public c4m0 W;
    public c4m0 X;
    public c4m0 Y;
    public c4m0 Z;
    public c4m0 a0;
    public bby b0;
    public bby c0;
    public c4m0 d0;
    public final vzg0 o;
    public final String p;
    public final Cs2GameScreenParams q;
    public final ctf0 r;
    public final mne s;
    public final m1e t;
    public final iw20 u;
    public final a7q v;
    public final vpu w;
    public final dwu x;
    public final hqc y;
    public final rpt z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnf(vzg0 vzg0Var, String str, Cs2GameScreenParams cs2GameScreenParams, ctf0 ctf0Var, g2v g2vVar, mne mneVar, lbu lbuVar, pru pruVar, e1u e1uVar, m1e m1eVar, iw20 iw20Var, a7q a7qVar, vpu vpuVar, dwu dwuVar, hqc hqcVar, rpt rptVar, kut kutVar, luu luuVar, rus rusVar, g3j g3jVar, r8i r8iVar, tzi tziVar, sbu sbuVar, drm0 drm0Var, lbu lbuVar2, hzg hzgVar, z0s z0sVar, zsr zsrVar, uii uiiVar, nvu nvuVar, h3c h3cVar, oeg0 oeg0Var, qgh qghVar, h3c h3cVar2, qv2 qv2Var, xpr xprVar, j3c j3cVar, r9u r9uVar) {
        super(new pg1(lbuVar, pruVar, luuVar, vzg0Var, e1uVar, (Parcelable) cs2GameScreenParams, r9uVar, (byte) 8), cvm0.p(mneVar.c, mneVar.f22085a), new o20(ctf0Var, g2vVar, (byte) 2), (yzn0) null);
        ctf0Var.getClass();
        m1eVar.getClass();
        oeg0Var.getClass();
        r9uVar.getClass();
        this.o = vzg0Var;
        this.p = str;
        this.q = cs2GameScreenParams;
        this.r = ctf0Var;
        this.s = mneVar;
        this.t = m1eVar;
        this.u = iw20Var;
        this.v = a7qVar;
        this.w = vpuVar;
        this.x = dwuVar;
        this.y = hqcVar;
        this.z = rptVar;
        this.A = kutVar;
        this.B = rusVar;
        this.C = g3jVar;
        this.D = r8iVar;
        this.E = tziVar;
        this.F = sbuVar;
        this.G = drm0Var;
        this.H = lbuVar2;
        this.I = hzgVar;
        this.J = z0sVar;
        this.K = zsrVar;
        this.L = uiiVar;
        this.M = nvuVar;
        this.N = h3cVar;
        this.O = oeg0Var;
        this.P = qghVar;
        this.Q = h3cVar2;
        this.R = qv2Var;
        this.S = xprVar;
        this.T = j3cVar;
        sac.V(jiu0.a(this), null, null, mneVar.c, new nnf(this, null, (byte) 4), 11);
        i3t0.B(this, xprVar, new wpr[]{upr.f36080a});
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(ats atsVar, zje zjeVar) {
        mnf mnfVar;
        m9s m9sVarC;
        Throwable th;
        m9s m9sVar;
        j0g0 j0g0Var;
        Object g0g0Var;
        String str;
        boolean z;
        String str2;
        Object obj;
        if (zjeVar instanceof mnf) {
            mnfVar = (mnf) zjeVar;
            int i = mnfVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                mnfVar.l = i - Integer.MIN_VALUE;
            } else {
                mnfVar = new mnf(this, zjeVar);
            }
        } else {
            mnfVar = new mnf(this, zjeVar);
        }
        Object objF = mnfVar.j;
        wne wneVar = wne.f39444a;
        int i2 = mnfVar.l;
        boolean z2 = true;
        if (i2 == 0) {
            z1x.P(objF);
            yws ywsVar = ((wmf) D()).v;
            if (ywsVar != null) {
                return ywsVar;
            }
            m9sVarC = d5c.C(atsVar.f1447a);
            if (m9sVarC != null) {
                String str3 = m9sVarC.u;
                if (str3.length() != 0 || m9sVarC.B > 0) {
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        try {
                            e0g0 e0g0Var = j0g0.b;
                            lbu lbuVar = this.H;
                            mnfVar.i = m9sVarC;
                            mnfVar.l = 1;
                            objF = lbuVar.f(str3, mnfVar);
                            if (objF == wneVar) {
                                return wneVar;
                            }
                            m9sVar = m9sVarC;
                        } catch (Throwable th2) {
                            th = th2;
                            m9sVar = m9sVarC;
                            e0g0 e0g0Var2 = j0g0.b;
                            g0g0Var = new g0g0(th);
                        }
                    } else {
                        j0g0Var = null;
                    }
                    if (j0g0Var != null) {
                        obj = j0g0Var.f15681a;
                        if (obj instanceof g0g0) {
                            obj = null;
                        }
                        str = (String) obj;
                    } else {
                        str = null;
                    }
                    z = (j0g0Var != null ? j0g0.a(j0g0Var.f15681a) : null) instanceof lws;
                    int i3 = m9sVarC.B;
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (!z && ((str == null || str.length() <= 0) && i3 <= 0)) {
                        z2 = false;
                    }
                    return new yws(z2, z, str2, i3);
                }
            }
            return null;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m9sVar = mnfVar.i;
        try {
            z1x.P(objF);
        } catch (Throwable th3) {
            th = th3;
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        g0g0Var = (String) objF;
        e0g0 e0g0Var4 = j0g0.b;
        m9sVarC = m9sVar;
        j0g0Var = new j0g0(g0g0Var);
        if (j0g0Var != null) {
            obj = j0g0Var.f15681a;
            if (obj instanceof g0g0) {
                obj = null;
            }
            str = (String) obj;
        } else {
            str = null;
        }
        z = (j0g0Var != null ? j0g0.a(j0g0Var.f15681a) : null) instanceof lws;
        int i4 = m9sVarC.B;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        if (!z) {
            z2 = false;
        }
        return new yws(z2, z, str2, i4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(zje zjeVar) {
        qnf qnfVar;
        m9s m9sVar;
        if (zjeVar instanceof qnf) {
            qnfVar = (qnf) zjeVar;
            int i = qnfVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnfVar.l = i - Integer.MIN_VALUE;
            } else {
                qnfVar = new qnf(this, zjeVar);
            }
        } else {
            qnfVar = new qnf(this, zjeVar);
        }
        Object obj = qnfVar.j;
        wne wneVar = wne.f39444a;
        int i2 = qnfVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            m9s m9sVarC = d5c.C(((wmf) D()).b);
            if (m9sVarC == null) {
                return Unit.f46060a;
            }
            long j = m9sVarC.o;
            qnfVar.i = m9sVarC;
            qnfVar.l = 1;
            Object objB = this.Q.b(j, qnfVar);
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
            m9sVar = qnfVar.i;
            z1x.P(obj);
        }
        GameScreenGeneralParams gameScreenGeneralParamsL = d7x.L(this.q.f46511a, m9sVar, ((Boolean) obj).booleanValue());
        if (gameScreenGeneralParamsL == null) {
            return Unit.f46060a;
        }
        FragmentScreen fragmentScreenH = this.R.h(gameScreenGeneralParamsL);
        i1w0 i1w0VarC = this.O.c();
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
        LinkedHashMap linkedHashMap = clf.f4555a;
        String str = this.p;
        str.getClass();
        clf.f4555a.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        wif wifVar;
        Object next;
        Object next2;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        m9s m9sVar;
        List listV;
        boolean z;
        owq0 owq0Var;
        nkf nkfVar = (nkf) obj;
        nkfVar.getClass();
        super.x(nkfVar);
        if (nkfVar instanceof xjf) {
            E();
            return;
        }
        if (nkfVar instanceof hkf) {
            bby bbyVar = this.b0;
            if (bbyVar != null) {
                e3c.n(bbyVar);
            }
            bby bbyVar2 = this.c0;
            if (bbyVar2 != null) {
                e3c.n(bbyVar2);
            }
            c4m0 c4m0Var = this.d0;
            if (c4m0Var != null) {
                e3c.n(c4m0Var);
            }
            c4m0 c4m0Var2 = this.V;
            if (c4m0Var2 != null) {
                e3c.n(c4m0Var2);
            }
            e3c.n(this.W);
            e3c.n(this.X);
            e3c.n(this.Y);
            c4m0 c4m0Var3 = this.Z;
            if (c4m0Var3 != null) {
                e3c.n(c4m0Var3);
            }
            c4m0 c4m0Var4 = this.a0;
            if (c4m0Var4 != null) {
                e3c.n(c4m0Var4);
            }
            c4m0 c4m0Var5 = this.U;
            if (c4m0Var5 != null) {
                e3c.n(c4m0Var5);
                return;
            }
            return;
        }
        boolean z2 = nkfVar instanceof ikf;
        byte b = 2;
        byte b2 = 1;
        byte b3 = 4;
        mne mneVar = this.s;
        ?? r9 = 0;
        Cs2GameScreenParams cs2GameScreenParams = this.q;
        if (z2) {
            c4m0 c4m0Var6 = this.U;
            if (c4m0Var6 != null) {
                e3c.n(c4m0Var6);
            }
            fnq fnqVar = new fnq(this.t.b(), new nnf(this, r9, b), (byte) 4);
            bvc bvcVarA = jiu0.a(this);
            rwj rwjVar = mneVar.f22085a;
            sje sjeVarS = d5c.S(bvcVarA, rwjVar);
            foe foeVar = foe.h;
            this.U = sac.T(fnqVar, sjeVarS, foeVar);
            c4m0 c4m0Var7 = this.d0;
            if (c4m0Var7 != null) {
                e3c.n(c4m0Var7);
            }
            gmq gmqVarL = this.E.l(((wmf) D()).s, ((wmf) D()).j.J1);
            uii uiiVar = this.L;
            utb utbVarC = aoq.c(new i89(((b8u) uiiVar.e).d(), (byte) 22), new zo1((yje) r9, (Object) uiiVar, (byte) 19));
            List list = ((wmf) D()).q;
            dam0 dam0Var = dam0.f5756a;
            dwu dwuVar = this.x;
            this.d0 = sac.T(dub.f0(gmqVarL, utbVarC, dwuVar.a(list, dam0Var), new pnf(this, null)), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var8 = this.V;
            if (c4m0Var8 != null) {
                e3c.n(c4m0Var8);
            }
            this.V = sac.T(new fnq(this.v.a(40L, 46L), new onf(this, r9, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var9 = this.W;
            if (c4m0Var9 != null) {
                e3c.n(c4m0Var9);
            }
            this.W = sac.T(new fnq(this.w.a(), new nnf(this, r9, (byte) 3), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var10 = this.X;
            if (c4m0Var10 != null) {
                e3c.n(c4m0Var10);
            }
            this.X = sac.T(new fnq(dwuVar.a(((wmf) D()).q, dam0Var), new onf(this, r9, (byte) 3), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var11 = this.Y;
            if (c4m0Var11 != null) {
                e3c.n(c4m0Var11);
            }
            this.Y = sac.T(new fnq(this.y.a(), new onf(this, r9, b2), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var12 = this.Z;
            if (c4m0Var12 != null) {
                e3c.n(c4m0Var12);
            }
            this.Z = sac.T(new fnq(this.z.b(), new nnf(this, r9, b2), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var13 = this.a0;
            if (c4m0Var13 != null) {
                e3c.n(c4m0Var13);
            }
            this.a0 = sac.T(new fnq(this.A.a(), new onf(this, r9, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            bby bbyVar3 = this.b0;
            if (bbyVar3 != null) {
                e3c.n(bbyVar3);
            }
            bby bbyVar4 = this.c0;
            if (bbyVar4 != null) {
                e3c.n(bbyVar4);
            }
            this.b0 = i3t0.F(this, this.B, null, new ejd(this, (byte) 24), new bqd((byte) 29), 117);
            this.c0 = i3t0.F(this, this.C, null, null, new bqd((byte) 27), 119);
            if (cs2GameScreenParams.b && this.D.r(fk60.CYBER_EVENT)) {
                G(umf.f35917a);
                return;
            }
            return;
        }
        if (nkfVar instanceof dkf) {
            ims imsVar = ((dkf) nkfVar).f6227a;
            m9s m9sVarC = d5c.C(((wmf) D()).b);
            if (m9sVarC == null) {
                return;
            }
            i3t0.B(this, this.C, new ims[]{new ems(cs2GameScreenParams.e, cs2GameScreenParams.d, ((wmf) D()).h, m9sVarC), imsVar});
            return;
        }
        byte b4 = 10;
        if (nkfVar instanceof mkf) {
            nus nusVar = ((mkf) nkfVar).f21941a;
            m9s m9sVarC2 = d5c.C(((wmf) D()).b);
            if (m9sVarC2 == null || !m9sVarC2.K) {
                c0o c0oVar = xmf.c;
                ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
                Iterator it = c0oVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((xmf) it.next()).f41120a.f33572a));
                }
                mrf mrfVar = ((wmf) D()).f;
                if (mrfVar == null || (listV = u1c.v(mrfVar, d5c.C(((wmf) D()).b))) == null) {
                    listV = iun.f15405a;
                }
                ?? r6 = ((wmf) D()).n;
                r6.getClass();
                if (r6.isEmpty()) {
                    z = false;
                } else {
                    Iterator it2 = r6.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            StatisticBlockModel statisticBlockModel = (StatisticBlockModel) it2.next();
                            if (!statisticBlockModel.c || statisticBlockModel.b != Integer.MAX_VALUE) {
                                if (!r6.isEmpty()) {
                                    Iterator it3 = r6.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            StatisticBlockModel statisticBlockModel2 = (StatisticBlockModel) it3.next();
                                            if (!statisticBlockModel2.c || statisticBlockModel2.b != r6.indexOf(statisticBlockModel2)) {
                                                z = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z = false;
                    }
                }
                owq0Var = new owq0(arrayList, listV, z);
            } else {
                iun iunVar = iun.f15405a;
                owq0Var = new owq0(iunVar, iunVar, false);
            }
            i3t0.B(this, this.B, new nus[]{new jus(d5c.C(((wmf) D()).b), owq0Var, cs2GameScreenParams.i), nusVar});
            return;
        }
        if (nkfVar instanceof zjf) {
            hdb hdbVar = ((zjf) nkfVar).f44479a;
            m9s m9sVarC3 = d5c.C(((wmf) D()).b);
            long j = m9sVarC3 != null ? m9sVarC3.A : cs2GameScreenParams.h;
            long j2 = cs2GameScreenParams.e;
            long j3 = cs2GameScreenParams.d;
            sff0 sff0Var = ((wmf) D()).j;
            List list2 = ((wmf) D()).t;
            ypl0 ypl0Var = ((wmf) D()).i;
            CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
            int i = cs2GameScreenParams.i;
            boolean z3 = cs2GameScreenParams.b;
            String str = cs2GameScreenParams.g;
            if (str.length() == 0) {
                jlr jlrVar = ((wmf) D()).b;
                xkr xkrVar = jlrVar instanceof xkr ? (xkr) jlrVar : null;
                String str2 = (xkrVar == null || (m9sVar = xkrVar.d) == null) ? null : m9sVar.f;
                if (str2 == null) {
                    str2 = "";
                }
                str = str2;
            }
            String str3 = str;
            jlr jlrVar2 = ((wmf) D()).b;
            xkr xkrVar2 = jlrVar2 instanceof xkr ? (xkr) jlrVar2 : null;
            i3t0.B(this, this.J, new hdb[]{new ddb(i, j2, j3, j, xkrVar2 != null ? xkrVar2.d : null, sff0Var, ypl0Var, str3, list2, real, z3), hdbVar});
            return;
        }
        boolean z4 = nkfVar instanceof akf;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z4) {
            uss ussVar = ((akf) nkfVar).f1019a;
            if (ussVar instanceof sss) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value4 = p7m0Var.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value4, wmf.a((wmf) value4, null, null, false, null, null, null, false, e49.a(((sss) ussVar).f32741a), null, false, null, null, null, null, null, 16775167)));
                return;
            }
            if (!(ussVar instanceof tss)) {
                t9f.b();
                return;
            }
            i3t0.A(this, this.S, tpr.f34347a, null, null, 6);
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, wmf.a((wmf) value3, null, null, false, null, null, null, false, true, null, false, null, null, null, null, null, 16775167)));
            this.K.a();
            return;
        }
        boolean z5 = nkfVar instanceof ekf;
        hzg hzgVar = this.I;
        if (z5) {
            ((uzg) hzgVar).e(CyberGamesPage.Real.INSTANCE.f46556a, 40L, cs2GameScreenParams.d, true);
            return;
        }
        if (nkfVar instanceof fkf) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
                da10 da10Var = da10.DEFAULT_ERROR;
            } while (!p7m0Var3.m(value2, wmf.a((wmf) value2, null, null, false, null, null, null, false, false, null, false, null, null, null, null, null, 16760831)));
            this.u.h();
            return;
        }
        if (nkfVar instanceof gkf) {
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value = p7m0Var4.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value, wmf.a((wmf) value, null, null, false, null, null, null, false, false, null, false, null, null, null, null, null, 16744447)));
            return;
        }
        if (nkfVar instanceof lkf) {
            long j4 = ((lkf) nkfVar).f20200a;
            Iterator it4 = oix0.f25333a.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (((inf) next).f15071a != j4);
            if (next != null) {
                H(new a21((byte) 6, j4));
                return;
            }
            Iterator it5 = n2z.f22823a.iterator();
            do {
                if (!it5.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it5.next();
            } while (((l2z) next2).f19335a != j4);
            if (next2 != null) {
                H(new a21((byte) 7, j4));
                return;
            }
            for (Object obj2 : cmf.f4600a) {
                if (((bmf) obj2).f2834a == j4) {
                    r9 = obj2;
                    break;
                }
            }
            if (r9 != 0) {
                H(new a21((byte) 8, j4));
                return;
            }
            return;
        }
        if (nkfVar instanceof jkf) {
            String str4 = ((jkf) nkfVar).f16666a;
            mrf mrfVar2 = ((wmf) D()).f;
            if (mrfVar2 == null || (wifVar = mrfVar2.b) == null) {
                return;
            }
            H(new eod(wifVar, str4, (byte) 12));
            return;
        }
        if (nkfVar instanceof ckf) {
            String str5 = ((ckf) nkfVar).f4503a;
            if (str5.length() == 0) {
                G(new tmf(this.r.b.a(R.string.statistics_dont_found_for_event, Arrays.copyOf(new Object[0], 0))));
                return;
            } else {
                ((uzg) hzgVar).h(str5, cs2GameScreenParams.i, cs2GameScreenParams.d);
                return;
            }
        }
        if (nkfVar instanceof bkf) {
            H(new bqd((byte) 28));
            return;
        }
        if (!(nkfVar instanceof yjf)) {
            if (!(nkfVar instanceof kkf)) {
                t9f.b();
                return;
            }
            szj0 szj0Var = ((wmf) D()).w;
            if (szj0Var == null) {
                return;
            }
            i3t0.K(this, null, null, new sr((i3t0) this, (Object) szj0Var, szj0Var.f33073a.longValue(), (yje) null, (byte) 4), 3);
            return;
        }
        yjf yjfVar = (yjf) nkfVar;
        ox oxVar = yjfVar.f42736a;
        int i2 = yjfVar.b;
        if (oxVar.equals(hx.f13788a)) {
            sac.V(jiu0.a(this), new vlf(b3), null, mneVar.c, new bh0(this, i2, r9, b4), 10);
        } else if (oxVar.equals(mx.f22528a)) {
            sac.V(jiu0.a(this), null, null, mneVar.c, new nnf(this, r9, (byte) 0), 11);
        }
    }
}
