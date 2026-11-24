package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.home.CyberHomeParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$stockScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class ukw extends i3t0 {
    public static final /* synthetic */ int X = 0;
    public final grj A;
    public final duj B;
    public final hvt C;
    public final rpt D;
    public final oeg0 E;
    public final y3v F;
    public final vqc G;
    public final vqc H;
    public final poq0 I;
    public final pyg0 J;
    public final qyg0 K;
    public final r2u L;
    public final fvt0 M;
    public final nv20 N;
    public final ivn O;
    public final rkt0 P;
    public c4m0 Q;
    public c4m0 R;
    public bby S;
    public bby T;
    public bby U;
    public long V;
    public bby W;
    public final CyberHomeParams o;
    public final hzg p;
    public final d4u q;
    public final ctf0 r;
    public final mne s;
    public final m1e t;
    public final luu u;
    public final hjd v;
    public final ih5 w;
    public final yo4 x;
    public final zr1 y;
    public final chf0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ukw(CyberHomeParams cyberHomeParams, hzg hzgVar, d4u d4uVar, pru pruVar, ctf0 ctf0Var, mne mneVar, m1e m1eVar, luu luuVar, lbu lbuVar, g2v g2vVar, y78 y78Var, hjd hjdVar, ih5 ih5Var, yo4 yo4Var, zr1 zr1Var, chf0 chf0Var, grj grjVar, duj dujVar, hvt hvtVar, rpt rptVar, oeg0 oeg0Var, y3v y3vVar, vqc vqcVar, vqc vqcVar2, poq0 poq0Var, svu svuVar, r9u r9uVar, pyg0 pyg0Var, qyg0 qyg0Var, r2u r2uVar, fvt0 fvt0Var, nv20 nv20Var, ivn ivnVar, rkt0 rkt0Var) {
        ctf0Var.getClass();
        m1eVar.getClass();
        oeg0Var.getClass();
        r9uVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(new pg1((Object) pruVar, (Object) cyberHomeParams, (Object) ctf0Var, (Object) luuVar, (Object) lbuVar, (Object) svuVar, (Object) r9uVar, (byte) 10), cvm0.p(rwjVar, rwjVar), new enm((Object) cyberHomeParams, (Object) ctf0Var, (Object) y78Var, (Object) g2vVar, (byte) 11), (yzn0) null);
        this.o = cyberHomeParams;
        this.p = hzgVar;
        this.q = d4uVar;
        this.r = ctf0Var;
        this.s = mneVar;
        this.t = m1eVar;
        this.u = luuVar;
        this.v = hjdVar;
        this.w = ih5Var;
        this.x = yo4Var;
        this.y = zr1Var;
        this.z = chf0Var;
        this.A = grjVar;
        this.B = dujVar;
        this.C = hvtVar;
        this.D = rptVar;
        this.E = oeg0Var;
        this.F = y3vVar;
        this.G = vqcVar;
        this.H = vqcVar2;
        this.I = poq0Var;
        this.J = pyg0Var;
        this.K = qyg0Var;
        this.L = r2uVar;
        this.M = fvt0Var;
        this.N = nv20Var;
        this.O = ivnVar;
        this.P = rkt0Var;
        i3t0.K(this, null, null, new pkw(this, null), 3);
    }

    public static boolean M(zjw zjwVar) {
        return zjwVar.b.c.o != g5h.DEFAULT;
    }

    public static boolean X(zjw zjwVar) {
        Map map = zjwVar.h;
        CyberGamesPage cyberGamesPage = zjwVar.g.f7971a;
        jih jihVar = (jih) map.get(cyberGamesPage);
        return (jihVar != null && kih.b(jihVar, cyberGamesPage, M(zjwVar))) || (jihVar != null && kih.a(jihVar, cyberGamesPage, M(zjwVar)));
    }

    public final void N(long j, long j2, long j3, boolean z, boolean z2) {
        r1g r1gVar;
        r1g r1gVar2;
        if (z) {
            r1gVar = r1g.POPULAR_ESPORT;
        } else if (((zjw) D()).g.f7971a instanceof CyberGamesPage.Real) {
            r1gVar = r1g.CYBERSPORT_REAL;
        } else if (((zjw) D()).g.f7971a instanceof CyberGamesPage.Virtual) {
            r1gVar = r1g.CYBERSPORT_VIRTUAL;
        } else if (!(((zjw) D()).g.f7971a instanceof CyberGamesPage.OneXCyber)) {
            return;
        } else {
            r1gVar = r1g.CYBER;
        }
        r1g r1gVar3 = r1gVar;
        if (z) {
            r1gVar2 = r1g.POPULAR_ESPORT;
        } else if (((zjw) D()).g.f7971a instanceof CyberGamesPage.Real) {
            r1gVar2 = r1g.CYBERSPORT_REAL;
        } else if (((zjw) D()).g.f7971a instanceof CyberGamesPage.Virtual) {
            r1gVar2 = r1g.CYBERSPORT_VIRTUAL;
        } else if (!(((zjw) D()).g.f7971a instanceof CyberGamesPage.OneXCyber)) {
            return;
        } else {
            r1gVar2 = r1g.CYBER;
        }
        this.w.k(j, r1gVar3, j2, j3, z2);
        this.y.l(j, j2, j3, r1gVar2.f29679a, z2);
    }

    public final void O(boolean z, ekw ekwVar) {
        e3c.n(this.R);
        CyberGamesPage cyberGamesPage = ekwVar.f7971a;
        boolean zM = M((zjw) D());
        d4u d4uVar = this.q;
        d4uVar.getClass();
        cyberGamesPage.getClass();
        this.R = sac.T(new fnq(aoq.c(new vsg0(new n3u(d4uVar, null, (byte) 1)), new a4u(null, d4uVar, cyberGamesPage, zM)), new r1w(ekwVar, this, z, (yje) null), (byte) 4), d5c.S(jiu0.a(this), this.s.f22085a), foe.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void P() {
        ?? D;
        CyberGamesPage cyberGamesPage = ((zjw) D()).g.f7971a;
        this.z.g0(org.xplatform.cyber.section.api.domain.entity.d.e(cyberGamesPage.f46556a));
        if (cyberGamesPage.equals(CyberGamesPage.Real.INSTANCE)) {
            D = kih.d((jih) ((zjw) D()).h.get(cyberGamesPage));
        } else {
            jih jihVar = (jih) ((zjw) D()).h.get(cyberGamesPage);
            Object obj = null;
            if (jihVar != null) {
                Object obj2 = jihVar.f;
                e0g0 e0g0Var = j0g0.b;
                obj = (List) (obj2 instanceof g0g0 ? null : obj2);
            }
            D = obj == null ? iun.f15405a : obj;
        }
        ((uzg) this.p).k(cyberGamesPage.f46556a, 40L, iun.f15405a, !D.isEmpty());
    }

    public final void Q() {
        CyberGamesPage cyberGamesPage = ((zjw) D()).g.f7971a;
        boolean z = ((zjw) D()).f;
        chf0 chf0Var = this.z;
        if (z) {
            chf0Var.i0(i1g.DISCIPLINES, -1L, -1L);
        } else {
            chf0Var.h0(-1L, -1L, org.xplatform.cyber.section.api.domain.entity.d.e(cyberGamesPage.f46556a));
        }
        uzg uzgVar = (uzg) this.p;
        uzgVar.getClass();
        cyberGamesPage.getClass();
        uzgVar.f36533a.c().d(new v4f(uzgVar, cyberGamesPage, (byte) 24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void R() {
        ?? D;
        CyberGamesPage cyberGamesPage = ((zjw) D()).g.f7971a;
        this.z.g0(org.xplatform.cyber.section.api.domain.entity.d.e(cyberGamesPage.f46556a));
        if (cyberGamesPage.equals(CyberGamesPage.Real.INSTANCE)) {
            D = kih.d((jih) ((zjw) D()).h.get(cyberGamesPage));
        } else {
            jih jihVar = (jih) ((zjw) D()).h.get(cyberGamesPage);
            Object obj = null;
            if (jihVar != null) {
                Object obj2 = jihVar.f;
                e0g0 e0g0Var = j0g0.b;
                obj = (List) (obj2 instanceof g0g0 ? null : obj2);
            }
            D = obj == null ? iun.f15405a : obj;
        }
        ((uzg) this.p).k(cyberGamesPage.f46556a, 40L, iun.f15405a, !D.isEmpty());
    }

    public final void S() {
        this.y.f44833a.a(xun.f41520a, 12020L);
        this.w.f14765a.c("cyber_calendar_call");
        ((uzg) this.p).b(new CyberCalendarParams(0, 0, iun.f15405a, false));
    }

    public final void T(ghw ghwVar) {
        boolean z = ghwVar instanceof chw;
        hjd hjdVar = this.v;
        if (z) {
            i3t0.B(this, hjdVar, new vid[]{new did(kih.c((jih) ((zjw) D()).h.get(((zjw) D()).g.f7971a))), ((chw) ghwVar).f4381a});
        } else if (ghwVar instanceof ehw) {
            i3t0.B(this, hjdVar, new vid[]{new did(kih.c((jih) ((zjw) D()).h.get(((zjw) D()).g.f7971a))), ebc.n0(((ehw) ghwVar).f7828a)});
        } else {
            t9f.b();
        }
    }

    public final void U() {
        this.y.f44833a.a(xun.f41520a, 3350L);
        this.w.f14765a.c("cybersport_actions_call");
        CyberGamesPage cyberGamesPage = ((zjw) D()).g.f7971a;
        uzg uzgVar = (uzg) this.p;
        uzgVar.getClass();
        cyberGamesPage.getClass();
        i1w0 i1w0VarC = uzgVar.f36533a.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        FragmentScreen cyberGamesScreenFactoryImpl$stockScreen$1 = new CyberGamesScreenFactoryImpl$stockScreen$1(uzgVar.b, cyberGamesPage);
        if (cyberGamesScreenFactoryImpl$stockScreen$1 instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) cyberGamesScreenFactoryImpl$stockScreen$1)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(cyberGamesScreenFactoryImpl$stockScreen$1)));
        }
        ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }

    public final void V(boolean z) {
        CyberGamesPage cyberGamesPage = ((zjw) D()).g.f7971a;
        this.z.g0(org.xplatform.cyber.section.api.domain.entity.d.e(cyberGamesPage.f46556a));
        ((uzg) this.p).k(cyberGamesPage.f46556a, 40L, iun.f15405a, z);
    }

    public final void W(xah xahVar, r1g r1gVar) {
        this.w.b(xahVar.i, xahVar.k, xahVar.g, r1gVar, xahVar.n, xahVar.m);
        this.y.d(xahVar.i, xahVar.k, xahVar.g, r1gVar.f29679a, xahVar.n, xahVar.m);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r5 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(a.npn r6, boolean r7, a.zje r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof a.skw
            if (r0 == 0) goto L13
            r0 = r8
            a.skw r0 = (a.skw) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.skw r0 = new a.skw
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 == r4) goto L26
            if (r2 != r3) goto L2c
        L26:
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> L2a
            goto L58
        L2a:
            r6 = move-exception
            goto L4e
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L33:
            a.z1x.P(r8)
            if (r7 != 0) goto L43
            a.fvt0 r7 = r5.M     // Catch: java.lang.Throwable -> L2a
            r0.k = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r7.w(r6, r0)     // Catch: java.lang.Throwable -> L2a
            if (r5 != r1) goto L58
            goto L4d
        L43:
            a.nv20 r7 = r5.N     // Catch: java.lang.Throwable -> L2a
            r0.k = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r7.c(r6, r0)     // Catch: java.lang.Throwable -> L2a
            if (r5 != r1) goto L58
        L4d:
            return r1
        L4e:
            a.nkw r7 = new a.nkw
            r7.<init>(r5, r4)
            a.ivn r5 = r5.O
            r5.f(r6, r7)
        L58:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ukw.Y(a.npn, boolean, a.zje):java.lang.Object");
    }

    public final void Z() {
        bby bbyVar = this.T;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.T = sac.V(jiu0.a(this), new nkw(this, (byte) 4), null, this.s.b, new qkw(this, yjeVar, (byte) 1), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        yhw yhwVar = (yhw) obj;
        yhwVar.getClass();
        super.x(yhwVar);
        boolean z = yhwVar instanceof whw;
        byte b = 4;
        byte b2 = 0;
        mne mneVar = this.s;
        yje yjeVar = null;
        if (z) {
            whw whwVar = (whw) yhwVar;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.V;
            ymx ymxVar = ymx.INTERVAL_100;
            if (j > 200) {
                bby bbyVar = this.U;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.U = sac.V(jiu0.a(this), new nkw(this, b2), null, mneVar.f22085a, new kaw(whwVar, this, yjeVar, b), 10);
                this.V = jCurrentTimeMillis;
                return;
            }
            return;
        }
        if (!(yhwVar instanceof hgw)) {
            t9f.b();
            return;
        }
        hgw hgwVar = (hgw) yhwVar;
        if (!(hgwVar instanceof fgw)) {
            if (hgwVar instanceof dgw) {
                e3c.n(this.Q);
                e3c.n(this.R);
                e3c.n(this.S);
                return;
            } else if (hgwVar instanceof bgw) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        this.P.g(X((zjw) D()));
        e3c.n(this.Q);
        this.Q = sac.T(new fnq(i120.W(this.t.b()), new qkw(this, yjeVar, b2), b), d5c.S(jiu0.a(this), mneVar.f22085a), foe.h);
        Z();
        byte b3 = 2;
        sac.V(jiu0.a(this), new nkw(this, (byte) 3), null, null, new qkw(this, yjeVar, b3), 14);
        this.S = i3t0.F(this, this.v, mneVar.f22085a, null, new x2w((byte) 21), 118);
        bby bbyVar2 = this.W;
        if (bbyVar2 == null || !bbyVar2.isActive()) {
            this.W = sac.V(jiu0.a(this), new nkw(this, b3), null, null, new cin(this, yjeVar, (byte) 18), 14);
        }
    }
}
