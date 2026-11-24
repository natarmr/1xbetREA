package a;

import android.gov.nist.core.Separators;
import com.appsflyer.sdk_base.referrer.Payload;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class nn20 extends i3t0 {
    public static final /* synthetic */ int c1 = 0;
    public final nw20 A;
    public final cl5 A0;
    public final r4v B;
    public final chf0 B0;
    public final h3c C;
    public final cr C0;
    public final vqc D;
    public final xzp D0;
    public final phf0 E;
    public final esg0 E0;
    public final nvu F;
    public final wyu F0;
    public final zlt0 G;
    public final k7u G0;
    public final mii0 H;
    public final pyu H0;
    public final gg5 I;
    public final rxu I0;
    public final ih5 J;
    public final z7u J0;
    public final ih5 K;
    public final bbw0 K0;
    public final l7k L;
    public final vzg0 L0;
    public final x20 M;
    public final do20 M0;
    public final cmt N;
    public final f3c N0;
    public final yo4 O;
    public final r9u O0;
    public final m1e P;
    public final yox P0;
    public final sd60 Q;
    public final jru Q0;
    public final duj R;
    public final x1u R0;
    public final ctf0 S;
    public final edo S0;
    public final mne T;
    public bby T0;
    public final b8u U;
    public bby U0;
    public final ot V;
    public bby V0;
    public final f6k W;
    public bby W0;
    public final u4a X;
    public final k050 X0;
    public final i1w0 Y;
    public bby Y0;
    public final v88 Z;
    public c4m0 Z0;
    public final tmt a0;
    public c4m0 a1;
    public final nou b0;
    public boolean b1;
    public final m0u c0;
    public final ouu d0;
    public final khf0 e0;
    public final e8u f0;
    public final pj9 g0;
    public final vyt h0;
    public final lbu i0;
    public final pyu j0;
    public final q4u k0;
    public final b8u l0;
    public final yk5 m0;
    public final hru n0;
    public final m0k0 o;
    public final x0u o0;
    public final ms2 p;
    public final rou p0;
    public final g320 q;
    public final loi0 q0;
    public final nhf0 r;
    public final loi0 r0;
    public final khf0 s;
    public final g320 s0;
    public final lbu t;
    public final gud t0;
    public final dzu u;
    public final dnv u0;
    public final f3c v;
    public final vyt v0;
    public final rpt w;
    public final y3j0 w0;
    public final hsj x;
    public final mpt x0;
    public final reu y;
    public final clc y0;
    public final pru z;
    public final ouu z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public nn20(m0k0 m0k0Var, ms2 ms2Var, g320 g320Var, nhf0 nhf0Var, khf0 khf0Var, lbu lbuVar, dzu dzuVar, f3c f3cVar, rpt rptVar, hsj hsjVar, reu reuVar, pru pruVar, nw20 nw20Var, r4v r4vVar, h3c h3cVar, vqc vqcVar, phf0 phf0Var, nvu nvuVar, zlt0 zlt0Var, mii0 mii0Var, gg5 gg5Var, ih5 ih5Var, ih5 ih5Var2, l7k l7kVar, x20 x20Var, cmt cmtVar, yo4 yo4Var, m1e m1eVar, sd60 sd60Var, duj dujVar, ctf0 ctf0Var, mne mneVar, b8u b8uVar, ot otVar, f6k f6kVar, u4a u4aVar, i1w0 i1w0Var, v88 v88Var, tmt tmtVar, nou nouVar, m0u m0uVar, ouu ouuVar, khf0 khf0Var2, e8u e8uVar, pj9 pj9Var, vyt vytVar, lbu lbuVar2, pyu pyuVar, q4u q4uVar, b8u b8uVar2, yk5 yk5Var, hru hruVar, x0u x0uVar, rou rouVar, loi0 loi0Var, loi0 loi0Var2, g320 g320Var2, gud gudVar, dnv dnvVar, vyt vytVar2, y3j0 y3j0Var, mpt mptVar, clc clcVar, ouu ouuVar2, cl5 cl5Var, jc60 jc60Var, chf0 chf0Var, cr crVar, xzp xzpVar, esg0 esg0Var, uyn uynVar, wyu wyuVar, k7u k7uVar, pyu pyuVar2, rxu rxuVar, iqt iqtVar, z7u z7uVar, bbw0 bbw0Var, vzg0 vzg0Var, do20 do20Var, f3c f3cVar2, lk5 lk5Var, r9u r9uVar, yox yoxVar, jru jruVar, x1u x1uVar, edo edoVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        wyuVar.getClass();
        edoVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        byte b = 2;
        yje yjeVar = null;
        super(new h92(wyuVar, m0k0Var, zlt0Var, reuVar, ctf0Var, pruVar, iqtVar, lk5Var), cvm0.p(rwjVar, rwjVar), new idn(ctf0Var, pruVar, r9uVar, b), (yzn0) null);
        this.o = m0k0Var;
        this.p = ms2Var;
        this.q = g320Var;
        this.r = nhf0Var;
        this.s = khf0Var;
        this.t = lbuVar;
        this.u = dzuVar;
        this.v = f3cVar;
        this.w = rptVar;
        this.x = hsjVar;
        this.y = reuVar;
        this.z = pruVar;
        this.A = nw20Var;
        this.B = r4vVar;
        this.C = h3cVar;
        this.D = vqcVar;
        this.E = phf0Var;
        this.F = nvuVar;
        this.G = zlt0Var;
        this.H = mii0Var;
        this.I = gg5Var;
        this.J = ih5Var;
        this.K = ih5Var2;
        this.L = l7kVar;
        this.M = x20Var;
        this.N = cmtVar;
        this.O = yo4Var;
        this.P = m1eVar;
        this.Q = sd60Var;
        this.R = dujVar;
        this.S = ctf0Var;
        this.T = mneVar;
        this.U = b8uVar;
        this.V = otVar;
        this.W = f6kVar;
        this.X = u4aVar;
        this.Y = i1w0Var;
        this.Z = v88Var;
        this.a0 = tmtVar;
        this.b0 = nouVar;
        this.c0 = m0uVar;
        this.d0 = ouuVar;
        this.e0 = khf0Var2;
        this.f0 = e8uVar;
        this.g0 = pj9Var;
        this.h0 = vytVar;
        this.i0 = lbuVar2;
        this.j0 = pyuVar;
        this.k0 = q4uVar;
        this.l0 = b8uVar2;
        this.m0 = yk5Var;
        this.n0 = hruVar;
        this.o0 = x0uVar;
        this.p0 = rouVar;
        this.q0 = loi0Var;
        this.r0 = loi0Var2;
        this.s0 = g320Var2;
        this.t0 = gudVar;
        this.u0 = dnvVar;
        this.v0 = vytVar2;
        this.w0 = y3j0Var;
        this.x0 = mptVar;
        this.y0 = clcVar;
        this.z0 = ouuVar2;
        this.A0 = cl5Var;
        this.B0 = chf0Var;
        this.C0 = crVar;
        this.D0 = xzpVar;
        this.E0 = esg0Var;
        this.F0 = wyuVar;
        this.G0 = k7uVar;
        this.H0 = pyuVar2;
        this.I0 = rxuVar;
        this.J0 = z7uVar;
        this.K0 = bbw0Var;
        this.L0 = vzg0Var;
        this.M0 = do20Var;
        this.N0 = f3cVar2;
        this.O0 = r9uVar;
        this.P0 = yoxVar;
        this.Q0 = jruVar;
        this.R0 = x1uVar;
        this.S0 = edoVar;
        this.X0 = new k050();
        bvc bvcVarA = jiu0.a(this);
        dvj dvjVar = mneVar.b;
        sac.V(bvcVarA, new yw10(1, this, nn20.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 20), null, dvjVar, new mnu(this, null), 10);
        byte b2 = 1;
        sac.T(new fnq(jc60Var.f16260a.f11847a.c, new am20(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new am20(this, yjeVar, b));
        i3t0.L(this, new fnq(uynVar.h(), new am20(this, yjeVar, (byte) 0), (byte) 4), null, null, 3);
        i3t0.K(this, null, null, new mj20(this, yjeVar, b2), 3);
    }

    public static double D0(double d, double d2, double d3, boolean z) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(d2));
        BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(d3));
        BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimal2);
        bigDecimalAdd.getClass();
        return (bigDecimalAdd.compareTo(bigDecimal3) <= 0 || z) ? bigDecimalAdd.doubleValue() : d3;
    }

    public static BigDecimal M(BigDecimal bigDecimal, xyc xycVar) {
        BigDecimal bigDecimal2 = xycVar.f41701a;
        BigDecimal bigDecimal3 = xycVar.d;
        BigDecimal bigDecimal4 = xycVar.e;
        if (bigDecimal2.equals(new BigDecimal(String.valueOf(0.0d)))) {
            return xycVar.b;
        }
        if (bigDecimal.compareTo(bigDecimal4) > 0 || bigDecimal.compareTo(bigDecimal3) < 0) {
            return bigDecimal.compareTo(bigDecimal4) > 0 ? bigDecimal4 : bigDecimal3;
        }
        return bigDecimal;
    }

    public static double N(vw6 vw6Var) {
        double d = vw6Var.f38133a;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(vw6Var.c));
        double d2 = vw6Var.d;
        BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(d2));
        BigDecimal bigDecimal4 = new BigDecimal(String.valueOf(vw6Var.b()));
        if (d == -1.0d) {
            return vw6Var.b;
        }
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
        bigDecimalSubtract.getClass();
        if (bigDecimalSubtract.compareTo(bigDecimal3) < 0) {
            return d2;
        }
        if (bigDecimal.compareTo(bigDecimal4) > 0) {
            return vw6Var.b();
        }
        BigDecimal bigDecimalSubtract2 = bigDecimal.subtract(bigDecimal2);
        bigDecimalSubtract2.getClass();
        return bigDecimalSubtract2.doubleValue();
    }

    public static double O(vw6 vw6Var) {
        double d = vw6Var.f38133a;
        if (d != -1.0d) {
            return D0(d, vw6Var.c, vw6Var.b(), vw6Var.m);
        }
        boolean z = vw6Var.h;
        double d2 = vw6Var.b;
        return z ? d2 : D0(d2, vw6Var.c, vw6Var.b(), vw6Var.m);
    }

    public static double Q(float f, vw6 vw6Var) {
        double d = vw6Var.d;
        double dB = vw6Var.b();
        BigDecimal scale = new BigDecimal(((((double) f) / 100.0d) * (dB - d)) + d).setScale(2, RoundingMode.HALF_UP);
        scale.getClass();
        return l1e0.b(scale.doubleValue(), d, dB);
    }

    public static boolean S(String str, BigDecimal bigDecimal) {
        BigDecimal bigDecimalH = kotlin.text.b.h(str);
        return (bigDecimalH == null || Intrinsics.d(bigDecimal, BigDecimal.ZERO) || bigDecimalH.compareTo(bigDecimal) <= 0) ? false : true;
    }

    public static a8q0 W(a8q0 a8q0Var) {
        String strP = twn.p("[^0-9.]", a8q0Var.f440a.b, "");
        return strP.length() == 0 ? new a8q0("", 0L, 6) : a8q0.b(a8q0Var, strP, 0L, 6);
    }

    public static a8q0 X(a8q0 a8q0Var, boolean z, BigDecimal bigDecimal, int i, int i2) {
        long jE;
        String plainString = z ? bigDecimal.toPlainString() : a8q0Var.f440a.b;
        plainString.getClass();
        boolean z2 = plainString.length() > 0 && plainString.charAt(0) == '.';
        if (z2) {
            plainString = "0".concat(plainString);
        } else {
            int iU = StringsKt.U('.', 0, 6, plainString);
            if (iU != -1) {
                int i3 = iU + 1;
                plainString = ttm0.L(i3, plainString).concat(kotlin.text.c.r(plainString.substring(i3), Separators.DOT, "", false));
            }
        }
        if (StringsKt.P(plainString, '.')) {
            String strQ0 = StringsKt.q0(plainString, '.');
            String strN0 = StringsKt.n0(plainString, '.');
            if (strQ0.length() > i) {
                strQ0 = ttm0.L(i, strQ0);
            }
            if (strN0.length() > i2) {
                strN0 = ttm0.L(i2, strN0);
            }
            plainString = kng0.l(strQ0, Separators.DOT, strN0);
        } else if (plainString.length() > i) {
            plainString = ttm0.L(i, plainString);
        }
        if (plainString.length() > 1 && plainString.charAt(0) == '0' && plainString.charAt(1) != '.') {
            plainString = plainString.substring(1);
        }
        if (z && kotlin.text.c.n(plainString, ".0", false)) {
            plainString = ttm0.H(2, plainString);
        }
        if (z || z2) {
            int length = plainString.length();
            jE = s7n0.e(length, length);
        } else {
            jE = a8q0Var.b;
        }
        return a8q0.b(a8q0Var, plainString, jE, 4);
    }

    public static j43 Y(String str, String str2, czc czcVar) {
        c0d c0dVar;
        int iOrdinal = czcVar.ordinal();
        if (iOrdinal == 0) {
            c0dVar = c0d.f3518a;
        } else if (iOrdinal == 1) {
            c0dVar = c0d.b;
        } else if (iOrdinal == 2) {
            c0dVar = c0d.c;
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return null;
            }
            c0dVar = c0d.d;
        }
        return new j43(str, str2, c0dVar, false);
    }

    public static lpm i0() {
        return new lpm(opm.f25648a, new gpm());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A0(long j, ms2 ms2Var, long j2, long j3, long j4, zje zjeVar) {
        qm20 qm20Var;
        j1g j1gVar;
        if (zjeVar instanceof qm20) {
            qm20Var = (qm20) zjeVar;
            int i = qm20Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                qm20Var.p = i - Integer.MIN_VALUE;
            } else {
                qm20Var = new qm20(this, zjeVar);
            }
        } else {
            qm20Var = new qm20(this, zjeVar);
        }
        Object objB = qm20Var.n;
        wne wneVar = wne.f39444a;
        int i2 = qm20Var.p;
        if (i2 == 0) {
            z1x.P(objB);
            qm20Var.m = ms2Var;
            qm20Var.i = j;
            qm20Var.j = j2;
            qm20Var.k = j3;
            qm20Var.l = j4;
            qm20Var.p = 1;
            objB = this.C.b(j2, qm20Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j4 = qm20Var.l;
            j3 = qm20Var.k;
            j2 = qm20Var.j;
            j = qm20Var.i;
            ms2Var = qm20Var.m;
            z1x.P(objB);
        }
        boolean zBooleanValue = ((Boolean) objB).booleanValue();
        if (j2 == 40) {
            j2 = j3;
        }
        l1g l1gVar = l1g.OPEN_SCREEN;
        if (j2 == 40) {
            j1gVar = j1g.REAL;
        } else {
            j1gVar = zBooleanValue ? j1g.SYNTHETIC : j1g.CYBER;
        }
        if (ms2Var != null) {
            boolean z = ms2Var instanceof lq2;
            vqc vqcVar = this.D;
            if (z || (ms2Var instanceof rq2) || (ms2Var instanceof uq2) || (ms2Var instanceof sq2) || (ms2Var instanceof jq2) || (ms2Var instanceof kq2) || (ms2Var instanceof mq2) || (ms2Var instanceof nq2) || (ms2Var instanceof tq2)) {
                vqcVar.k(pzb.C(new gi20(j, ms2Var, j2, j1gVar, j4, (byte) 0)));
            } else {
                long j5 = j4;
                if ((ms2Var instanceof kr2) || (ms2Var instanceof lr2) || (ms2Var instanceof jr2) || (ms2Var instanceof fr2)) {
                    if (zBooleanValue) {
                        vqcVar.k(pzb.C(new gi20(j, ms2Var, j2, j1gVar, j5, (byte) 1)));
                    }
                }
            }
            return Unit.f46060a;
        }
        return Unit.f46060a;
    }

    public final void B0() {
        pek0 pek0Var = pek0.f26859a;
        ctf0 ctf0Var = this.S;
        G(new qc20(new xdk0(pek0Var, ctf0Var.b.a(R.string.no_connection_title_with_hyphen, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.no_connection_description, Arrays.copyOf(new Object[0], 0)), null, null, null, 120)));
    }

    public final void C0() {
        bby bbyVar = this.Y0;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.Y0 = sac.f0(jiu0.a(this), 500L, TimeUnit.MILLISECONDS, this.T.f22085a, vm20.f37656a, new z210(this, yjeVar, (byte) 11), 32);
    }

    public final void E0(a8q0 a8q0Var) {
        gx4 gx4Var = ((b820) D()).f;
        if (gx4Var == null) {
            return;
        }
        H(new k110((Object) gx4Var, (Object) a8q0Var, (byte) 17));
    }

    public final void F0(double d) {
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(d, p3u0.g);
        int length = strC.length();
        E0(new a8q0(strC, s7n0.e(length, length), 4));
    }

    public final void G0(BigDecimal bigDecimal) {
        Object value;
        b820 b820Var;
        gx4 gx4Var;
        String plainString = bigDecimal.toPlainString();
        plainString.getClass();
        int length = plainString.length();
        a8q0 a8q0Var = new a8q0(plainString, s7n0.e(length, length), 4);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            b820Var = (b820) value;
            this.f.getClass();
            gx4Var = b820Var.f;
        } while (!p7m0Var.m(value, b820.a(b820Var, null, null, null, null, null, gx4Var != null ? gx4.a(gx4Var, a8q0Var, null, null, null, null, 30) : null, null, false, false, false, false, false, 8159)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H0(ql5 ql5Var, zje zjeVar) {
        ym20 ym20Var;
        if (zjeVar instanceof ym20) {
            ym20Var = (ym20) zjeVar;
            int i = ym20Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ym20Var.l = i - Integer.MIN_VALUE;
            } else {
                ym20Var = new ym20(this, zjeVar);
            }
        } else {
            ym20Var = new ym20(this, zjeVar);
        }
        Object objA = ym20Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ym20Var.l;
        if (i2 == 0) {
            z1x.P(objA);
            ym20Var.i = ql5Var;
            ym20Var.l = 1;
            objA = this.X.a(ym20Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ql5Var = ym20Var.i;
            z1x.P(objA);
        }
        H(new ns6(ql5Var, ((Boolean) objA).booleanValue(), (byte) 2));
        return Unit.f46060a;
    }

    public final bby I0(Function1 function1) {
        return sac.V(jiu0.a(this), new yw10(1, this, nn20.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, this.T.b, new mq10((Object) this, (Object) function1, (yje) null, (byte) 12), 10);
    }

    public final void J0() {
        bby bbyVar = this.U0;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.V0;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        this.U0 = i3t0.K(this, null, null, new mj20(this, yjeVar, (byte) 4), 3);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (r2 == r4) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K0(a.cit0 r26, boolean r27, double r28, a.zje r30) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nn20.K0(a.cit0, boolean, double, a.zje):java.lang.Object");
    }

    public final void L0(double d) {
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(d, p3u0.g);
        int length = strC.length();
        H(new w1y(new a8q0(strC, s7n0.e(length, length), 4), (byte) 4));
    }

    public final void M0() {
        yje yjeVar = null;
        if (!U()) {
            bby bbyVar = this.Y0;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            byte b = 5;
            H(new fd20(b));
            sac.V(jiu0.a(this), new yw10(1, this, nn20.class, "handlePossibleWinThrowable", "handlePossibleWinThrowable(Ljava/lang/Throwable;)V", 0, (byte) 28), null, this.T.b, new gk20(this, yjeVar, b), 10);
            return;
        }
        fo7 fo7Var = ((b820) D()).b;
        byte b2 = 2;
        byte b3 = 0;
        byte b4 = 4;
        byte b5 = 12;
        if (fo7Var.equals(co7.b)) {
            if (s0()) {
                i3t0.K(this, null, null, new dm4(this, new mt00((Object) this, yjeVar, b5), yjeVar, b4), 3);
                return;
            }
            bby bbyVar2 = this.W0;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            bby bbyVar3 = this.Y0;
            if (bbyVar3 != null) {
                bbyVar3.cancel(null);
            }
            H(new uh20(this, b3));
            H(new uh20(this, b2));
            return;
        }
        if (!fo7Var.equals(xn7.b)) {
            if (fo7Var.equals(zn7.b)) {
                return;
            }
            t9f.b();
        } else {
            if (o0()) {
                i3t0.K(this, null, null, new dm4(this, new gk20(this, yjeVar, b3), yjeVar, b4), 3);
                return;
            }
            bby bbyVar4 = this.W0;
            if (bbyVar4 != null) {
                bbyVar4.cancel(null);
            }
            bby bbyVar5 = this.Y0;
            if (bbyVar5 != null) {
                bbyVar5.cancel(null);
            }
            H(new fd20(b5));
            H(new uh20(this, b2));
        }
    }

    public final double P(double d, double d2) {
        cit0 cit0VarG = this.w.g();
        boolean z = cit0VarG.T && this.G0.f17841a.b() == jvn.f;
        double d3 = cit0VarG.N;
        q4f q4fVar = q4f.c;
        this.A0.getClass();
        return cl5.t(d, d2, d3, z, 0, q4fVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R(boolean z, m97 m97Var, zje zjeVar) {
        cj20 cj20Var;
        if (zjeVar instanceof cj20) {
            cj20Var = (cj20) zjeVar;
            int i = cj20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cj20Var.k = i - Integer.MIN_VALUE;
            } else {
                cj20Var = new cj20(this, zjeVar);
            }
        } else {
            cj20Var = new cj20(this, zjeVar);
        }
        Object objT = cj20Var.i;
        Object obj = wne.f39444a;
        int i2 = cj20Var.k;
        if (i2 == 0) {
            z1x.P(objT);
            if (this.z.a().f32117a.f12063a.i && !z && m97Var.u != 707) {
                cj20Var.k = 1;
                objT = T(cj20Var);
                if (objT == obj) {
                    return obj;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objT);
        boolean z2 = ((Boolean) objT).booleanValue() ? false : true;
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T(zje zjeVar) {
        fj20 fj20Var;
        if (zjeVar instanceof fj20) {
            fj20Var = (fj20) zjeVar;
            int i = fj20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fj20Var.k = i - Integer.MIN_VALUE;
            } else {
                fj20Var = new fj20(this, zjeVar);
            }
        } else {
            fj20Var = new fj20(this, zjeVar);
        }
        Object objA = fj20Var.i;
        wne wneVar = wne.f39444a;
        int i2 = fj20Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            fj20Var.k = 1;
            objA = this.v.a(fj20Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return Boolean.valueOf(((m97) objA).w instanceof xfa0);
    }

    public final boolean U() {
        nwo0 nwo0VarC = this.y.c();
        if (nwo0VarC.f24244a || !Intrinsics.d(this.l0.b(), duw.d)) {
            return true;
        }
        return ((b820) D()).j && nwo0VarC.b && ((ovo0) this.H0.f27815a).f25934a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object V(dx6 dx6Var, double d, xdr xdrVar, zje zjeVar) throws Throwable {
        jj20 jj20Var;
        xdr xdrVar2;
        double d2;
        String str;
        double d3 = d;
        if (zjeVar instanceof jj20) {
            jj20Var = (jj20) zjeVar;
            int i = jj20Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                jj20Var.o = i - Integer.MIN_VALUE;
            } else {
                jj20Var = new jj20(this, zjeVar);
            }
        } else {
            jj20Var = new jj20(this, zjeVar);
        }
        jj20 jj20Var2 = jj20Var;
        Object objK0 = jj20Var2.m;
        Object obj = wne.f39444a;
        int i2 = jj20Var2.o;
        if (i2 == 0) {
            z1x.P(objK0);
            vw6 vw6Var = dx6Var.b;
            double d4 = vw6Var.f38133a;
            String str2 = vw6Var.f;
            double dC = vw6Var.c() * d4;
            double d5 = ((b820) D()).d.f31171a.b.p ? d3 / 2.0d : d3;
            xdrVar2 = xdrVar;
            jj20Var2.i = xdrVar2;
            jj20Var2.j = str2;
            jj20Var2.k = d3;
            jj20Var2.l = d4;
            jj20Var2.o = 1;
            objK0 = k0(dC, d5, jj20Var2);
            if (objK0 == obj) {
                return obj;
            }
            d2 = d4;
            str = str2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d2 = jj20Var2.l;
            d3 = jj20Var2.k;
            str = jj20Var2.j;
            xdr xdrVar3 = jj20Var2.i;
            z1x.P(objK0);
            xdrVar2 = xdrVar3;
        }
        hxu hxuVar = (hxu) objK0;
        duw duwVarB = this.l0.b();
        double dP = P(d2, d3);
        int i3 = duwVarB.f6716a;
        double d6 = duwVarB.b;
        double d7 = duwVarB.c;
        this.m0.getClass();
        txu txuVarH0 = ozb.h0(hxuVar, yk5.i(dP, i3, d6, d7), duwVarB.f6716a);
        Object objR = (txuVarH0.g.b > 0.0d || txuVarH0.d.b > 0.0d || txuVarH0.f34720a.b > 0.0d) ? rsm0.r(txuVarH0, str, this.S) : iun.f15405a;
        String strG = d3 > 0.0d ? ydx.G(P(d2, d3), str, hxuVar, txuVarH0) : "";
        bby bbyVar = this.Y0;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        xdrVar2.F(txuVarH0, objR, strG);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object Z(m97 m97Var, zje zjeVar) {
        rj20 rj20Var;
        if (zjeVar instanceof rj20) {
            rj20Var = (rj20) zjeVar;
            int i = rj20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                rj20Var.k = i - Integer.MIN_VALUE;
            } else {
                rj20Var = new rj20(this, zjeVar);
            }
        } else {
            rj20Var = new rj20(this, zjeVar);
        }
        rj20 rj20Var2 = rj20Var;
        Object objF = rj20Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = rj20Var2.k;
        if (i2 == 0) {
            z1x.P(objF);
            boolean z = m97Var.w instanceof xfa0;
            m0k0 m0k0Var = this.o;
            long j = m0k0Var.f20959a;
            Long l = new Long(m0k0Var.B);
            rj20Var2.k = 1;
            objF = this.d0.F(z, j, l, rj20Var2);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objF);
        }
        return new ld5((String) objF, !h97.A(this.F0, uaq0.f35345a) ? R.drawable.bet_game_info_dark_them_bg : R.drawable.bet_game_info_light_theme_bg);
    }

    public final czc a0(double d, double d2, boolean z) {
        m97 m97Var;
        nb7 nb7Var = (nb7) this.N0.f8854a.b;
        if (nb7Var.b || ((m97Var = (m97) nb7Var.f23225a.getValue()) != null && m97Var.d)) {
            return czc.d;
        }
        if (z) {
            return czc.f5217a;
        }
        if (d == 0.0d || d2 == 0.0d) {
            return czc.f5217a;
        }
        if (d > d2) {
            return czc.c;
        }
        return d < d2 ? czc.b : czc.f5217a;
    }

    public final f0d b0() {
        int i;
        f0d f0dVar = ((b820) D()).f2138a.e;
        ctf0 ctf0Var = this.S;
        String strA = ctf0Var.b.a(R.string.coef_change_medium_custom, Arrays.copyOf(new Object[0], 0));
        int iOrdinal = this.h0.a().ordinal();
        if (iOrdinal == 0) {
            i = R.string.to_confirm;
        } else if (iOrdinal == 1) {
            i = R.string.to_any_accept;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return null;
            }
            i = R.string.to_up_accept;
        }
        String strA2 = ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0));
        boolean z = ((b820) D()).h;
        f0dVar.getClass();
        return new f0d(strA, strA2, z);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:49:0x011c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0125  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0140  */
    /* JADX WARN: Code duplicated, block: B:57:0x0145  */
    /* JADX WARN: Code duplicated, block: B:59:0x0148  */
    /* JADX WARN: Code duplicated, block: B:62:0x014c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object c0(m97 m97Var, zje zjeVar) {
        tj20 tj20Var;
        boolean zB;
        Object objT;
        wbs0 wbs0Var;
        m97 m97Var2;
        boolean z;
        boolean zBooleanValue;
        Object objC;
        boolean z2;
        wbs0 wbs0Var2;
        m97 m97Var3;
        fho fhoVar;
        long j;
        String str;
        int length;
        ctf0 ctf0Var;
        vw20 tw20Var;
        m5n0 m5n0Var;
        String str2;
        String str3;
        m97 m97Var4 = m97Var;
        if (zjeVar instanceof tj20) {
            tj20Var = (tj20) zjeVar;
            int i = tj20Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                tj20Var.o = i - Integer.MIN_VALUE;
            } else {
                tj20Var = new tj20(this, zjeVar);
            }
        } else {
            tj20Var = new tj20(this, zjeVar);
        }
        Object obj = tj20Var.m;
        Object obj2 = wne.f39444a;
        int i2 = tj20Var.o;
        m0k0 m0k0Var = this.o;
        if (i2 == 0) {
            z1x.P(obj);
            zB = this.g0.b(new pbs0(xcm0.v(m0k0Var), m97Var4));
            tj20Var.i = m97Var4;
            tj20Var.k = zB;
            tj20Var.o = 1;
            objT = T(tj20Var);
            if (objT != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            boolean z3 = tj20Var.k;
            m97 m97Var5 = tj20Var.i;
            z1x.P(obj);
            zB = z3;
            m97Var4 = m97Var5;
            objT = obj;
        } else {
            if (i2 == 2) {
                z = tj20Var.k;
                wbs0Var = tj20Var.j;
                m97Var2 = tj20Var.i;
                z1x.P(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                long j2 = m97Var2.i;
                tj20Var.i = m97Var2;
                tj20Var.j = wbs0Var;
                tj20Var.k = z;
                tj20Var.l = zBooleanValue;
                tj20Var.o = 3;
                objC = this.J0.c(j2, tj20Var);
                if (objC != obj2) {
                    obj = objC;
                    z2 = zBooleanValue;
                    wbs0Var2 = wbs0Var;
                    m97Var3 = m97Var2;
                }
                return obj2;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = tj20Var.l;
            wbs0 wbs0Var3 = tj20Var.j;
            m97Var3 = tj20Var.i;
            z1x.P(obj);
            wbs0Var2 = wbs0Var3;
        }
        if (((Boolean) obj).booleanValue()) {
            fhoVar = fho.b;
        } else if (z2) {
            fhoVar = fho.c;
        } else {
            fhoVar = fho.f9552a;
        }
        fho fhoVar2 = fhoVar;
        String str4 = m97Var3.o;
        j = m97Var3.h;
        str = m97Var3.p;
        length = str4.length();
        ctf0Var = this.S;
        if (length > 0) {
            tw20Var = new uw20(ctf0Var.b.a(R.string.bet_name, Arrays.copyOf(new Object[]{str}, 1)), m97Var3.o, j);
        } else {
            tw20Var = new tw20(ctf0Var.b.a(R.string.bet_name, Arrays.copyOf(new Object[]{str}, 1)), j);
        }
        vw20 vw20Var = tw20Var;
        if (m0k0Var.t.length() > 0) {
            m5n0Var = new m5n0(m0k0Var.t);
        } else {
            m5n0Var = new m5n0(ctf0Var.b.a(R.string.main_game, Arrays.copyOf(new Object[0], 0)));
        }
        str2 = m97Var3.m;
        if (z2) {
            str3 = null;
        } else {
            str3 = str2;
        }
        if (str3 == null) {
            str3 = "";
        }
        String str5 = z2 ? null : str2;
        return new jur(vw20Var, m5n0Var, new j43(str3, str5 != null ? str5 : "", c0d.f3518a, false), wbs0Var2, fhoVar2);
        if (((Boolean) objT).booleanValue()) {
            wbs0Var = wbs0.IS_NOT_VISIBLE;
        } else {
            wbs0Var = zB ? wbs0.IS_TRACKED : wbs0.IS_NOT_TRACKED;
        }
        tj20Var.i = m97Var4;
        tj20Var.j = wbs0Var;
        tj20Var.k = zB;
        tj20Var.o = 2;
        Object objR0 = r0(m97Var4, tj20Var);
        if (objR0 != obj2) {
            m97Var2 = m97Var4;
            z = zB;
            obj = objR0;
            zBooleanValue = ((Boolean) obj).booleanValue();
            long j3 = m97Var2.i;
            tj20Var.i = m97Var2;
            tj20Var.j = wbs0Var;
            tj20Var.k = z;
            tj20Var.l = zBooleanValue;
            tj20Var.o = 3;
            objC = this.J0.c(j3, tj20Var);
            if (objC != obj2) {
                obj = objC;
                z2 = zBooleanValue;
                wbs0Var2 = wbs0Var;
                m97Var3 = m97Var2;
                if (((Boolean) obj).booleanValue()) {
                    fhoVar = fho.b;
                } else if (z2) {
                    fhoVar = fho.c;
                } else {
                    fhoVar = fho.f9552a;
                }
                fho fhoVar3 = fhoVar;
                String str6 = m97Var3.o;
                j = m97Var3.h;
                str = m97Var3.p;
                length = str6.length();
                ctf0Var = this.S;
                if (length > 0) {
                    tw20Var = new uw20(ctf0Var.b.a(R.string.bet_name, Arrays.copyOf(new Object[]{str}, 1)), m97Var3.o, j);
                } else {
                    tw20Var = new tw20(ctf0Var.b.a(R.string.bet_name, Arrays.copyOf(new Object[]{str}, 1)), j);
                }
                vw20 vw20Var2 = tw20Var;
                if (m0k0Var.t.length() > 0) {
                    m5n0Var = new m5n0(m0k0Var.t);
                } else {
                    m5n0Var = new m5n0(ctf0Var.b.a(R.string.main_game, Arrays.copyOf(new Object[0], 0)));
                }
                str2 = m97Var3.m;
                if (z2) {
                    str3 = str2;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "";
                }
                if (z2) {
                }
                return new jur(vw20Var2, m5n0Var, new j43(str3, str5 != null ? str5 : "", c0d.f3518a, false), wbs0Var2, fhoVar3);
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00fe A[PHI: r3 r4 r5 r6 r7 r9 r15
  0x00fe: PHI (r3v7 boolean) = (r3v6 boolean), (r3v17 boolean) binds: [B:30:0x00fb, B:18:0x004c] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r4v4 java.lang.Object) = (r4v3 java.lang.Object), (r4v14 java.lang.Object) binds: [B:30:0x00fb, B:18:0x004c] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r5v6 java.lang.String) = (r5v5 java.lang.String), (r5v14 java.lang.String) binds: [B:30:0x00fb, B:18:0x004c] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r6v4 java.lang.String) = (r6v3 java.lang.String), (r6v11 java.lang.String) binds: [B:30:0x00fb, B:18:0x004c] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r7v4 a.m97) = (r7v3 a.m97), (r7v14 a.m97) binds: [B:30:0x00fb, B:18:0x004c] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r9v13 boolean) = (r9v12 boolean), (r9v16 boolean) binds: [B:30:0x00fb, B:18:0x004c] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r15v4 a.m0k0) = (r15v3 a.m0k0), (r15v9 a.m0k0) binds: [B:30:0x00fb, B:18:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0106  */
    /* JADX WARN: Code duplicated, block: B:35:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x010b  */
    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    /* JADX WARN: Code duplicated, block: B:40:0x011c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0138  */
    /* JADX WARN: Code duplicated, block: B:52:0x0154 A[PHI: r3 r4 r5 r6 r7
  0x0154: PHI (r3v9 boolean) = (r3v7 boolean), (r3v12 boolean) binds: [B:39:0x011a, B:51:0x0151] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r4v11 a.jye) = (r4v9 a.jye), (r4v13 a.jye) binds: [B:39:0x011a, B:51:0x0151] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r5v7 java.lang.String) = (r5v6 java.lang.String), (r5v10 java.lang.String) binds: [B:39:0x011a, B:51:0x0151] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v8 java.lang.String) binds: [B:39:0x011a, B:51:0x0151] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r7v7 boolean) = (r7v6 boolean), (r7v10 boolean) binds: [B:39:0x011a, B:51:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x015e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0160  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r19v0, types: [a.nn20] */
    public final Object d0(m97 m97Var, zje zjeVar) {
        uj20 uj20Var;
        boolean z;
        m97 m97Var2;
        String str;
        Object objA;
        m97 m97Var3;
        String str2;
        boolean zBooleanValue;
        Object objT;
        jye jyeVar;
        boolean z2;
        long j;
        boolean z3;
        jye jyeVar2;
        int i;
        int i2;
        ?? r0;
        jye jyeVar3;
        boolean z4;
        if (zjeVar instanceof uj20) {
            uj20Var = (uj20) zjeVar;
            int i3 = uj20Var.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uj20Var.r = i3 - Integer.MIN_VALUE;
            } else {
                uj20Var = new uj20(this, zjeVar);
            }
        } else {
            uj20Var = new uj20(this, zjeVar);
        }
        uj20 uj20Var2 = uj20Var;
        Object objP = uj20Var2.p;
        wne wneVar = wne.f39444a;
        int i4 = uj20Var2.r;
        m0k0 m0k0Var = this.o;
        if (i4 == 0) {
            z1x.P(objP);
            boolean z5 = m0k0Var.x;
            long j2 = m0k0Var.f20959a;
            long j3 = m0k0Var.B;
            boolean z6 = m0k0Var.h1;
            uj20Var2.i = m97Var;
            uj20Var2.m = z5;
            uj20Var2.r = 1;
            Object objC = this.e0.C(j2, j3, uj20Var2, z6);
            if (objC != wneVar) {
                z = z5;
                objP = objC;
                m97Var2 = m97Var;
            }
            return wneVar;
        }
        if (i4 == 1) {
            z = uj20Var2.m;
            m97Var2 = uj20Var2.i;
            z1x.P(objP);
        } else {
            if (i4 == 2) {
                z = uj20Var2.m;
                str2 = uj20Var2.k;
                str = uj20Var2.j;
                m97Var3 = uj20Var2.i;
                z1x.P(objP);
                objA = objP;
                m0k0Var = m0k0Var;
                zBooleanValue = ((Boolean) objA).booleanValue();
                uj20Var2.i = m97Var3;
                uj20Var2.j = str;
                uj20Var2.k = str2;
                uj20Var2.m = z;
                uj20Var2.n = zBooleanValue;
                uj20Var2.r = 3;
                objT = T(uj20Var2);
                if (objT != wneVar) {
                    if (((Boolean) objT).booleanValue()) {
                        jyeVar = jye.INVISIBLE;
                    } else if (zBooleanValue) {
                        jyeVar = jye.NOT_ADDED_TO_COUPON;
                    } else {
                        jyeVar = jye.ADDED_TO_COUPON;
                    }
                    z2 = m97Var3.w instanceof yfa0;
                    j = m0k0Var.f20959a;
                    if (j != 40) {
                        iun iunVar = iun.f15405a;
                        uj20Var2.i = null;
                        uj20Var2.j = str;
                        uj20Var2.k = str2;
                        uj20Var2.l = jyeVar;
                        uj20Var2.m = z;
                        uj20Var2.n = zBooleanValue;
                        uj20Var2.o = z2 ? 1 : 0;
                        uj20Var2.r = 4;
                        objP = this.K0.p(j, uj20Var2, iunVar);
                        if (objP != wneVar) {
                            z3 = z;
                            jyeVar2 = jyeVar;
                            i = z2 ? 1 : 0;
                        }
                    } else {
                        i2 = R.drawable.ic_glyph_cyber_gamepad;
                        r0 = z2;
                        jyeVar3 = jyeVar;
                    }
                    String str3 = str;
                    String str4 = str2;
                    int i5 = i2;
                    if (r0 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    return new htv(z4, z, str3, i5, str4, jyeVar3);
                }
                return wneVar;
            }
            if (i4 == 3) {
                boolean z7 = uj20Var2.n;
                boolean z8 = uj20Var2.m;
                String str5 = uj20Var2.k;
                String str6 = uj20Var2.j;
                m97 m97Var4 = uj20Var2.i;
                z1x.P(objP);
                zBooleanValue = z7;
                z = z8;
                str2 = str5;
                str = str6;
                m97Var3 = m97Var4;
                m0k0Var = m0k0Var;
                objT = objP;
                if (((Boolean) objT).booleanValue()) {
                    jyeVar = jye.INVISIBLE;
                } else if (zBooleanValue) {
                    jyeVar = jye.NOT_ADDED_TO_COUPON;
                } else {
                    jyeVar = jye.ADDED_TO_COUPON;
                }
                z2 = m97Var3.w instanceof yfa0;
                j = m0k0Var.f20959a;
                if (j != 40) {
                    iun iunVar2 = iun.f15405a;
                    uj20Var2.i = null;
                    uj20Var2.j = str;
                    uj20Var2.k = str2;
                    uj20Var2.l = jyeVar;
                    uj20Var2.m = z;
                    uj20Var2.n = zBooleanValue;
                    uj20Var2.o = z2 ? 1 : 0;
                    uj20Var2.r = 4;
                    objP = this.K0.p(j, uj20Var2, iunVar2);
                    if (objP != wneVar) {
                        z3 = z;
                        jyeVar2 = jyeVar;
                        i = z2 ? 1 : 0;
                    }
                    return wneVar;
                }
                i2 = R.drawable.ic_glyph_cyber_gamepad;
                r0 = z2;
                jyeVar3 = jyeVar;
                String str7 = str;
                String str8 = str2;
                int i6 = i2;
                if (r0 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return new htv(z4, z, str7, i6, str8, jyeVar3);
            }
            if (i4 != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = uj20Var2.o;
            z3 = uj20Var2.m;
            jyeVar2 = uj20Var2.l;
            str2 = uj20Var2.k;
            str = uj20Var2.j;
            z1x.P(objP);
            m0k0Var = m0k0Var;
            i = i7;
        }
        if (!((Boolean) objP).booleanValue() || m0k0Var.h1) {
            z2 = i == true ? 1 : 0;
            jyeVar = jyeVar2;
            z = z3;
            i2 = R.drawable.ic_glyph_cyber_gamepad;
            r0 = z2;
            jyeVar3 = jyeVar;
        } else {
            i2 = R.drawable.ic_glyph_category_new;
            jyeVar3 = jyeVar2;
            z = z3;
            r0 = i;
        }
        String str9 = str;
        String str10 = str2;
        int i8 = i2;
        if (r0 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new htv(z4, z, str9, i8, str10, jyeVar3);
        str = (String) objP;
        znq0 znq0Var = new znq0(m0k0Var.y);
        rdj rdjVar = rdj.f30294a;
        String strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(this.S.h()), false, 56);
        ru6 ru6VarD0 = xia0.d0(m97Var2, phu0.Y(this.p).f12022a);
        uj20Var2.i = m97Var2;
        uj20Var2.j = str;
        uj20Var2.k = strG;
        uj20Var2.m = z;
        uj20Var2.r = 2;
        objA = this.f0.a(ru6VarD0, uj20Var2);
        if (objA != wneVar) {
            m97Var3 = m97Var2;
            str2 = strG;
            zBooleanValue = ((Boolean) objA).booleanValue();
            uj20Var2.i = m97Var3;
            uj20Var2.j = str;
            uj20Var2.k = str2;
            uj20Var2.m = z;
            uj20Var2.n = zBooleanValue;
            uj20Var2.r = 3;
            objT = T(uj20Var2);
            if (objT != wneVar) {
                if (((Boolean) objT).booleanValue()) {
                    jyeVar = jye.INVISIBLE;
                } else if (zBooleanValue) {
                    jyeVar = jye.NOT_ADDED_TO_COUPON;
                } else {
                    jyeVar = jye.ADDED_TO_COUPON;
                }
                z2 = m97Var3.w instanceof yfa0;
                j = m0k0Var.f20959a;
                if (j != 40) {
                    iun iunVar3 = iun.f15405a;
                    uj20Var2.i = null;
                    uj20Var2.j = str;
                    uj20Var2.k = str2;
                    uj20Var2.l = jyeVar;
                    uj20Var2.m = z;
                    uj20Var2.n = zBooleanValue;
                    uj20Var2.o = z2 ? 1 : 0;
                    uj20Var2.r = 4;
                    objP = this.K0.p(j, uj20Var2, iunVar3);
                    if (objP != wneVar) {
                        z3 = z;
                        jyeVar2 = jyeVar;
                        i = z2 ? 1 : 0;
                        if (((Boolean) objP).booleanValue()) {
                        }
                        z2 = i == true ? 1 : 0;
                        jyeVar = jyeVar2;
                        z = z3;
                        i2 = R.drawable.ic_glyph_cyber_gamepad;
                        r0 = z2;
                        jyeVar3 = jyeVar;
                    }
                } else {
                    i2 = R.drawable.ic_glyph_cyber_gamepad;
                    r0 = z2;
                    jyeVar3 = jyeVar;
                }
                String str11 = str;
                String str12 = str2;
                int i9 = i2;
                if (r0 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return new htv(z4, z, str11, i9, str12, jyeVar3);
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e0(m97 m97Var, zje zjeVar) {
        vj20 vj20Var;
        if (zjeVar instanceof vj20) {
            vj20Var = (vj20) zjeVar;
            int i = vj20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vj20Var.k = i - Integer.MIN_VALUE;
            } else {
                vj20Var = new vj20(this, zjeVar);
            }
        } else {
            vj20Var = new vj20(this, zjeVar);
        }
        Object objR0 = vj20Var.i;
        Object obj = wne.f39444a;
        int i2 = vj20Var.k;
        if (i2 == 0) {
            z1x.P(objR0);
            vj20Var.k = 1;
            objR0 = r0(m97Var, vj20Var);
            if (objR0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objR0);
        }
        if (!((Boolean) objR0).booleanValue()) {
            return null;
        }
        c0d c0dVar = c0d.f3518a;
        return new g680(new j43("", "", c0dVar, true), new j43("", "", c0dVar, true));
    }

    public final boolean f0() {
        return this.z.a().f32117a.f12063a.h && this.G.k() && !this.o.x;
    }

    public final double g0(double d) {
        if (((b820) D()).d.f31171a.b.p) {
            double d2 = this.w.g().e0;
            if (d2 != 0.0d) {
                return d2;
            }
        }
        return d;
    }

    public final String h0(boolean z) {
        nwo0 nwo0VarC = this.y.c();
        return efx.s(this.S, nwo0VarC.f24244a || (((b820) D()).j && nwo0VarC.b && ((ovo0) this.H0.f27815a).f25934a), z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j0(zje zjeVar) {
        yj20 yj20Var;
        if (zjeVar instanceof yj20) {
            yj20Var = (yj20) zjeVar;
            int i = yj20Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                yj20Var.l = i - Integer.MIN_VALUE;
            } else {
                yj20Var = new yj20(this, zjeVar);
            }
        } else {
            yj20Var = new yj20(this, zjeVar);
        }
        Object objA = yj20Var.j;
        wne wneVar = wne.f39444a;
        int i2 = yj20Var.l;
        if (i2 == 0) {
            z1x.P(objA);
            yj20Var.i = this;
            yj20Var.l = 1;
            objA = this.v.a(yj20Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = yj20Var.i;
            z1x.P(objA);
        }
        return new Double(this.g0(((m97) objA).l));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0100  */
    /* JADX WARN: Code duplicated, block: B:36:0x0126 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object k0(double d, double d2, zje zjeVar) throws Throwable {
        ak20 ak20Var;
        double d3;
        hru hruVar;
        double d4;
        qvo0 qvo0Var;
        hru hruVar2;
        double d5;
        long j;
        double d6;
        int iIntValue;
        long j2;
        Object objA;
        qvo0 qvo0Var2;
        double d7;
        double d8;
        hru hruVar3;
        double d9;
        int i;
        double d10;
        long j3;
        Serializable serializableC;
        double d11 = d;
        double d12 = d2;
        if (zjeVar instanceof ak20) {
            ak20Var = (ak20) zjeVar;
            int i2 = ak20Var.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ak20Var.s = i2 - Integer.MIN_VALUE;
            } else {
                ak20Var = new ak20(this, zjeVar);
            }
        } else {
            ak20Var = new ak20(this, zjeVar);
        }
        Object objG = ak20Var.q;
        wne wneVar = wne.f39444a;
        int i3 = ak20Var.s;
        if (i3 == 0) {
            z1x.P(objG);
            bm5 bm5Var = bm5.b;
            hru hruVar4 = this.n0;
            ak20Var.m = hruVar4;
            ak20Var.i = d11;
            ak20Var.j = d12;
            ak20Var.k = d11;
            ak20Var.l = d12;
            ak20Var.s = 1;
            objG = khf0.G(this.s, bm5Var, ak20Var);
            if (objG != wneVar) {
                d3 = d11;
                hruVar = hruVar4;
                d4 = d12;
            }
            return wneVar;
        }
        if (i3 == 1) {
            double d13 = ak20Var.l;
            double d14 = ak20Var.k;
            d4 = ak20Var.j;
            d3 = ak20Var.i;
            hruVar = ak20Var.m;
            z1x.P(objG);
            d12 = d13;
            d11 = d14;
        } else {
            if (i3 == 2) {
                j = ak20Var.o;
                d12 = ak20Var.l;
                d5 = ak20Var.k;
                d6 = ak20Var.j;
                double d15 = ak20Var.i;
                qvo0Var = ak20Var.n;
                hru hruVar5 = ak20Var.m;
                z1x.P(objG);
                hruVar2 = hruVar5;
                d3 = d15;
                iIntValue = ((Number) objG).intValue();
                ak20Var.m = hruVar2;
                ak20Var.n = qvo0Var;
                ak20Var.i = d3;
                ak20Var.j = d6;
                ak20Var.k = d5;
                ak20Var.l = d12;
                ak20Var.o = j;
                ak20Var.p = iIntValue;
                j2 = j;
                ak20Var.s = 3;
                objA = this.p0.a(false, ak20Var);
                if (objA != wneVar) {
                    qvo0Var2 = qvo0Var;
                    objG = objA;
                    d7 = d3;
                    d8 = d12;
                    hruVar3 = hruVar2;
                    d9 = d5;
                    i = iIntValue;
                    d10 = d6;
                    j3 = j2;
                }
                return wneVar;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    z1x.P(objG);
                    return objG;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = ak20Var.p;
            long j4 = ak20Var.o;
            double d16 = ak20Var.l;
            double d17 = ak20Var.k;
            double d18 = ak20Var.j;
            double d19 = ak20Var.i;
            qvo0 qvo0Var3 = ak20Var.n;
            hru hruVar6 = ak20Var.m;
            z1x.P(objG);
            qvo0Var2 = qvo0Var3;
            d9 = d17;
            i = i4;
            hruVar3 = hruVar6;
            j3 = j4;
            d7 = d19;
            d10 = d18;
            d8 = d16;
        }
        int i5 = ((m2c0) objG).F;
        ak20Var.m = null;
        ak20Var.n = null;
        ak20Var.i = d7;
        ak20Var.j = d10;
        ak20Var.s = 4;
        serializableC = hruVar3.c(d9, d8, i, i5, j3, ak20Var, qvo0Var2);
        if (serializableC == wneVar) {
            return wneVar;
        }
        return serializableC;
        long j5 = ((ql5) objG).e;
        qvo0 qvo0Var4 = qvo0.b;
        ak20Var.m = hruVar;
        ak20Var.n = qvo0Var4;
        ak20Var.i = d3;
        ak20Var.j = d4;
        ak20Var.k = d11;
        ak20Var.l = d12;
        ak20Var.o = j5;
        ak20Var.s = 2;
        Object objC = this.o0.c(ak20Var);
        if (objC != wneVar) {
            double d20 = d4;
            qvo0Var = qvo0Var4;
            objG = objC;
            hruVar2 = hruVar;
            d5 = d11;
            j = j5;
            d6 = d20;
            iIntValue = ((Number) objG).intValue();
            ak20Var.m = hruVar2;
            ak20Var.n = qvo0Var;
            ak20Var.i = d3;
            ak20Var.j = d6;
            ak20Var.k = d5;
            ak20Var.l = d12;
            ak20Var.o = j;
            ak20Var.p = iIntValue;
            j2 = j;
            ak20Var.s = 3;
            objA = this.p0.a(false, ak20Var);
            if (objA != wneVar) {
                qvo0Var2 = qvo0Var;
                objG = objA;
                d7 = d3;
                d8 = d12;
                hruVar3 = hruVar2;
                d9 = d5;
                i = iIntValue;
                d10 = d6;
                j3 = j2;
                int i6 = ((m2c0) objG).F;
                ak20Var.m = null;
                ak20Var.n = null;
                ak20Var.i = d7;
                ak20Var.j = d10;
                ak20Var.s = 4;
                serializableC = hruVar3.c(d9, d8, i, i6, j3, ak20Var, qvo0Var2);
                if (serializableC == wneVar) {
                    return wneVar;
                }
                return serializableC;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object l0(aud audVar, zje zjeVar) {
        ek20 ek20Var;
        jye jyeVar;
        if (zjeVar instanceof ek20) {
            ek20Var = (ek20) zjeVar;
            int i = ek20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ek20Var.k = i - Integer.MIN_VALUE;
            } else {
                ek20Var = new ek20(this, zjeVar);
            }
        } else {
            ek20Var = new ek20(this, zjeVar);
        }
        ek20 ek20Var2 = ek20Var;
        Object obj = ek20Var2.i;
        Object obj2 = wne.f39444a;
        int i2 = ek20Var2.k;
        if (i2 == 0) {
            z1x.P(obj);
            G(new za20(audVar));
            boolean z = audVar instanceof vtd;
            m0k0 m0k0Var = this.o;
            ms2 ms2Var = this.p;
            x20 x20Var = this.M;
            if (z || (audVar instanceof ttd)) {
                ek20Var2.k = 1;
                String strJ = q8x.J(ms2Var);
                long j = m0k0Var.B;
                long j2 = m0k0Var.f20959a;
                mii0 mii0Var = this.H;
                if (j == 0) {
                    mii0Var.H(j2, strJ);
                    x20Var.c((int) j2, strJ);
                } else {
                    mii0Var.G(j2, j, strJ);
                    x20Var.b((int) j2, (int) m0k0Var.B, strJ);
                }
                Object objT0 = t0(m0k0Var.Y, m0k0Var.f20959a, m0k0Var.B, m0k0Var.z, ek20Var2);
                if (objT0 != obj2) {
                    objT0 = Unit.f46060a;
                }
                if (objT0 == obj2) {
                    return obj2;
                }
            } else {
                if (!(audVar instanceof wtd)) {
                    return Unit.f46060a;
                }
                String strJ2 = q8x.J(ms2Var);
                long j3 = m0k0Var.B;
                long j4 = m0k0Var.f20959a;
                mii0 mii0Var2 = this.H;
                if (j3 == 0) {
                    mii0Var2.P(j4, strJ2);
                    x20Var.n((int) j4, strJ2);
                } else {
                    mii0Var2.O(j4, j3, strJ2);
                    x20Var.m((int) j4, (int) m0k0Var.B, strJ2);
                }
                jyeVar = jye.ADDED_TO_COUPON;
            }
            H(new b120(jyeVar, (byte) 5));
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        jyeVar = jye.NOT_ADDED_TO_COUPON;
        H(new b120(jyeVar, (byte) 5));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m0(zje zjeVar) {
        rk20 rk20Var;
        vw6 vw6Var;
        double d;
        if (zjeVar instanceof rk20) {
            rk20Var = (rk20) zjeVar;
            int i = rk20Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                rk20Var.m = i - Integer.MIN_VALUE;
            } else {
                rk20Var = new rk20(this, zjeVar);
            }
        } else {
            rk20Var = new rk20(this, zjeVar);
        }
        Object obj = rk20Var.k;
        Object obj2 = wne.f39444a;
        int i2 = rk20Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            vw6 vw6Var2 = ((b820) D()).d.f31171a.b;
            double d2 = vw6Var2.f38133a;
            rk20Var.i = vw6Var2;
            rk20Var.j = d2;
            rk20Var.m = 1;
            Object objJ0 = j0(rk20Var);
            if (objJ0 == obj2) {
                return obj2;
            }
            vw6Var = vw6Var2;
            obj = objJ0;
            d = d2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d = rk20Var.j;
            vw6Var = rk20Var.i;
            z1x.P(obj);
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        H(new yh20((!s0() || dDoubleValue == 0.0d) ? "" : ydx.G(P(d, dDoubleValue), vw6Var.f, hxu.h, null), (byte) 3));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:104:0x02ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:111:0x030f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0130  */
    /* JADX WARN: Code duplicated, block: B:44:0x017c  */
    /* JADX WARN: Code duplicated, block: B:45:0x017e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0181 A[PHI: r3
  0x0181: PHI (r3v35 java.lang.Double) = (r3v8 java.lang.Double), (r3v13 java.lang.Double) binds: [B:46:0x017f, B:52:0x0198] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0186  */
    /* JADX WARN: Code duplicated, block: B:50:0x0190  */
    /* JADX WARN: Code duplicated, block: B:51:0x0197  */
    /* JADX WARN: Code duplicated, block: B:54:0x019b  */
    /* JADX WARN: Code duplicated, block: B:58:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:69:0x020a  */
    /* JADX WARN: Code duplicated, block: B:70:0x020d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0213  */
    /* JADX WARN: Code duplicated, block: B:73:0x0216  */
    /* JADX WARN: Code duplicated, block: B:75:0x021e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0224  */
    /* JADX WARN: Code duplicated, block: B:81:0x0230  */
    /* JADX WARN: Code duplicated, block: B:84:0x024d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0278  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:90:0x027b  */
    /* JADX WARN: Code duplicated, block: B:92:0x027f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0283  */
    /* JADX WARN: Code duplicated, block: B:96:0x0288  */
    /* JADX WARN: Code duplicated, block: B:98:0x02aa  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x015e, code lost:
    
        if (r9.m(r34, r0, r0, r10) == r11) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n0(a.oa20 r33, long r34, long r36, boolean r38, long r39, a.zje r41) {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nn20.n0(a.oa20, long, long, boolean, long, a.zje):java.lang.Object");
    }

    public final boolean o0() {
        gx4 gx4Var = ((b820) D()).f;
        if (gx4Var != null) {
            vw6 vw6Var = gx4Var.c.b;
            double d = vw6Var.f38133a;
            xyc xycVar = gx4Var.b;
            BigDecimal bigDecimal = xycVar.d;
            BigDecimal bigDecimal2 = xycVar.e;
            BigDecimal bigDecimal3 = xycVar.f41701a;
            boolean z = bigDecimal3.compareTo(bigDecimal) >= 0 && bigDecimal3.compareTo(bigDecimal2) <= 0;
            if (d != -1.0d) {
                double d2 = vw6Var.d;
                double d3 = vw6Var.e;
                if (((d <= d3 && d2 <= d) || (d > d3 && (vw6Var.g || vw6Var.m))) && z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p0(m97 m97Var, zje zjeVar) {
        zk20 zk20Var;
        if (zjeVar instanceof zk20) {
            zk20Var = (zk20) zjeVar;
            int i = zk20Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                zk20Var.l = i - Integer.MIN_VALUE;
            } else {
                zk20Var = new zk20(this, zjeVar);
            }
        } else {
            zk20Var = new zk20(this, zjeVar);
        }
        Object objT = zk20Var.j;
        Object obj = wne.f39444a;
        int i2 = zk20Var.l;
        if (i2 == 0) {
            z1x.P(objT);
            zk20Var.i = m97Var;
            zk20Var.l = 1;
            objT = T(zk20Var);
            if (objT != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objT);
                return objT;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m97Var = zk20Var.i;
        z1x.P(objT);
        if (((Boolean) objT).booleanValue()) {
            return Boolean.FALSE;
        }
        long j = m97Var.h;
        zk20Var.i = null;
        zk20Var.l = 2;
        Object objE = this.Q0.e(j, zk20Var);
        return objE == obj ? obj : objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q0(m97 m97Var, zje zjeVar) {
        al20 al20Var;
        if (zjeVar instanceof al20) {
            al20Var = (al20) zjeVar;
            int i = al20Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                al20Var.l = i - Integer.MIN_VALUE;
            } else {
                al20Var = new al20(this, zjeVar);
            }
        } else {
            al20Var = new al20(this, zjeVar);
        }
        Object objT = al20Var.j;
        Object obj = wne.f39444a;
        int i2 = al20Var.l;
        if (i2 == 0) {
            z1x.P(objT);
            al20Var.i = m97Var;
            al20Var.l = 1;
            objT = T(al20Var);
            if (objT == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m97Var = al20Var.i;
            z1x.P(objT);
        }
        return Boolean.valueOf((((Boolean) objT).booleanValue() || m97Var.y == 0.0d) ? false : true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r0(m97 m97Var, zje zjeVar) {
        bl20 bl20Var;
        if (zjeVar instanceof bl20) {
            bl20Var = (bl20) zjeVar;
            int i = bl20Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                bl20Var.l = i - Integer.MIN_VALUE;
            } else {
                bl20Var = new bl20(this, zjeVar);
            }
        } else {
            bl20Var = new bl20(this, zjeVar);
        }
        Object objT = bl20Var.j;
        Object obj = wne.f39444a;
        int i2 = bl20Var.l;
        if (i2 == 0) {
            z1x.P(objT);
            bl20Var.i = m97Var;
            bl20Var.l = 1;
            objT = T(bl20Var);
            if (objT != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objT);
                return objT;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m97Var = bl20Var.i;
        z1x.P(objT);
        if (((Boolean) objT).booleanValue()) {
            return Boolean.FALSE;
        }
        long j = m97Var.h;
        bl20Var.i = null;
        bl20Var.l = 2;
        Object objM = this.P0.m(j, bl20Var);
        return objM == obj ? obj : objM;
    }

    public final boolean s0() {
        vw6 vw6Var = ((b820) D()).d.f31171a.b;
        double d = vw6Var.f38133a;
        if (d == -1.0d) {
            return false;
        }
        double d2 = vw6Var.d;
        if (d <= vw6Var.b() && d2 <= d) {
            return true;
        }
        if (d > vw6Var.b()) {
            return vw6Var.g || vw6Var.m;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object t0(long j, long j2, long j3, long j4, zje zjeVar) {
        fl20 fl20Var;
        long j5;
        Object obj;
        final long j6;
        long j7;
        final l1g l1gVar;
        final long j8;
        final j1g j1gVar;
        if (zjeVar instanceof fl20) {
            fl20Var = (fl20) zjeVar;
            int i = fl20Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                fl20Var.p = i - Integer.MIN_VALUE;
            } else {
                fl20Var = new fl20(this, zjeVar);
            }
        } else {
            fl20Var = new fl20(this, zjeVar);
        }
        Object obj2 = fl20Var.n;
        wne wneVar = wne.f39444a;
        int i2 = fl20Var.p;
        if (i2 == 0) {
            z1x.P(obj2);
            long j9 = j2 == 40 ? j3 : j2;
            l1g l1gVar2 = l1g.ADD_TO_COUPON;
            fl20Var.m = l1gVar2;
            fl20Var.i = j;
            fl20Var.j = j2;
            j5 = j4;
            fl20Var.k = j5;
            fl20Var.l = j9;
            fl20Var.p = 1;
            Object objB = this.C.b(j2, fl20Var);
            if (objB == wneVar) {
                return wneVar;
            }
            obj = objB;
            j6 = j9;
            j7 = j2;
            l1gVar = l1gVar2;
            j8 = j;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j10 = fl20Var.l;
            long j11 = fl20Var.k;
            j7 = fl20Var.j;
            long j12 = fl20Var.i;
            l1g l1gVar3 = fl20Var.m;
            z1x.P(obj2);
            j5 = j11;
            l1gVar = l1gVar3;
            j6 = j10;
            obj = obj2;
            j8 = j12;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (j7 == 40) {
            j1gVar = j1g.REAL;
        } else {
            j1gVar = zBooleanValue ? j1g.SYNTHETIC : j1g.CYBER;
        }
        ms2 ms2Var = this.p;
        if (ms2Var != null) {
            boolean z = ms2Var instanceof uq2;
            vqc vqcVar = this.D;
            if (z || (ms2Var instanceof lq2) || (ms2Var instanceof sq2) || (ms2Var instanceof jr2) || (ms2Var instanceof tq2) || (ms2Var instanceof jq2) || (ms2Var instanceof kq2) || (ms2Var instanceof mq2) || (ms2Var instanceof nq2) || (ms2Var instanceof rq2)) {
                final byte b = 0;
                final long j13 = j5;
                vqcVar.k(pzb.C(new Function1() { // from class: a.di20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        byte b2 = b;
                        long j14 = j13;
                        j1g j1gVar2 = j1gVar;
                        l1g l1gVar4 = l1gVar;
                        long j15 = j6;
                        nn20 nn20Var = this;
                        long j16 = j8;
                        n1g n1gVar = (n1g) obj3;
                        switch (b2) {
                            case 0:
                                n1gVar.getClass();
                                n1gVar.b(String.valueOf(j16));
                                n1gVar.a(nn20Var.p);
                                n1gVar.c = j15;
                                n1gVar.c(l1gVar4);
                                n1gVar.d = j1gVar2;
                                n1gVar.b = j14;
                                break;
                            default:
                                n1gVar.getClass();
                                n1gVar.b(String.valueOf(j16));
                                n1gVar.a(nn20Var.p);
                                n1gVar.c = j15;
                                n1gVar.c(l1gVar4);
                                n1gVar.d = j1gVar2;
                                n1gVar.b = j14;
                                break;
                        }
                        return Unit.f46060a;
                    }
                }));
            } else if (((ms2Var instanceof kr2) || (ms2Var instanceof lr2)) && zBooleanValue) {
                final byte b2 = 1;
                final long j14 = j5;
                vqcVar.k(pzb.C(new Function1() { // from class: a.di20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        byte b3 = b2;
                        long j15 = j14;
                        j1g j1gVar2 = j1gVar;
                        l1g l1gVar4 = l1gVar;
                        long j16 = j6;
                        nn20 nn20Var = this;
                        long j17 = j8;
                        n1g n1gVar = (n1g) obj3;
                        switch (b3) {
                            case 0:
                                n1gVar.getClass();
                                n1gVar.b(String.valueOf(j17));
                                n1gVar.a(nn20Var.p);
                                n1gVar.c = j16;
                                n1gVar.c(l1gVar4);
                                n1gVar.d = j1gVar2;
                                n1gVar.b = j15;
                                break;
                            default:
                                n1gVar.getClass();
                                n1gVar.b(String.valueOf(j17));
                                n1gVar.a(nn20Var.p);
                                n1gVar.c = j16;
                                n1gVar.c(l1gVar4);
                                n1gVar.d = j1gVar2;
                                n1gVar.b = j15;
                                break;
                        }
                        return Unit.f46060a;
                    }
                }));
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object u0(int i, long j, long j2, zje zjeVar, boolean z) {
        kl20 kl20Var;
        String str;
        long j3;
        String str2;
        boolean z2;
        long j4;
        int i2;
        int i3;
        if (zjeVar instanceof kl20) {
            kl20Var = (kl20) zjeVar;
            int i4 = kl20Var.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                kl20Var.p = i4 - Integer.MIN_VALUE;
            } else {
                kl20Var = new kl20(this, zjeVar);
            }
        } else {
            kl20Var = new kl20(this, zjeVar);
        }
        Object obj = kl20Var.n;
        wne wneVar = wne.f39444a;
        int i5 = kl20Var.p;
        Object obj2 = null;
        if (i5 == 0) {
            z1x.P(obj);
            fo7 fo7Var = ((b820) D()).b;
            xn7 xn7Var = xn7.b;
            if (z) {
                str = "fast";
            } else if (fo7Var.equals(xn7Var)) {
                str = "coeff";
            } else if (fo7Var.equals(zn7.b)) {
                str = "promo";
            } else {
                if (!fo7Var.equals(co7.b)) {
                    t9f.b();
                    return null;
                }
                str = Payload.CUSTOM;
            }
            boolean zEquals = ((b820) D()).b.equals(xn7Var);
            kl20Var.m = str;
            kl20Var.j = j;
            kl20Var.l = i;
            j3 = j2;
            kl20Var.k = j3;
            kl20Var.i = zEquals;
            kl20Var.p = 1;
            Object objB = this.S0.b(kl20Var);
            if (objB == wneVar) {
                return wneVar;
            }
            str2 = str;
            obj = objB;
            z2 = zEquals;
            j4 = j;
            i2 = i;
        } else {
            if (i5 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = kl20Var.i;
            long j5 = kl20Var.k;
            int i6 = kl20Var.l;
            long j6 = kl20Var.j;
            String str3 = kl20Var.m;
            z1x.P(obj);
            str2 = str3;
            i2 = i6;
            j3 = j5;
            j4 = j6;
        }
        for (Object obj3 : (Iterable) obj) {
            if (((xco) obj3).f40655a == j4) {
                obj2 = obj3;
                break;
            }
        }
        xco xcoVar = (xco) obj2;
        String strValueOf = (!(xcoVar != null ? xcoVar.e : false) || z2 || j3 == 0) ? "" : String.valueOf(j3);
        ms2 ms2Var = this.p;
        if (ms2Var == null) {
            i3 = -1;
        } else if (ms2Var instanceof ds2) {
            i3 = ((ds2) ms2Var).f6590a;
        } else if (ms2Var instanceof jq2) {
            i3 = (int) ((jq2) ms2Var).f16929a;
        } else {
            i3 = -1;
        }
        int i7 = i3;
        m0k0 m0k0Var = this.o;
        this.O.q(m0k0Var.f20959a, m0k0Var.B, ms2Var, j4, str2, i2, this.R0.a(), i7, strValueOf);
        ms2 ms2Var2 = this.p;
        long j7 = j4;
        this.M.w(m0k0Var.f20959a, m0k0Var.B, i7, ms2Var2 instanceof ds2 ? g1x.v((ds2) ms2Var2) : kpb.v0(ms2Var2), j7, str2, i2, strValueOf);
        return Unit.f46060a;
    }

    @Override // a.diu0
    public final void v() {
        this.W.a(bm5.b);
        this.B0.P();
    }

    public final void v0() {
        G(jb20.f16218a);
        sac.V(jiu0.a(this), new yw10(1, this, nn20.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 21), null, this.T.b, new ml20(this, null), 10);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    public final void w0(a8q0 a8q0Var) {
        boolean z;
        gx4 gx4Var;
        a8q0 a8q0VarW = W(a8q0Var);
        gx4 gx4Var2 = ((b820) D()).f;
        BigDecimal bigDecimal = gx4Var2 != null ? new BigDecimal(String.valueOf(gx4Var2.c.b.i.b)) : BigDecimal.ZERO;
        String str = a8q0VarW.f440a.b;
        bigDecimal.getClass();
        if (S(str, bigDecimal) && (gx4Var = ((b820) D()).f) != null) {
            z = gx4Var.c.b.i.f46769a;
        }
        a8q0 a8q0VarX = X(a8q0VarW, z, bigDecimal, 13, 2);
        E0(a8q0VarX);
        gx4 gx4Var3 = ((b820) D()).f;
        if (gx4Var3 == null) {
            return;
        }
        Double dI = kotlin.text.b.i(a8q0VarX.f440a.b);
        double dDoubleValue = dI != null ? dI.doubleValue() : -1.0d;
        if (dDoubleValue == gx4Var3.c.b.f38133a) {
            return;
        }
        H(new th20(gx4Var3, dDoubleValue, (byte) 0));
        M0();
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        BigDecimal bigDecimalAdd;
        BigDecimal bigDecimalSubtract;
        double dMin;
        boolean z;
        l520 l520Var = (l520) obj;
        l520Var.getClass();
        boolean zEquals = l520Var.equals(x420.f40245a);
        byte b = 23;
        byte b2 = 18;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        zlt0 zlt0Var = this.G;
        mne mneVar = this.T;
        yje yjeVar = null;
        if (zEquals) {
            sac.V(jiu0.a(this), null, null, mneVar.b, new xj1((diu0) this, yjeVar, (byte) 13), 11);
            H(new obg(b2, f0()));
            if (((b820) D()).h) {
                sac.V(jiu0.a(this), new r520((byte) 23), null, mneVar.f22085a, new xj1((diu0) this, yjeVar, (byte) 12), 10);
            }
            boolean zJ = zlt0Var.j();
            if (zJ != ((b820) D()).d.f31171a.b.i.f46769a) {
                vw6 vw6Var = ((b820) D()).d.f31171a.b;
                double dB = vw6Var.f38133a;
                if (dB == -1.0d) {
                    z = zJ;
                } else {
                    double d = vw6Var.e;
                    if (zJ && dB > vw6Var.b()) {
                        dB = vw6Var.b();
                    }
                    L0(dB);
                    z = zJ;
                    H(new ci20(dB, z, d));
                }
                gx4 gx4Var = ((b820) D()).f;
                if (gx4Var != null) {
                    vw6 vw6Var2 = gx4Var.c.b;
                    double d2 = vw6Var2.f38133a;
                    if (d2 != -1.0d) {
                        double d3 = vw6Var2.e;
                        if (z && d2 > d3) {
                            d2 = d3;
                        }
                        F0(d2);
                        H(new lm20(gx4Var, d2, z, d3));
                    }
                }
            }
            f0d f0dVarB0 = b0();
            p7m0 p7m0Var = ocjVar.f25029a;
            while (true) {
                Object value3 = p7m0Var.getValue();
                value3.getClass();
                b820 b820Var = (b820) value3;
                oyg0Var.getClass();
                f0d f0dVar = f0dVarB0;
                if (p7m0Var.m(value3, b820.a(b820Var, ly6.a(b820Var.f2138a, null, null, f0dVarB0, null, 111), null, null, null, null, null, null, false, false, false, false, false, 8190))) {
                    M0();
                    return;
                }
                f0dVarB0 = f0dVar;
            }
        } else {
            boolean z2 = false;
            if (l520Var instanceof d520) {
                ynd0 ynd0Var = ((d520) l520Var).f5484a;
                rvj0 rvj0Var = ((b820) D()).d;
                mnd0 mnd0Var = rvj0Var.d;
                vw6 vw6Var3 = rvj0Var.f31171a.b;
                if (ynd0Var instanceof und0) {
                    dMin = mnd0Var.b;
                } else if (ynd0Var instanceof wnd0) {
                    dMin = mnd0Var.c;
                } else if (ynd0Var instanceof xnd0) {
                    dMin = mnd0Var.d;
                } else {
                    if (!(ynd0Var instanceof vnd0)) {
                        t9f.b();
                        return;
                    }
                    double d4 = ((b820) D()).c.c.b;
                    double dB2 = vw6Var3.b();
                    double d5 = ((b820) D()).c.d.f10638a;
                    if (this.z.a().f32117a.f12063a.b && d5 > -1.0d) {
                        d4 += d5;
                    }
                    dMin = Math.min(d4 / vw6Var3.c(), dB2);
                }
                double d6 = dMin;
                H(new sh20(rvj0Var, d6, vw6Var3.c() * d6, (byte) 1));
                L0(d6);
                M0();
                if (d6 < vw6Var3.d) {
                    G(new cc20(this.S.b.a(R.string.insufficient_funds, Arrays.copyOf(new Object[0], 0))));
                    return;
                } else {
                    v0();
                    return;
                }
            }
            if (l520Var instanceof k420) {
                sac.V(jiu0.a(this), jm20.f16744a, null, mneVar.b, new v620((Object) this, (Object) ((k420) l520Var).f17648a, yjeVar, (byte) 25), 10);
                return;
            }
            final byte b3 = 1;
            if (l520Var instanceof l420) {
                String str = ((l420) l520Var).f19384a;
                czc0 czc0Var = ((b820) D()).e;
                if (czc0Var != null) {
                    czc0Var.f5218a.f34747a.setValue(str);
                }
                H(new yh20(str, b3));
                return;
            }
            if (l520Var.equals(c520.f3751a)) {
                sac.V(jiu0.a(this), new r520((byte) 18), null, mneVar.b, new mq10((diu0) this, yjeVar, (byte) 10), 10);
                return;
            }
            if (l520Var.equals(k320.f17598a)) {
                E();
                return;
            }
            if (l520Var.equals(e520.f7211a)) {
                H(new fd20(b));
                v0();
                return;
            }
            if (l520Var.equals(y420.f41981a)) {
                return;
            }
            boolean zEquals2 = l520Var.equals(i320.f14077a);
            ms2 ms2Var = this.p;
            if (zEquals2) {
                String str2 = ms2Var instanceof vq2 ? "duel" : "regular_bet";
                this.J.c(str2);
                this.I.i(str2);
                G(xb20.f40579a);
                return;
            }
            boolean zEquals3 = l520Var.equals(j520.f15913a);
            byte b4 = 15;
            byte b5 = 2;
            cmt cmtVar = this.N;
            l7k l7kVar = this.L;
            ih5 ih5Var = this.K;
            if (zEquals3) {
                ms2Var.getClass();
                boolean z3 = ms2Var instanceof vq2;
                ih5Var.f(z3 ? k7k.PlayerDuel : k7k.PlacementBet);
                l7kVar.b((z3 ? y1p.PLAYER_DUEL : y1p.PLACEMENT_BET).f41868a, cmtVar.g());
                i3t0.K(this, null, new rh20(this, b5), new xg0(this, yjeVar, b4), 1);
                return;
            }
            if (l520Var.equals(m320.f21093a)) {
                ms2Var.getClass();
                boolean z4 = ms2Var instanceof vq2;
                ih5Var.f(z4 ? k7k.NoMoneyPlayerDuel : k7k.NoMoneyPlacementBet);
                l7kVar.b((z4 ? y1p.NO_MONEY_PLAYER_DUEL : y1p.NO_MONEY_PLACEMENT_BET).f41868a, cmtVar.g());
                i3t0.K(this, null, new rh20(this, b5), new xg0(this, yjeVar, b4), 1);
                return;
            }
            if (l520Var.equals(h320.f12365a)) {
                i3t0.K(this, null, null, new mj20(this, yjeVar, b5), 3);
                return;
            }
            byte b6 = 16;
            if (l520Var instanceof g520) {
                int i = ((g520) l520Var).f10697a;
                G(jb20.f16218a);
                H(new u49(b6, i, z2));
                M0();
                return;
            }
            byte b7 = 6;
            if (l520Var instanceof v420) {
                v420 v420Var = (v420) l520Var;
                if (v420Var.equals(q420.f28077a)) {
                    double dN = N(((b820) D()).d.f31171a.b);
                    L0(dN);
                    H(new ks6(dN, b7));
                    M0();
                    return;
                }
                if (v420Var.equals(s420.f31584a)) {
                    double dO = O(((b820) D()).d.f31171a.b);
                    L0(dO);
                    H(new ks6(dO, (byte) 5));
                    M0();
                    return;
                }
                if (v420Var instanceof u420) {
                    y0(((u420) v420Var).f35024a);
                    return;
                }
                if (v420Var.equals(r420.f29815a)) {
                    H(new fd20((byte) 14));
                    return;
                }
                if (!(v420Var instanceof t420)) {
                    t9f.b();
                    return;
                }
                float f = ((t420) v420Var).f33298a;
                vw6 vw6Var4 = ((b820) D()).d.f31171a.b;
                if (vw6Var4.b() <= vw6Var4.d) {
                    return;
                }
                double dQ = Q(f, vw6Var4);
                if (dQ == vw6Var4.f38133a) {
                    return;
                }
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dQ);
                String plainString = (bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros()).toPlainString();
                plainString.getClass();
                int length = plainString.length();
                y0(new a8q0(plainString, s7n0.e(length, length), 4));
                return;
            }
            if (l520Var instanceof a420) {
                a420 a420Var = (a420) l520Var;
                if (a420Var instanceof v320) {
                    w0(((v320) a420Var).f36715a);
                    return;
                }
                if (a420Var instanceof z320) {
                    x0(((z320) a420Var).f43698a);
                    return;
                }
                if (a420Var.equals(w320.f38479a)) {
                    gx4 gx4Var2 = ((b820) D()).f;
                    if (gx4Var2 != null) {
                        xyc xycVar = gx4Var2.b;
                        BigDecimal bigDecimal = xycVar.c;
                        BigDecimal bigDecimal2 = xycVar.f41701a;
                        if (bigDecimal2.scale() == 1) {
                            bigDecimalSubtract = bigDecimal2.subtract(bigDecimal);
                            bigDecimalSubtract.getClass();
                        } else {
                            bigDecimalSubtract = bigDecimal2.setScale(1, RoundingMode.CEILING).subtract(bigDecimal);
                            bigDecimalSubtract.getClass();
                        }
                        BigDecimal bigDecimalM = M(bigDecimalSubtract, xycVar);
                        boolean z5 = bigDecimalSubtract.compareTo(xycVar.e) > 0;
                        boolean z6 = bigDecimalM.compareTo(xycVar.d) < 0;
                        G0(bigDecimalM);
                        H(new jh20(bigDecimalM, z5, z6, (byte) 3));
                        M0();
                        return;
                    }
                    return;
                }
                if (a420Var.equals(x320.f40195a)) {
                    gx4 gx4Var3 = ((b820) D()).f;
                    if (gx4Var3 != null) {
                        xyc xycVar2 = gx4Var3.b;
                        BigDecimal bigDecimal3 = xycVar2.d;
                        BigDecimal bigDecimal4 = xycVar2.c;
                        BigDecimal bigDecimal5 = xycVar2.f41701a;
                        if (bigDecimal5.compareTo(bigDecimal3) < 0) {
                            bigDecimalAdd = bigDecimal3;
                        } else if (bigDecimal5.scale() == 1 || bigDecimal5.scale() == 0) {
                            bigDecimalAdd = bigDecimal5.add(bigDecimal4);
                            bigDecimalAdd.getClass();
                        } else {
                            bigDecimalAdd = bigDecimal5.setScale(1, RoundingMode.FLOOR).add(bigDecimal4);
                            bigDecimalAdd.getClass();
                        }
                        BigDecimal bigDecimalM2 = M(bigDecimalAdd, xycVar2);
                        boolean z7 = bigDecimalAdd.compareTo(xycVar2.e) > 0;
                        z2 = bigDecimalM2.compareTo(bigDecimal3) < 0;
                        G0(bigDecimalM2);
                        H(new jh20(bigDecimalM2, z7, z2, (byte) 2));
                        M0();
                        return;
                    }
                    return;
                }
                if (a420Var.equals(r320.f29766a)) {
                    gx4 gx4Var4 = ((b820) D()).f;
                    if (gx4Var4 != null) {
                        final vw6 vw6Var5 = gx4Var4.c.b;
                        final double dN2 = N(vw6Var5);
                        F0(dN2);
                        final byte b8 = z2 ? (byte) 1 : (byte) 0;
                        H(new Function2() { // from class: a.qh20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (b8) {
                                    case 0:
                                        b820 b820Var2 = (b820) obj3;
                                        ((oyg0) obj2).getClass();
                                        b820Var2.getClass();
                                        gx4 gx4Var5 = b820Var2.f;
                                        return b820.a(b820Var2, null, null, null, null, null, gx4Var5 != null ? gx4.a(gx4Var5, null, null, dx6.a(gx4Var5.c, null, vw6.a(vw6Var5, dN2, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, 65534), 1), null, null, 27) : null, null, false, false, false, false, false, 8159);
                                    default:
                                        b820 b820Var3 = (b820) obj3;
                                        ((oyg0) obj2).getClass();
                                        b820Var3.getClass();
                                        gx4 gx4Var6 = b820Var3.f;
                                        return b820.a(b820Var3, null, null, null, null, null, gx4Var6 != null ? gx4.a(gx4Var6, null, null, dx6.a(gx4Var6.c, null, vw6.a(vw6Var5, dN2, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, 65534), 1), null, null, 27) : null, null, false, false, false, false, false, 8159);
                                }
                            }
                        });
                        M0();
                        return;
                    }
                    return;
                }
                if (a420Var.equals(t320.f33245a)) {
                    gx4 gx4Var5 = ((b820) D()).f;
                    if (gx4Var5 != null) {
                        final vw6 vw6Var6 = gx4Var5.c.b;
                        final double dO2 = O(vw6Var6);
                        F0(dO2);
                        H(new Function2() { // from class: a.qh20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (b3) {
                                    case 0:
                                        b820 b820Var2 = (b820) obj3;
                                        ((oyg0) obj2).getClass();
                                        b820Var2.getClass();
                                        gx4 gx4Var6 = b820Var2.f;
                                        return b820.a(b820Var2, null, null, null, null, null, gx4Var6 != null ? gx4.a(gx4Var6, null, null, dx6.a(gx4Var6.c, null, vw6.a(vw6Var6, dO2, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, 65534), 1), null, null, 27) : null, null, false, false, false, false, false, 8159);
                                    default:
                                        b820 b820Var3 = (b820) obj3;
                                        ((oyg0) obj2).getClass();
                                        b820Var3.getClass();
                                        gx4 gx4Var7 = b820Var3.f;
                                        return b820.a(b820Var3, null, null, null, null, null, gx4Var7 != null ? gx4.a(gx4Var7, null, null, dx6.a(gx4Var7.c, null, vw6.a(vw6Var6, dO2, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, 65534), 1), null, null, 27) : null, null, false, false, false, false, false, 8159);
                                }
                            }
                        });
                        M0();
                        return;
                    }
                    return;
                }
                if (a420Var instanceof u320) {
                    float f2 = ((u320) a420Var).f34976a;
                    gx4 gx4Var6 = ((b820) D()).f;
                    if (gx4Var6 == null) {
                        return;
                    }
                    vw6 vw6Var7 = gx4Var6.c.b;
                    if (vw6Var7.e <= vw6Var7.d) {
                        return;
                    }
                    double dQ2 = Q(f2, vw6Var7);
                    if (dQ2 == vw6Var7.f38133a) {
                        return;
                    }
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(dQ2);
                    String plainString2 = (bigDecimalValueOf2.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf2.stripTrailingZeros()).toPlainString();
                    plainString2.getClass();
                    int length2 = plainString2.length();
                    w0(new a8q0(plainString2, s7n0.e(length2, length2), 4));
                    return;
                }
                if (!(a420Var instanceof y320)) {
                    if (a420Var.equals(s320.f31535a)) {
                        H(new fd20((byte) 24));
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                float f3 = ((y320) a420Var).f41930a;
                gx4 gx4Var7 = ((b820) D()).f;
                if (gx4Var7 == null) {
                    return;
                }
                xyc xycVar3 = gx4Var7.b;
                BigDecimal bigDecimal6 = xycVar3.e;
                BigDecimal bigDecimal7 = xycVar3.d;
                if (bigDecimal6.compareTo(bigDecimal7) <= 0) {
                    return;
                }
                BigDecimal bigDecimalSubtract2 = bigDecimal6.subtract(bigDecimal7);
                BigDecimal bigDecimal8 = new BigDecimal(String.valueOf(f3));
                BigDecimal bigDecimal9 = new BigDecimal("100");
                RoundingMode roundingMode = RoundingMode.HALF_UP;
                BigDecimal bigDecimalDivide = bigDecimal8.divide(bigDecimal9, 6, roundingMode);
                bigDecimalDivide.getClass();
                BigDecimal bigDecimalAdd2 = bigDecimal7.add(bigDecimalSubtract2.multiply(bigDecimalDivide));
                bigDecimalAdd2.getClass();
                BigDecimal scale = bigDecimalAdd2.setScale(3, roundingMode);
                scale.getClass();
                BigDecimal bigDecimal10 = (BigDecimal) l1e0.h(scale, bigDecimal7, bigDecimal6);
                if (bigDecimal10.compareTo(xycVar3.f41701a) != 0) {
                    String plainString3 = (bigDecimal10.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal10.stripTrailingZeros()).toPlainString();
                    plainString3.getClass();
                    int length3 = plainString3.length();
                    x0(new a8q0(plainString3, s7n0.e(length3, length3), 4));
                    return;
                }
                return;
            }
            if (l520Var.equals(b420.f1937a)) {
                gx4 gx4Var8 = ((b820) D()).f;
                if (gx4Var8 == null) {
                    return;
                }
                H(new wh20(gx4Var8.c.b.f38133a, gx4Var8.b.f41701a.doubleValue(), zlt0Var.l(), zlt0Var.m(), (byte) 1));
                v0();
                return;
            }
            if (l520Var.equals(m420.f21146a)) {
                H(new fd20((byte) 26));
                v0();
                return;
            }
            if (l520Var.equals(w420.f38525a)) {
                H(new fd20((byte) 7));
                v0();
                return;
            }
            byte b9 = 22;
            if (l520Var.equals(q320.f28029a)) {
                H(new fd20(b9));
                v0();
                return;
            }
            boolean zEquals4 = l520Var.equals(e420.f7162a);
            mb20 mb20Var = mb20.f21486a;
            if (zEquals4) {
                G(mb20Var);
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, b820.a((b820) value2, null, null, null, null, null, null, null, false, false, false, false, false, 8127)));
                return;
            }
            if (l520Var.equals(o320.f24561a)) {
                sac.V(jiu0.a(this), new r520((byte) 20), null, mneVar.b, new mt00((Object) this, yjeVar, b4), 10);
                return;
            }
            boolean zEquals5 = l520Var.equals(o420.f24612a);
            x20 x20Var = this.M;
            mii0 mii0Var = this.H;
            i1w0 i1w0Var = this.Y;
            if (zEquals5) {
                ((kt2) mii0Var.b).c("bet_place_settings");
                x20Var.f40143a.a(xun.f41520a, 3174L);
                i1w0Var.d(new rh20(this, b3));
                return;
            }
            if (l520Var.equals(b520.f1980a)) {
                sac.V(jiu0.a(this), pk20.f27117a, null, mneVar.b, new gk20(this, yjeVar, b5), 10);
                return;
            }
            if (l520Var.equals(p320.f26279a)) {
                if (ua80.x((vwb0) this.u0.f6390a.f13293a.b, "HELP_COUPON_SNACKBAR_SHOWN", false)) {
                    return;
                }
                G(qb20.f28427a);
                ((vwb0) this.v0.f38265a.f13293a.b).e("HELP_COUPON_SNACKBAR_SHOWN", true);
                return;
            }
            if (l520Var.equals(i420.f14125a)) {
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                }
            } else {
                if (!l520Var.equals(p420.f26329a)) {
                    if (l520Var instanceof n320) {
                        n320 n320Var = (n320) l520Var;
                        sac.V(jiu0.a(this), new r520((byte) 21), null, mneVar.b, new fm20(this, n320Var.b, n320Var.f22829a, yjeVar, (byte) 0), 10);
                        return;
                    }
                    if (l520Var instanceof n420) {
                        n420 n420Var = (n420) l520Var;
                        sac.V(jiu0.a(this), new r520((byte) 16), null, mneVar.b, new fm20(this, n420Var.b, n420Var.f22879a, yjeVar, (byte) 1), 10);
                        return;
                    }
                    if (l520Var.equals(f520.f8939a)) {
                        G(mb20Var);
                        p7m0 p7m0Var3 = ocjVar.f25029a;
                        do {
                            value = p7m0Var3.getValue();
                            value.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var3.m(value, b820.a((b820) value, null, null, null, null, null, null, null, false, false, false, false, false, 8127)));
                        return;
                    }
                    if (!l520Var.equals(j420.f15864a)) {
                        if (l520Var.equals(g420.f10642a)) {
                            sac.V(jiu0.a(this), new r520((byte) 22), null, mneVar.b, new gk20(this, yjeVar, (byte) 4), 10);
                            return;
                        }
                        return;
                    } else {
                        long jA = ((b820) D()).f2138a.d.f17171a.a();
                        f680[] f680VarArr = f680.f8998a;
                        mii0Var.T(jA, "placement_bet");
                        x20Var.u(jA, "placement_bet");
                        G(lc20.f19780a);
                        return;
                    }
                }
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                ListIterator listIteratorP2 = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, o0w0.f24450a)), i1w0Var, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            }
        }
    }

    public final void x0(a8q0 a8q0Var) {
        Object value;
        b820 b820Var;
        gx4 gx4Var;
        BigDecimal bigDecimal;
        a8q0 a8q0VarW = W(a8q0Var);
        String str = a8q0VarW.f440a.b;
        gx4 gx4Var2 = ((b820) D()).f;
        BigDecimal bigDecimal2 = gx4Var2 != null ? gx4Var2.b.e : BigDecimal.ZERO;
        bigDecimal2.getClass();
        boolean zS = S(str, bigDecimal2);
        gx4 gx4Var3 = ((b820) D()).f;
        BigDecimal bigDecimal3 = gx4Var3 != null ? gx4Var3.b.e : BigDecimal.ZERO;
        bigDecimal3.getClass();
        a8q0 a8q0VarX = X(a8q0VarW, zS, bigDecimal3, 3, 3);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            b820Var = (b820) value;
            this.f.getClass();
            gx4Var = b820Var.f;
        } while (!p7m0Var.m(value, b820.a(b820Var, null, null, null, null, null, gx4Var != null ? gx4.a(gx4Var, a8q0VarX, null, null, null, null, 30) : null, null, false, false, false, false, false, 8159)));
        gx4 gx4Var4 = ((b820) D()).f;
        if (gx4Var4 != null) {
            xyc xycVar = gx4Var4.b;
            try {
                bigDecimal = new BigDecimal(a8q0VarX.f440a.b);
            } catch (NumberFormatException unused) {
                bigDecimal = new BigDecimal(String.valueOf(-1.0d));
            }
            BigDecimal bigDecimal4 = bigDecimal;
            boolean z = bigDecimal4.compareTo(new BigDecimal(String.valueOf(-1.0d))) != 0;
            boolean z2 = bigDecimal4.compareTo(xycVar.e) > 0 || zS;
            boolean z3 = bigDecimal4.compareTo(xycVar.d) < 0;
            BigDecimal bigDecimal5 = xycVar.f41701a;
            H(new oh20(bigDecimal4, z2, z3, z, (byte) 1));
            if (bigDecimal5.equals(bigDecimal4)) {
                return;
            }
            M0();
        }
    }

    public final void y0(a8q0 a8q0Var) {
        a8q0 a8q0VarW = W(a8q0Var);
        vw6 vw6Var = ((b820) D()).d.f31171a.b;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(vw6Var.i.b / vw6Var.c()));
        a8q0 a8q0VarX = X(a8q0VarW, S(a8q0VarW.f440a.b, bigDecimal) && ((b820) D()).d.f31171a.b.i.f46769a, bigDecimal, 13, 2);
        H(new w1y(a8q0VarX, (byte) 4));
        Double dI = kotlin.text.b.i(a8q0VarX.f440a.b);
        double dDoubleValue = dI != null ? dI.doubleValue() : -1.0d;
        if (dDoubleValue == ((b820) D()).d.f31171a.b.f38133a) {
            return;
        }
        H(new ks6(dDoubleValue, (byte) 7));
        M0();
    }

    public final void z0() {
        Object value;
        b820 b820Var;
        bby bbyVar = this.T0;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        e40 e40Var = this.z.a().f32117a.f12063a.b ? e40.b : e40.f7159a;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            b820Var = (b820) value;
            this.f.getClass();
        } while (!p7m0Var.m(value, b820.a(b820Var, null, null, an5.a(b820Var.c, new g40(-1.0d, e40Var)), null, null, null, null, false, false, false, false, false, 8187)));
    }
}
