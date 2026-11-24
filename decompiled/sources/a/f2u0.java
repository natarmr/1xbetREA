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
import org.xplatform.cyber.game.valorant.api.ValorantGameScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;

/* JADX INFO: loaded from: classes4.dex */
public final class f2u0 extends i3t0 {
    public static final /* synthetic */ int e0 = 0;
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
    public final qv2 T;
    public c4m0 U;
    public c4m0 V;
    public bby W;
    public bby X;
    public c4m0 Y;
    public c4m0 Z;
    public c4m0 a0;
    public c4m0 b0;
    public c4m0 c0;
    public c4m0 d0;
    public final vzg0 o;
    public final String p;
    public final mne q;
    public final ValorantGameScreenParams r;
    public final tzi s;
    public final ali t;
    public final a7q u;
    public final rus v;
    public final g3j w;
    public final z0s x;
    public final sbu y;
    public final drm0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2u0(vzg0 vzg0Var, String str, mne mneVar, ValorantGameScreenParams valorantGameScreenParams, tzi tziVar, ali aliVar, a7q a7qVar, rus rusVar, g3j g3jVar, z0s z0sVar, sbu sbuVar, drm0 drm0Var, vpu vpuVar, lbu lbuVar, dwu dwuVar, hqc hqcVar, j3c j3cVar, pru pruVar, luu luuVar, e1u e1uVar, zsr zsrVar, rpt rptVar, kut kutVar, h3c h3cVar, iw20 iw20Var, lbu lbuVar2, r8i r8iVar, nvu nvuVar, m1e m1eVar, qgh qghVar, hzg hzgVar, oeg0 oeg0Var, ctf0 ctf0Var, g2v g2vVar, xpr xprVar, r9u r9uVar, h3c h3cVar2, qv2 qv2Var) {
        super(new pg1(lbuVar, pruVar, luuVar, vzg0Var, e1uVar, (Parcelable) valorantGameScreenParams, r9uVar, (byte) 16), cvm0.p(mneVar.c, mneVar.f22085a), new cls0(ctf0Var, g2vVar, (byte) 5), (yzn0) null);
        m1eVar.getClass();
        oeg0Var.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        this.o = vzg0Var;
        this.p = str;
        this.q = mneVar;
        this.r = valorantGameScreenParams;
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
        this.T = qv2Var;
        sac.V(jiu0.a(this), null, null, mneVar.c, new c2u0(this, null, (byte) 4), 11);
        i3t0.B(this, xprVar, new wpr[]{upr.f36080a});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(ats atsVar, zje zjeVar) {
        b2u0 b2u0Var;
        Object g0g0Var;
        if (zjeVar instanceof b2u0) {
            b2u0Var = (b2u0) zjeVar;
            int i = b2u0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                b2u0Var.k = i - Integer.MIN_VALUE;
            } else {
                b2u0Var = new b2u0(this, zjeVar);
            }
        } else {
            b2u0Var = new b2u0(this, zjeVar);
        }
        Object objF = b2u0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = b2u0Var.k;
        boolean z = true;
        try {
            if (i2 == 0) {
                z1x.P(objF);
                yws ywsVar = ((b0u0) D()).w;
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
                        b2u0Var.k = 1;
                        objF = lbuVar.f(str, b2u0Var);
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
        e2u0 e2u0Var;
        m9s m9sVar;
        if (zjeVar instanceof e2u0) {
            e2u0Var = (e2u0) zjeVar;
            int i = e2u0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                e2u0Var.l = i - Integer.MIN_VALUE;
            } else {
                e2u0Var = new e2u0(this, zjeVar);
            }
        } else {
            e2u0Var = new e2u0(this, zjeVar);
        }
        Object obj = e2u0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = e2u0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            m9s m9sVarC = d5c.C(((b0u0) D()).c);
            if (m9sVarC == null) {
                return Unit.f46060a;
            }
            long j = m9sVarC.o;
            e2u0Var.i = m9sVarC;
            e2u0Var.l = 1;
            Object objB = this.S.b(j, e2u0Var);
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
            m9sVar = e2u0Var.i;
            z1x.P(obj);
        }
        GameScreenGeneralParams gameScreenGeneralParamsL = d7x.L(this.r.f46542a, m9sVar, ((Boolean) obj).booleanValue());
        if (gameScreenGeneralParamsL == null) {
            return Unit.f46060a;
        }
        FragmentScreen fragmentScreenH = this.T.h(gameScreenGeneralParamsL);
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
        LinkedHashMap linkedHashMap = uxt0.f36459a;
        String str = this.p;
        str.getClass();
        uxt0.f36459a.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object next;
        Object value3;
        b0u0 b0u0Var;
        qrh qrhVar;
        Object value4;
        Object value5;
        Object value6;
        m9s m9sVar;
        boolean z;
        lxt0 lxt0Var = (lxt0) obj;
        lxt0Var.getClass();
        super.x(lxt0Var);
        boolean z2 = lxt0Var instanceof gxt0;
        byte b = 25;
        byte b2 = 3;
        byte b3 = 2;
        byte b4 = 1;
        byte b5 = 0;
        mne mneVar = this.q;
        ?? r10 = 0;
        ValorantGameScreenParams valorantGameScreenParams = this.r;
        if (z2) {
            c4m0 c4m0Var = this.d0;
            if (c4m0Var != null) {
                e3c.n(c4m0Var);
            }
            byte b6 = 4;
            fnq fnqVar = new fnq(this.M.b(), new c2u0(this, r10, b3), b6);
            bvc bvcVarA = jiu0.a(this);
            rwj rwjVar = mneVar.f22085a;
            sje sjeVarS = d5c.S(bvcVarA, rwjVar);
            foe foeVar = foe.h;
            this.d0 = sac.T(fnqVar, sjeVarS, foeVar);
            c4m0 c4m0Var2 = this.U;
            if (c4m0Var2 != null) {
                e3c.n(c4m0Var2);
            }
            gmq gmqVarL = this.s.l(((b0u0) D()).b, ((b0u0) D()).r.J1);
            ali aliVar = this.t;
            this.U = sac.T(new p6d(gmqVarL, aoq.c(new i89(((b8u) aliVar.c).d(), (byte) 22), new zo1((yje) r10, aliVar, b)), new kh1((Object) this, (yje) r10, (byte) 17), b4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var3 = this.V;
            if (c4m0Var3 != null) {
                e3c.n(c4m0Var3);
            }
            this.V = sac.T(new fnq(this.u.a(40L, 27L), new d2u0(this, r10, b3), b6), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var4 = this.Y;
            if (c4m0Var4 != null) {
                e3c.n(c4m0Var4);
            }
            this.Y = sac.T(new fnq(this.A.a(), new c2u0(this, r10, b2), b6), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var5 = this.Z;
            if (c4m0Var5 != null) {
                e3c.n(c4m0Var5);
            }
            this.Z = sac.T(new fnq(this.B.a(((b0u0) D()).n, dam0.f5756a), new d2u0(this, r10, b2), b6), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var6 = this.a0;
            if (c4m0Var6 != null) {
                e3c.n(c4m0Var6);
            }
            this.a0 = sac.T(new fnq(this.C.a(), new d2u0(this, r10, b4), b6), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var7 = this.b0;
            if (c4m0Var7 != null) {
                e3c.n(c4m0Var7);
            }
            this.b0 = sac.T(new fnq(this.F.b(), new c2u0(this, r10, b4), b6), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var8 = this.c0;
            if (c4m0Var8 != null) {
                e3c.n(c4m0Var8);
            }
            this.c0 = sac.T(new fnq(this.G.a(), new d2u0(this, r10, b5), b6), d5c.S(jiu0.a(this), rwjVar), foeVar);
            bby bbyVar = this.W;
            if (bbyVar != null) {
                e3c.n(bbyVar);
            }
            bby bbyVar2 = this.X;
            if (bbyVar2 != null) {
                e3c.n(bbyVar2);
            }
            this.W = i3t0.F(this, this.v, null, new npt0(this, b4), new i9t0((byte) 10), 117);
            this.X = i3t0.F(this, this.w, null, null, new i9t0((byte) 11), 119);
            if (valorantGameScreenParams.d && this.K.r(fk60.CYBER_EVENT)) {
                G(zzt0.f45271a);
                return;
            }
            return;
        }
        if (lxt0Var instanceof fxt0) {
            bby bbyVar3 = this.W;
            if (bbyVar3 != null) {
                e3c.n(bbyVar3);
            }
            bby bbyVar4 = this.X;
            if (bbyVar4 != null) {
                e3c.n(bbyVar4);
            }
            c4m0 c4m0Var9 = this.U;
            if (c4m0Var9 != null) {
                e3c.n(c4m0Var9);
            }
            c4m0 c4m0Var10 = this.V;
            if (c4m0Var10 != null) {
                e3c.n(c4m0Var10);
            }
            e3c.n(this.Y);
            e3c.n(this.Z);
            e3c.n(this.a0);
            c4m0 c4m0Var11 = this.b0;
            if (c4m0Var11 != null) {
                e3c.n(c4m0Var11);
            }
            c4m0 c4m0Var12 = this.c0;
            if (c4m0Var12 != null) {
                e3c.n(c4m0Var12);
            }
            c4m0 c4m0Var13 = this.d0;
            if (c4m0Var13 != null) {
                e3c.n(c4m0Var13);
                return;
            }
            return;
        }
        if (lxt0Var instanceof kxt0) {
            nus nusVar = ((kxt0) lxt0Var).f19074a;
            c0o c0oVar = c0u0.c;
            ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
            Iterator it = c0oVar.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((c0u0) it.next()).f3541a.f33572a));
            }
            List listG = xcm0.g(((b0u0) D()).d, d5c.C(((b0u0) D()).c));
            ?? r4 = ((b0u0) D()).m;
            r4.getClass();
            if (r4.isEmpty()) {
                z = false;
            } else {
                for (StatisticBlockModel statisticBlockModel : r4) {
                    if (!statisticBlockModel.c || statisticBlockModel.b != Integer.MAX_VALUE) {
                        if (!r4.isEmpty()) {
                            for (StatisticBlockModel statisticBlockModel2 : r4) {
                                if (!statisticBlockModel2.c || statisticBlockModel2.b != r4.indexOf(statisticBlockModel2)) {
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
            i3t0.B(this, this.v, new nus[]{new jus(d5c.C(((b0u0) D()).c), new owq0(arrayList, listG, z), valorantGameScreenParams.i), nusVar});
            return;
        }
        if (lxt0Var instanceof uwt0) {
            E();
            return;
        }
        if (lxt0Var instanceof axt0) {
            ims imsVar = ((axt0) lxt0Var).f1638a;
            m9s m9sVarC = d5c.C(((b0u0) D()).c);
            if (m9sVarC == null) {
                return;
            }
            i3t0.B(this, this.w, new ims[]{new ems(valorantGameScreenParams.e, valorantGameScreenParams.c, ((b0u0) D()).q, m9sVarC), imsVar});
            return;
        }
        if (lxt0Var instanceof wwt0) {
            hdb hdbVar = ((wwt0) lxt0Var).f39901a;
            long j = valorantGameScreenParams.e;
            long j2 = valorantGameScreenParams.c;
            long j3 = valorantGameScreenParams.h;
            sff0 sff0Var = ((b0u0) D()).r;
            List list = ((b0u0) D()).s;
            ypl0 ypl0Var = ((b0u0) D()).e;
            CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
            int i = valorantGameScreenParams.i;
            boolean z3 = valorantGameScreenParams.d;
            String str = valorantGameScreenParams.g;
            if (str.length() == 0) {
                jlr jlrVar = ((b0u0) D()).c;
                xkr xkrVar = jlrVar instanceof xkr ? (xkr) jlrVar : null;
                String str2 = (xkrVar == null || (m9sVar = xkrVar.d) == null) ? null : m9sVar.f;
                if (str2 == null) {
                    str2 = "";
                }
                str = str2;
            }
            String str3 = str;
            jlr jlrVar2 = ((b0u0) D()).c;
            xkr xkrVar2 = jlrVar2 instanceof xkr ? (xkr) jlrVar2 : null;
            i3t0.B(this, this.x, new hdb[]{new ddb(i, j, j2, j3, xkrVar2 != null ? xkrVar2.d : null, sff0Var, ypl0Var, str3, list, real, z3), hdbVar});
            return;
        }
        boolean z4 = lxt0Var instanceof xwt0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z4) {
            uss ussVar = ((xwt0) lxt0Var).f41627a;
            if (ussVar instanceof sss) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value6 = p7m0Var.getValue();
                    value6.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value6, b0u0.a((b0u0) value6, null, null, null, null, null, null, false, null, null, null, false, null, false, e49.a(((sss) ussVar).f32741a), null, null, 31457279)));
                return;
            }
            if (!(ussVar instanceof tss)) {
                t9f.b();
                return;
            }
            i3t0.A(this, this.R, tpr.f34347a, null, null, 6);
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value5 = p7m0Var2.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value5, b0u0.a((b0u0) value5, null, null, null, null, null, null, false, null, null, null, false, null, false, true, null, null, 31457279)));
            this.E.a();
            return;
        }
        if (lxt0Var instanceof vwt0) {
            vwt0 vwt0Var = (vwt0) lxt0Var;
            ox oxVar = vwt0Var.f38171a;
            int i2 = vwt0Var.b;
            if (oxVar.equals(hx.f13788a)) {
                sac.V(jiu0.a(this), new qzs0((byte) 13), null, mneVar.c, new bh0(this, i2, r10, (byte) 27), 10);
                return;
            } else {
                if (oxVar.equals(mx.f22528a)) {
                    sac.V(jiu0.a(this), null, null, mneVar.c, new c2u0(this, r10, b5), 11);
                    return;
                }
                return;
            }
        }
        if (lxt0Var instanceof ywt0) {
            H(new i9t0((byte) 9));
            return;
        }
        boolean z5 = lxt0Var instanceof zwt0;
        hzg hzgVar = this.O;
        if (z5) {
            String str4 = ((zwt0) lxt0Var).f45125a;
            if (str4.length() == 0) {
                G(new yzt0(this.Q.b.a(R.string.statistics_dont_found_for_event, Arrays.copyOf(new Object[0], 0))));
                return;
            } else {
                ((uzg) hzgVar).h(str4, valorantGameScreenParams.i, valorantGameScreenParams.c);
                return;
            }
        }
        if (lxt0Var instanceof ext0) {
            int i3 = ((ext0) lxt0Var).f8595a;
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value4 = p7m0Var3.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value4, b0u0.a((b0u0) value4, null, null, null, null, null, null, false, null, new nxt0(i3), null, false, null, false, false, null, null, 33553407)));
            return;
        }
        if (lxt0Var instanceof hxt0) {
            String str5 = ((hxt0) lxt0Var).f13828a;
            vxt0 vxt0Var = ((b0u0) D()).d;
            if (vxt0Var == null || (qrhVar = vxt0Var.c) == null) {
                return;
            }
            H(new htr0(qrhVar, str5, b));
            return;
        }
        if (!(lxt0Var instanceof jxt0)) {
            if (lxt0Var instanceof bxt0) {
                ((uzg) hzgVar).e(CyberGamesPage.Real.INSTANCE.f46556a, 40L, valorantGameScreenParams.c, true);
                return;
            }
            if (lxt0Var instanceof cxt0) {
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var4.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                    da10 da10Var = da10.DEFAULT_ERROR;
                } while (!p7m0Var4.m(value2, b0u0.a((b0u0) value2, null, null, null, null, null, null, false, null, null, null, false, null, false, false, null, null, 33552383)));
                this.I.h();
                return;
            }
            if (lxt0Var instanceof dxt0) {
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value = p7m0Var5.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var5.m(value, b0u0.a((b0u0) value, null, null, null, null, null, null, false, null, null, null, false, null, false, false, null, null, 33554175)));
                return;
            }
            if (!(lxt0Var instanceof ixt0)) {
                t9f.b();
                return;
            }
            szj0 szj0Var = ((b0u0) D()).x;
            if (szj0Var == null) {
                return;
            }
            i3t0.K(this, null, null, new sr((i3t0) this, (Object) szj0Var, szj0Var.f33073a.longValue(), (yje) null, (byte) 16), 3);
            return;
        }
        long j4 = ((jxt0) lxt0Var).f17327a;
        Iterator it2 = s1u0.f31474a.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((mgm0) next).f21751a != j4);
        if (next == null) {
            for (Object obj2 : n2z.f22823a) {
                if (((l2z) obj2).f19335a == j4) {
                    r10 = obj2;
                    break;
                }
            }
            if (r10 != 0) {
                p7m0 p7m0Var6 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var6.getValue();
                    value3.getClass();
                    b0u0Var = (b0u0) value3;
                    oyg0Var.getClass();
                } while (!p7m0Var6.m(value3, b0u0.a(b0u0Var, null, null, null, null, null, null, false, vzt0.a(b0u0Var.j, null, 0L, j4, false, 11), null, null, false, null, false, false, null, null, 33553919)));
                return;
            }
            return;
        }
        p7m0 p7m0Var7 = ocjVar.f25029a;
        while (true) {
            Object value7 = p7m0Var7.getValue();
            value7.getClass();
            b0u0 b0u0Var2 = (b0u0) value7;
            oyg0Var.getClass();
            long j5 = j4;
            if (p7m0Var7.m(value7, b0u0.a(b0u0Var2, null, null, null, null, null, null, false, vzt0.a(b0u0Var2.j, null, j5, 0L, false, 13), null, null, false, null, false, false, null, null, 33553919))) {
                return;
            } else {
                j4 = j5;
            }
        }
    }
}
