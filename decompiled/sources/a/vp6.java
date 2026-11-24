package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.betting.core.zip.model.zip.bet.ChildBets;

/* JADX INFO: loaded from: classes3.dex */
public final class vp6 extends i3t0 {
    public static final /* synthetic */ int W = 0;
    public final x4u A;
    public final oif0 B;
    public final yk50 C;
    public final vn7 D;
    public final r4v E;
    public final vpu F;
    public final lbu G;
    public final pwi H;
    public final buo0 I;
    public final bn6 J;
    public final au0 K;
    public final v88 L;
    public final ctf0 M;
    public final mne N;
    public final i1w0 O;
    public final duj P;
    public final ort Q;
    public final nrt R;
    public final reu S;
    public final lk5 T;
    public c4m0 U;
    public final c4m0 V;
    public final drt o;
    public final yk50 p;
    public final lhf0 q;
    public final f8u r;
    public final qtt s;
    public final usu t;
    public final dsi0 u;
    public final epi0 v;
    public final h03 w;
    public final uii x;
    public final yiu y;
    public final dsi0 z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a.diu0, a.i3t0, a.vp6, java.lang.Object] */
    public vp6(drt drtVar, yk50 yk50Var, lhf0 lhf0Var, f8u f8uVar, qtt qttVar, usu usuVar, dsi0 dsi0Var, epi0 epi0Var, h03 h03Var, uii uiiVar, yiu yiuVar, yfu yfuVar, dsi0 dsi0Var2, x4u x4uVar, qtt qttVar2, oif0 oif0Var, yk50 yk50Var2, vn7 vn7Var, r4v r4vVar, vpu vpuVar, vpu vpuVar2, lbu lbuVar, pwi pwiVar, buo0 buo0Var, pru pruVar, bn6 bn6Var, au0 au0Var, v88 v88Var, ctf0 ctf0Var, mne mneVar, i1w0 i1w0Var, duj dujVar, m1e m1eVar, ort ortVar, nrt nrtVar, reu reuVar, lk5 lk5Var, ocl oclVar) {
        ctf0Var.getClass();
        i1w0Var.getClass();
        m1eVar.getClass();
        byte b = 1;
        yje yjeVar = null;
        ?? i3t0Var = new i3t0(new hc0(pruVar, (byte) 11), cvm0.p(mneVar.c, mneVar.f22085a), new cz(ctf0Var, oclVar, b), (yzn0) null);
        i3t0Var.o = drtVar;
        i3t0Var.p = yk50Var;
        i3t0Var.q = lhf0Var;
        i3t0Var.r = f8uVar;
        i3t0Var.s = qttVar;
        i3t0Var.t = usuVar;
        i3t0Var.u = dsi0Var;
        i3t0Var.v = epi0Var;
        i3t0Var.w = h03Var;
        i3t0Var.x = uiiVar;
        i3t0Var.y = yiuVar;
        i3t0Var.z = dsi0Var2;
        i3t0Var.A = x4uVar;
        i3t0Var.B = oif0Var;
        i3t0Var.C = yk50Var2;
        i3t0Var.D = vn7Var;
        i3t0Var.E = r4vVar;
        i3t0Var.F = vpuVar;
        i3t0Var.G = lbuVar;
        i3t0Var.H = pwiVar;
        i3t0Var.I = buo0Var;
        i3t0Var.J = bn6Var;
        i3t0Var.K = au0Var;
        i3t0Var.L = v88Var;
        i3t0Var.M = ctf0Var;
        i3t0Var.N = mneVar;
        i3t0Var.O = i1w0Var;
        i3t0Var.P = dujVar;
        i3t0Var.Q = ortVar;
        i3t0Var.R = nrtVar;
        i3t0Var.S = reuVar;
        i3t0Var.T = lk5Var;
        Class<vp6> cls = vp6.class;
        sac.T(new fnq(m1eVar.b(), new rp6(i3t0Var, yjeVar, (byte) 0), (byte) 4), jiu0.a(i3t0Var), new vp3(2, i3t0Var, cls, "handleErrorSilently", "handleErrorSilently(Ljava/lang/Throwable;)V", 4, (byte) 21));
        boolean zG = yk50Var2.g();
        p7m0 p7m0Var = i3t0Var.i.f25029a;
        vp6 vp6Var = i3t0Var;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            vp6Var.f.getClass();
            if (p7m0Var.m(value, jp6.a((jp6) value, false, false, false, false, null, null, null, null, null, false, null, false, false, zG, null, false, null, false, 2088959))) {
                break;
            } else {
                vp6Var = this;
            }
        }
        c4m0 c4m0Var = vp6Var.V;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            Object obj = vp6Var;
            vp6Var.V = sac.T(new fnq(vpuVar2.a(), new rp6(vp6Var, yjeVar, b), (byte) 4), jiu0.a(vp6Var), new vp3(2, obj, cls, "handleErrorSilently", "handleErrorSilently(Ljava/lang/Throwable;)V", 4, (byte) 22));
        }
        Object obj2 = vp6Var;
        sac.T(new fnq(yfuVar.d(), new cm3(vp6Var, yjeVar, (byte) 28), (byte) 4), jiu0.a(this), new vp3(2, obj2, cls, "handleErrorSilently", "handleErrorSilently(Ljava/lang/Throwable;)V", 4, (byte) 23));
    }

    public static boolean O(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((BetGroupZip) it.next()).g.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void M(Throwable th) {
        this.P.b(th, new pp6(this, (byte) 1));
    }

    public final void N(Throwable th) {
        this.P.b(th, new gh5((byte) 21));
    }

    public final void P(boolean z, long j) {
        vp6 vp6Var = this;
        p7m0 p7m0Var = vp6Var.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            vp6Var.f.getClass();
            if (p7m0Var.m(value, jp6.a((jp6) value, false, false, false, false, null, null, null, null, null, false, null, false, false, false, null, false, Long.valueOf(j), false, 2031615))) {
                vp6Var.G(new hp6(true));
                sac.V(jiu0.a(vp6Var), tp6.f34316a, null, null, new rp6(vp6Var, null, (byte) 3), 14);
                sac.V(jiu0.a(vp6Var), new yj5(1, vp6Var, vp6.class, "handleMakeBetException", "handleMakeBetException(Ljava/lang/Throwable;)V", 0, (byte) 20), null, vp6Var.N.b, new jo6((byte) 1, j, null, this, z), 10);
                return;
            }
            vp6Var = this;
        }
    }

    public final void Q() {
        this.U = sac.T(bkb.h0(30L, TimeUnit.SECONDS, new sp6(this, null)), jiu0.a(this), new vp3(2, this, vp6.class, "handleErrorSilently", "handleErrorSilently(Ljava/lang/Throwable;)V", 4, (byte) 24));
    }

    public final void R(boolean z) {
        sac.i0(jiu0.a(this), this + ".getBets", 5, 0L, null, null, new up6(z, this, null), null, this.N.b, new yj5(1, this, vp6.class, "handleGetBetsExceptions", "handleGetBetsExceptions(Ljava/lang/Throwable;)V", 0, (byte) 26), null, Response.DOES_NOT_EXIST_ANYWHERE);
    }

    public final void S(List list, boolean z) {
        vp6 vp6Var = this;
        boolean zA = vp6Var.D.f37705a.a();
        Map mapN = xp20.n(vp6Var.A.d());
        bop0 bop0Var = bop0.FIRST;
        f8u f8uVar = vp6Var.r;
        ArrayList arrayListA = f8uVar.a(bop0Var);
        ArrayList arrayListA2 = f8uVar.a(bop0.SECOND);
        p7m0 p7m0Var = vp6Var.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            vp6Var.f.getClass();
            if (p7m0Var.m(value, jp6.a((jp6) value, false, false, false, false, arrayListA, arrayListA2, list, m8x.U(list), list, zA, mapN, false, z, false, null, false, null, false, 2088968))) {
                return;
            } else {
                vp6Var = this;
            }
        }
    }

    @Override // a.diu0
    public final void v() {
        ((so6) this.v.b).b.f = true;
        ((so6) this.w.b).b.c.clear();
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        c4m0 c4m0Var;
        Object value2;
        Object next;
        Object next2;
        BetZip betZip;
        qn6 qn6Var = (qn6) obj;
        qn6Var.getClass();
        super.x(qn6Var);
        boolean zEquals = qn6Var.equals(gn6.f11571a);
        byte b = 0;
        i1w0 i1w0Var = this.O;
        if (!zEquals) {
            if (qn6Var.equals(nn6.f23805a)) {
                R(true);
                return;
            }
            boolean zEquals2 = qn6Var.equals(pn6.f27270a);
            yje yjeVar = null;
            mne mneVar = this.N;
            if (zEquals2) {
                sac.V(jiu0.a(this), new yj5(1, this, vp6.class, "emitShowSnackBarWithDefaultErrorMessage", "emitShowSnackBarWithDefaultErrorMessage(Ljava/lang/Throwable;)V", 0, (byte) 25), null, mneVar.b, new wa(this, yjeVar, (byte) 22), 10);
                return;
            }
            if (qn6Var instanceof mn6) {
                G(new gp6(((mn6) qn6Var).f22074a));
                return;
            }
            if (qn6Var instanceof on6) {
                sac.V(jiu0.a(this), new yj5(1, this, vp6.class, "emitShowSnackBarWithDefaultErrorMessage", "emitShowSnackBarWithDefaultErrorMessage(Ljava/lang/Throwable;)V", 0, (byte) 24), null, mneVar.b, new cm3(this, ((on6) qn6Var).f25531a, yjeVar, (byte) 29), 10);
                return;
            }
            if (qn6Var instanceof jn6) {
                sac.V(jiu0.a(this), new yj5(1, this, vp6.class, "emitShowSnackBarWithDefaultErrorMessage", "emitShowSnackBarWithDefaultErrorMessage(Ljava/lang/Throwable;)V", 0, (byte) 21), null, mneVar.b, new sp6(this, ((jn6) qn6Var).f16798a, null), 10);
                return;
            }
            if (qn6Var instanceof hn6) {
                xgl0 xgl0Var = ((hn6) qn6Var).f13336a;
                Iterator it = ((jp6) D()).g.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((BetGroupZip) next).b != xgl0Var.f);
                BetGroupZip betGroupZip = (BetGroupZip) next;
                if (betGroupZip == null) {
                    betZip = null;
                } else {
                    List list = betGroupZip.f;
                    List list2 = betGroupZip.g;
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        w3d.u(arrayList, ((ChildBets) it2.next()).b);
                    }
                    Iterator it3 = CollectionsKt.q0(list, arrayList).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        BetZip betZip2 = (BetZip) next2;
                        if (betZip2.f46426a == xgl0Var.f40846a && betZip2.d == xgl0Var.b) {
                            break;
                        }
                    }
                    betZip = (BetZip) next2;
                }
                if (betZip == null) {
                    return;
                }
                jg7 jg7VarF0 = x8f.f0(betZip);
                sac.V(jiu0.a(this), new yj5(1, this, vp6.class, "handleErrorSilently", "handleErrorSilently(Ljava/lang/Throwable;)V", 0, (byte) 22), new qp6(this, jg7VarF0, b), mneVar.b, new xw5(this, jg7VarF0, yjeVar, (byte) 12), 8);
                return;
            }
            if (qn6Var.equals(ln6.f20329a)) {
                if (this.G.j()) {
                    return;
                }
                sac.V(jiu0.a(this), new yj5(1, this, vp6.class, "emitShowSnackBarWithDefaultErrorMessage", "emitShowSnackBarWithDefaultErrorMessage(Ljava/lang/Throwable;)V", 0, (byte) 23), null, mneVar.b, new rp6(this, yjeVar, (byte) 2), 10);
                return;
            }
            if (qn6Var.equals(kn6.f18568a)) {
                v88.b(this.L, i1w0Var, 0L, 4);
                return;
            }
            boolean zEquals3 = qn6Var.equals(in6.f15058a);
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (zEquals3) {
                Long l = ((jp6) D()).q;
                if (l != null) {
                    P(true, l.longValue());
                }
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value2, jp6.a((jp6) value2, false, false, false, false, null, null, null, null, null, false, null, false, false, false, null, false, null, false, 2031615)));
                return;
            }
            if (qn6Var.equals(fn6.f9818a)) {
                if (((jp6) D()).f16886a || ((jp6) D()).b || (c4m0Var = this.U) == null || !c4m0Var.isCancelled() || !((jp6) D()).r) {
                    return;
                }
                Q();
                return;
            }
            if (qn6Var.equals(en6.f8077a)) {
                v3c.N(this.U);
                return;
            }
            if (!qn6Var.equals(cn6.f4638a)) {
                if (qn6Var.equals(dn6.f6353a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            if (this.Q.f25751a.a() && ((jp6) D()).p) {
                jg7 jg7Var = ((jp6) D()).o;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, jp6.a((jp6) value, false, false, false, false, null, null, null, null, null, false, null, false, false, false, null, true, null, false, 2064383)));
                i1w0Var.d(new qo5(this, jg7Var, (byte) 18));
                return;
            }
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
