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
import org.xplatform.cyber.game.lol.api.LolScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;

/* JADX INFO: loaded from: classes4.dex */
public final class u610 extends i3t0 {
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
    public final LolScreenParams r;
    public final tzi s;
    public final ali t;
    public final a7q u;
    public final rus v;
    public final g3j w;
    public final z0s x;
    public final sbu y;
    public final drm0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u610(vzg0 vzg0Var, String str, mne mneVar, LolScreenParams lolScreenParams, tzi tziVar, ali aliVar, a7q a7qVar, rus rusVar, g3j g3jVar, z0s z0sVar, sbu sbuVar, drm0 drm0Var, vpu vpuVar, lbu lbuVar, dwu dwuVar, hqc hqcVar, j3c j3cVar, pru pruVar, luu luuVar, e1u e1uVar, zsr zsrVar, rpt rptVar, kut kutVar, h3c h3cVar, iw20 iw20Var, lbu lbuVar2, r8i r8iVar, nvu nvuVar, m1e m1eVar, qgh qghVar, hzg hzgVar, oeg0 oeg0Var, ctf0 ctf0Var, g2v g2vVar, xpr xprVar, r9u r9uVar, h3c h3cVar2, qv2 qv2Var) {
        super(new h92(lbuVar, pruVar, luuVar, vzg0Var, e1uVar, (Parcelable) lolScreenParams, ctf0Var, r9uVar, (byte) 5), cvm0.p(mneVar.c, mneVar.f22085a), new o20(ctf0Var, g2vVar, (byte) 13), (yzn0) null);
        m1eVar.getClass();
        oeg0Var.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        this.o = vzg0Var;
        this.p = str;
        this.q = mneVar;
        this.r = lolScreenParams;
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
        sac.V(jiu0.a(this), null, null, mneVar.c, new r610(this, null, (byte) 4), 11);
        i3t0.B(this, xprVar, new wpr[]{upr.f36080a});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(ats atsVar, zje zjeVar) {
        q610 q610Var;
        Object g0g0Var;
        if (zjeVar instanceof q610) {
            q610Var = (q610) zjeVar;
            int i = q610Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                q610Var.k = i - Integer.MIN_VALUE;
            } else {
                q610Var = new q610(this, zjeVar);
            }
        } else {
            q610Var = new q610(this, zjeVar);
        }
        Object objF = q610Var.i;
        wne wneVar = wne.f39444a;
        int i2 = q610Var.k;
        boolean z = true;
        try {
            if (i2 == 0) {
                z1x.P(objF);
                yws ywsVar = ((m310) D()).w;
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
                        q610Var.k = 1;
                        objF = lbuVar.f(str, q610Var);
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
        t610 t610Var;
        m9s m9sVar;
        if (zjeVar instanceof t610) {
            t610Var = (t610) zjeVar;
            int i = t610Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                t610Var.l = i - Integer.MIN_VALUE;
            } else {
                t610Var = new t610(this, zjeVar);
            }
        } else {
            t610Var = new t610(this, zjeVar);
        }
        Object obj = t610Var.j;
        wne wneVar = wne.f39444a;
        int i2 = t610Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            m9s m9sVarC = d5c.C(((m310) D()).c);
            if (m9sVarC == null) {
                return Unit.f46060a;
            }
            long j = m9sVarC.o;
            t610Var.i = m9sVarC;
            t610Var.l = 1;
            Object objB = this.S.b(j, t610Var);
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
            m9sVar = t610Var.i;
            z1x.P(obj);
        }
        GameScreenGeneralParams gameScreenGeneralParamsL = d7x.L(this.r.f46516a, m9sVar, ((Boolean) obj).booleanValue());
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
        LinkedHashMap linkedHashMap = g3h.f10611a;
        String str = this.p;
        str.getClass();
        g3h.f10611a.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object next;
        Object next2;
        Object next3;
        y3h y3hVar;
        Object value3;
        Object value4;
        Object value5;
        m9s m9sVar;
        boolean z;
        yy00 yy00Var = (yy00) obj;
        yy00Var.getClass();
        super.x(yy00Var);
        boolean z2 = yy00Var instanceof ty00;
        byte b = 10;
        byte b2 = 3;
        byte b3 = 22;
        byte b4 = 2;
        byte b5 = 1;
        byte b6 = 4;
        byte b7 = 0;
        mne mneVar = this.q;
        ?? r12 = 0;
        LolScreenParams lolScreenParams = this.r;
        if (z2) {
            c4m0 c4m0Var = this.d0;
            if (c4m0Var != null) {
                e3c.n(c4m0Var);
            }
            fnq fnqVar = new fnq(this.M.b(), new r610(this, r12, b4), b6);
            bvc bvcVarA = jiu0.a(this);
            rwj rwjVar = mneVar.f22085a;
            sje sjeVarS = d5c.S(bvcVarA, rwjVar);
            foe foeVar = foe.h;
            this.d0 = sac.T(fnqVar, sjeVarS, foeVar);
            c4m0 c4m0Var2 = this.U;
            if (c4m0Var2 != null) {
                e3c.n(c4m0Var2);
            }
            gmq gmqVarL = this.s.l(((m310) D()).b, ((m310) D()).r.J1);
            ali aliVar = this.t;
            this.U = sac.T(new p6d(gmqVarL, aoq.c(new i89(((b8u) aliVar.d).d(), b3), new zo1((yje) r12, aliVar, b3)), new kh1(this, (yje) r12, b), b5), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var3 = this.V;
            if (c4m0Var3 != null) {
                e3c.n(c4m0Var3);
            }
            this.V = sac.T(new fnq(this.u.a(40L, 2L), new s610(this, r12, b4), b6), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var4 = this.Y;
            if (c4m0Var4 != null) {
                e3c.n(c4m0Var4);
            }
            this.Y = sac.T(new fnq(this.A.a(), new r610(this, r12, b2), b6), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var5 = this.Z;
            if (c4m0Var5 != null) {
                e3c.n(c4m0Var5);
            }
            this.Z = sac.T(new fnq(this.B.a(((m310) D()).n, dam0.f5756a), new s610(this, r12, b2), b6), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var6 = this.a0;
            if (c4m0Var6 != null) {
                e3c.n(c4m0Var6);
            }
            this.a0 = sac.T(new fnq(this.C.a(), new s610(this, r12, b5), b6), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var7 = this.b0;
            if (c4m0Var7 != null) {
                e3c.n(c4m0Var7);
            }
            this.b0 = sac.T(new fnq(this.F.b(), new r610(this, r12, b5), b6), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var8 = this.c0;
            if (c4m0Var8 != null) {
                e3c.n(c4m0Var8);
            }
            this.c0 = sac.T(new fnq(this.G.a(), new s610(this, r12, b7), b6), d5c.S(jiu0.a(this), rwjVar), foeVar);
            bby bbyVar = this.W;
            if (bbyVar != null) {
                e3c.n(bbyVar);
            }
            bby bbyVar2 = this.X;
            if (bbyVar2 != null) {
                e3c.n(bbyVar2);
            }
            this.W = i3t0.F(this, this.v, null, new km00(this, b6), new kyz((byte) 20), 117);
            this.X = i3t0.F(this, this.w, null, null, new kyz((byte) 21), 119);
            if (lolScreenParams.b && this.K.r(fk60.CYBER_EVENT)) {
                G(k310.f17596a);
                return;
            }
            return;
        }
        if (yy00Var instanceof sy00) {
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
        boolean z3 = yy00Var instanceof xy00;
        ctf0 ctf0Var = this.Q;
        if (z3) {
            nus nusVar = ((xy00) yy00Var).f41684a;
            boolean zJ = ctf0Var.j();
            ArrayList arrayListU = efx.u(efx.t(n310.g, zJ), zJ);
            ArrayList arrayList = new ArrayList(r3d.q(arrayListU, 10));
            Iterator it = arrayListU.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((n310) it.next()).f22827a.f33572a));
            }
            List listR = c9x.r(((m310) D()).n, ((m310) D()).d, d5c.C(((m310) D()).c));
            ?? r3 = ((m310) D()).m;
            r3.getClass();
            if (r3.isEmpty()) {
                z = false;
            } else {
                for (StatisticBlockModel statisticBlockModel : r3) {
                    if (!statisticBlockModel.c || statisticBlockModel.b != Integer.MAX_VALUE) {
                        if (!r3.isEmpty()) {
                            for (StatisticBlockModel statisticBlockModel2 : r3) {
                                if (!statisticBlockModel2.c || statisticBlockModel2.b != r3.indexOf(statisticBlockModel2)) {
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
            i3t0.B(this, this.v, new nus[]{new jus(d5c.C(((m310) D()).c), new owq0(arrayList, listR, z), lolScreenParams.i), nusVar});
            return;
        }
        if (yy00Var instanceof gy00) {
            E();
            return;
        }
        if (yy00Var instanceof oy00) {
            ims imsVar = ((oy00) yy00Var).f26038a;
            m9s m9sVarC = d5c.C(((m310) D()).c);
            if (m9sVarC == null) {
                return;
            }
            i3t0.B(this, this.w, new ims[]{new ems(lolScreenParams.e, lolScreenParams.d, ((m310) D()).q, m9sVarC), imsVar});
            return;
        }
        if (yy00Var instanceof ky00) {
            hdb hdbVar = ((ky00) yy00Var).f19085a;
            long j = lolScreenParams.e;
            long j2 = lolScreenParams.d;
            long j3 = lolScreenParams.h;
            sff0 sff0Var = ((m310) D()).r;
            List list = ((m310) D()).s;
            ypl0 ypl0Var = ((m310) D()).e;
            CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
            int i = lolScreenParams.i;
            boolean z4 = lolScreenParams.b;
            String str = lolScreenParams.g;
            if (str.length() == 0) {
                jlr jlrVar = ((m310) D()).c;
                xkr xkrVar = jlrVar instanceof xkr ? (xkr) jlrVar : null;
                String str2 = (xkrVar == null || (m9sVar = xkrVar.d) == null) ? null : m9sVar.f;
                if (str2 == null) {
                    str2 = "";
                }
                str = str2;
            }
            String str3 = str;
            jlr jlrVar2 = ((m310) D()).c;
            xkr xkrVar2 = jlrVar2 instanceof xkr ? (xkr) jlrVar2 : null;
            i3t0.B(this, this.x, new hdb[]{new ddb(i, j, j2, j3, xkrVar2 != null ? xkrVar2.d : null, sff0Var, ypl0Var, str3, list, real, z4), hdbVar});
            return;
        }
        boolean z5 = yy00Var instanceof ly00;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z5) {
            uss ussVar = ((ly00) yy00Var).f20842a;
            if (ussVar instanceof sss) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value5 = p7m0Var.getValue();
                    value5.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value5, m310.a((m310) value5, null, null, null, null, null, null, false, null, null, null, false, null, false, e49.a(((sss) ussVar).f32741a), null, null, 31457279)));
                return;
            }
            if (!(ussVar instanceof tss)) {
                t9f.b();
                return;
            }
            i3t0.A(this, this.R, tpr.f34347a, null, null, 6);
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value4 = p7m0Var2.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value4, m310.a((m310) value4, null, null, null, null, null, null, false, null, null, null, false, null, false, true, null, null, 31457279)));
            this.E.a();
            return;
        }
        if (yy00Var instanceof hy00) {
            hy00 hy00Var = (hy00) yy00Var;
            ox oxVar = hy00Var.f13839a;
            int i2 = hy00Var.b;
            if (oxVar.equals(hx.f13788a)) {
                sac.V(jiu0.a(this), new p610(b7), null, mneVar.c, new bh0(this, i2, r12, (byte) 12), 10);
                return;
            } else {
                if (oxVar.equals(mx.f22528a)) {
                    sac.V(jiu0.a(this), null, null, mneVar.c, new r610(this, r12, b7), 11);
                    return;
                }
                return;
            }
        }
        if (yy00Var instanceof my00) {
            H(new kyz((byte) 19));
            return;
        }
        boolean z6 = yy00Var instanceof ny00;
        hzg hzgVar = this.O;
        if (z6) {
            String str4 = ((ny00) yy00Var).f24308a;
            if (str4.length() == 0) {
                G(new j310(ctf0Var.b.a(R.string.statistics_dont_found_for_event, Arrays.copyOf(new Object[0], 0))));
                return;
            } else {
                ((uzg) hzgVar).h(str4, lolScreenParams.i, lolScreenParams.d);
                return;
            }
        }
        if (yy00Var instanceof iy00) {
            int i3 = ((iy00) yy00Var).f15566a;
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value3 = p7m0Var3.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value3, m310.a((m310) value3, null, null, null, null, null, null, false, null, new mz00(i3), null, false, null, false, false, null, null, 33553407)));
            return;
        }
        if (yy00Var instanceof jy00) {
            H(new hxk(((jy00) yy00Var).f17336a, (byte) 28));
            return;
        }
        if (yy00Var instanceof uy00) {
            String str5 = ((uy00) yy00Var).f36466a;
            k4h k4hVar = ((m310) D()).d;
            if (k4hVar == null || (y3hVar = k4hVar.c) == null) {
                return;
            }
            H(new k110(y3hVar, str5, b6));
            return;
        }
        if (!(yy00Var instanceof wy00)) {
            if (yy00Var instanceof py00) {
                ((uzg) hzgVar).e(CyberGamesPage.Real.INSTANCE.f46556a, 40L, lolScreenParams.d, true);
                return;
            }
            if (yy00Var instanceof qy00) {
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var4.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                    da10 da10Var = da10.DEFAULT_ERROR;
                } while (!p7m0Var4.m(value2, m310.a((m310) value2, null, null, null, null, null, null, false, null, null, null, false, null, false, false, null, null, 33552383)));
                this.I.h();
                return;
            }
            if (yy00Var instanceof ry00) {
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value = p7m0Var5.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var5.m(value, m310.a((m310) value, null, null, null, null, null, null, false, null, null, null, false, null, false, false, null, null, 33554175)));
                return;
            }
            if (!(yy00Var instanceof vy00)) {
                t9f.b();
                return;
            }
            szj0 szj0Var = ((m310) D()).x;
            if (szj0Var == null) {
                return;
            }
            i3t0.K(this, null, null, new sr((i3t0) this, (Object) szj0Var, szj0Var.f33073a.longValue(), (yje) null, (byte) 9), 3);
            return;
        }
        long j4 = ((wy00) yy00Var).f39955a;
        Iterator it2 = q4h.f28097a.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((x510) next).f40291a != j4);
        if (next != null) {
            H(new a21((byte) 21, j4));
            return;
        }
        Iterator it3 = w510.f38564a.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (((aco0) next2).f639a != j4);
        if (next2 != null) {
            H(new a21(b3, j4));
            return;
        }
        Iterator it4 = q4h.c.iterator();
        do {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
        } while (((r2g) next3).f29732a != j4);
        if (next3 != null) {
            H(new a21((byte) 23, j4));
            return;
        }
        for (Object obj2 : q4h.b) {
            if (((u1h) obj2).f34902a == j4) {
                r12 = obj2;
                break;
            }
        }
        if (r12 != 0) {
            H(new a21((byte) 24, j4));
        }
    }
}
