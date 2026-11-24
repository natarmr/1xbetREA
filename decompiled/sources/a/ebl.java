package a;

import android.os.Parcelable;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.cyber.game.dota.api.presentation.CyberGameDotaScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;

/* JADX INFO: loaded from: classes3.dex */
public final class ebl extends i3t0 {
    public static final /* synthetic */ int g0 = 0;
    public final vpu A;
    public final dwu B;
    public final hqc C;
    public final j3c D;
    public final zsr E;
    public final rpt F;
    public final kut G;
    public final h3c H;
    public final iw20 I;
    public final lbu J;
    public final r8i K;
    public final nvu L;
    public final m1e M;
    public final qgh N;
    public final hzg O;
    public final oeg0 P;
    public final ctf0 Q;
    public final xpr R;
    public final h3c S;
    public final bwl T;
    public final qv2 U;
    public final gr00 V;
    public c4m0 W;
    public c4m0 X;
    public bby Y;
    public bby Z;
    public c4m0 a0;
    public c4m0 b0;
    public c4m0 c0;
    public c4m0 d0;
    public c4m0 e0;
    public c4m0 f0;
    public final vzg0 o;
    public final String p;
    public final mne q;
    public final CyberGameDotaScreenParams r;
    public final tzi s;
    public final ali t;
    public final a7q u;
    public final rus v;
    public final g3j w;
    public final z0s x;
    public final sbu y;
    public final drm0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebl(vzg0 vzg0Var, String str, mne mneVar, CyberGameDotaScreenParams cyberGameDotaScreenParams, tzi tziVar, ali aliVar, a7q a7qVar, rus rusVar, g3j g3jVar, z0s z0sVar, sbu sbuVar, drm0 drm0Var, vpu vpuVar, lbu lbuVar, dwu dwuVar, hqc hqcVar, j3c j3cVar, pru pruVar, luu luuVar, e1u e1uVar, zsr zsrVar, rpt rptVar, kut kutVar, h3c h3cVar, iw20 iw20Var, lbu lbuVar2, r8i r8iVar, nvu nvuVar, m1e m1eVar, qgh qghVar, hzg hzgVar, oeg0 oeg0Var, ctf0 ctf0Var, g2v g2vVar, xpr xprVar, r9u r9uVar, h3c h3cVar2, bwl bwlVar, qv2 qv2Var, gr00 gr00Var) {
        super(new h92(lbuVar, pruVar, luuVar, vzg0Var, e1uVar, (Parcelable) cyberGameDotaScreenParams, ctf0Var, r9uVar, (byte) 3), cvm0.p(mneVar.c, mneVar.f22085a), new o20(ctf0Var, g2vVar, (byte) 6), (yzn0) null);
        m1eVar.getClass();
        oeg0Var.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        this.o = vzg0Var;
        this.p = str;
        this.q = mneVar;
        this.r = cyberGameDotaScreenParams;
        this.s = tziVar;
        this.t = aliVar;
        this.u = a7qVar;
        this.v = rusVar;
        this.w = g3jVar;
        this.x = z0sVar;
        this.y = sbuVar;
        this.z = drm0Var;
        this.A = vpuVar;
        this.B = dwuVar;
        this.C = hqcVar;
        this.D = j3cVar;
        this.E = zsrVar;
        this.F = rptVar;
        this.G = kutVar;
        this.H = h3cVar;
        this.I = iw20Var;
        this.J = lbuVar2;
        this.K = r8iVar;
        this.L = nvuVar;
        this.M = m1eVar;
        this.N = qghVar;
        this.O = hzgVar;
        this.P = oeg0Var;
        this.Q = ctf0Var;
        this.R = xprVar;
        this.S = h3cVar2;
        this.T = bwlVar;
        this.U = qv2Var;
        this.V = gr00Var;
        sac.V(jiu0.a(this), null, null, mneVar.c, new bbl(this, null, (byte) 3), 11);
        i3t0.B(this, xprVar, new wpr[]{upr.f36080a});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object M(m9s m9sVar, zje zjeVar) throws Throwable {
        yal yalVar;
        Object value;
        if (zjeVar instanceof yal) {
            yalVar = (yal) zjeVar;
            int i = yalVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                yalVar.k = i - Integer.MIN_VALUE;
            } else {
                yalVar = new yal(this, zjeVar);
            }
        } else {
            yalVar = new yal(this, zjeVar);
        }
        Object objK = yalVar.i;
        wne wneVar = wne.f39444a;
        int i2 = yalVar.k;
        if (i2 == 0) {
            z1x.P(objK);
            String str = m9sVar.i;
            String str2 = m9sVar.j;
            znq0 znq0Var = new znq0(m9sVar.v);
            dfj dfjVar = dfj.UNIQUE_4;
            Locale.ENGLISH.getClass();
            String strK0 = jtv.K0(znq0Var, dfjVar, 4);
            yalVar.k = 1;
            objK = ((prc) this.T.f3330a).k(str, str2, strK0, yalVar);
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
        omg omgVar = (omg) objK;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, f9l.a((f9l) value, null, null, null, null, null, null, false, null, null, false, null, false, false, null, 0, omgVar.i.size(), null, 58720255)));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(ats atsVar, zje zjeVar) {
        zal zalVar;
        m9s m9sVarC;
        Throwable th;
        m9s m9sVar;
        j0g0 j0g0Var;
        Object g0g0Var;
        String str;
        boolean z;
        String str2;
        Object obj;
        if (zjeVar instanceof zal) {
            zalVar = (zal) zjeVar;
            int i = zalVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                zalVar.l = i - Integer.MIN_VALUE;
            } else {
                zalVar = new zal(this, zjeVar);
            }
        } else {
            zalVar = new zal(this, zjeVar);
        }
        Object objF = zalVar.j;
        wne wneVar = wne.f39444a;
        int i2 = zalVar.l;
        boolean z2 = true;
        if (i2 == 0) {
            z1x.P(objF);
            yws ywsVar = ((f9l) D()).v;
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
                            lbu lbuVar = this.J;
                            zalVar.i = m9sVarC;
                            zalVar.l = 1;
                            objF = lbuVar.f(str3, zalVar);
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
        m9sVar = zalVar.i;
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
    public final Object O(zje zjeVar) {
        dbl dblVar;
        m9s m9sVar;
        if (zjeVar instanceof dbl) {
            dblVar = (dbl) zjeVar;
            int i = dblVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                dblVar.l = i - Integer.MIN_VALUE;
            } else {
                dblVar = new dbl(this, zjeVar);
            }
        } else {
            dblVar = new dbl(this, zjeVar);
        }
        Object obj = dblVar.j;
        wne wneVar = wne.f39444a;
        int i2 = dblVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            m9s m9sVarC = d5c.C(((f9l) D()).c);
            if (m9sVarC == null) {
                return Unit.f46060a;
            }
            long j = m9sVarC.o;
            dblVar.i = m9sVarC;
            dblVar.l = 1;
            Object objB = this.S.b(j, dblVar);
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
            m9sVar = dblVar.i;
            z1x.P(obj);
        }
        GameScreenGeneralParams gameScreenGeneralParamsL = d7x.L(this.r.f46514a, m9sVar, ((Boolean) obj).booleanValue());
        if (gameScreenGeneralParamsL == null) {
            return Unit.f46060a;
        }
        FragmentScreen fragmentScreenH = this.U.h(gameScreenGeneralParamsL);
        i1w0 i1w0VarC = this.P.c();
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
        LinkedHashMap linkedHashMap = n3l.f22856a;
        String str = this.p;
        str.getClass();
        n3l.f22856a.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object next;
        Object next2;
        Object next3;
        Object value;
        Object value2;
        m9s m9sVarC;
        Object value3;
        Object value4;
        m9s m9sVar;
        boolean z;
        x1l x1lVar = (x1l) obj;
        x1lVar.getClass();
        super.x(x1lVar);
        boolean z2 = x1lVar instanceof s1l;
        byte b = 3;
        byte b2 = 2;
        byte b3 = 0;
        byte b4 = 1;
        mne mneVar = this.q;
        ?? r8 = 0;
        CyberGameDotaScreenParams cyberGameDotaScreenParams = this.r;
        if (z2) {
            c4m0 c4m0Var = this.f0;
            if (c4m0Var != null) {
                e3c.n(c4m0Var);
            }
            byte b5 = 4;
            fnq fnqVar = new fnq(this.M.b(), new bbl(this, r8, b4), b5);
            bvc bvcVarA = jiu0.a(this);
            rwj rwjVar = mneVar.f22085a;
            sje sjeVarS = d5c.S(bvcVarA, rwjVar);
            foe foeVar = foe.h;
            this.f0 = sac.T(fnqVar, sjeVarS, foeVar);
            c4m0 c4m0Var2 = this.W;
            if (c4m0Var2 != null) {
                e3c.n(c4m0Var2);
            }
            gmq gmqVarL = this.s.l(((f9l) D()).b, ((f9l) D()).q.J1);
            ali aliVar = this.t;
            this.W = sac.T(new p6d(gmqVarL, aoq.c(new i89(((b8u) aliVar.c).d(), (byte) 22), new zo1((yje) r8, (Object) aliVar, (byte) 20)), new cbl(this, null), b4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var3 = this.X;
            if (c4m0Var3 != null) {
                e3c.n(c4m0Var3);
            }
            this.X = sac.T(new fnq(this.u.a(40L, 1L), new abl(this, r8, b2), b5), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var4 = this.a0;
            if (c4m0Var4 != null) {
                e3c.n(c4m0Var4);
            }
            this.a0 = sac.T(new fnq(this.A.a(), new bbl(this, r8, b2), b5), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var5 = this.b0;
            if (c4m0Var5 != null) {
                e3c.n(c4m0Var5);
            }
            this.b0 = sac.T(new fnq(this.B.a(((f9l) D()).m, dam0.f5756a), new abl(this, r8, b), b5), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var6 = this.c0;
            if (c4m0Var6 != null) {
                e3c.n(c4m0Var6);
            }
            this.c0 = sac.T(new fnq(this.C.a(), new abl(this, r8, b4), b5), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var7 = this.d0;
            if (c4m0Var7 != null) {
                e3c.n(c4m0Var7);
            }
            this.d0 = sac.T(new fnq(this.F.b(), new bbl(this, r8, b3), b5), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var8 = this.e0;
            if (c4m0Var8 != null) {
                e3c.n(c4m0Var8);
            }
            this.e0 = sac.T(new fnq(this.G.a(), new abl(this, r8, b3), b5), d5c.S(jiu0.a(this), rwjVar), foeVar);
            bby bbyVar = this.Y;
            if (bbyVar != null) {
                e3c.n(bbyVar);
            }
            bby bbyVar2 = this.Z;
            if (bbyVar2 != null) {
                e3c.n(bbyVar2);
            }
            this.Y = i3t0.F(this, this.v, null, new e3j(this, (byte) 29), new j2l(b5), 117);
            this.Z = i3t0.F(this, this.w, null, null, new j2l((byte) 5), 119);
            if (cyberGameDotaScreenParams.b && this.K.r(fk60.CYBER_EVENT)) {
                G(d7l.f5597a);
                return;
            }
            return;
        }
        if (x1lVar instanceof r1l) {
            bby bbyVar3 = this.Y;
            if (bbyVar3 != null) {
                e3c.n(bbyVar3);
            }
            bby bbyVar4 = this.Z;
            if (bbyVar4 != null) {
                e3c.n(bbyVar4);
            }
            c4m0 c4m0Var9 = this.W;
            if (c4m0Var9 != null) {
                e3c.n(c4m0Var9);
            }
            c4m0 c4m0Var10 = this.X;
            if (c4m0Var10 != null) {
                e3c.n(c4m0Var10);
            }
            e3c.n(this.a0);
            e3c.n(this.b0);
            e3c.n(this.c0);
            c4m0 c4m0Var11 = this.d0;
            if (c4m0Var11 != null) {
                e3c.n(c4m0Var11);
            }
            c4m0 c4m0Var12 = this.e0;
            if (c4m0Var12 != null) {
                e3c.n(c4m0Var12);
            }
            c4m0 c4m0Var13 = this.f0;
            if (c4m0Var13 != null) {
                e3c.n(c4m0Var13);
                return;
            }
            return;
        }
        boolean z3 = x1lVar instanceof w1l;
        byte b6 = 10;
        ctf0 ctf0Var = this.Q;
        if (z3) {
            nus nusVar = ((w1l) x1lVar).f38406a;
            boolean zJ = ctf0Var.j();
            m9s m9sVarC2 = d5c.C(((f9l) D()).c);
            if (m9sVarC2 == null) {
                m9sVarC2 = uzb.X();
            }
            ArrayList arrayListW = e3c.w(e9l.f, zJ);
            ArrayList arrayList = new ArrayList(r3d.q(arrayListW, 10));
            Iterator it = arrayListW.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((e9l) it.next()).f7427a.f33572a));
            }
            List listL = ckb.L(((f9l) D()).m, ((f9l) D()).d, m9sVarC2, ((f9l) D()).v, zJ);
            ?? r6 = ((f9l) D()).l;
            r6.getClass();
            if (r6.isEmpty()) {
                z = false;
            } else {
                for (StatisticBlockModel statisticBlockModel : r6) {
                    if (!statisticBlockModel.c || statisticBlockModel.b != Integer.MAX_VALUE) {
                        if (!r6.isEmpty()) {
                            for (StatisticBlockModel statisticBlockModel2 : r6) {
                                if (!statisticBlockModel2.c || statisticBlockModel2.b != r6.indexOf(statisticBlockModel2)) {
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
            i3t0.B(this, this.v, new nus[]{new jus(d5c.C(((f9l) D()).c), new owq0(arrayList, listL, z), cyberGameDotaScreenParams.i), nusVar});
            return;
        }
        if (x1lVar instanceof f1l) {
            E();
            return;
        }
        if (x1lVar instanceof m1l) {
            ims imsVar = ((m1l) x1lVar).f21014a;
            m9s m9sVarC3 = d5c.C(((f9l) D()).c);
            if (m9sVarC3 == null) {
                return;
            }
            i3t0.B(this, this.w, new ims[]{new ems(cyberGameDotaScreenParams.e, cyberGameDotaScreenParams.d, ((f9l) D()).p, m9sVarC3), imsVar});
            return;
        }
        if (x1lVar instanceof i1l) {
            hdb hdbVar = ((i1l) x1lVar).f14004a;
            long j = cyberGameDotaScreenParams.e;
            long j2 = cyberGameDotaScreenParams.d;
            long j3 = cyberGameDotaScreenParams.h;
            sff0 sff0Var = ((f9l) D()).q;
            List list = ((f9l) D()).r;
            ypl0 ypl0Var = ((f9l) D()).e;
            CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
            int i = cyberGameDotaScreenParams.i;
            boolean z4 = cyberGameDotaScreenParams.b;
            String str = cyberGameDotaScreenParams.g;
            if (str.length() == 0) {
                jlr jlrVar = ((f9l) D()).c;
                xkr xkrVar = jlrVar instanceof xkr ? (xkr) jlrVar : null;
                String str2 = (xkrVar == null || (m9sVar = xkrVar.d) == null) ? null : m9sVar.f;
                if (str2 == null) {
                    str2 = "";
                }
                str = str2;
            }
            String str3 = str;
            jlr jlrVar2 = ((f9l) D()).c;
            xkr xkrVar2 = jlrVar2 instanceof xkr ? (xkr) jlrVar2 : null;
            i3t0.B(this, this.x, new hdb[]{new ddb(i, j, j2, j3, xkrVar2 != null ? xkrVar2.d : null, sff0Var, ypl0Var, str3, list, real, z4), hdbVar});
            return;
        }
        boolean z5 = x1lVar instanceof j1l;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z5) {
            uss ussVar = ((j1l) x1lVar).f15741a;
            if (ussVar instanceof sss) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value4 = p7m0Var.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value4, f9l.a((f9l) value4, null, null, null, null, null, null, false, null, null, false, null, false, e49.a(((sss) ussVar).f32741a), null, 0, 0, null, 66060287)));
                return;
            }
            if (!(ussVar instanceof tss)) {
                t9f.b();
                return;
            }
            i3t0.A(this, this.R, tpr.f34347a, null, null, 6);
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, f9l.a((f9l) value3, null, null, null, null, null, null, false, null, null, false, null, false, true, null, 0, 0, null, 66060287)));
            this.E.a();
            return;
        }
        byte b7 = 11;
        if (x1lVar instanceof g1l) {
            g1l g1lVar = (g1l) x1lVar;
            ox oxVar = g1lVar.f10518a;
            int i2 = g1lVar.b;
            if (oxVar.equals(hx.f13788a)) {
                sac.V(jiu0.a(this), new n2l((byte) 25), null, mneVar.c, new bh0(this, i2, r8, b7), 10);
                return;
            } else {
                if (!oxVar.equals(mx.f22528a) || (m9sVarC = d5c.C(((f9l) D()).c)) == null) {
                    return;
                }
                sac.V(jiu0.a(this), null, null, mneVar.c, new j0l(this, m9sVarC, (yje) r8, b), 11);
                return;
            }
        }
        if (x1lVar instanceof k1l) {
            H(new j2l((byte) 6));
            return;
        }
        boolean z6 = x1lVar instanceof l1l;
        hzg hzgVar = this.O;
        if (z6) {
            String str4 = ((l1l) x1lVar).f19259a;
            if (str4.length() == 0) {
                G(new c7l(ctf0Var.b.a(R.string.statistics_dont_found_for_event, Arrays.copyOf(new Object[0], 0))));
                return;
            } else {
                ((uzg) hzgVar).h(str4, cyberGameDotaScreenParams.i, cyberGameDotaScreenParams.d);
                return;
            }
        }
        if (x1lVar instanceof h1l) {
            H(new hxk(((h1l) x1lVar).f12288a, b4));
            return;
        }
        if (x1lVar instanceof t1l) {
            String str5 = ((t1l) x1lVar).f33172a;
            x9l x9lVar = ((f9l) D()).d;
            if (x9lVar != null) {
                H(new cxj(x9lVar.b, str5, (byte) 17));
                return;
            }
            return;
        }
        if (x1lVar instanceof n1l) {
            ((uzg) hzgVar).e(CyberGamesPage.Real.INSTANCE.f46556a, 40L, cyberGameDotaScreenParams.d, true);
            return;
        }
        if (x1lVar instanceof p1l) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
                da10 da10Var = da10.DEFAULT_ERROR;
            } while (!p7m0Var3.m(value2, f9l.a((f9l) value2, null, null, null, null, null, null, false, null, null, false, null, false, false, null, 0, 0, null, 67107839)));
            this.I.h();
            return;
        }
        if (x1lVar instanceof q1l) {
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value = p7m0Var4.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value, f9l.a((f9l) value, null, null, null, null, null, null, false, null, null, false, null, false, false, null, 0, 0, null, 67108607)));
            return;
        }
        if (!(x1lVar instanceof v1l)) {
            if (x1lVar instanceof u1l) {
                szj0 szj0Var = ((f9l) D()).y;
                if (szj0Var == null) {
                    return;
                }
                i3t0.K(this, null, null, new sr((i3t0) this, (Object) szj0Var, szj0Var.f33073a.longValue(), (yje) null, (byte) 6), 3);
                return;
            }
            if (!(x1lVar instanceof o1l)) {
                t9f.b();
                return;
            }
            int i3 = ((o1l) x1lVar).f24485a;
            if (((f9l) D()).x == 0) {
                G(new c7l(ctf0Var.b.a(R.string.no_statistics_for_previous_maps, Arrays.copyOf(new Object[0], 0))));
                return;
            }
            int i4 = i3 <= ((f9l) D()).x ? i3 - 1 : -1;
            if (i4 == -1) {
                G(new c7l(ctf0Var.b.a(R.string.no_statistics_for_previous_maps, Arrays.copyOf(new Object[0], 0))));
                return;
            } else {
                this.P.c().d(new z08(this, i4, b2));
                return;
            }
        }
        long j4 = ((v1l) x1lVar).f36637a;
        Iterator it2 = dng.c.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((aco0) next).f639a != j4);
        if (next != null) {
            H(new a21((byte) 9, j4));
            return;
        }
        Iterator it3 = dng.b.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (((aco0) next2).f639a != j4);
        if (next2 != null) {
            H(new a21(b6, j4));
            return;
        }
        Iterator it4 = dng.f6366a.iterator();
        do {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
        } while (((r2g) next3).f29732a != j4);
        if (next3 != null) {
            H(new a21(b7, j4));
            return;
        }
        for (Object obj2 : n2z.f22823a) {
            if (((l2z) obj2).f19335a == j4) {
                r8 = obj2;
                break;
            }
        }
        if (r8 != 0) {
            H(new a21((byte) 12, j4));
        }
    }
}
