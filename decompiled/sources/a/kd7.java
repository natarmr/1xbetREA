package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import org.xplatform.bet_history.additional_info.presentation.AdditionalInfoScreen;
import org.xplatform.bet_history.bet_info.presentation.model.BetInfoScreenModel;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class kd7 extends i3t0 {
    public static final List m0 = q3d.j(0L, 42L, 707L);
    public final b8u A;
    public final hru B;
    public final rrc C;
    public final ocl D;
    public final a3u E;
    public final z7u F;
    public final h03 G;
    public final nsc H;
    public final vpt I;
    public final fvt0 J;
    public final n660 K;
    public final pmi0 L;
    public final o470 M;
    public final p37 N;
    public final nj7 O;
    public final art P;
    public final jrt Q;
    public final h3c R;
    public final fvt0 S;
    public final gr00 T;
    public final yfm0 U;
    public final pv00 V;
    public final vqc W;
    public final qv2 X;
    public final upt Y;
    public final ryu Z;
    public final k9u a0;
    public final rou b0;
    public final x1u c0;
    public final xw30 d0;
    public final f47 e0;
    public final duj f0;
    public final i1w0 g0;
    public bby h0;
    public c4m0 i0;
    public c4m0 j0;
    public bby k0;
    public final c4m0 l0;
    public final String o;
    public final BetInfoScreenModel p;
    public final jrt q;
    public final mne r;
    public final ctf0 s;
    public final m1e t;
    public final uii u;
    public final k7u v;
    public final lsn w;
    public final bbw0 x;
    public final cmt y;
    public final pru z;

    /* JADX WARN: Illegal instructions before constructor call */
    public kd7(vzg0 vzg0Var, String str, BetInfoScreenModel betInfoScreenModel, jrt jrtVar, mne mneVar, ctf0 ctf0Var, m1e m1eVar, uii uiiVar, k7u k7uVar, lsn lsnVar, bbw0 bbw0Var, cmt cmtVar, pru pruVar, b8u b8uVar, hru hruVar, rrc rrcVar, ocl oclVar, a3u a3uVar, ntu ntuVar, yiu yiuVar, z7u z7uVar, h03 h03Var, luu luuVar, nsc nscVar, vpt vptVar, fvt0 fvt0Var, n660 n660Var, pmi0 pmi0Var, o470 o470Var, p37 p37Var, nj7 nj7Var, art artVar, jrt jrtVar2, h3c h3cVar, fvt0 fvt0Var2, gr00 gr00Var, yfm0 yfm0Var, pv00 pv00Var, vqc vqcVar, qv2 qv2Var, upt uptVar, ryu ryuVar, k9u k9uVar, czt cztVar, rou rouVar, x1u x1uVar, xw30 xw30Var, f47 f47Var, wyu wyuVar, duj dujVar, ocl oclVar2, i1w0 i1w0Var, r9u r9uVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        k7uVar.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        yje yjeVar = null;
        super(new h92(pruVar, cztVar, luuVar, r9uVar, ntuVar, yiuVar, wyuVar, betInfoScreenModel), cvm0.p(vs10Var, rwjVar), new cz(ctf0Var, oclVar2, (byte) 4), (yzn0) null);
        this.o = str;
        this.p = betInfoScreenModel;
        this.q = jrtVar;
        this.r = mneVar;
        this.s = ctf0Var;
        this.t = m1eVar;
        this.u = uiiVar;
        this.v = k7uVar;
        this.w = lsnVar;
        this.x = bbw0Var;
        this.y = cmtVar;
        this.z = pruVar;
        this.A = b8uVar;
        this.B = hruVar;
        this.C = rrcVar;
        this.D = oclVar;
        this.E = a3uVar;
        this.F = z7uVar;
        this.G = h03Var;
        this.H = nscVar;
        this.I = vptVar;
        this.J = fvt0Var;
        this.K = n660Var;
        this.L = pmi0Var;
        this.M = o470Var;
        this.N = p37Var;
        this.O = nj7Var;
        this.P = artVar;
        this.Q = jrtVar2;
        this.R = h3cVar;
        this.S = fvt0Var2;
        this.T = gr00Var;
        this.U = yfm0Var;
        this.V = pv00Var;
        this.W = vqcVar;
        this.X = qv2Var;
        this.Y = uptVar;
        this.Z = ryuVar;
        this.a0 = k9uVar;
        this.b0 = rouVar;
        this.c0 = x1uVar;
        this.d0 = xw30Var;
        this.e0 = f47Var;
        this.f0 = dujVar;
        this.g0 = i1w0Var;
        Class<kd7> cls = kd7.class;
        sac.V(jiu0.a(this), new ur6(1, this, cls, "errorHandle", "errorHandle(Ljava/lang/Throwable;)V", 0, (byte) 26), null, rwjVar, new bd7(this, yjeVar, (byte) 0), 10);
        sac.V(jiu0.a(this), new ur6(1, this, cls, "errorHandle", "errorHandle(Ljava/lang/Throwable;)V", 0, (byte) 25), null, rwjVar, new ex1((Object) this, yjeVar, (byte) 14), 10);
        e3c.n(this.l0);
        this.l0 = sac.T(new fnq(xw30Var.b(), new xw5(this, yjeVar, (byte) 17), (byte) 4), jiu0.a(this), new ed7(this, yjeVar, (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    public final void M() {
        Object value;
        boolean z;
        boolean z2 = P() && R();
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, rc7.a((rc7) value, null, false, null, null, null, null, null, null, null, false, false, z2, 0L, 0L, 266338303)));
        yje yjeVar = null;
        if (!z2) {
            bby bbyVar = this.k0;
            if (bbyVar != null) {
                bbyVar.cancel(null);
                return;
            }
            return;
        }
        if (this.o.length() != 0) {
            a5w a5wVar = ((rc7) D()).d;
            if (a5wVar == null) {
                z = false;
            } else if (a5wVar instanceof kzv) {
                z = ((kzv) a5wVar).q;
            } else if (a5wVar instanceof vw4) {
                z = ((vw4) a5wVar).p;
            } else {
                z = false;
            }
            if (!z) {
                if (!O().isEmpty()) {
                    return;
                }
            }
        } else if (!O().isEmpty()) {
            return;
        }
        bby bbyVar2 = this.k0;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        this.k0 = sac.c0(jiu0.a(this), ibc.w0(30000L, bfn.MILLISECONDS), this.r.b, new yc7(this, (byte) 5), new bd7(this, yjeVar, (byte) 6));
    }

    public final void N(Throwable th) {
        this.f0.b(th, new i87((byte) 4));
    }

    public final List O() {
        a5w a5wVar = ((rc7) D()).d;
        if (a5wVar != null) {
            if (a5wVar instanceof kzv) {
                return ((kzv) a5wVar).Y;
            }
            if (a5wVar instanceof vw4) {
                return ((vw4) a5wVar).T;
            }
        }
        return iun.f15405a;
    }

    public final boolean P() {
        List<z0w> listO = O();
        if (listO != null && listO.isEmpty()) {
            return false;
        }
        for (z0w z0wVar : listO) {
            if (!z0wVar.g && z0wVar.l) {
                return true;
            }
        }
        return false;
    }

    public final void Q() {
        bby bbyVar = this.h0;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.h0 = sac.V(jiu0.a(this), new yc7(this, (byte) 8), null, this.r.b, new cd7(this, yjeVar, (byte) 0), 10);
    }

    public final boolean R() {
        List listJ = q3d.j(iy4.c, iy4.d, i0w.f, i0w.i);
        a5w a5wVar = ((rc7) D()).d;
        return !CollectionsKt.L(listJ, a5wVar != null ? a5wVar.b() : null);
    }

    public final void S() {
        a5w a5wVar = ((rc7) D()).d;
        kzv kzvVar = a5wVar instanceof kzv ? (kzv) a5wVar : null;
        if (kzvVar == null) {
            return;
        }
        ql5 ql5Var = ((rc7) D()).h;
        String str = ql5Var != null ? ql5Var.f : null;
        if (str == null) {
            str = "";
        }
        G(new jc7(kzvVar.m, this.o, str));
    }

    public final void T() {
        a5w a5wVar;
        ql5 ql5Var = ((rc7) D()).h;
        if (ql5Var == null || (a5wVar = ((rc7) D()).d) == null) {
            return;
        }
        i3t0.K(this, null, null, new xg0(this, a5wVar, ql5Var, null, (byte) 5), 3);
        BetInfoScreenModel betInfoScreenModel = this.p;
        f8w f8wVar = betInfoScreenModel.c;
        HistoryTypeModel historyTypeModel = betInfoScreenModel.f46385a;
        boolean zA = ql5Var.i.a();
        gx7 gx7Var = this.z.a().f32117a;
        this.P.getClass();
        List listE = art.e(a5wVar, f8wVar, historyTypeModel, zA, gx7Var);
        ArrayList arrayList = new ArrayList(r3d.q(listE, 10));
        Iterator it = ((ArrayList) listE).iterator();
        while (it.hasNext()) {
            arrayList.add(kkb.V((HistoryMenuItem) it.next(), this.s));
        }
        G(new ic7(arrayList));
    }

    public final void U() {
        sac.V(jiu0.a(this), new ur6(1, this, kd7.class, "errorHandle", "errorHandle(Ljava/lang/Throwable;)V", 0, (byte) 27), null, this.r.b, new dd7(this, null, (byte) 1), 10);
    }

    public final void V() {
        String str = this.o;
        if (str.length() == 0 || str.equals("-1")) {
            return;
        }
        if (!this.I.a()) {
            G(gc7.f11045a);
            return;
        }
        sac.V(jiu0.a(this), new yc7(this, (byte) 3), null, this.r.b, new oa(this, str, null, (byte) 24), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W(a5w a5wVar, zje zjeVar) {
        jd7 jd7Var;
        if (zjeVar instanceof jd7) {
            jd7Var = (jd7) zjeVar;
            int i = jd7Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jd7Var.k = i - Integer.MIN_VALUE;
            } else {
                jd7Var = new jd7(this, zjeVar);
            }
        } else {
            jd7Var = new jd7(this, zjeVar);
        }
        Object objJ = jd7Var.i;
        Object obj = wne.f39444a;
        int i2 = jd7Var.k;
        if (i2 == 0) {
            z1x.P(objJ);
            if (!(a5wVar instanceof kzv) || ((kzv) a5wVar).g != i0w.b) {
                return w760.f38657a;
            }
            jd7Var.k = 1;
            objJ = this.D.j();
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objJ);
        }
        return axq.y(Long.parseLong(this.o), (List) objJ) ? v760.f36909a : x760.f40400a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object next;
        z0w z0wVar;
        Object next2;
        Object value;
        la7 la7Var = (la7) obj;
        la7Var.getClass();
        super.x(la7Var);
        boolean zEquals = la7Var.equals(q97.f28334a);
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        i1w0 i1w0Var = this.g0;
        if (zEquals) {
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
        } else {
            if (la7Var.equals(aa7.f511a)) {
                T();
                return;
            }
            if (la7Var.equals(ba7.f2245a)) {
                U();
                return;
            }
            yje yjeVar = null;
            if (la7Var.equals(ea7.f7453a)) {
                c4m0 c4m0Var = this.i0;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                c4m0 c4m0Var2 = this.j0;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                }
                bby bbyVar = this.k0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                    return;
                }
                return;
            }
            boolean zEquals2 = la7Var.equals(ga7.f10951a);
            byte b = 4;
            byte b2 = 1;
            mne mneVar = this.r;
            if (zEquals2) {
                c4m0 c4m0Var3 = this.i0;
                if (c4m0Var3 != null) {
                    c4m0Var3.cancel(null);
                }
                this.i0 = slb.U(new fnq(this.t.b(), new bd7(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a));
                c4m0 c4m0Var4 = this.j0;
                if (c4m0Var4 != null) {
                    c4m0Var4.cancel(null);
                }
                uzc uzcVar = (uzc) this.y.b;
                uzcVar.getClass();
                this.j0 = sac.T(new fnq(nkb.z(new rzc(uzcVar, yjeVar, objArr5 == true ? 1 : 0)), new dd7(this, yjeVar, objArr4 == true ? 1 : 0), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new ed7(this, yjeVar, objArr3 == true ? 1 : 0));
                bby bbyVar2 = this.h0;
                boolean zIsActive = bbyVar2 != null ? bbyVar2.isActive() : false;
                bby bbyVar3 = this.k0;
                if (bbyVar3 == null || !bbyVar3.isCancelled() || zIsActive) {
                    return;
                }
                M();
                return;
            }
            if (la7Var.equals(v97.f37021a)) {
                sac.V(jiu0.a(this), null, null, mneVar.f22085a, new cd7(this, yjeVar, b2), 11);
                return;
            }
            byte b3 = 9;
            if (la7Var.equals(r97.f30063a)) {
                sac.V(jiu0.a(this), new yc7(this, (byte) 10), null, mneVar.b, new ic1(this, yjeVar, b3), 10);
                return;
            }
            if (la7Var.equals(s97.f31839a)) {
                sac.V(jiu0.a(this), new yc7(this, (byte) 11), null, mneVar.b, new fd7(this, yjeVar, objArr2 == true ? 1 : 0), 10);
                return;
            }
            if (la7Var.equals(t97.f33547a)) {
                S();
                return;
            }
            byte b4 = 2;
            if (la7Var.equals(ha7.f12711a)) {
                this.O.d();
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, rc7.a((rc7) value, null, false, null, null, null, null, null, null, null, true, false, false, 0L, 0L, 267911167)));
                sac.i0(jiu0.a(this), kd7.class.getSimpleName().concat(".onSaleConfirmed"), 3, 0L, q3d.j(oqt0.class, lai0.class), null, new ex1((Object) this, yjeVar, (byte) 15), null, mneVar.b, new yc7(this, b4), null, 596);
                return;
            }
            if (la7Var.equals(ja7.f16175a)) {
                sac.V(jiu0.a(this), new yc7(this, b), null, mneVar.b, new bd7(this, yjeVar, (byte) 5), 10);
                return;
            }
            if (la7Var.equals(w97.f38765a)) {
                E();
                return;
            }
            if (la7Var.equals(fa7.f9193a)) {
                sac.V(jiu0.a(this), null, null, mneVar.f22085a, new dd7(this, yjeVar, b4), 11);
                return;
            }
            if (la7Var.equals(ia7.f14423a)) {
                ((fme) ((zas0) this.L.f27236a).b).f9776a.f(new qkt0(this.o));
                sac.V(jiu0.a(this), new yc7(this, b2), null, mneVar.b, new cd7(this, yjeVar, b4), 10);
                return;
            }
            if (la7Var.equals(u97.f35270a)) {
                this.Y.a(true);
                this.a0.a(true);
                V();
                return;
            }
            if (la7Var.equals(ka7.f17950a)) {
                V();
                return;
            }
            if (la7Var.equals(o97.f24865a)) {
                sac.V(jiu0.a(this), new yc7(this, objArr == true ? 1 : 0), null, mneVar.b, new bd7(this, yjeVar, (byte) 3), 10);
                return;
            }
            if (la7Var.equals(x97.f40496a)) {
                sac.V(jiu0.a(this), new yc7(this, b3), null, mneVar.b, new bd7(this, yjeVar, b), 10);
                return;
            }
            if (la7Var.equals(p97.f26594a)) {
                sac.V(jiu0.a(this), new yc7(this, (byte) 12), null, mneVar.f22085a, new bd7(this, yjeVar, b4), 10);
                return;
            }
            if (!(la7Var instanceof z97)) {
                if (la7Var instanceof y97) {
                    sac.V(jiu0.a(this), new yc7(this, (byte) 6), null, null, new xw5(this, ((y97) la7Var).f42231a, yjeVar, (byte) 18), 14);
                    return;
                }
                if (la7Var.equals(ca7.f3994a)) {
                    i3t0.A(this, this.N, new k1k(r6w.i), null, null, 6);
                    return;
                } else if (la7Var.equals(da7.f5733a)) {
                    i3t0.A(this, this.N, new l1k(r6w.i), null, null, 6);
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            long j = ((z97) la7Var).f44003a;
            a5w a5wVar = ((rc7) D()).d;
            if (a5wVar == null) {
                z0wVar = null;
            } else if (a5wVar instanceof kzv) {
                Iterator it = ((kzv) a5wVar).Y.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (((z0w) next2).i != j);
                z0wVar = (z0w) next2;
            } else if (a5wVar instanceof vw4) {
                Iterator it2 = ((vw4) a5wVar).T.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((z0w) next).i != j);
                z0wVar = (z0w) next;
            } else {
                if (!(a5wVar instanceof z7y) && !(a5wVar instanceof nc10) && !(a5wVar instanceof for0) && !(a5wVar instanceof y21)) {
                    t9f.b();
                    return;
                }
                z0wVar = null;
            }
            if (z0wVar == null) {
                return;
            }
            if (m0.contains(Long.valueOf(z0wVar.t))) {
                return;
            }
            long j2 = z0wVar.t;
            if (j2 != 95) {
                if (!z0wVar.g) {
                    sac.V(jiu0.a(this), null, null, mneVar.f22085a, new xw5(this, z0wVar, yjeVar, (byte) 19), 11);
                    return;
                } else {
                    ((bn6) this.x.b).e(j2, z0wVar.I, z0wVar.f43588a, true, false, "bet_history", null, null);
                    sac.V(jiu0.a(this), new yc7(this, (byte) 7), null, mneVar.b, new ir(z0wVar, this, yjeVar, b), 10);
                    return;
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            AdditionalInfoScreen additionalInfoScreen = new AdditionalInfoScreen(j);
            if (additionalInfoScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) additionalInfoScreen)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(additionalInfoScreen)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
