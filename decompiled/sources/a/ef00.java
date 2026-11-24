package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class ef00 extends w46 {
    public final r9u A;
    public final m6m0 B;
    public final rqt C;
    public final lk5 D;
    public final vjp E;
    public final vqc F;
    public final peg0 G;
    public final y3v H;
    public final uf3 I;
    public final b4j J;
    public final hs60 K;
    public final ix0 L;
    public final gw60 M;
    public final mne N;
    public final ctf0 O;
    public final duj P;
    public final i1w0 Q;
    public final ag3 R;
    public final s2m0 S;
    public final lme0 T;
    public final xak U;
    public final kl5 V;
    public final jdk0 W;
    public final u8u X;
    public final ouu Y;
    public final gg5 Z;
    public final z7z a0;
    public final nlu b;
    public final z7z b0;
    public final ouu c;
    public final ys70 c0;
    public final yoc d;
    public final hqx d0;
    public final yoc e;
    public final pzt e0;
    public final lbu f;
    public final b4j f0;
    public final pru g;
    public final je g0;
    public final prc h;
    public final qho h0;
    public final vqc i;
    public final o3c i0;
    public final iqt j;
    public final atz j0;
    public final rou k;
    public final r2u k0;
    public final gxu l;
    public final rpt l0;
    public final xex m;
    public final yfu m0;
    public final ls n;
    public final yox n0;
    public final oct o;
    public final bzs0 o0;
    public final g9m0 p;
    public final lbu p0;
    public final jh70 q;
    public final nhf0 q0;
    public final mi70 r;
    public final kys0 r0;
    public final std s;
    public final cyu s0;
    public final gle0 t;
    public final lk5 t0;
    public final iw20 u;
    public final eke0 u0;
    public final uzc0 v;
    public final p7m0 v0;
    public final org.xplatform.toto_bet.core.navigation.a w;
    public final p7m0 w0;
    public final pek x;
    public final ol60 x0;
    public final kj5 y;
    public bby y0;
    public final xr z;
    public bby z0;

    public ef00(vzg0 vzg0Var, nlu nluVar, ouu ouuVar, yoc yocVar, yoc yocVar2, lbu lbuVar, pru pruVar, prc prcVar, vqc vqcVar, iqt iqtVar, rou rouVar, gxu gxuVar, xex xexVar, ls lsVar, oct octVar, k9c k9cVar, g9m0 g9m0Var, jh70 jh70Var, mi70 mi70Var, std stdVar, gle0 gle0Var, iw20 iw20Var, uzc0 uzc0Var, org.xplatform.toto_bet.core.navigation.a aVar, pek pekVar, kj5 kj5Var, xr xrVar, r9u r9uVar, m6m0 m6m0Var, rqt rqtVar, lk5 lk5Var, vjp vjpVar, vqc vqcVar2, peg0 peg0Var, y3v y3vVar, uf3 uf3Var, b4j b4jVar, hs60 hs60Var, ix0 ix0Var, gw60 gw60Var, mne mneVar, ctf0 ctf0Var, duj dujVar, i1w0 i1w0Var, ag3 ag3Var, s2m0 s2m0Var, lme0 lme0Var, xak xakVar, kl5 kl5Var, jdk0 jdk0Var, ahu ahuVar, u8u u8uVar, ouu ouuVar2, gg5 gg5Var, z7z z7zVar, z7z z7zVar2, ys70 ys70Var, hqx hqxVar, pzt pztVar, b4j b4jVar2, je jeVar, qho qhoVar, o3c o3cVar, atz atzVar, r2u r2uVar, rpt rptVar, yfu yfuVar, yox yoxVar, bzs0 bzs0Var, lbu lbuVar2, nhf0 nhf0Var, kc60 kc60Var, kys0 kys0Var, cyu cyuVar, lk5 lk5Var2, eke0 eke0Var) {
        r9uVar.getClass();
        ctf0Var.getClass();
        z7zVar.getClass();
        z7zVar2.getClass();
        ys70Var.getClass();
        this.b = nluVar;
        this.c = ouuVar;
        this.d = yocVar;
        this.e = yocVar2;
        this.f = lbuVar;
        this.g = pruVar;
        this.h = prcVar;
        this.i = vqcVar;
        this.j = iqtVar;
        this.k = rouVar;
        this.l = gxuVar;
        this.m = xexVar;
        this.n = lsVar;
        this.o = octVar;
        this.p = g9m0Var;
        this.q = jh70Var;
        this.r = mi70Var;
        this.s = stdVar;
        this.t = gle0Var;
        this.u = iw20Var;
        this.v = uzc0Var;
        this.w = aVar;
        this.x = pekVar;
        this.y = kj5Var;
        this.z = xrVar;
        this.A = r9uVar;
        this.B = m6m0Var;
        this.C = rqtVar;
        this.D = lk5Var;
        this.E = vjpVar;
        this.F = vqcVar2;
        this.G = peg0Var;
        this.H = y3vVar;
        this.I = uf3Var;
        this.J = b4jVar;
        this.K = hs60Var;
        this.L = ix0Var;
        this.M = gw60Var;
        this.N = mneVar;
        this.O = ctf0Var;
        this.P = dujVar;
        this.Q = i1w0Var;
        this.R = ag3Var;
        this.S = s2m0Var;
        this.T = lme0Var;
        this.U = xakVar;
        this.V = kl5Var;
        this.W = jdk0Var;
        this.X = u8uVar;
        this.Y = ouuVar2;
        this.Z = gg5Var;
        this.a0 = z7zVar;
        this.b0 = z7zVar2;
        this.c0 = ys70Var;
        this.d0 = hqxVar;
        this.e0 = pztVar;
        this.f0 = b4jVar2;
        this.g0 = jeVar;
        this.h0 = qhoVar;
        this.i0 = o3cVar;
        this.j0 = atzVar;
        this.k0 = r2uVar;
        this.l0 = rptVar;
        this.m0 = yfuVar;
        this.n0 = yoxVar;
        this.o0 = bzs0Var;
        this.p0 = lbuVar2;
        this.q0 = nhf0Var;
        this.r0 = kys0Var;
        this.s0 = cyuVar;
        this.t0 = lk5Var2;
        this.u0 = eke0Var;
        this.v0 = q7m0.a(iun.f15405a);
        this.w0 = q7m0.a(re00.f30312a);
        this.x0 = new ol60(3);
        yje yjeVar = null;
        sac.T(new fnq(dtb.z(kc60Var.a(), 1), new kaw(this, yjeVar, (byte) 19), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), ze00.h);
        sac.T(new fnq(new va(((qe50) ouuVar2.b).b, (byte) 16), new ye00(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), cf00.h);
    }

    public final void A(lr1 lr1Var) {
        sac.V(jiu0.a(this), new svz(1, this, ef00.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 11), null, this.N.f22085a, new juy((Object) this, (Object) lr1Var, (yje) null, (byte) 13), 10);
    }

    public final void B(long j) {
        A(new fr1(new fs80(null, j, null, null, 0L, false, 125), null, 2));
    }

    public final void C(int i, String str) {
        boolean z = this.g.a().p0;
        boolean zO = StringsKt.O(str, "https://", false);
        i1w0 i1w0Var = this.Q;
        if (zO && z) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            this.n0.getClass();
            FragmentScreen paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1 = new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str);
            if (paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1 instanceof DialogScreen) {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1)));
            } else {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1)));
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
            if (StringsKt.O(str, "https://", false)) {
                this.x0.f(new he00(str));
                return;
            }
            if (str.length() <= 0) {
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            this.o0.getClass();
            FragmentScreen fragmentScreenD = bzs0.d(i, str);
            if (fragmentScreenD instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenD)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenD)));
            }
            ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(List list, zje zjeVar) {
        df00 df00Var;
        if (zjeVar instanceof df00) {
            df00Var = (df00) zjeVar;
            int i = df00Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                df00Var.k = i - Integer.MIN_VALUE;
            } else {
                df00Var = new df00(this, zjeVar);
            }
        } else {
            df00Var = new df00(this, zjeVar);
        }
        Object obj = df00Var.i;
        wne wneVar = wne.f39444a;
        int i2 = df00Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            df00Var.k = 1;
            if (this.e.b(list, df00Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        y();
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(zje zjeVar) {
        te00 te00Var;
        Object g0g0Var;
        if (zjeVar instanceof te00) {
            te00Var = (te00) zjeVar;
            int i = te00Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                te00Var.k = i - Integer.MIN_VALUE;
            } else {
                te00Var = new te00(this, zjeVar);
            }
        } else {
            te00Var = new te00(this, zjeVar);
        }
        Object obj = te00Var.i;
        wne wneVar = wne.f39444a;
        int i2 = te00Var.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                o3c o3cVar = this.i0;
                te00Var.k = 1;
                if (o3c.p(o3cVar, false, te00Var, 3) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            g0g0Var = Unit.f46060a;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null && (thA instanceof sq60)) {
            y();
        }
        return Unit.f46060a;
    }

    public final void x(Throwable th) {
        this.P.b(th, new fe00(this, (byte) 0));
    }

    public final void y() {
        v3c.N(this.z0);
        this.z0 = sac.V(jiu0.a(this), ve00.f37259a, null, this.N.f22085a, new xe00(this, null, (byte) 0), 10);
    }

    public final void z(f240 f240Var) {
        String strV = bww.V(f240Var.n());
        boolean z = f240Var instanceof z140;
        gg5 gg5Var = this.Z;
        ag3 ag3Var = this.R;
        if (z) {
            z140 z140Var = (z140) f240Var;
            ag3Var.a(strV, String.valueOf(z140Var.getEventId()));
            gg5Var.l(z140Var.getEventId(), strV);
        } else {
            String strD = vvw.D(f240Var);
            ag3Var.b(strV, strD);
            gg5Var.m(strV, strD);
        }
    }
}
