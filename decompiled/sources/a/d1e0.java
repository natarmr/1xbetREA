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
import org.xplatform.cyber.game.rainbow.api.RainbowGameScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;

/* JADX INFO: loaded from: classes4.dex */
public final class d1e0 extends i3t0 {
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
    public final RainbowGameScreenParams r;
    public final tzi s;
    public final kki t;
    public final a7q u;
    public final rus v;
    public final g3j w;
    public final z0s x;
    public final sbu y;
    public final drm0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1e0(vzg0 vzg0Var, String str, mne mneVar, RainbowGameScreenParams rainbowGameScreenParams, tzi tziVar, kki kkiVar, a7q a7qVar, rus rusVar, g3j g3jVar, z0s z0sVar, sbu sbuVar, drm0 drm0Var, vpu vpuVar, lbu lbuVar, dwu dwuVar, hqc hqcVar, j3c j3cVar, pru pruVar, luu luuVar, e1u e1uVar, zsr zsrVar, rpt rptVar, kut kutVar, h3c h3cVar, iw20 iw20Var, lbu lbuVar2, r8i r8iVar, nvu nvuVar, m1e m1eVar, qgh qghVar, hzg hzgVar, oeg0 oeg0Var, ctf0 ctf0Var, g2v g2vVar, xpr xprVar, r9u r9uVar, h3c h3cVar2, qv2 qv2Var) {
        super(new pg1(lbuVar, pruVar, luuVar, vzg0Var, e1uVar, (Parcelable) rainbowGameScreenParams, r9uVar, (byte) 13), cvm0.p(mneVar.c, mneVar.f22085a), new o20(ctf0Var, g2vVar, (byte) 22), (yzn0) null);
        m1eVar.getClass();
        oeg0Var.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        this.o = vzg0Var;
        this.p = str;
        this.q = mneVar;
        this.r = rainbowGameScreenParams;
        this.s = tziVar;
        this.t = kkiVar;
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
        sac.V(jiu0.a(this), null, null, mneVar.c, new a1e0(this, null, (byte) 4), 11);
        i3t0.B(this, xprVar, new wpr[]{upr.f36080a});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(ats atsVar, zje zjeVar) {
        z0e0 z0e0Var;
        Object g0g0Var;
        if (zjeVar instanceof z0e0) {
            z0e0Var = (z0e0) zjeVar;
            int i = z0e0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                z0e0Var.k = i - Integer.MIN_VALUE;
            } else {
                z0e0Var = new z0e0(this, zjeVar);
            }
        } else {
            z0e0Var = new z0e0(this, zjeVar);
        }
        Object objF = z0e0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = z0e0Var.k;
        boolean z = true;
        try {
            if (i2 == 0) {
                z1x.P(objF);
                yws ywsVar = ((qyd0) D()).y;
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
                        z0e0Var.k = 1;
                        objF = lbuVar.f(str, z0e0Var);
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
        c1e0 c1e0Var;
        m9s m9sVar;
        if (zjeVar instanceof c1e0) {
            c1e0Var = (c1e0) zjeVar;
            int i = c1e0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1e0Var.l = i - Integer.MIN_VALUE;
            } else {
                c1e0Var = new c1e0(this, zjeVar);
            }
        } else {
            c1e0Var = new c1e0(this, zjeVar);
        }
        Object obj = c1e0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = c1e0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            m9s m9sVarC = d5c.C(((qyd0) D()).c);
            if (m9sVarC == null) {
                return Unit.f46060a;
            }
            long j = m9sVarC.o;
            c1e0Var.i = m9sVarC;
            c1e0Var.l = 1;
            Object objB = this.S.b(j, c1e0Var);
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
            m9sVar = c1e0Var.i;
            z1x.P(obj);
        }
        GameScreenGeneralParams gameScreenGeneralParamsL = d7x.L(this.r.f46520a, m9sVar, ((Boolean) obj).booleanValue());
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
        LinkedHashMap linkedHashMap = avd0.f1520a;
        String str = this.p;
        str.getClass();
        avd0.f1520a.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object next;
        Object next2;
        oxd0 oxd0Var;
        Object value3;
        Object value4;
        Object value5;
        m9s m9sVar;
        List listC;
        boolean z;
        mud0 mud0Var = (mud0) obj;
        mud0Var.getClass();
        super.x(mud0Var);
        boolean z2 = mud0Var instanceof hud0;
        byte b = 22;
        byte b2 = 2;
        byte b3 = 1;
        byte b4 = 4;
        mne mneVar = this.q;
        ?? r10 = 0;
        RainbowGameScreenParams rainbowGameScreenParams = this.r;
        if (z2) {
            c4m0 c4m0Var = this.d0;
            if (c4m0Var != null) {
                e3c.n(c4m0Var);
            }
            fnq fnqVar = new fnq(this.M.b(), new a1e0(this, r10, b2), (byte) 4);
            bvc bvcVarA = jiu0.a(this);
            rwj rwjVar = mneVar.f22085a;
            sje sjeVarS = d5c.S(bvcVarA, rwjVar);
            foe foeVar = foe.h;
            this.d0 = sac.T(fnqVar, sjeVarS, foeVar);
            c4m0 c4m0Var2 = this.U;
            if (c4m0Var2 != null) {
                e3c.n(c4m0Var2);
            }
            gmq gmqVarL = this.s.l(((qyd0) D()).b, ((qyd0) D()).t.J1);
            kki kkiVar = this.t;
            byte b5 = 15;
            this.U = sac.T(new p6d(gmqVarL, aoq.c(new i89(((b8u) kkiVar.c).d(), b), new zo1((yje) r10, (Object) kkiVar, (byte) 24)), new kh1(this, (yje) r10, b5), b3), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var3 = this.V;
            if (c4m0Var3 != null) {
                e3c.n(c4m0Var3);
            }
            this.V = sac.T(new fnq(this.u.a(40L, 15L), new b1e0(this, r10, b2), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var4 = this.Y;
            if (c4m0Var4 != null) {
                e3c.n(c4m0Var4);
            }
            this.Y = sac.T(new fnq(this.A.a(), new a1e0(this, r10, (byte) 3), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var5 = this.Z;
            if (c4m0Var5 != null) {
                e3c.n(c4m0Var5);
            }
            this.Z = sac.T(new fnq(this.B.a(((qyd0) D()).n, dam0.f5756a), new b1e0(this, r10, (byte) 3), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var6 = this.a0;
            if (c4m0Var6 != null) {
                e3c.n(c4m0Var6);
            }
            this.a0 = sac.T(new fnq(this.C.a(), new b1e0(this, r10, b3), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var7 = this.b0;
            if (c4m0Var7 != null) {
                e3c.n(c4m0Var7);
            }
            this.b0 = sac.T(new fnq(this.F.b(), new a1e0(this, r10, b3), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            c4m0 c4m0Var8 = this.c0;
            if (c4m0Var8 != null) {
                e3c.n(c4m0Var8);
            }
            this.c0 = sac.T(new fnq(this.G.a(), new b1e0(this, r10, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foeVar);
            bby bbyVar = this.W;
            if (bbyVar != null) {
                e3c.n(bbyVar);
            }
            bby bbyVar2 = this.X;
            if (bbyVar2 != null) {
                e3c.n(bbyVar2);
            }
            this.W = i3t0.F(this, this.v, null, new v6d0(this, b5), new ksc0((byte) 20), 117);
            this.X = i3t0.F(this, this.w, null, null, new ksc0((byte) 21), 119);
            if (rainbowGameScreenParams.b && this.K.r(fk60.CYBER_EVENT)) {
                G(mxd0.f22549a);
                return;
            }
            return;
        }
        if (mud0Var instanceof gud0) {
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
        byte b6 = 10;
        if (mud0Var instanceof lud0) {
            nus nusVar = ((lud0) mud0Var).f20670a;
            c0o c0oVar = ryd0.c;
            ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
            Iterator it = c0oVar.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((ryd0) it.next()).f31310a.f33572a));
            }
            vvd0 vvd0Var = ((qyd0) D()).d;
            if (vvd0Var == null || (listC = azw.C(((qyd0) D()).n, vvd0Var, d5c.C(((qyd0) D()).c))) == null) {
                listC = iun.f15405a;
            }
            ?? r6 = ((qyd0) D()).m;
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
            i3t0.B(this, this.v, new nus[]{new jus(d5c.C(((qyd0) D()).c), new owq0(arrayList, listC, z), rainbowGameScreenParams.i), nusVar});
            return;
        }
        if (mud0Var instanceof vtd0) {
            E();
            return;
        }
        if (mud0Var instanceof cud0) {
            ims imsVar = ((cud0) mud0Var).f4982a;
            m9s m9sVarC = d5c.C(((qyd0) D()).c);
            if (m9sVarC == null) {
                return;
            }
            i3t0.B(this, this.w, new ims[]{new ems(rainbowGameScreenParams.e, rainbowGameScreenParams.d, ((qyd0) D()).q, m9sVarC), imsVar});
            return;
        }
        if (mud0Var instanceof xtd0) {
            hdb hdbVar = ((xtd0) mud0Var).f41461a;
            long j = rainbowGameScreenParams.e;
            long j2 = rainbowGameScreenParams.d;
            long j3 = rainbowGameScreenParams.h;
            sff0 sff0Var = ((qyd0) D()).t;
            List list = ((qyd0) D()).u;
            ypl0 ypl0Var = ((qyd0) D()).e;
            CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
            int i = rainbowGameScreenParams.i;
            boolean z3 = rainbowGameScreenParams.b;
            String str = rainbowGameScreenParams.g;
            if (str.length() == 0) {
                jlr jlrVar = ((qyd0) D()).c;
                xkr xkrVar = jlrVar instanceof xkr ? (xkr) jlrVar : null;
                str = (xkrVar == null || (m9sVar = xkrVar.d) == null) ? null : m9sVar.f;
                if (str == null) {
                    str = "";
                }
            }
            String str2 = str;
            jlr jlrVar2 = ((qyd0) D()).c;
            xkr xkrVar2 = jlrVar2 instanceof xkr ? (xkr) jlrVar2 : null;
            i3t0.B(this, this.x, new hdb[]{new ddb(i, j, j2, j3, xkrVar2 != null ? xkrVar2.d : null, sff0Var, ypl0Var, str2, list, real, z3), hdbVar});
            return;
        }
        boolean z4 = mud0Var instanceof ztd0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z4) {
            uss ussVar = ((ztd0) mud0Var).f44953a;
            if (ussVar instanceof sss) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value5 = p7m0Var.getValue();
                    value5.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value5, qyd0.a((qyd0) value5, null, null, null, null, null, null, false, null, null, null, false, null, false, e49.a(((sss) ussVar).f32741a), null, null, 125829119)));
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
            } while (!p7m0Var2.m(value4, qyd0.a((qyd0) value4, null, null, null, null, null, null, false, null, null, null, false, null, false, true, null, null, 125829119)));
            this.E.a();
            return;
        }
        if (mud0Var instanceof wtd0) {
            wtd0 wtd0Var = (wtd0) mud0Var;
            ox oxVar = wtd0Var.f39735a;
            int i2 = wtd0Var.b;
            if (oxVar.equals(hx.f13788a)) {
                sac.V(jiu0.a(this), new bod0(b6), null, mneVar.c, new bh0(this, i2, r10, b), 10);
                return;
            } else {
                if (oxVar.equals(mx.f22528a)) {
                    sac.V(jiu0.a(this), null, null, mneVar.c, new a1e0(this, r10, (byte) 0), 11);
                    return;
                }
                return;
            }
        }
        if (mud0Var instanceof aud0) {
            H(new ksc0((byte) 19));
            return;
        }
        boolean z5 = mud0Var instanceof bud0;
        hzg hzgVar = this.O;
        if (z5) {
            String str3 = ((bud0) mud0Var).f3225a;
            if (str3.length() == 0) {
                G(new lxd0(this.Q.b.a(R.string.statistics_dont_found_for_event, Arrays.copyOf(new Object[0], 0))));
                return;
            } else {
                ((uzg) hzgVar).h(str3, rainbowGameScreenParams.i, rainbowGameScreenParams.d);
                return;
            }
        }
        if (mud0Var instanceof ytd0) {
            int i3 = ((ytd0) mud0Var).f43213a;
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value3 = p7m0Var3.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value3, qyd0.a((qyd0) value3, null, null, null, null, null, null, false, null, new rud0(i3), null, false, null, false, false, null, null, 134216703)));
            return;
        }
        if (mud0Var instanceof iud0) {
            String str4 = ((iud0) mud0Var).f15392a;
            vvd0 vvd0Var2 = ((qyd0) D()).d;
            if (vvd0Var2 == null || (oxd0Var = vvd0Var2.e) == null) {
                return;
            }
            H(new j5d0(oxd0Var, str4, (byte) 6));
            return;
        }
        if (!(mud0Var instanceof kud0)) {
            if (mud0Var instanceof dud0) {
                ((uzg) hzgVar).e(CyberGamesPage.Real.INSTANCE.f46556a, 40L, rainbowGameScreenParams.d, true);
                return;
            }
            if (mud0Var instanceof eud0) {
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var4.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                    da10 da10Var = da10.DEFAULT_ERROR;
                } while (!p7m0Var4.m(value2, qyd0.a((qyd0) value2, null, null, null, null, null, null, false, null, null, null, false, null, false, false, null, null, 134215679)));
                this.I.h();
                return;
            }
            if (mud0Var instanceof fud0) {
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value = p7m0Var5.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var5.m(value, qyd0.a((qyd0) value, null, null, null, null, null, null, false, null, null, null, false, null, false, false, null, null, 134217471)));
                return;
            }
            if (!(mud0Var instanceof jud0)) {
                t9f.b();
                return;
            }
            szj0 szj0Var = ((qyd0) D()).z;
            if (szj0Var == null) {
                return;
            }
            i3t0.K(this, null, null, new sr((i3t0) this, (Object) szj0Var, szj0Var.f33073a.longValue(), (yje) null, (byte) 12), 3);
            return;
        }
        long j4 = ((kud0) mud0Var).f18905a;
        Iterator it2 = v0e0.f36578a.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((aco0) next).f639a != j4);
        if (next != null) {
            H(new e3b0(b2, j4));
            return;
        }
        Iterator it3 = n2z.f22823a.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (((l2z) next2).f19335a != j4);
        if (next2 != null) {
            H(new e3b0((byte) 3, j4));
            return;
        }
        for (Object obj2 : v0e0.b) {
            if (((aco0) obj2).f639a == j4) {
                r10 = obj2;
                break;
            }
        }
        if (r10 != 0) {
            H(new e3b0(b4, j4));
        }
    }
}
