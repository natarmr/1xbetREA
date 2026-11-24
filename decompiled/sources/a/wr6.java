package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;
import org.xplatform.bet_constructor.impl.bets.presentation.BetConstructorBetsScreen;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class wr6 extends i3t0 {
    public static final /* synthetic */ int K = 0;
    public final bn6 A;
    public final au0 B;
    public final mne C;
    public final i1w0 D;
    public final duj E;
    public final ctf0 F;
    public final xex G;
    public final f6k H;
    public final f8u I;
    public bby J;
    public final f7u o;
    public final gdu p;
    public final b8u q;
    public final edu r;
    public final nt s;
    public final yk50 t;
    public final r4v u;
    public final lbu v;
    public final wsf0 w;
    public final lhf0 x;
    public final drt y;
    public final poq0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public wr6(f7u f7uVar, gdu gduVar, b8u b8uVar, edu eduVar, nt ntVar, yk50 yk50Var, r4v r4vVar, lbu lbuVar, wsf0 wsf0Var, lhf0 lhf0Var, drt drtVar, poq0 poq0Var, bn6 bn6Var, au0 au0Var, mne mneVar, i1w0 i1w0Var, duj dujVar, ctf0 ctf0Var, m1e m1eVar, xex xexVar, f6k f6kVar, r9u r9uVar, ocl oclVar, f8u f8uVar, pru pruVar) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        yje yjeVar = null;
        super(new oj6(r9uVar, pruVar), g090VarP, new cz(ctf0Var, oclVar, (byte) 2), (yzn0) null);
        this.o = f7uVar;
        this.p = gduVar;
        this.q = b8uVar;
        this.r = eduVar;
        this.s = ntVar;
        this.t = yk50Var;
        this.u = r4vVar;
        this.v = lbuVar;
        this.w = wsf0Var;
        this.x = lhf0Var;
        this.y = drtVar;
        this.z = poq0Var;
        this.A = bn6Var;
        this.B = au0Var;
        this.C = mneVar;
        this.D = i1w0Var;
        this.E = dujVar;
        this.F = ctf0Var;
        this.G = xexVar;
        this.H = f6kVar;
        this.I = f8uVar;
        fnq fnqVar = new fnq(m1eVar.b(), new vr6(this, yjeVar, (byte) 1), (byte) 4);
        bvc bvcVarA = jiu0.a(this);
        dvj dvjVar = mneVar.b;
        sac.T(fnqVar, d5c.S(bvcVarA, dvjVar), new vp3(2, this, wr6.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 25));
        sac.V(jiu0.a(this), new ur6(1, this, wr6.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, dvjVar, new vr6(this, yjeVar, (byte) 0), 10);
    }

    public final void M() {
        bby bbyVar = this.J;
        if (bbyVar != null) {
            v3c.N(bbyVar);
        }
        this.J = sac.i0(jiu0.a(this), wr6.class.getName().concat(".loadSportGames"), 3, 8L, kotlin.collections.a.c(oqt0.class), null, new hu3((diu0) this, (yje) null, (byte) 1), null, this.C.b, new ur6(1, this, wr6.class, "handleLoadingErrors", "handleLoadingErrors(Ljava/lang/Throwable;)V", 0, (byte) 1), null, 592);
    }

    public final void N() {
        this.w.p();
        i1w0 i1w0Var = this.D;
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

    public final void O() {
        Object value;
        List listA = this.p.a(((or6) D()).c);
        ArrayList arrayList = ((gs6) ((mii0) this.q.f2175a).c).b;
        gio gioVar = ((gs6) this.I.f9125a.c).g;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, or6.a((or6) value, arrayList, listA, 0, false, false, false, gioVar, 252)));
    }

    @Override // a.diu0
    public final void v() {
        this.H.a(bm5.k);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object next;
        Object value2;
        sq6 sq6Var = (sq6) obj;
        sq6Var.getClass();
        super.x(sq6Var);
        if (sq6Var.equals(lq6.f20471a)) {
            if (this.s.a()) {
                N();
                return;
            } else {
                G(jr6.f16987a);
                return;
            }
        }
        boolean zEquals = sq6Var.equals(nq6.f23944a);
        au0 au0Var = this.B;
        bn6 bn6Var = this.A;
        if (zEquals) {
            bn6Var.b.c("betkit_bet_call");
            au0Var.f1455a.a(xun.f41520a, 3357L);
            i1w0 i1w0Var = this.D;
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            FragmentScreen betConstructorBetsScreen = new BetConstructorBetsScreen();
            if (betConstructorBetsScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) betConstructorBetsScreen)));
            } else {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(betConstructorBetsScreen)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            boolean z = sq6Var instanceof qq6;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            f8u f8uVar = this.I;
            gdu gduVar = this.p;
            if (!z) {
                boolean z2 = sq6Var instanceof oq6;
                ctf0 ctf0Var = this.F;
                if (z2) {
                    d9a0 d9a0Var = ((oq6) sq6Var).f25672a;
                    ArrayList arrayListB = this.y.b(d9a0Var);
                    if (arrayListB.isEmpty()) {
                        G(new kr6(ctf0Var.b.a(R.string.error_wrong_team, Arrays.copyOf(new Object[0], 0))));
                        return;
                    } else {
                        G(new lr6(d9a0Var, arrayListB));
                        return;
                    }
                }
                boolean z3 = sq6Var instanceof rq6;
                lbu lbuVar = this.v;
                yk50 yk50Var = this.t;
                if (!z3) {
                    if (sq6Var.equals(mq6.f22207a)) {
                        N();
                        return;
                    }
                    if (sq6Var.equals(kq6.f18705a)) {
                        if (this.z.f27342a.d().r(fk60.BET_CONSCTRUCTOR)) {
                            G(mr6.f22253a);
                            return;
                        }
                        return;
                    }
                    if (sq6Var.equals(iq6.f15193a)) {
                        O();
                        boolean z4 = yk50Var.g() && !lbuVar.j();
                        p7m0 p7m0Var = ocjVar.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var.m(value, or6.a((or6) value, null, null, 0, z4, false, false, null, 495)));
                        return;
                    }
                    if (sq6Var.equals(jq6.f16935a)) {
                        E();
                        return;
                    } else if (sq6Var.equals(pq6.f27399a)) {
                        M();
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                ojp0 ojp0Var = ((rq6) sq6Var).f30916a;
                int i = ojp0Var.f25370a;
                int i2 = ojp0Var.b;
                m6m0 m6m0Var = bop0.b;
                int i3 = ojp0Var.c;
                m6m0Var.getClass();
                jyb jybVarT = this.x.t(i, i2, m6m0.j(i3), false);
                if (!jybVarT.equals(ujn.f)) {
                    if (jybVarT instanceof hyb) {
                        G(new kr6(ctf0Var.b.a(R.string.team_by_number_is_full_v2, Arrays.copyOf(new Object[]{Integer.valueOf(((hyb) jybVarT).a())}, 1))));
                        return;
                    } else if (jybVarT.equals(iyb.f15580a)) {
                        G(new kr6(ctf0Var.b.a(R.string.error_wrong_team, Arrays.copyOf(new Object[0], 0))));
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                List listA = gduVar.a(((or6) D()).c);
                gio gioVar = ((gs6) f8uVar.f9125a.c).g;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                while (true) {
                    Object value3 = p7m0Var2.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                    gio gioVar2 = gioVar;
                    if (p7m0Var2.m(value3, or6.a((or6) value3, null, listA, 0, false, false, false, gioVar2, 253))) {
                        break;
                    } else {
                        gioVar = gioVar2;
                    }
                }
                Iterator it = ((or6) D()).f25720a.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((vil0) next).f37485a != ((or6) D()).c);
                vil0 vil0Var = (vil0) next;
                if (vil0Var != null) {
                    long j = vil0Var.b;
                    h97.x("sport_id", Long.valueOf(j), bn6Var.b, "betkit_add_to_team");
                    h97.r(j, au0Var.f1455a, 3356L);
                }
                boolean z5 = yk50Var.g() && !lbuVar.j();
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value2, or6.a((or6) value2, null, null, 0, z5, false, false, null, 495)));
                return;
            }
            int i4 = (int) ((qq6) sq6Var).f29151a;
            List listA2 = gduVar.a(i4);
            gio gioVar3 = ((gs6) f8uVar.f9125a.c).g;
            p7m0 p7m0Var4 = ocjVar.f25029a;
            while (true) {
                Object value4 = p7m0Var4.getValue();
                value4.getClass();
                oyg0Var.getClass();
                gio gioVar4 = gioVar3;
                if (p7m0Var4.m(value4, or6.a((or6) value4, null, listA2, i4, false, false, false, gioVar4, 249))) {
                    return;
                } else {
                    gioVar3 = gioVar4;
                }
            }
        }
    }
}
