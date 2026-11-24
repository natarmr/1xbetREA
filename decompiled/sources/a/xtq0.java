package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class xtq0 extends w46 {
    public final hs60 A;
    public final eke0 A0;
    public final ix0 B;
    public final p7m0 B0;
    public final gw60 C;
    public final ol60 C0;
    public final gg5 D;
    public final p7m0 D0;
    public final lk5 E;
    public bby E0;
    public final rqt F;
    public bby F0;
    public final kj5 G;
    public final org.xplatform.toto_bet.core.navigation.a H;
    public final xex I;
    public final m6m0 J;
    public final xr K;
    public final r9u L;
    public final pek M;
    public final uzc0 N;
    public final iw20 O;
    public final lbu P;
    public final prc Q;
    public final boolean R;
    public final s2m0 S;
    public final lme0 T;
    public final xak U;
    public final kl5 V;
    public final jdk0 W;
    public final u8u X;
    public final ouu Y;
    public final z7z Z;
    public final z7z a0;
    public final nlu b;
    public final ys70 b0;
    public final pru c;
    public final hqx c0;
    public final duj d;
    public final pzt d0;
    public final ouu e;
    public final s64 e0;
    public final iqt f;
    public final b4j f0;
    public final gxu g;
    public final je g0;
    public final rou h;
    public final qho h0;
    public final vqc i;
    public final o3c i0;
    public final ls j;
    public final yoc j0;
    public final vjp k;
    public final yoc k0;
    public final vqc l;
    public final ieu l0;
    public final peg0 m;
    public final pau m0;
    public final oct n;
    public final n4u n0;
    public final g9m0 o;
    public final jqc o0;
    public final jh70 p;
    public final atz p0;
    public final mi70 q;
    public final r2u q0;
    public final tf3 r;
    public final rpt r0;
    public final ag3 s;
    public final yfu s0;
    public final y3v t;
    public final yox t0;
    public final std u;
    public final bzs0 u0;
    public final gle0 v;
    public final lbu v0;
    public final ctf0 w;
    public final nhf0 w0;
    public final mne x;
    public final kys0 x0;
    public final i1w0 y;
    public final cyu y0;
    public final b4j z;
    public final lk5 z0;

    public xtq0(nlu nluVar, pru pruVar, duj dujVar, ouu ouuVar, iqt iqtVar, gxu gxuVar, rou rouVar, vqc vqcVar, ls lsVar, vjp vjpVar, vqc vqcVar2, peg0 peg0Var, oct octVar, g9m0 g9m0Var, jh70 jh70Var, mi70 mi70Var, tf3 tf3Var, ag3 ag3Var, y3v y3vVar, std stdVar, gle0 gle0Var, ctf0 ctf0Var, mne mneVar, i1w0 i1w0Var, b4j b4jVar, hs60 hs60Var, ix0 ix0Var, gw60 gw60Var, gg5 gg5Var, lk5 lk5Var, rqt rqtVar, kj5 kj5Var, org.xplatform.toto_bet.core.navigation.a aVar, xex xexVar, m6m0 m6m0Var, xr xrVar, r9u r9uVar, pek pekVar, uzc0 uzc0Var, iw20 iw20Var, vzg0 vzg0Var, lbu lbuVar, prc prcVar, boolean z, s2m0 s2m0Var, lme0 lme0Var, xak xakVar, kl5 kl5Var, jdk0 jdk0Var, u8u u8uVar, ouu ouuVar2, z7z z7zVar, z7z z7zVar2, ys70 ys70Var, hqx hqxVar, pzt pztVar, s64 s64Var, b4j b4jVar2, je jeVar, qho qhoVar, o3c o3cVar, yoc yocVar, yoc yocVar2, ieu ieuVar, pau pauVar, n4u n4uVar, jqc jqcVar, atz atzVar, r2u r2uVar, rpt rptVar, yfu yfuVar, yox yoxVar, bzs0 bzs0Var, lbu lbuVar2, nhf0 nhf0Var, kc60 kc60Var, kys0 kys0Var, cyu cyuVar, lk5 lk5Var2, eke0 eke0Var) {
        i1w0Var.getClass();
        r9uVar.getClass();
        z7zVar.getClass();
        z7zVar2.getClass();
        this.b = nluVar;
        this.c = pruVar;
        this.d = dujVar;
        this.e = ouuVar;
        this.f = iqtVar;
        this.g = gxuVar;
        this.h = rouVar;
        this.i = vqcVar;
        this.j = lsVar;
        this.k = vjpVar;
        this.l = vqcVar2;
        this.m = peg0Var;
        this.n = octVar;
        this.o = g9m0Var;
        this.p = jh70Var;
        this.q = mi70Var;
        this.r = tf3Var;
        this.s = ag3Var;
        this.t = y3vVar;
        this.u = stdVar;
        this.v = gle0Var;
        this.w = ctf0Var;
        this.x = mneVar;
        this.y = i1w0Var;
        this.z = b4jVar;
        this.A = hs60Var;
        this.B = ix0Var;
        this.C = gw60Var;
        this.D = gg5Var;
        this.E = lk5Var;
        this.F = rqtVar;
        this.G = kj5Var;
        this.H = aVar;
        this.I = xexVar;
        this.J = m6m0Var;
        this.K = xrVar;
        this.L = r9uVar;
        this.M = pekVar;
        this.N = uzc0Var;
        this.O = iw20Var;
        this.P = lbuVar;
        this.Q = prcVar;
        this.R = z;
        this.S = s2m0Var;
        this.T = lme0Var;
        this.U = xakVar;
        this.V = kl5Var;
        this.W = jdk0Var;
        this.X = u8uVar;
        this.Y = ouuVar2;
        this.Z = z7zVar;
        this.a0 = z7zVar2;
        this.b0 = ys70Var;
        this.c0 = hqxVar;
        this.d0 = pztVar;
        this.e0 = s64Var;
        this.f0 = b4jVar2;
        this.g0 = jeVar;
        this.h0 = qhoVar;
        this.i0 = o3cVar;
        this.j0 = yocVar;
        this.k0 = yocVar2;
        this.l0 = ieuVar;
        this.m0 = pauVar;
        this.n0 = n4uVar;
        this.o0 = jqcVar;
        this.p0 = atzVar;
        this.q0 = r2uVar;
        this.r0 = rptVar;
        this.s0 = yfuVar;
        this.t0 = yoxVar;
        this.u0 = bzs0Var;
        this.v0 = lbuVar2;
        this.w0 = nhf0Var;
        this.x0 = kys0Var;
        this.y0 = cyuVar;
        this.z0 = lk5Var2;
        this.A0 = eke0Var;
        this.B0 = q7m0.a(jtq0.f17113a);
        this.C0 = new ol60(3);
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.D0 = q7m0.a(lunVar);
        yje yjeVar = null;
        sac.T(new fnq(dtb.z(kc60Var.a(), 1), new rtq0(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), stq0.h);
        sac.T(new fnq(new va(((qe50) ouuVar2.b).b, (byte) 24), new qtq0(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), vtq0.h);
    }

    public final void A(f240 f240Var) {
        String strV = bww.V(f240Var.n());
        boolean z = f240Var instanceof z140;
        gg5 gg5Var = this.D;
        ag3 ag3Var = this.s;
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

    public final void B(f240 f240Var) {
        iz30 iz30VarM = f240Var.m();
        A(f240Var);
        int iOrdinal = iz30VarM.ordinal();
        if (iOrdinal == 11) {
            this.C.c();
        } else {
            if (iOrdinal != 13) {
                return;
            }
            this.s.c();
            b1j.v("menu_other", this.e0.f31684a, 3246L);
        }
    }

    public final void C(lr1 lr1Var) {
        sac.V(jiu0.a(this), new w6q0(1, this, xtq0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, this.x.f22085a, new meq0((Object) this, (Object) lr1Var, (yje) null, (byte) 7), 10);
    }

    public final void D(long j) {
        C(new fr1(new fs80(null, j, null, null, 0L, false, 125), null, 2));
    }

    public final void E(int i, String str) {
        boolean z = this.c.a().p0;
        boolean zO = StringsKt.O(str, "https://", false);
        i1w0 i1w0Var = this.y;
        if (zO && z) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            this.t0.getClass();
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
                this.C0.f(new btq0(str));
                return;
            }
            if (str.length() <= 0) {
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            this.u0.getClass();
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

    public final void F() {
        sac.V(jiu0.a(this), wtq0.f39754a, null, this.x.f22085a, new eho0(this, null, (byte) 2), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(zje zjeVar) {
        ltq0 ltq0Var;
        Object g0g0Var;
        if (zjeVar instanceof ltq0) {
            ltq0Var = (ltq0) zjeVar;
            int i = ltq0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ltq0Var.k = i - Integer.MIN_VALUE;
            } else {
                ltq0Var = new ltq0(this, zjeVar);
            }
        } else {
            ltq0Var = new ltq0(this, zjeVar);
        }
        Object obj = ltq0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ltq0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                o3c o3cVar = this.i0;
                ltq0Var.k = 1;
                if (o3c.p(o3cVar, false, ltq0Var, 3) == wneVar) {
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
            F();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable x(a.zje r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.mtq0
            if (r0 == 0) goto L13
            r0 = r8
            a.mtq0 r0 = (a.mtq0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.mtq0 r0 = new a.mtq0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> La7
            goto L74
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r3
        L31:
            boolean r7 = r0.j
            a.xtq0 r2 = r0.i
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> La7
            goto L57
        L39:
            a.z1x.P(r8)
            a.e0g0 r8 = a.j0g0.b     // Catch: java.lang.Throwable -> La7
            a.n4u r8 = r7.n0     // Catch: java.lang.Throwable -> La7
            boolean r8 = r8.f()     // Catch: java.lang.Throwable -> La7
            a.jqc r2 = r7.o0     // Catch: java.lang.Throwable -> La7
            r0.i = r7     // Catch: java.lang.Throwable -> La7
            r0.j = r8     // Catch: java.lang.Throwable -> La7
            r0.m = r5     // Catch: java.lang.Throwable -> La7
            java.io.Serializable r2 = r2.a(r0)     // Catch: java.lang.Throwable -> La7
            if (r2 != r1) goto L53
            goto L73
        L53:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L57:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> La7
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> La7
            if (r7 == 0) goto L65
            if (r8 == 0) goto L62
            goto L65
        L62:
            a.iun r7 = a.iun.f15405a     // Catch: java.lang.Throwable -> La7
            goto La4
        L65:
            a.ieu r8 = r2.l0     // Catch: java.lang.Throwable -> La7
            r0.i = r3     // Catch: java.lang.Throwable -> La7
            r0.j = r7     // Catch: java.lang.Throwable -> La7
            r0.m = r4     // Catch: java.lang.Throwable -> La7
            java.io.Serializable r8 = r8.e(r0)     // Catch: java.lang.Throwable -> La7
            if (r8 != r1) goto L74
        L73:
            return r1
        L74:
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> La7
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La7
            r7.<init>()     // Catch: java.lang.Throwable -> La7
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> La7
        L7f:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto La4
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> La7
            r1 = r0
            a.mz60 r1 = (a.mz60) r1     // Catch: java.lang.Throwable -> La7
            a.a570 r2 = r1.b     // Catch: java.lang.Throwable -> La7
            long r2 = a.x1x.D(r2)     // Catch: java.lang.Throwable -> La7
            a.s470 r4 = a.s470.LUCKY_WHEEL     // Catch: java.lang.Throwable -> La7
            long r4 = r4.a()     // Catch: java.lang.Throwable -> La7
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L7f
            boolean r1 = r1.f     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L7f
            r7.add(r0)     // Catch: java.lang.Throwable -> La7
            goto L7f
        La4:
            a.e0g0 r8 = a.j0g0.b     // Catch: java.lang.Throwable -> La7
            goto Lb0
        La7:
            r7 = move-exception
            a.e0g0 r8 = a.j0g0.b
            a.g0g0 r8 = new a.g0g0
            r8.<init>(r7)
            r7 = r8
        Lb0:
            a.iun r8 = a.iun.f15405a
            boolean r0 = r7 instanceof a.g0g0
            if (r0 == 0) goto Lb7
            r7 = r8
        Lb7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xtq0.x(a.zje):java.io.Serializable");
    }

    public final void y(Throwable th) {
        this.d.b(th, new ysq0(this, (byte) 0));
    }

    public final void z() {
        v3c.N(this.E0);
        this.E0 = sac.V(jiu0.a(this), ntq0.f24112a, null, this.x.f22085a, new ptq0(this, null, (byte) 0), 10);
    }
}
