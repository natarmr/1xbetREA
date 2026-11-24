package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class on20 extends i3t0 {
    public static final /* synthetic */ int m1 = 0;
    public final x20 A;
    public final o4a A0;
    public final m1e B;
    public final mpc B0;
    public final duj C;
    public final w5z C0;
    public final ctf0 D;
    public final svu D0;
    public final mne E;
    public final mpc E0;
    public final b8u F;
    public final uqx F0;
    public final ot G;
    public final tqc G0;
    public final f6k H;
    public final u0u H0;
    public final u4a I;
    public final dnv I0;
    public final i1w0 J;
    public final fqc J0;
    public final v88 K;
    public final bsu K0;
    public final tmt L;
    public final urt L0;
    public final nou M;
    public final jyg0 M0;
    public final m0u N;
    public final es N0;
    public final vyt O;
    public final gs O0;
    public final lbu P;
    public final gs P0;
    public final pyu Q;
    public final ipc Q0;
    public final q4u R;
    public final g320 R0;
    public final b8u S;
    public final uii S0;
    public final yk5 T;
    public final cl5 T0;
    public final kxu U;
    public final bst U0;
    public final ivn V;
    public final gg5 V0;
    public final iqi W;
    public final ih5 W0;
    public final hsj X;
    public final pyu X0;
    public final ert Y;
    public final rxu Y0;
    public final hst Z;
    public final j9c Z0;
    public final aot a0;
    public final z7u a1;
    public final j9c b0;
    public final reu b1;
    public final mne c0;
    public final x1u c1;
    public final lhf0 d0;
    public final ih5 d1;
    public final bhu e0;
    public final l7k e1;
    public final y3j0 f0;
    public final cmt f1;
    public final ni9 g0;
    public bby g1;
    public final g2v h0;
    public bby h1;
    public final onv i0;
    public final k050 i1;
    public final wdu j0;
    public bby j1;
    public final o3c k0;
    public c4m0 k1;
    public final eti0 l0;
    public c4m0 l1;
    public final ni9 m0;
    public final znt n0;
    public final g320 o;
    public final ert o0;
    public final ieu p;
    public final gs p0;
    public final daf q;
    public final pv00 q0;
    public final khf0 r;
    public final ymv r0;
    public final lbu s;
    public final gr00 s0;
    public final dzu t;
    public final hst t0;
    public final reu u;
    public final rq u0;
    public final pru v;
    public final tqc v0;
    public final r4v w;
    public final mpc w0;
    public final nvu x;
    public final phf0 x0;
    public final zlt0 y;
    public final hst y0;
    public final mii0 z;
    public final tqc z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public on20(g320 g320Var, ieu ieuVar, daf dafVar, khf0 khf0Var, lbu lbuVar, dzu dzuVar, reu reuVar, pru pruVar, r4v r4vVar, nvu nvuVar, zlt0 zlt0Var, mii0 mii0Var, x20 x20Var, m1e m1eVar, duj dujVar, ctf0 ctf0Var, mne mneVar, b8u b8uVar, ot otVar, f6k f6kVar, u4a u4aVar, i1w0 i1w0Var, v88 v88Var, tmt tmtVar, nou nouVar, m0u m0uVar, vyt vytVar, lbu lbuVar2, pyu pyuVar, q4u q4uVar, b8u b8uVar2, yk5 yk5Var, kxu kxuVar, lsn lsnVar, k52 k52Var, ivn ivnVar, iqi iqiVar, hsj hsjVar, ert ertVar, hst hstVar, aot aotVar, wsc wscVar, j9c j9cVar, mne mneVar2, lhf0 lhf0Var, bhu bhuVar, y3j0 y3j0Var, gs gsVar, ni9 ni9Var, g2v g2vVar, onv onvVar, wdu wduVar, o3c o3cVar, eti0 eti0Var, ni9 ni9Var2, znt zntVar, ert ertVar2, gs gsVar2, pv00 pv00Var, ymv ymvVar, gr00 gr00Var, hst hstVar2, rq rqVar, tqc tqcVar, mpc mpcVar, phf0 phf0Var, hst hstVar3, tqc tqcVar2, o4a o4aVar, mpc mpcVar2, w5z w5zVar, svu svuVar, mpc mpcVar3, uqx uqxVar, tqc tqcVar3, u0u u0uVar, dnv dnvVar, fqc fqcVar, bsu bsuVar, urt urtVar, jyg0 jyg0Var, es esVar, gs gsVar3, gs gsVar4, ipc ipcVar, g320 g320Var2, uii uiiVar, cl5 cl5Var, bst bstVar, gg5 gg5Var, ih5 ih5Var, pyu pyuVar2, rxu rxuVar, xre xreVar, j9c j9cVar2, j9c j9cVar3, z7u z7uVar, lk5 lk5Var, reu reuVar2, x1u x1uVar, wyu wyuVar, ih5 ih5Var2, l7k l7kVar, r9u r9uVar, cmt cmtVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        i1w0Var.getClass();
        wyuVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        byte b = 1;
        yje yjeVar = null;
        super(new pg1(wyuVar, zlt0Var, reuVar, ctf0Var, pruVar, j9cVar, lk5Var), cvm0.p(rwjVar, rwjVar), new idn(ctf0Var, pruVar, r9uVar, b), (yzn0) null);
        this.o = g320Var;
        this.p = ieuVar;
        this.q = dafVar;
        this.r = khf0Var;
        this.s = lbuVar;
        this.t = dzuVar;
        this.u = reuVar;
        this.v = pruVar;
        this.w = r4vVar;
        this.x = nvuVar;
        this.y = zlt0Var;
        this.z = mii0Var;
        this.A = x20Var;
        this.B = m1eVar;
        this.C = dujVar;
        this.D = ctf0Var;
        this.E = mneVar;
        this.F = b8uVar;
        this.G = otVar;
        this.H = f6kVar;
        this.I = u4aVar;
        this.J = i1w0Var;
        this.K = v88Var;
        this.L = tmtVar;
        this.M = nouVar;
        this.N = m0uVar;
        this.O = vytVar;
        this.P = lbuVar2;
        this.Q = pyuVar;
        this.R = q4uVar;
        this.S = b8uVar2;
        this.T = yk5Var;
        this.U = kxuVar;
        this.V = ivnVar;
        this.W = iqiVar;
        this.X = hsjVar;
        this.Y = ertVar;
        this.Z = hstVar;
        this.a0 = aotVar;
        this.b0 = j9cVar;
        this.c0 = mneVar2;
        this.d0 = lhf0Var;
        this.e0 = bhuVar;
        this.f0 = y3j0Var;
        this.g0 = ni9Var;
        this.h0 = g2vVar;
        this.i0 = onvVar;
        this.j0 = wduVar;
        this.k0 = o3cVar;
        this.l0 = eti0Var;
        this.m0 = ni9Var2;
        this.n0 = zntVar;
        this.o0 = ertVar2;
        this.p0 = gsVar2;
        this.q0 = pv00Var;
        this.r0 = ymvVar;
        this.s0 = gr00Var;
        this.t0 = hstVar2;
        this.u0 = rqVar;
        this.v0 = tqcVar;
        this.w0 = mpcVar;
        this.x0 = phf0Var;
        this.y0 = hstVar3;
        this.z0 = tqcVar2;
        this.A0 = o4aVar;
        this.B0 = mpcVar2;
        this.C0 = w5zVar;
        this.D0 = svuVar;
        this.E0 = mpcVar3;
        this.F0 = uqxVar;
        this.G0 = tqcVar3;
        this.H0 = u0uVar;
        this.I0 = dnvVar;
        this.J0 = fqcVar;
        this.K0 = bsuVar;
        this.L0 = urtVar;
        this.M0 = jyg0Var;
        this.N0 = esVar;
        this.O0 = gsVar3;
        this.P0 = gsVar4;
        this.Q0 = ipcVar;
        this.R0 = g320Var2;
        this.S0 = uiiVar;
        this.T0 = cl5Var;
        this.U0 = bstVar;
        this.V0 = gg5Var;
        this.W0 = ih5Var;
        this.X0 = pyuVar2;
        this.Y0 = rxuVar;
        this.Z0 = j9cVar2;
        this.a1 = z7uVar;
        this.b1 = reuVar2;
        this.c1 = x1uVar;
        this.d1 = ih5Var2;
        this.e1 = l7kVar;
        this.f1 = cmtVar;
        this.i1 = new k050();
        byte b2 = 3;
        i3t0.L(this, new fnq(new fnq(vtb.N(xreVar.f41366a.r), new rl20(this, yjeVar, (byte) 4), (byte) 4), new rl20(this, yjeVar, (byte) 5), (byte) 4), null, null, 3);
        i3t0.L(this, new fnq(j9cVar3.b(), new wl20(this, yjeVar, b), (byte) 4), null, null, 3);
        i3t0.L(this, new fnq(wscVar.f39683a.f11847a.c, new rl20(this, yjeVar, b2), (byte) 4), null, null, 3);
        i3t0.L(this, new fnq(i120.W(k52Var.a()), new j33(this, null), (byte) 4), null, null, 3);
        byte b3 = 2;
        i3t0.L(this, new fnq(i120.W(new fnq(new p6d(((lye) ((khf0) lsnVar.f20589a).b).o, ((lye) ((khf0) reuVar2.b).b).q, new tze(3, null, (byte) 1), (byte) 1), new rl20(this, yjeVar, b3), (byte) 4)), new wl20(this, yjeVar, (byte) 0), (byte) 4), null, null, 3);
        i3t0.L(this, new fnq(ertVar.b(), new rl20(this, yjeVar, b), (byte) 4), null, null, 3);
        i3t0.L(this, new fnq(new fnq(((ave) gsVar.f11805a.c).o, new ql20(this, yjeVar, b3)), new ql20(this, yjeVar, b2), (byte) 4), null, null, 3);
    }

    public static double F0(double d, double d2, double d3, boolean z) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(d2));
        BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(d3));
        BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimal2);
        bigDecimalAdd.getClass();
        return (bigDecimalAdd.compareTo(bigDecimal3) <= 0 || z) ? bigDecimalAdd.doubleValue() : d3;
    }

    public static BigDecimal M(BigDecimal bigDecimal, yyc yycVar) {
        BigDecimal bigDecimal2 = yycVar.f43459a;
        BigDecimal bigDecimal3 = yycVar.d;
        BigDecimal bigDecimal4 = yycVar.e;
        if (bigDecimal2.equals(new BigDecimal(String.valueOf(0.0d)))) {
            return yycVar.b;
        }
        if (bigDecimal.compareTo(bigDecimal4) > 0 || bigDecimal.compareTo(bigDecimal3) < 0) {
            return bigDecimal.compareTo(bigDecimal4) > 0 ? bigDecimal4 : bigDecimal3;
        }
        return bigDecimal;
    }

    public static double O(tw6 tw6Var) {
        double d = tw6Var.f34633a;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(tw6Var.c));
        double d2 = tw6Var.d;
        BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(d2));
        BigDecimal bigDecimal4 = new BigDecimal(String.valueOf(tw6Var.b()));
        if (d == -1.0d) {
            return tw6Var.b;
        }
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
        bigDecimalSubtract.getClass();
        if (bigDecimalSubtract.compareTo(bigDecimal3) < 0) {
            return d2;
        }
        if (bigDecimal.compareTo(bigDecimal4) > 0) {
            return tw6Var.b();
        }
        BigDecimal bigDecimalSubtract2 = bigDecimal.subtract(bigDecimal2);
        bigDecimalSubtract2.getClass();
        return bigDecimalSubtract2.doubleValue();
    }

    public static double P(tw6 tw6Var) {
        double d = tw6Var.f34633a;
        if (d != -1.0d) {
            return F0(d, tw6Var.c, tw6Var.b(), tw6Var.m);
        }
        boolean z = tw6Var.h;
        double d2 = tw6Var.b;
        return z ? d2 : F0(d2, tw6Var.c, tw6Var.b(), tw6Var.m);
    }

    public static double R(float f, tw6 tw6Var) {
        double d = tw6Var.d;
        double dB = tw6Var.b();
        return l1e0.b(new BigDecimal(((((double) f) / 100.0d) * (dB - d)) + d).setScale(2, RoundingMode.HALF_UP).doubleValue(), d, dB);
    }

    public static boolean T(String str, BigDecimal bigDecimal) {
        BigDecimal bigDecimalH = kotlin.text.b.h(str);
        return (bigDecimalH == null || bigDecimal.equals(BigDecimal.ZERO) || bigDecimalH.compareTo(bigDecimal) <= 0) ? false : true;
    }

    public static a8q0 a0(a8q0 a8q0Var) {
        String strP = twn.p("[^0-9.]", a8q0Var.f440a.b, "");
        return strP.length() == 0 ? new a8q0("", 0L, 6) : a8q0.b(a8q0Var, strP, 0L, 6);
    }

    public static a8q0 b0(a8q0 a8q0Var, boolean z, BigDecimal bigDecimal, int i) {
        long jE;
        String plainString = z ? bigDecimal.toPlainString() : a8q0Var.f440a.b;
        plainString.getClass();
        boolean z2 = plainString.length() > 0 && plainString.charAt(0) == '.';
        if (z2) {
            plainString = "0".concat(plainString);
        } else {
            int iU = StringsKt.U('.', 0, 6, plainString);
            if (iU != -1) {
                int i2 = iU + 1;
                plainString = ttm0.L(i2, plainString).concat(kotlin.text.c.r(plainString.substring(i2), Separators.DOT, "", false));
            }
        }
        if (StringsKt.P(plainString, '.')) {
            String strQ0 = StringsKt.q0(plainString, '.');
            String strN0 = StringsKt.n0(plainString, '.');
            if (strQ0.length() > 13) {
                strQ0 = ttm0.L(13, strQ0);
            }
            if (strN0.length() > i) {
                strN0 = ttm0.L(i, strN0);
            }
            plainString = kng0.l(strQ0, Separators.DOT, strN0);
        } else if (plainString.length() > 13) {
            plainString = ttm0.L(13, plainString);
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

    public final void A0(a8q0 a8q0Var) {
        a8q0 a8q0VarA0 = a0(a8q0Var);
        tw6 tw6Var = ((a820) D()).e.f27665a.b;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(tw6Var.i.b / tw6Var.c()));
        boolean z = true;
        char c = 1;
        a8q0 a8q0VarB0 = b0(a8q0VarA0, T(a8q0VarA0.f440a.b, bigDecimal) && ((a820) D()).e.f27665a.b.i.f46472a, bigDecimal, 2);
        H(new xh20((Object) a8q0VarB0, z, (byte) (c == true ? 1 : 0)));
        Double dI = kotlin.text.b.i(a8q0VarB0.f440a.b);
        double dDoubleValue = dI != null ? dI.doubleValue() : -1.0d;
        if (dDoubleValue == ((a820) D()).e.f27665a.b.f34633a) {
            return;
        }
        N0(dDoubleValue);
        H(new ks6(dDoubleValue, (byte) 3));
        R0();
        i3t0.K(this, null, null, new hj20(this, null, (byte) 6), 3);
    }

    public final void B0() {
        G(lb20.f19736a);
        H(new fd20((byte) 11));
    }

    public final void C0() {
        pek0 pek0Var = pek0.f26859a;
        ctf0 ctf0Var = this.D;
        G(new pc20(new xdk0(pek0Var, ctf0Var.b.a(R.string.no_connection_title_with_hyphen, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.no_connection_description, Arrays.copyOf(new Object[0], 0)), null, null, null, 120)));
    }

    /* JADX WARN: Code duplicated, block: B:78:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:79:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object D0(oa20 oa20Var, q4f q4fVar, boolean z, zje zjeVar) {
        sm20 sm20Var;
        double dC;
        String strA;
        String str;
        String str2;
        double d;
        String str3;
        String str4;
        boolean z2;
        q4f q4fVar2;
        hg7 hg7Var;
        en7 en7Var;
        String strR;
        boolean z3;
        String str5;
        String str6;
        String str7;
        hg7 hg7Var2;
        String str8;
        String str9;
        q4f q4fVar3;
        long j;
        String strO;
        on20 on20Var;
        String str10;
        int i;
        boolean z4;
        String str11;
        pn40 pn40Var;
        String str12;
        String str13;
        q4f q4fVar4;
        long j2;
        String str14;
        int i2;
        hg7 hg7Var3;
        boolean z5;
        on20 on20Var2 = this;
        oa20 oa20Var2 = oa20Var;
        boolean z6 = z;
        if (zjeVar instanceof sm20) {
            sm20Var = (sm20) zjeVar;
            int i3 = sm20Var.Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sm20Var.Z = i3 - Integer.MIN_VALUE;
            } else {
                sm20Var = new sm20(on20Var2, zjeVar);
            }
        } else {
            sm20Var = new sm20(on20Var2, zjeVar);
        }
        Object objQ = sm20Var.B;
        wne wneVar = wne.f39444a;
        int i4 = sm20Var.Z;
        ctf0 ctf0Var = on20Var2.D;
        ho7 ho7Var = ho7.b;
        if (i4 != 0) {
            if (i4 == 1) {
                boolean z7 = sm20Var.w;
                double d2 = sm20Var.y;
                dC = sm20Var.x;
                boolean z8 = sm20Var.v;
                str2 = sm20Var.m;
                str4 = sm20Var.l;
                str3 = sm20Var.k;
                q4f q4fVar5 = sm20Var.j;
                oa20Var2 = sm20Var.i;
                z1x.P(objQ);
                str = "";
                z2 = z7;
                q4fVar2 = q4fVar5;
                d = d2;
                z6 = z8;
            } else {
                if (i4 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i5 = sm20Var.A;
                j2 = sm20Var.z;
                z4 = sm20Var.w;
                pn40Var = sm20Var.u;
                on20Var = sm20Var.t;
                strR = sm20Var.s;
                en7Var = sm20Var.r;
                str5 = sm20Var.q;
                hg7 hg7Var4 = sm20Var.p;
                String str15 = sm20Var.o;
                str11 = sm20Var.n;
                String str16 = sm20Var.m;
                i2 = i5;
                String str17 = sm20Var.l;
                str12 = sm20Var.k;
                q4fVar4 = sm20Var.j;
                z1x.P(objQ);
                hg7Var3 = hg7Var4;
                str4 = str17;
                str13 = str16;
                str14 = str15;
                z3 = false;
            }
            double dDoubleValue = ((Number) objQ).doubleValue();
            pn40Var.getClass();
            str8 = str12;
            j = j2;
            strO = pn40.o(dDoubleValue);
            q4fVar3 = q4fVar4;
            str10 = strR;
            str7 = str11;
            hg7Var2 = hg7Var3;
            str6 = str14;
            i = i2;
            str9 = str13;
            en7 en7Var2 = en7Var;
            String str18 = str5;
            String str19 = str4;
            String strI0 = on20Var2.i0(z4);
            if (i != 0) {
                z5 = true;
            } else {
                z5 = z3;
            }
            on20Var.G(new hc20(str19, str8, j, str10, strO, str9, q4fVar3, en7Var2, str18, z5, str6, hg7Var2, str7, strI0));
            return Unit.f46060a;
        }
        z1x.P(objQ);
        Double d3 = new Double(oa20Var2.j);
        if (d3.doubleValue() == 0.0d) {
            d3 = null;
        }
        if (d3 != null) {
            dC = d3.doubleValue();
        } else {
            tw6 tw6Var = ((a820) on20Var2.D()).e.f27665a.b;
            dC = tw6Var.c() * tw6Var.f34633a;
        }
        double d4 = ((a820) on20Var2.D()).e.f27665a.b.f34633a;
        boolean zEquals = ((a820) on20Var2.D()).c.equals(ho7Var);
        if (q4fVar == q4f.d || q4fVar == q4f.c || q4fVar == q4f.i || (q4fVar == q4f.e && !z6)) {
            strA = oa20Var2.g;
            if (strA.equals("0")) {
                strA = null;
            }
            if (strA == null) {
                str = "";
                strA = ctf0Var.b.a(R.string.sp_coef, Arrays.copyOf(new Object[0], 0));
            } else {
                str = "";
            }
        } else {
            strA = "";
            str = strA;
        }
        pn40 pn40Var2 = pn40.f27267a;
        String strC = pn40.c(dC, p3u0.g);
        str2 = ((a820) on20Var2.D()).e.f27665a.b.f;
        sm20Var.i = oa20Var2;
        sm20Var.j = q4fVar;
        sm20Var.k = strA;
        sm20Var.l = strC;
        sm20Var.m = str2;
        sm20Var.v = z6;
        sm20Var.x = dC;
        sm20Var.y = d4;
        sm20Var.w = zEquals;
        String str20 = strA;
        sm20Var.Z = 1;
        Object objF0 = on20Var2.f0(q4fVar, sm20Var);
        if (objF0 == wneVar) {
            return wneVar;
        }
        d = d4;
        str3 = str20;
        str4 = strC;
        z2 = zEquals;
        objQ = objF0;
        q4fVar2 = q4fVar;
        String str21 = (String) objQ;
        boolean z9 = z2;
        String strA2 = ctf0Var.b.a(z2 ? R.string.success_auto_bet : R.string.bet_processed_successfully, Arrays.copyOf(new Object[0], 0));
        ko7 ko7Var = ((a820) on20Var2.D()).c;
        if (ko7Var.equals(jo7.b)) {
            hg7Var = hg7.f13004a;
        } else if (ko7Var.equals(ho7Var)) {
            hg7Var = hg7.c;
        } else {
            if (!ko7Var.equals(io7.b)) {
                t9f.b();
                return null;
            }
            hg7Var = hg7.b;
        }
        hg7 hg7Var5 = hg7Var;
        long j3 = oa20Var2.e;
        String str22 = oa20Var2.f24910a;
        en7Var = (en7) on20Var2.Y.b().getValue();
        int i6 = dC > 0.0d ? 1 : 0;
        double d5 = dC;
        boolean z10 = z6;
        strR = kotlin.text.c.r(on20Var2.h0(((a820) on20Var2.D()).e.f27665a.b.p, null), Separators.COLON, str, false);
        if (hg7Var5 == hg7.f13004a && !on20Var2.u.c().f24244a && on20Var2.r0()) {
            pn40 pn40Var3 = pn40.f27267a;
            str5 = str22;
            double dG0 = on20Var2.g0(oa20Var2.f);
            sm20Var.i = null;
            sm20Var.j = q4fVar2;
            sm20Var.k = str3;
            sm20Var.l = str4;
            sm20Var.m = str2;
            sm20Var.n = str21;
            sm20Var.o = strA2;
            sm20Var.p = hg7Var5;
            sm20Var.q = str5;
            sm20Var.r = en7Var;
            sm20Var.s = strR;
            sm20Var.t = on20Var2;
            sm20Var.u = pn40Var3;
            sm20Var.v = z10;
            sm20Var.x = d5;
            double d6 = d;
            sm20Var.y = d6;
            sm20Var.w = z9;
            q4f q4fVar6 = q4fVar2;
            sm20Var.z = j3;
            sm20Var.A = i6;
            sm20Var.Z = 2;
            z3 = false;
            on20Var2 = this;
            objQ = on20Var2.Q(d6, dG0, sm20Var);
            if (objQ == wneVar) {
                return wneVar;
            }
            str11 = str21;
            pn40Var = pn40Var3;
            str12 = str3;
            str13 = str2;
            q4fVar4 = q4fVar6;
            j2 = j3;
            str14 = strA2;
            i2 = i6;
            hg7Var3 = hg7Var5;
            z4 = z9;
            on20Var = on20Var2;
            double dDoubleValue2 = ((Number) objQ).doubleValue();
            pn40Var.getClass();
            str8 = str12;
            j = j2;
            strO = pn40.o(dDoubleValue2);
            q4fVar3 = q4fVar4;
            str10 = strR;
            str7 = str11;
            hg7Var2 = hg7Var3;
            str6 = str14;
            i = i2;
            str9 = str13;
        } else {
            z3 = false;
            str5 = str22;
            str6 = strA2;
            str7 = str21;
            hg7Var2 = hg7Var5;
            str8 = str3;
            str9 = str2;
            q4fVar3 = q4fVar2;
            j = j3;
            strO = null;
            on20Var = on20Var2;
            str10 = strR;
            i = i6;
            z4 = z9;
        }
        en7 en7Var3 = en7Var;
        String str110 = str5;
        String str111 = str4;
        String strI1 = on20Var2.i0(z4);
        if (i != 0) {
            z5 = true;
        } else {
            z5 = z3;
        }
        on20Var.G(new hc20(str111, str8, j, str10, strO, str9, q4fVar3, en7Var3, str110, z5, str6, hg7Var2, str7, strI1));
        return Unit.f46060a;
    }

    public final void E0() {
        bby bbyVar = this.j1;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.j1 = sac.f0(jiu0.a(this), 500L, TimeUnit.MILLISECONDS, this.E.f22085a, wm20.f39384a, new wl20(this, yjeVar, (byte) 3), 32);
    }

    public final void G0(a8q0 a8q0Var, boolean z) {
        H(new q2n((Object) ((a820) D()).g, (Object) a8q0Var, z, (byte) 9));
    }

    public final void H0(BigDecimal bigDecimal) {
        String plainString = bigDecimal.toPlainString();
        plainString.getClass();
        int length = plainString.length();
        H(new w1y(new a8q0(plainString, s7n0.e(length, length), 4), (byte) 5));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I0(ql5 ql5Var, zje zjeVar) {
        zm20 zm20Var;
        if (zjeVar instanceof zm20) {
            zm20Var = (zm20) zjeVar;
            int i = zm20Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                zm20Var.l = i - Integer.MIN_VALUE;
            } else {
                zm20Var = new zm20(this, zjeVar);
            }
        } else {
            zm20Var = new zm20(this, zjeVar);
        }
        Object objA = zm20Var.j;
        wne wneVar = wne.f39444a;
        int i2 = zm20Var.l;
        if (i2 == 0) {
            z1x.P(objA);
            zm20Var.i = ql5Var;
            zm20Var.l = 1;
            objA = this.I.a(zm20Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ql5Var = zm20Var.i;
            z1x.P(objA);
        }
        H(new ns6(ql5Var, ((Boolean) objA).booleanValue(), (byte) 4));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r5.y0.b(r6, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r5.Q0.a(r6, r8, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J0(double r6, a.zje r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof a.an20
            if (r0 == 0) goto L13
            r0 = r8
            a.an20 r0 = (a.an20) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.an20 r0 = new a.an20
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 == r4) goto L26
            if (r2 != r3) goto L2c
        L26:
            double r6 = r0.i
            a.z1x.P(r8)
            goto L74
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L33:
            a.z1x.P(r8)
            java.lang.Object r8 = r5.D()
            a.a820 r8 = (a.a820) r8
            a.q4f r8 = r8.j
            int r8 = r8.ordinal()
            r2 = 6
            if (r8 == r2) goto L57
            r2 = 11
            if (r8 == r2) goto L4a
            goto L74
        L4a:
            r0.i = r6
            r0.l = r3
            a.hst r8 = r5.y0
            java.lang.Object r8 = r8.b(r6, r0)
            if (r8 != r1) goto L74
            goto L73
        L57:
            a.hst r8 = r5.t0
            a.oif0 r8 = r8.f13600a
            java.util.List r8 = r8.n()
            java.lang.Object r8 = kotlin.collections.CollectionsKt.U(r8)
            a.hf6 r8 = (a.hf6) r8
            int r8 = r8.f12958a
            r0.i = r6
            r0.l = r4
            a.ipc r2 = r5.Q0
            java.lang.Object r8 = r2.a(r6, r8, r0)
            if (r8 != r1) goto L74
        L73:
            return r1
        L74:
            a.tqc r5 = r5.z0
            a.g45 r5 = r5.f34374a
            java.lang.Object r5 = r5.c
            a.ave r5 = (a.ave) r5
            r5.g = r6
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.on20.J0(double, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058 A[PHI: r3
  0x0058: PHI (r3v3 java.lang.String) = (r3v1 java.lang.String), (r3v4 java.lang.String) binds: [B:33:0x005f, B:27:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    public final m0d K0(m0d m0dVar, String str, double d, boolean z, boolean z2) {
        String str2;
        String str3;
        double d2 = m0dVar.f20948a;
        azc azcVarG = this.V.g(d, d2, z2);
        boolean z3 = z && !q3d.j(azc.d, azc.f1709a).contains(azcVarG);
        Double dValueOf = Double.valueOf(d);
        if (!z) {
            dValueOf = null;
        }
        double dDoubleValue = dValueOf != null ? dValueOf.doubleValue() : 0.0d;
        Double dValueOf2 = Double.valueOf(d2);
        if (!z3) {
            dValueOf2 = null;
        }
        double dDoubleValue2 = dValueOf2 != null ? dValueOf2.doubleValue() : 0.0d;
        if (d == d2) {
            str2 = z3 ? m0dVar.d : null;
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
        } else {
            str2 = z3 ? m0dVar.b : null;
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
        }
        azc azcVar = m0dVar.e;
        o0d o0dVar = z ? o0d.b : o0d.f24418a;
        str.getClass();
        azcVar.getClass();
        return new m0d(dDoubleValue, str, dDoubleValue2, str3, azcVarG, azcVar, o0dVar);
    }

    public final void L0(boolean z) {
        H(new uo1((byte) 4, (Object) this, z && this.b0.a() == q4f.c, z));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    /* JADX WARN: Code duplicated, block: B:55:0x011f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0129  */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b7 A[LOOP:1: B:64:0x0176->B:68:0x01b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object M0(vf7 vf7Var, boolean z, zje zjeVar) {
        cn20 cn20Var;
        vf7 vf7Var2;
        boolean z2;
        ql5 ql5Var;
        vf7 vf7Var3;
        final double d;
        double d2;
        int i;
        int i2;
        Object objC;
        double d3;
        int i3;
        boolean z3;
        vf7 vf7Var4;
        double d4;
        boolean z4;
        long j;
        boolean z5;
        double d5;
        final double d6;
        boolean z6;
        vf7 vf7Var5;
        final boolean z7;
        p7m0 p7m0Var;
        Object value;
        oyg0 oyg0Var;
        p7m0 p7m0Var2;
        Object value2;
        vf7 vf7Var6;
        if (zjeVar instanceof cn20) {
            cn20Var = (cn20) zjeVar;
            int i4 = cn20Var.r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cn20Var.r = i4 - Integer.MIN_VALUE;
            } else {
                cn20Var = new cn20(this, zjeVar);
            }
        } else {
            cn20Var = new cn20(this, zjeVar);
        }
        cn20 cn20Var2 = cn20Var;
        Object objG = cn20Var2.p;
        Object obj = wne.f39444a;
        int i5 = cn20Var2.r;
        if (i5 == 0) {
            z1x.P(objG);
            bm5 bm5Var = bm5.i;
            vf7Var2 = vf7Var;
            cn20Var2.i = vf7Var2;
            z2 = z;
            cn20Var2.k = z2;
            cn20Var2.r = 1;
            objG = khf0.G(this.r, bm5Var, cn20Var2);
            if (objG != obj) {
            }
            return obj;
        }
        if (i5 == 1) {
            boolean z8 = cn20Var2.k;
            vf7 vf7Var7 = cn20Var2.i;
            z1x.P(objG);
            z2 = z8;
            vf7Var2 = vf7Var7;
        } else {
            if (i5 == 2) {
                boolean z9 = cn20Var2.k;
                ql5Var = cn20Var2.j;
                vf7 vf7Var8 = cn20Var2.i;
                z1x.P(objG);
                vf7Var3 = vf7Var8;
                z2 = z9;
                d = ((c3j0) objG).b;
                d2 = vf7Var3.d;
                if (d2 == 0.0d) {
                    i = 1;
                } else {
                    i = 0;
                }
                i2 = i ^ 1;
                if (z2) {
                    d3 = d;
                    z3 = z2;
                    vf7Var4 = vf7Var3;
                    if (vf7Var4.h) {
                        d4 = 9.99999999999999E12d;
                    } else {
                        d4 = vf7Var4.b;
                    }
                    z4 = vf7Var4.g;
                    double d7 = d3;
                    j = vf7Var4.f37318a;
                    if (i2 != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    cn20Var2.i = vf7Var4;
                    cn20Var2.j = null;
                    cn20Var2.k = z3;
                    cn20Var2.l = d7;
                    cn20Var2.o = i2;
                    cn20Var2.m = d;
                    cn20Var2.n = d4;
                    cn20Var2.r = 4;
                    d5 = d4;
                    if (P0(d, d5, z5, z4, j, cn20Var2) != obj) {
                        d6 = d5;
                        z6 = z3;
                        vf7Var5 = vf7Var4;
                    }
                } else if (i == 0) {
                    d3 = d;
                    d = d2;
                    z3 = z2;
                    vf7Var4 = vf7Var3;
                    if (vf7Var4.h) {
                        d4 = 9.99999999999999E12d;
                    } else {
                        d4 = vf7Var4.b;
                    }
                    z4 = vf7Var4.g;
                    double d8 = d3;
                    j = vf7Var4.f37318a;
                    if (i2 != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    cn20Var2.i = vf7Var4;
                    cn20Var2.j = null;
                    cn20Var2.k = z3;
                    cn20Var2.l = d8;
                    cn20Var2.o = i2;
                    cn20Var2.m = d;
                    cn20Var2.n = d4;
                    cn20Var2.r = 4;
                    d5 = d4;
                    if (P0(d, d5, z5, z4, j, cn20Var2) != obj) {
                        d6 = d5;
                        z6 = z3;
                        vf7Var5 = vf7Var4;
                    }
                } else {
                    long j2 = ql5Var.e;
                    cn20Var2.i = vf7Var3;
                    cn20Var2.j = null;
                    cn20Var2.k = z2;
                    cn20Var2.l = d;
                    cn20Var2.o = i2;
                    cn20Var2.r = 3;
                    objC = this.N.f20973a.c(j2, cn20Var2);
                    if (objC != obj) {
                        objG = objC;
                        d3 = d;
                        i3 = i2;
                        d2 = ((xuf) objG).i;
                        i2 = i3;
                        d = d2;
                        z3 = z2;
                        vf7Var4 = vf7Var3;
                        if (vf7Var4.h) {
                            d4 = 9.99999999999999E12d;
                        } else {
                            d4 = vf7Var4.b;
                        }
                        z4 = vf7Var4.g;
                        double d9 = d3;
                        j = vf7Var4.f37318a;
                        if (i2 != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        cn20Var2.i = vf7Var4;
                        cn20Var2.j = null;
                        cn20Var2.k = z3;
                        cn20Var2.l = d9;
                        cn20Var2.o = i2;
                        cn20Var2.m = d;
                        cn20Var2.n = d4;
                        cn20Var2.r = 4;
                        d5 = d4;
                        if (P0(d, d5, z5, z4, j, cn20Var2) != obj) {
                            d6 = d5;
                            z6 = z3;
                            vf7Var5 = vf7Var4;
                        }
                    }
                }
                return obj;
            }
            if (i5 == 3) {
                i3 = cn20Var2.o;
                d3 = cn20Var2.l;
                z2 = cn20Var2.k;
                vf7Var3 = cn20Var2.i;
                z1x.P(objG);
                d2 = ((xuf) objG).i;
                i2 = i3;
                d = d2;
                z3 = z2;
                vf7Var4 = vf7Var3;
                if (vf7Var4.h) {
                    d4 = 9.99999999999999E12d;
                } else {
                    d4 = vf7Var4.b;
                }
                z4 = vf7Var4.g;
                double d10 = d3;
                j = vf7Var4.f37318a;
                if (i2 != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                cn20Var2.i = vf7Var4;
                cn20Var2.j = null;
                cn20Var2.k = z3;
                cn20Var2.l = d10;
                cn20Var2.o = i2;
                cn20Var2.m = d;
                cn20Var2.n = d4;
                cn20Var2.r = 4;
                d5 = d4;
                if (P0(d, d5, z5, z4, j, cn20Var2) != obj) {
                    d6 = d5;
                    z6 = z3;
                    vf7Var5 = vf7Var4;
                }
                return obj;
            }
            if (i5 != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d11 = cn20Var2.n;
            double d12 = cn20Var2.m;
            int i6 = cn20Var2.o;
            boolean z10 = cn20Var2.k;
            vf7 vf7Var9 = cn20Var2.i;
            z1x.P(objG);
            i2 = i6;
            z6 = z10;
            vf7Var5 = vf7Var9;
            d6 = d11;
            d = d12;
        }
        final boolean z11 = vf7Var5.g;
        final long j3 = vf7Var5.f37318a;
        if (i2 != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        H(new Function2() { // from class: a.fi20
            /* JADX WARN: Code duplicated, block: B:24:0x0051  */
            /* JADX WARN: Code duplicated, block: B:8:0x002f  */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                boolean z12;
                double d13;
                a820 a820Var = (a820) obj3;
                ((oyg0) obj2).getClass();
                a820Var.getClass();
                hx4 hx4Var = a820Var.g;
                bx6 bx6Var = hx4Var.c;
                tw6 tw6Var = bx6Var.b;
                double d14 = tw6Var.b;
                double d15 = tw6Var.f34633a;
                boolean z13 = bx6Var.c;
                double d16 = d;
                if (d16 == d14) {
                    if (j3 != a820Var.m.f37318a) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } else {
                    z12 = true;
                }
                if (d15 == -1.0d && !z12) {
                    return a820Var;
                }
                if (d15 == -1.0d || z12 || d15 == 0.0d) {
                    d13 = d16;
                } else if (z11) {
                    double d17 = d6;
                    if (d15 > d17) {
                        d13 = d17;
                    } else {
                        d13 = d15;
                    }
                } else {
                    d13 = d15;
                }
                pn40 pn40Var = pn40.f27267a;
                String strC = pn40.c(d13, p3u0.g);
                int length = strC.length();
                a8q0 a8q0Var = new a8q0(strC, s7n0.e(length, length), 4);
                if (d13 != d15) {
                    z13 = false;
                }
                this.G0(a8q0Var, z13);
                return a820.a(a820Var, null, null, null, null, null, hx4.a(hx4Var, null, null, bx6.a(bx6Var, null, tw6.a(bx6Var.b, d13, d16, 0.0d, 0.0d, 0.0d, null, false, z7, null, false, false, false, false, false, false, 65404), false, 5), null, null, false, 59), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
            }
        });
        ocj ocjVar = this.i;
        p7m0Var = ocjVar.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            oyg0Var = this.f;
            oyg0Var.getClass();
        } while (!p7m0Var.m(value, a820.a((a820) value, null, null, null, null, null, null, null, false, null, 0.0f, z6, null, 0, false, false, false, 260095)));
        p7m0Var2 = ocjVar.f25029a;
        while (true) {
            value2 = p7m0Var2.getValue();
            value2.getClass();
            oyg0Var.getClass();
            vf7Var6 = vf7Var5;
            if (p7m0Var2.m(value2, a820.a((a820) value2, null, null, null, null, null, null, null, false, null, 0.0f, false, vf7Var6, 0, false, false, false, 258047))) {
                R0();
                return Unit.f46060a;
            }
            vf7Var5 = vf7Var6;
        }
        ql5 ql5Var2 = (ql5) objG;
        cn20Var2.i = vf7Var2;
        cn20Var2.j = ql5Var2;
        cn20Var2.k = z2;
        cn20Var2.r = 2;
        Object objA = this.R.f28119a.a(ql5Var2, cn20Var2);
        if (objA != obj) {
            ql5Var = ql5Var2;
            objG = objA;
            vf7Var3 = vf7Var2;
            d = ((c3j0) objG).b;
            d2 = vf7Var3.d;
            if (d2 == 0.0d) {
                i = 1;
            } else {
                i = 0;
            }
            i2 = i ^ 1;
            if (z2) {
                d3 = d;
                z3 = z2;
                vf7Var4 = vf7Var3;
                if (vf7Var4.h) {
                    d4 = 9.99999999999999E12d;
                } else {
                    d4 = vf7Var4.b;
                }
                z4 = vf7Var4.g;
                double d13 = d3;
                j = vf7Var4.f37318a;
                if (i2 != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                cn20Var2.i = vf7Var4;
                cn20Var2.j = null;
                cn20Var2.k = z3;
                cn20Var2.l = d13;
                cn20Var2.o = i2;
                cn20Var2.m = d;
                cn20Var2.n = d4;
                cn20Var2.r = 4;
                d5 = d4;
                if (P0(d, d5, z5, z4, j, cn20Var2) != obj) {
                    d6 = d5;
                    z6 = z3;
                    vf7Var5 = vf7Var4;
                    final boolean z12 = vf7Var5.g;
                    final long j4 = vf7Var5.f37318a;
                    if (i2 != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    H(new Function2() { // from class: a.fi20
                        /* JADX WARN: Code duplicated, block: B:24:0x0051  */
                        /* JADX WARN: Code duplicated, block: B:8:0x002f  */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            boolean z13;
                            double d14;
                            a820 a820Var = (a820) obj3;
                            ((oyg0) obj2).getClass();
                            a820Var.getClass();
                            hx4 hx4Var = a820Var.g;
                            bx6 bx6Var = hx4Var.c;
                            tw6 tw6Var = bx6Var.b;
                            double d15 = tw6Var.b;
                            double d16 = tw6Var.f34633a;
                            boolean z14 = bx6Var.c;
                            double d17 = d;
                            if (d17 == d15) {
                                if (j4 != a820Var.m.f37318a) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            } else {
                                z13 = true;
                            }
                            if (d16 == -1.0d && !z13) {
                                return a820Var;
                            }
                            if (d16 == -1.0d || z13 || d16 == 0.0d) {
                                d14 = d17;
                            } else if (z12) {
                                double d18 = d6;
                                if (d16 > d18) {
                                    d14 = d18;
                                } else {
                                    d14 = d16;
                                }
                            } else {
                                d14 = d16;
                            }
                            pn40 pn40Var = pn40.f27267a;
                            String strC = pn40.c(d14, p3u0.g);
                            int length = strC.length();
                            a8q0 a8q0Var = new a8q0(strC, s7n0.e(length, length), 4);
                            if (d14 != d16) {
                                z14 = false;
                            }
                            this.G0(a8q0Var, z14);
                            return a820.a(a820Var, null, null, null, null, null, hx4.a(hx4Var, null, null, bx6.a(bx6Var, null, tw6.a(bx6Var.b, d14, d17, 0.0d, 0.0d, 0.0d, null, false, z7, null, false, false, false, false, false, false, 65404), false, 5), null, null, false, 59), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
                        }
                    });
                    ocj ocjVar2 = this.i;
                    p7m0Var = ocjVar2.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        oyg0Var = this.f;
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value, a820.a((a820) value, null, null, null, null, null, null, null, false, null, 0.0f, z6, null, 0, false, false, false, 260095)));
                    p7m0Var2 = ocjVar2.f25029a;
                    while (true) {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                        vf7Var6 = vf7Var5;
                        if (p7m0Var2.m(value2, a820.a((a820) value2, null, null, null, null, null, null, null, false, null, 0.0f, false, vf7Var6, 0, false, false, false, 258047))) {
                            R0();
                            return Unit.f46060a;
                        }
                        vf7Var5 = vf7Var6;
                    }
                }
            } else if (i == 0) {
                d3 = d;
                d = d2;
                z3 = z2;
                vf7Var4 = vf7Var3;
                if (vf7Var4.h) {
                    d4 = 9.99999999999999E12d;
                } else {
                    d4 = vf7Var4.b;
                }
                z4 = vf7Var4.g;
                double d14 = d3;
                j = vf7Var4.f37318a;
                if (i2 != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                cn20Var2.i = vf7Var4;
                cn20Var2.j = null;
                cn20Var2.k = z3;
                cn20Var2.l = d14;
                cn20Var2.o = i2;
                cn20Var2.m = d;
                cn20Var2.n = d4;
                cn20Var2.r = 4;
                d5 = d4;
                if (P0(d, d5, z5, z4, j, cn20Var2) != obj) {
                    d6 = d5;
                    z6 = z3;
                    vf7Var5 = vf7Var4;
                    final boolean z13 = vf7Var5.g;
                    final long j5 = vf7Var5.f37318a;
                    if (i2 != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    H(new Function2() { // from class: a.fi20
                        /* JADX WARN: Code duplicated, block: B:24:0x0051  */
                        /* JADX WARN: Code duplicated, block: B:8:0x002f  */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            boolean z14;
                            double d15;
                            a820 a820Var = (a820) obj3;
                            ((oyg0) obj2).getClass();
                            a820Var.getClass();
                            hx4 hx4Var = a820Var.g;
                            bx6 bx6Var = hx4Var.c;
                            tw6 tw6Var = bx6Var.b;
                            double d16 = tw6Var.b;
                            double d17 = tw6Var.f34633a;
                            boolean z15 = bx6Var.c;
                            double d18 = d;
                            if (d18 == d16) {
                                if (j5 != a820Var.m.f37318a) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            } else {
                                z14 = true;
                            }
                            if (d17 == -1.0d && !z14) {
                                return a820Var;
                            }
                            if (d17 == -1.0d || z14 || d17 == 0.0d) {
                                d15 = d18;
                            } else if (z13) {
                                double d19 = d6;
                                if (d17 > d19) {
                                    d15 = d19;
                                } else {
                                    d15 = d17;
                                }
                            } else {
                                d15 = d17;
                            }
                            pn40 pn40Var = pn40.f27267a;
                            String strC = pn40.c(d15, p3u0.g);
                            int length = strC.length();
                            a8q0 a8q0Var = new a8q0(strC, s7n0.e(length, length), 4);
                            if (d15 != d17) {
                                z15 = false;
                            }
                            this.G0(a8q0Var, z15);
                            return a820.a(a820Var, null, null, null, null, null, hx4.a(hx4Var, null, null, bx6.a(bx6Var, null, tw6.a(bx6Var.b, d15, d18, 0.0d, 0.0d, 0.0d, null, false, z7, null, false, false, false, false, false, false, 65404), false, 5), null, null, false, 59), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
                        }
                    });
                    ocj ocjVar3 = this.i;
                    p7m0Var = ocjVar3.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        oyg0Var = this.f;
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value, a820.a((a820) value, null, null, null, null, null, null, null, false, null, 0.0f, z6, null, 0, false, false, false, 260095)));
                    p7m0Var2 = ocjVar3.f25029a;
                    while (true) {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                        vf7Var6 = vf7Var5;
                        if (p7m0Var2.m(value2, a820.a((a820) value2, null, null, null, null, null, null, null, false, null, 0.0f, false, vf7Var6, 0, false, false, false, 258047))) {
                            R0();
                            return Unit.f46060a;
                        }
                        vf7Var5 = vf7Var6;
                    }
                }
            } else {
                long j6 = ql5Var.e;
                cn20Var2.i = vf7Var3;
                cn20Var2.j = null;
                cn20Var2.k = z2;
                cn20Var2.l = d;
                cn20Var2.o = i2;
                cn20Var2.r = 3;
                objC = this.N.f20973a.c(j6, cn20Var2);
                if (objC != obj) {
                    objG = objC;
                    d3 = d;
                    i3 = i2;
                    d2 = ((xuf) objG).i;
                    i2 = i3;
                    d = d2;
                    z3 = z2;
                    vf7Var4 = vf7Var3;
                    if (vf7Var4.h) {
                        d4 = 9.99999999999999E12d;
                    } else {
                        d4 = vf7Var4.b;
                    }
                    z4 = vf7Var4.g;
                    double d15 = d3;
                    j = vf7Var4.f37318a;
                    if (i2 != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    cn20Var2.i = vf7Var4;
                    cn20Var2.j = null;
                    cn20Var2.k = z3;
                    cn20Var2.l = d15;
                    cn20Var2.o = i2;
                    cn20Var2.m = d;
                    cn20Var2.n = d4;
                    cn20Var2.r = 4;
                    d5 = d4;
                    if (P0(d, d5, z5, z4, j, cn20Var2) != obj) {
                        d6 = d5;
                        z6 = z3;
                        vf7Var5 = vf7Var4;
                        final boolean z14 = vf7Var5.g;
                        final long j7 = vf7Var5.f37318a;
                        if (i2 != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        H(new Function2() { // from class: a.fi20
                            /* JADX WARN: Code duplicated, block: B:24:0x0051  */
                            /* JADX WARN: Code duplicated, block: B:8:0x002f  */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                boolean z15;
                                double d16;
                                a820 a820Var = (a820) obj3;
                                ((oyg0) obj2).getClass();
                                a820Var.getClass();
                                hx4 hx4Var = a820Var.g;
                                bx6 bx6Var = hx4Var.c;
                                tw6 tw6Var = bx6Var.b;
                                double d17 = tw6Var.b;
                                double d18 = tw6Var.f34633a;
                                boolean z16 = bx6Var.c;
                                double d19 = d;
                                if (d19 == d17) {
                                    if (j7 != a820Var.m.f37318a) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                } else {
                                    z15 = true;
                                }
                                if (d18 == -1.0d && !z15) {
                                    return a820Var;
                                }
                                if (d18 == -1.0d || z15 || d18 == 0.0d) {
                                    d16 = d19;
                                } else if (z14) {
                                    double d110 = d6;
                                    if (d18 > d110) {
                                        d16 = d110;
                                    } else {
                                        d16 = d18;
                                    }
                                } else {
                                    d16 = d18;
                                }
                                pn40 pn40Var = pn40.f27267a;
                                String strC = pn40.c(d16, p3u0.g);
                                int length = strC.length();
                                a8q0 a8q0Var = new a8q0(strC, s7n0.e(length, length), 4);
                                if (d16 != d18) {
                                    z16 = false;
                                }
                                this.G0(a8q0Var, z16);
                                return a820.a(a820Var, null, null, null, null, null, hx4.a(hx4Var, null, null, bx6.a(bx6Var, null, tw6.a(bx6Var.b, d16, d19, 0.0d, 0.0d, 0.0d, null, false, z7, null, false, false, false, false, false, false, 65404), false, 5), null, null, false, 59), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
                            }
                        });
                        ocj ocjVar4 = this.i;
                        p7m0Var = ocjVar4.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                            oyg0Var = this.f;
                            oyg0Var.getClass();
                        } while (!p7m0Var.m(value, a820.a((a820) value, null, null, null, null, null, null, null, false, null, 0.0f, z6, null, 0, false, false, false, 260095)));
                        p7m0Var2 = ocjVar4.f25029a;
                        while (true) {
                            value2 = p7m0Var2.getValue();
                            value2.getClass();
                            oyg0Var.getClass();
                            vf7Var6 = vf7Var5;
                            if (p7m0Var2.m(value2, a820.a((a820) value2, null, null, null, null, null, null, null, false, null, 0.0f, false, vf7Var6, 0, false, false, false, 258047))) {
                                R0();
                                return Unit.f46060a;
                            }
                            vf7Var5 = vf7Var6;
                        }
                    }
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object N(hxu hxuVar, txu txuVar, double d, double d2, String str, zje zjeVar) {
        zi20 zi20Var;
        if (zjeVar instanceof zi20) {
            zi20Var = (zi20) zjeVar;
            int i = zi20Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                zi20Var.n = i - Integer.MIN_VALUE;
            } else {
                zi20Var = new zi20(this, zjeVar);
            }
        } else {
            zi20Var = new zi20(this, zjeVar);
        }
        zi20 zi20Var2 = zi20Var;
        Object objQ = zi20Var2.l;
        Object obj = wne.f39444a;
        int i2 = zi20Var2.n;
        if (i2 == 0) {
            z1x.P(objQ);
            if (d2 <= 0.0d) {
                return "";
            }
            zi20Var2.i = hxuVar;
            zi20Var2.j = txuVar;
            zi20Var2.k = str;
            zi20Var2.n = 1;
            objQ = Q(d, d2, zi20Var2);
            if (objQ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = zi20Var2.k;
            txuVar = zi20Var2.j;
            hxuVar = zi20Var2.i;
            z1x.P(objQ);
        }
        return xdx.w(((Number) objQ).doubleValue(), str, hxuVar, txuVar);
    }

    public final void N0(double d) {
        on20 on20Var;
        double d2;
        if (this.b0.a() == q4f.m) {
            bvc bvcVarA = jiu0.a(this);
            rwj rwjVar = this.c0.f22085a;
            on20Var = this;
            d2 = d;
            sac.V(bvcVarA, en20.f8072a, null, rwjVar, new vdc(d, (diu0) on20Var, (yje) null, (byte) 3), 10);
        } else {
            on20Var = this;
            d2 = d;
        }
        ((ave) on20Var.z0.f34374a.c).g = d2;
    }

    public final void O0(double d) {
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(d, p3u0.g);
        int length = strC.length();
        H(new xh20((Object) new a8q0(strC, s7n0.e(length, length), 4), false, (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:47:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x0149  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object P0(double d, double d2, boolean z, boolean z2, long j, zje zjeVar) {
        gn20 gn20Var;
        double d3;
        boolean z3;
        double d4;
        int i;
        double d5;
        double d6;
        long j2;
        boolean z4;
        double d7;
        double d8;
        int i2;
        boolean z5;
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        boolean z6;
        int i3;
        double d14;
        double d15;
        boolean z7;
        q4f q4fVar;
        Double d16;
        double d17 = d2;
        if (zjeVar instanceof gn20) {
            gn20Var = (gn20) zjeVar;
            int i4 = gn20Var.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                gn20Var.v = i4 - Integer.MIN_VALUE;
            } else {
                gn20Var = new gn20(this, zjeVar);
            }
        } else {
            gn20Var = new gn20(this, zjeVar);
        }
        Object obj = gn20Var.t;
        Object obj2 = wne.f39444a;
        int i5 = gn20Var.v;
        if (i5 != 0) {
            if (i5 == 1) {
                double d18 = gn20Var.n;
                int i6 = gn20Var.s;
                double d19 = gn20Var.m;
                boolean z8 = gn20Var.q;
                double d20 = gn20Var.l;
                double d21 = gn20Var.k;
                j2 = gn20Var.r;
                z4 = gn20Var.p;
                z5 = gn20Var.o;
                double d22 = gn20Var.j;
                d11 = gn20Var.i;
                z1x.P(obj);
                d12 = d20;
                i3 = i6;
                d4 = d19;
                d13 = d21;
                d17 = d22;
                z6 = z8;
                d10 = d18;
            } else {
                if (i5 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            return Unit.f46060a;
        }
        z1x.P(obj);
        tw6 tw6Var = ((a820) D()).e.f27665a.b;
        d3 = tw6Var.b;
        double d23 = tw6Var.f34633a;
        boolean z9 = ((a820) D()).e.f27665a.c;
        double dC = tw6Var.c();
        z3 = z9;
        double d24 = d17 / dC;
        if (d == d3) {
            d4 = d24;
            if (j == ((a820) D()).m.f37318a) {
                i = 0;
            }
            if (d23 != -1.0d && i == 0) {
                return Unit.f46060a;
            }
            if (d23 != -1.0d || i != 0 || d23 == 0.0d) {
                d5 = d;
            } else if (z2 || d23 <= d4) {
                d5 = d23;
            } else {
                d5 = d4;
            }
            if (i != 0) {
                gn20Var.i = d;
                gn20Var.j = d17;
                gn20Var.o = z;
                gn20Var.p = z2;
                gn20Var.r = j;
                gn20Var.k = d3;
                gn20Var.l = d23;
                gn20Var.q = z3;
                gn20Var.m = d4;
                gn20Var.s = i;
                gn20Var.n = d5;
                gn20Var.v = 1;
                if (J0(d5, gn20Var) == obj2) {
                    return obj2;
                }
                z4 = z2;
                d10 = d5;
                j2 = j;
                d11 = d;
                d12 = d23;
                d13 = d3;
                z6 = z3;
                i3 = i;
                z5 = z;
            } else {
                d6 = d5;
                j2 = j;
                z4 = z2;
                d7 = d23;
                d8 = d4;
                i2 = i;
                z5 = z;
                d9 = d;
            }
            pn40 pn40Var = pn40.f27267a;
            boolean z10 = z5;
            String strC = pn40.c(d6, p3u0.g);
            d14 = d6;
            int length = strC.length();
            d15 = d7;
            a8q0 a8q0Var = new a8q0(strC, s7n0.e(length, length), 4);
            if (d14 == d15 || !z3) {
                z7 = false;
            } else {
                z7 = true;
            }
            H(new xh20((Object) a8q0Var, z7, (byte) 1));
            H(new ci20(d14, d9, z10));
            q4fVar = ((a820) D()).j;
            d16 = new Double(d14);
            gn20Var.i = d9;
            gn20Var.j = d17;
            gn20Var.o = z10;
            gn20Var.p = z4;
            gn20Var.r = j2;
            gn20Var.k = d3;
            gn20Var.l = d15;
            gn20Var.q = z3;
            gn20Var.m = d8;
            gn20Var.s = i2;
            gn20Var.n = d14;
            gn20Var.v = 2;
            if (T0(q4fVar, d16, gn20Var) == obj2) {
                return obj2;
            }
            return Unit.f46060a;
        }
        d4 = d24;
        i = 1;
        if (d23 != -1.0d) {
        }
        if (d23 != -1.0d) {
            d5 = d;
        } else if (z2) {
            d5 = d23;
        } else {
            d5 = d23;
        }
        if (i != 0) {
            gn20Var.i = d;
            gn20Var.j = d17;
            gn20Var.o = z;
            gn20Var.p = z2;
            gn20Var.r = j;
            gn20Var.k = d3;
            gn20Var.l = d23;
            gn20Var.q = z3;
            gn20Var.m = d4;
            gn20Var.s = i;
            gn20Var.n = d5;
            gn20Var.v = 1;
            if (J0(d5, gn20Var) == obj2) {
                return obj2;
            }
            z4 = z2;
            d10 = d5;
            j2 = j;
            d11 = d;
            d12 = d23;
            d13 = d3;
            z6 = z3;
            i3 = i;
            z5 = z;
        } else {
            d6 = d5;
            j2 = j;
            z4 = z2;
            d7 = d23;
            d8 = d4;
            i2 = i;
            z5 = z;
            d9 = d;
        }
        pn40 pn40Var2 = pn40.f27267a;
        boolean z11 = z5;
        String strC2 = pn40.c(d6, p3u0.g);
        d14 = d6;
        int length2 = strC2.length();
        d15 = d7;
        a8q0 a8q0Var2 = new a8q0(strC2, s7n0.e(length2, length2), 4);
        if (d14 == d15) {
            z7 = false;
        } else {
            z7 = false;
        }
        H(new xh20((Object) a8q0Var2, z7, (byte) 1));
        H(new ci20(d14, d9, z11));
        q4fVar = ((a820) D()).j;
        d16 = new Double(d14);
        gn20Var.i = d9;
        gn20Var.j = d17;
        gn20Var.o = z11;
        gn20Var.p = z4;
        gn20Var.r = j2;
        gn20Var.k = d3;
        gn20Var.l = d15;
        gn20Var.q = z3;
        gn20Var.m = d8;
        gn20Var.s = i2;
        gn20Var.n = d14;
        gn20Var.v = 2;
        if (T0(q4fVar, d16, gn20Var) == obj2) {
            return obj2;
        }
        return Unit.f46060a;
        double d25 = d4;
        i2 = i3;
        z3 = z6;
        d3 = d13;
        d8 = d25;
        d9 = d11;
        d6 = d10;
        d7 = d12;
        pn40 pn40Var3 = pn40.f27267a;
        boolean z12 = z5;
        String strC3 = pn40.c(d6, p3u0.g);
        d14 = d6;
        int length3 = strC3.length();
        d15 = d7;
        a8q0 a8q0Var3 = new a8q0(strC3, s7n0.e(length3, length3), 4);
        if (d14 == d15) {
            z7 = false;
        } else {
            z7 = false;
        }
        H(new xh20((Object) a8q0Var3, z7, (byte) 1));
        H(new ci20(d14, d9, z12));
        q4fVar = ((a820) D()).j;
        d16 = new Double(d14);
        gn20Var.i = d9;
        gn20Var.j = d17;
        gn20Var.o = z12;
        gn20Var.p = z4;
        gn20Var.r = j2;
        gn20Var.k = d3;
        gn20Var.l = d15;
        gn20Var.q = z3;
        gn20Var.m = d8;
        gn20Var.s = i2;
        gn20Var.n = d14;
        gn20Var.v = 2;
        if (T0(q4fVar, d16, gn20Var) == obj2) {
            return obj2;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object Q(double d, double d2, zje zjeVar) {
        aj20 aj20Var;
        double d3;
        double d4;
        boolean z;
        double d5;
        cl5 cl5Var;
        if (zjeVar instanceof aj20) {
            aj20Var = (aj20) zjeVar;
            int i = aj20Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                aj20Var.p = i - Integer.MIN_VALUE;
            } else {
                aj20Var = new aj20(this, zjeVar);
            }
        } else {
            aj20Var = new aj20(this, zjeVar);
        }
        Object obj = aj20Var.n;
        wne wneVar = wne.f39444a;
        int i2 = aj20Var.p;
        if (i2 == 0) {
            z1x.P(obj);
            double d6 = ((lye) this.E0.f22172a.f10647a).f20858a.j;
            boolean z2 = this.o0.a().k;
            p7m0 p7m0VarB = this.Y.b();
            cl5 cl5Var2 = this.T0;
            aj20Var.l = cl5Var2;
            d3 = d;
            aj20Var.i = d3;
            d4 = d2;
            aj20Var.j = d4;
            aj20Var.k = d6;
            aj20Var.m = z2;
            aj20Var.p = 1;
            Object objM = ntb.M(p7m0VarB, aj20Var);
            if (objM == wneVar) {
                return wneVar;
            }
            z = z2;
            obj = objM;
            d5 = d6;
            cl5Var = cl5Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = aj20Var.m;
            double d7 = aj20Var.k;
            double d8 = aj20Var.j;
            double d9 = aj20Var.i;
            cl5Var = aj20Var.l;
            z1x.P(obj);
            z = z3;
            d5 = d7;
            d4 = d8;
            d3 = d9;
        }
        en7 en7Var = (en7) obj;
        int i3 = en7Var != null ? en7Var.b : 0;
        q4f q4fVarA = this.b0.a();
        cl5Var.getClass();
        return new Double(cl5.t(d3, d4, d5, z, i3, q4fVarA));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q0(q4f q4fVar, zje zjeVar) {
        hn20 hn20Var;
        final boolean z;
        int i;
        if (zjeVar instanceof hn20) {
            hn20Var = (hn20) zjeVar;
            int i2 = hn20Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hn20Var.l = i2 - Integer.MIN_VALUE;
            } else {
                hn20Var = new hn20(this, zjeVar);
            }
        } else {
            hn20Var = new hn20(this, zjeVar);
        }
        Object objW = hn20Var.j;
        Object obj = wne.f39444a;
        int i3 = hn20Var.l;
        if (i3 == 0) {
            z1x.P(objW);
            hn20Var.i = q4fVar;
            hn20Var.l = 1;
            objW = this.a0.f1218a.w(hn20Var);
            if (objW == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q4fVar = hn20Var.i;
            z1x.P(objW);
        }
        List list = (List) objW;
        boolean zJ = this.P.j();
        pru pruVar = this.v;
        if (!pruVar.a().f32117a.f12063a.i || zJ) {
            z = false;
        } else if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((ru6) it.next()).h == 707) {
                    }
                } else if (q3d.j(q4f.c, q4f.d).contains(q4fVar)) {
                    z = true;
                }
                z = false;
            }
        } else if (q3d.j(q4f.c, q4f.d).contains(q4fVar)) {
            z = true;
        } else {
            z = false;
        }
        final boolean z2 = (!pruVar.a().l.g || zJ || q3d.j(q4f.h, q4f.m).contains(q4fVar)) ? false : true;
        List listJ = q3d.j(Boolean.valueOf(z2), Boolean.valueOf(z));
        if (listJ == null || !listJ.isEmpty()) {
            Iterator it2 = listJ.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (((Boolean) it2.next()).booleanValue() && (i = i + 1) < 0) {
                    q3d.o();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        final int i4 = i + 1;
        final boolean z3 = ((a820) D()).n != i4;
        H(new Function2() { // from class: a.zh20
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a820 a820Var = (a820) obj3;
                ((oyg0) obj2).getClass();
                a820Var.getClass();
                return a820.a(a820Var, null, z3 ? jo7.b : a820Var.c, null, null, dzc0.a(a820Var.f, null, null, false, false, z2, 31), hx4.a(a820Var.g, null, null, null, null, null, z, 31), null, false, null, 0.0f, false, null, i4, false, false, false, 253851);
            }
        });
        return Unit.f46060a;
    }

    public final void R0() {
        byte b = 0;
        byte b2 = 1;
        yje yjeVar = null;
        if (!U() && !s0()) {
            bby bbyVar = this.j1;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            H(new ei20(b));
            sac.V(jiu0.a(this), new yw10(1, this, on20.class, "handlePossibleWinThrowable", "handlePossibleWinThrowable(Ljava/lang/Throwable;)V", 0, (byte) 29), null, this.E.b, new nl20(this, yjeVar, b2), 10);
            return;
        }
        ko7 ko7Var = ((a820) D()).c;
        byte b3 = 5;
        if (ko7Var.equals(jo7.b)) {
            if (t0() && r0()) {
                i3t0.K(this, null, null, new dm4(this, new hk20(this, yjeVar, b2), yjeVar, b3), 3);
                return;
            }
            bby bbyVar2 = this.h1;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            bby bbyVar3 = this.j1;
            if (bbyVar3 != null) {
                bbyVar3.cancel(null);
            }
            H(new lh20(this, (byte) 1));
            if (r0()) {
                H(new lh20(this, (byte) 6));
                return;
            } else {
                H(new fd20((byte) 25));
                return;
            }
        }
        if (!ko7Var.equals(ho7.b)) {
            if (ko7Var.equals(io7.b)) {
                return;
            }
            t9f.b();
            return;
        }
        if (q0() && r0()) {
            i3t0.K(this, null, null, new dm4(this, new hk20(this, yjeVar, b), yjeVar, b3), 3);
            return;
        }
        bby bbyVar4 = this.h1;
        if (bbyVar4 != null) {
            bbyVar4.cancel(null);
        }
        bby bbyVar5 = this.j1;
        if (bbyVar5 != null) {
            bbyVar5.cancel(null);
        }
        H(new fd20((byte) 18));
        if (r0()) {
            H(new lh20(this, (byte) 6));
        } else {
            H(new fd20((byte) 25));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0070 -> B:30:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(a.zje r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a.bj20
            if (r0 == 0) goto L13
            r0 = r9
            a.bj20 r0 = (a.bj20) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.bj20 r0 = new a.bj20
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2d
            java.util.Iterator r2 = r0.i
            a.z1x.P(r9)
            goto L73
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L34:
            a.z1x.P(r9)
            goto L48
        L38:
            a.z1x.P(r9)
            r0.l = r5
            a.znt r9 = r8.n0
            a.chf0 r9 = r9.f44690a
            java.io.Serializable r9 = r9.p(r0)
            if (r9 != r1) goto L48
            goto L72
        L48:
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L53
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L53
            goto L7c
        L53:
            java.util.Iterator r9 = r9.iterator()
            r2 = r9
        L58:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L7c
            java.lang.Object r9 = r2.next()
            a.qu6 r9 = (a.qu6) r9
            long r6 = r9.B
            r0.i = r2
            r0.l = r4
            a.z7u r9 = r8.a1
            java.lang.Object r9 = r9.c(r6, r0)
            if (r9 != r1) goto L73
        L72:
            return r1
        L73:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L58
            r3 = r5
        L7c:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.on20.S(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S0(zje zjeVar) {
        in20 in20Var;
        if (zjeVar instanceof in20) {
            in20Var = (in20) zjeVar;
            int i = in20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                in20Var.k = i - Integer.MIN_VALUE;
            } else {
                in20Var = new in20(this, zjeVar);
            }
        } else {
            in20Var = new in20(this, zjeVar);
        }
        Object objZ = in20Var.i;
        wne wneVar = wne.f39444a;
        int i2 = in20Var.k;
        if (i2 == 0) {
            z1x.P(objZ);
            in20Var.k = 1;
            objZ = this.s0.z(in20Var);
            if (objZ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objZ);
        }
        H(new obg((byte) 19, ((Boolean) objZ).booleanValue()));
        return Unit.f46060a;
    }

    public final Object T0(q4f q4fVar, Double d, zje zjeVar) {
        int iOrdinal = q4fVar.ordinal();
        if (iOrdinal == 6) {
            Object objS0 = S0(zjeVar);
            return objS0 == wne.f39444a ? objS0 : Unit.f46060a;
        }
        if (iOrdinal != 11) {
            return Unit.f46060a;
        }
        Object objU0 = U0(d, zjeVar);
        return objU0 == wne.f39444a ? objU0 : Unit.f46060a;
    }

    public final boolean U() {
        nwo0 nwo0VarC = this.u.c();
        if (nwo0VarC.f24244a) {
            return true;
        }
        return ((a820) D()).o && nwo0VarC.b && ((ovo0) this.X0.f27815a).f25934a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ae A[PHI: r6
  0x00ae: PHI (r6v8 int) = (r6v4 int), (r6v13 int) binds: [B:36:0x00ac, B:70:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:66:0x0142  */
    /* JADX WARN: Code duplicated, block: B:72:0x0151  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0104 -> B:65:0x013a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x012e -> B:63:0x0130). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object U0(java.lang.Double r24, a.zje r25) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.on20.U0(java.lang.Double, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:38:0x0115  */
    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object V(double d, double d2, String str, Double d3, boolean z, xdr xdrVar, zje zjeVar) throws Throwable {
        kj20 kj20Var;
        double d4;
        boolean z2;
        double d5;
        xdr xdrVar2;
        String str2;
        on20 on20Var;
        double d6;
        double d7;
        kj20 kj20Var2;
        hxu hxuVar;
        String str3;
        xdr xdrVar3;
        txu txuVar;
        List listR;
        txu txuVar2;
        xdr xdrVar4;
        List list;
        bby bbyVar;
        on20 on20Var2 = this;
        if (zjeVar instanceof kj20) {
            kj20Var = (kj20) zjeVar;
            int i = kj20Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                kj20Var.s = i - Integer.MIN_VALUE;
            } else {
                kj20Var = new kj20(on20Var2, zjeVar);
            }
        } else {
            kj20Var = new kj20(on20Var2, zjeVar);
        }
        Object objK0 = kj20Var.q;
        wne wneVar = wne.f39444a;
        int i2 = kj20Var.s;
        if (i2 == 0) {
            z1x.P(objK0);
            kj20Var.k = str;
            kj20Var.l = xdrVar;
            kj20Var.i = d;
            d4 = d2;
            kj20Var.j = d4;
            kj20Var.p = z;
            kj20Var.s = 1;
            Object objJ0 = on20Var2.j0(d, d3, kj20Var);
            if (objJ0 != wneVar) {
                z2 = z;
                d5 = d;
                xdrVar2 = xdrVar;
                str2 = str;
                objK0 = objJ0;
            }
            return wneVar;
        }
        if (i2 == 1) {
            z2 = kj20Var.p;
            d4 = kj20Var.j;
            d5 = kj20Var.i;
            xdrVar2 = kj20Var.l;
            str2 = kj20Var.k;
            z1x.P(objK0);
        } else {
            if (i2 == 2) {
                z2 = kj20Var.p;
                d7 = kj20Var.j;
                d6 = kj20Var.i;
                hxuVar = kj20Var.m;
                xdrVar3 = kj20Var.l;
                String str4 = kj20Var.k;
                z1x.P(objK0);
                kj20 kj20Var3 = kj20Var;
                on20Var = on20Var2;
                str3 = str4;
                kj20Var2 = kj20Var3;
                txuVar = (txu) objK0;
                if (txuVar.g.b <= 0.0d || txuVar.d.b > 0.0d || txuVar.f34720a.b > 0.0d) {
                    listR = rsm0.r(txuVar, str3, on20Var.D);
                } else {
                    listR = iun.f15405a;
                }
                kj20Var2.k = null;
                kj20Var2.l = xdrVar3;
                kj20Var2.m = null;
                kj20Var2.n = txuVar;
                kj20Var2.o = listR;
                kj20Var2.i = d6;
                kj20Var2.j = d7;
                kj20Var2.p = z2;
                kj20Var2.s = 3;
                on20 on20Var3 = on20Var;
                double d8 = d6;
                objK0 = on20Var3.N(hxuVar, txuVar, d8, d7, str3, kj20Var2);
                on20Var2 = on20Var3;
                txuVar2 = txuVar;
                if (objK0 != wneVar) {
                    xdrVar4 = xdrVar3;
                    list = listR;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = (List) kj20Var.o;
            txuVar2 = kj20Var.n;
            xdrVar4 = kj20Var.l;
            z1x.P(objK0);
        }
        String str5 = (String) objK0;
        bbyVar = on20Var2.j1;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        xdrVar4.F(txuVar2, list, str5);
        return Unit.f46060a;
        hxu hxuVar2 = (hxu) objK0;
        kj20Var.k = str2;
        kj20Var.l = xdrVar2;
        kj20Var.m = hxuVar2;
        kj20Var.i = d5;
        kj20Var.j = d4;
        kj20Var.p = z2;
        kj20Var.s = 2;
        kj20 kj20Var4 = kj20Var;
        double d9 = d4;
        double d10 = d5;
        objK0 = on20Var2.k0(hxuVar2, d10, d9, z2, kj20Var4);
        on20Var = on20Var2;
        d6 = d10;
        d7 = d9;
        kj20Var2 = kj20Var4;
        if (objK0 != wneVar) {
            xdr xdrVar5 = xdrVar2;
            hxuVar = hxuVar2;
            str3 = str2;
            xdrVar3 = xdrVar5;
            txuVar = (txu) objK0;
            if (txuVar.g.b <= 0.0d) {
                listR = rsm0.r(txuVar, str3, on20Var.D);
            } else {
                listR = rsm0.r(txuVar, str3, on20Var.D);
            }
            kj20Var2.k = null;
            kj20Var2.l = xdrVar3;
            kj20Var2.m = null;
            kj20Var2.n = txuVar;
            kj20Var2.o = listR;
            kj20Var2.i = d6;
            kj20Var2.j = d7;
            kj20Var2.p = z2;
            kj20Var2.s = 3;
            on20 on20Var4 = on20Var;
            double d11 = d6;
            objK0 = on20Var4.N(hxuVar, txuVar, d11, d7, str3, kj20Var2);
            on20Var2 = on20Var4;
            txuVar2 = txuVar;
            if (objK0 != wneVar) {
                xdrVar4 = xdrVar3;
                list = listR;
                String str6 = (String) objK0;
                bbyVar = on20Var2.j1;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                xdrVar4.F(txuVar2, list, str6);
                return Unit.f46060a;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object W(double d, long j, ex4 ex4Var, zje zjeVar, String str, String str2, boolean z, boolean z2) {
        nj20 nj20Var;
        int i;
        double d2;
        long j2;
        boolean z3;
        boolean z4;
        if (zjeVar instanceof nj20) {
            nj20Var = (nj20) zjeVar;
            int i2 = nj20Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nj20Var.p = i2 - Integer.MIN_VALUE;
            } else {
                nj20Var = new nj20(this, zjeVar);
            }
        } else {
            nj20Var = new nj20(this, zjeVar);
        }
        nj20 nj20Var2 = nj20Var;
        Object obj = nj20Var2.n;
        wne wneVar = wne.f39444a;
        int i3 = nj20Var2.p;
        if (i3 == 0) {
            z1x.P(obj);
            int i4 = ex4Var != null ? 1 : 0;
            String string = str2 != null ? StringsKt.u0(str2).toString() : null;
            nj20Var2.i = j;
            nj20Var2.j = d;
            nj20Var2.k = z;
            nj20Var2.l = z2;
            nj20Var2.m = i4;
            nj20Var2.p = 1;
            Object objF = this.q.F(d, j, ex4Var, nj20Var2, string, str, z2, z);
            if (objF != wneVar) {
                i = i4;
                obj = objF;
                d2 = d;
                j2 = j;
                z3 = z;
                z4 = z2;
            }
            return wneVar;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                z1x.P(obj);
                return obj;
            }
            if (i3 == 3) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = nj20Var2.m;
        z4 = nj20Var2.l;
        z3 = nj20Var2.k;
        d2 = nj20Var2.j;
        j2 = nj20Var2.i;
        z1x.P(obj);
        ouj0 ouj0Var = (ouj0) obj;
        if (i != 0) {
            nj20Var2.i = j2;
            nj20Var2.j = d2;
            nj20Var2.k = z3;
            nj20Var2.l = z4;
            nj20Var2.m = i;
            nj20Var2.p = 2;
            Object objA = this.R0.a(ouj0Var, nj20Var2);
            if (objA != wneVar) {
                return objA;
            }
        } else {
            byte b = this.v.a().I1.f26017a;
            nj20Var2.i = j2;
            nj20Var2.j = d2;
            nj20Var2.k = z3;
            nj20Var2.l = z4;
            nj20Var2.m = i;
            nj20Var2.p = 3;
            Object objP = this.p.p(ouj0Var, 0L, b, nj20Var2);
            if (objP != wneVar) {
                return objP;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object X(double d, long j, ex4 ex4Var, zje zjeVar, String str, String str2, boolean z, boolean z2) {
        oj20 oj20Var;
        int i;
        double d2;
        long j2;
        boolean z3;
        boolean z4;
        if (zjeVar instanceof oj20) {
            oj20Var = (oj20) zjeVar;
            int i2 = oj20Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oj20Var.p = i2 - Integer.MIN_VALUE;
            } else {
                oj20Var = new oj20(this, zjeVar);
            }
        } else {
            oj20Var = new oj20(this, zjeVar);
        }
        oj20 oj20Var2 = oj20Var;
        Object obj = oj20Var2.n;
        wne wneVar = wne.f39444a;
        int i3 = oj20Var2.p;
        if (i3 == 0) {
            z1x.P(obj);
            int i4 = ex4Var != null ? 1 : 0;
            String string = str2 != null ? StringsKt.u0(str2).toString() : null;
            oj20Var2.i = j;
            oj20Var2.j = d;
            oj20Var2.k = z;
            oj20Var2.l = z2;
            oj20Var2.m = i4;
            oj20Var2.p = 1;
            Object objF = this.q.F(d, j, ex4Var, oj20Var2, string, str, z2, z);
            if (objF != wneVar) {
                i = i4;
                obj = objF;
                d2 = d;
                j2 = j;
                z3 = z;
                z4 = z2;
            }
            return wneVar;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                z1x.P(obj);
                return obj;
            }
            if (i3 == 3) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = oj20Var2.m;
        z4 = oj20Var2.l;
        z3 = oj20Var2.k;
        d2 = oj20Var2.j;
        j2 = oj20Var2.i;
        z1x.P(obj);
        ouj0 ouj0Var = (ouj0) obj;
        if (i != 0) {
            oj20Var2.i = j2;
            oj20Var2.j = d2;
            oj20Var2.k = z3;
            oj20Var2.l = z4;
            oj20Var2.m = i;
            oj20Var2.p = 2;
            Object objA = this.R0.a(ouj0Var, oj20Var2);
            if (objA != wneVar) {
                return objA;
            }
        } else {
            byte b = this.v.a().I1.f26017a;
            oj20Var2.i = j2;
            oj20Var2.j = d2;
            oj20Var2.k = z3;
            oj20Var2.l = z4;
            oj20Var2.m = i;
            oj20Var2.p = 3;
            Object objB = this.o.b(ouj0Var, 0L, b, oj20Var2);
            if (objB != wneVar) {
                return objB;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r0 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r0 == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(a.q4f r14, long r15, double r17, double r19, boolean r21, boolean r22, java.lang.String r23, java.lang.String r24, a.ex4 r25, a.zje r26) throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = r26
            boolean r1 = r0 instanceof a.pj20
            if (r1 == 0) goto L16
            r1 = r0
            a.pj20 r1 = (a.pj20) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.k = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            a.pj20 r1 = new a.pj20
            r1.<init>(r13, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.i
            a.wne r1 = a.wne.f39444a
            int r2 = r8.k
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            a.z1x.P(r0)
            goto L67
        L31:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r13)
            r13 = 0
            return r13
        L38:
            a.z1x.P(r0)
            goto L9f
        L3d:
            a.z1x.P(r0)
            return r0
        L41:
            a.z1x.P(r0)
            int r14 = r14.ordinal()
            r0 = 10
            if (r14 == r0) goto L88
            r0 = 11
            if (r14 == r0) goto L73
            r8.k = r3
            r2 = r13
            r5 = r15
            r3 = r17
            r11 = r21
            r12 = r22
            r9 = r23
            r10 = r24
            r7 = r25
            java.lang.Object r0 = r2.X(r3, r5, r7, r8, r9, r10, r11, r12)
            if (r0 != r1) goto L67
            goto L9e
        L67:
            java.util.List r13 = kotlin.collections.a.c(r0)
            a.iun r14 = a.iun.f15405a
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r13, r14)
            return r0
        L73:
            r8.k = r5
            r2 = r13
            r3 = r15
            r5 = r17
            r9 = r21
            r10 = r23
            r11 = r8
            r7 = r19
            java.io.Serializable r13 = r2.Z(r3, r5, r7, r9, r10, r11)
            if (r13 != r1) goto L87
            goto L9e
        L87:
            return r13
        L88:
            r8.k = r4
            r2 = r13
            r5 = r15
            r3 = r17
            r11 = r21
            r12 = r22
            r9 = r23
            r10 = r24
            r7 = r25
            java.lang.Object r0 = r2.W(r3, r5, r7, r8, r9, r10, r11, r12)
            if (r0 != r1) goto L9f
        L9e:
            return r1
        L9f:
            java.util.List r13 = kotlin.collections.a.c(r0)
            a.iun r14 = a.iun.f15405a
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.on20.Y(a.q4f, long, double, double, boolean, boolean, java.lang.String, java.lang.String, a.ex4, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Serializable Z(long j, double d, double d2, boolean z, String str, zje zjeVar) throws Throwable {
        qj20 qj20Var;
        long j2;
        double d3;
        double d4;
        boolean z2;
        ArrayList arrayList;
        if (zjeVar instanceof qj20) {
            qj20Var = (qj20) zjeVar;
            int i = qj20Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                qj20Var.p = i - Integer.MIN_VALUE;
            } else {
                qj20Var = new qj20(this, zjeVar);
            }
        } else {
            qj20Var = new qj20(this, zjeVar);
        }
        qj20 qj20Var2 = qj20Var;
        Object objN = qj20Var2.n;
        wne wneVar = wne.f39444a;
        int i2 = qj20Var2.p;
        if (i2 != 0) {
            if (i2 == 1) {
                z2 = qj20Var2.l;
                d4 = qj20Var2.k;
                d3 = qj20Var2.j;
                j2 = qj20Var2.i;
                z1x.P(objN);
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList = qj20Var2.m;
                z1x.P(objN);
            }
            return new Pair(objN, arrayList);
        }
        z1x.P(objN);
        qj20Var2.i = j;
        qj20Var2.j = d;
        qj20Var2.k = d2;
        qj20Var2.l = z;
        qj20Var2.p = 1;
        objN = this.k0.n(j, d, d2, z, str, qj20Var2);
        if (objN != wneVar) {
            j2 = j;
            d3 = d;
            d4 = d2;
            z2 = z;
        }
        return wneVar;
        nw40 nw40Var = (nw40) objN;
        List list = nw40Var.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w3d.u(arrayList2, ((ouj0) it.next()).e);
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            axq.t(((ru6) it2.next()).d, arrayList3);
        }
        qj20Var2.m = arrayList3;
        qj20Var2.i = j2;
        qj20Var2.j = d3;
        qj20Var2.k = d4;
        qj20Var2.l = z2;
        qj20Var2.p = 2;
        wdu wduVar = this.j0;
        ((ha20) wduVar.b).c.m.clear();
        ((ave) ((g45) wduVar.i).c).n.clear();
        objN = wduVar.J(nw40Var, 0L, qj20Var2);
        if (objN != wneVar) {
            arrayList = arrayList3;
            return new Pair(objN, arrayList);
        }
        return wneVar;
    }

    public final int c0() {
        List listN = this.t0.f13600a.n();
        int i = 0;
        if (listN != null && listN.isEmpty()) {
            return 0;
        }
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            if (!((hf6) it.next()).c.isEmpty() && (i = i + 1) < 0) {
                q3d.o();
                throw null;
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d0(zje zjeVar) {
        wj20 wj20Var;
        boolean z;
        if (zjeVar instanceof wj20) {
            wj20Var = (wj20) zjeVar;
            int i = wj20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wj20Var.k = i - Integer.MIN_VALUE;
            } else {
                wj20Var = new wj20(this, zjeVar);
            }
        } else {
            wj20Var = new wj20(this, zjeVar);
        }
        Object objP = wj20Var.i;
        Object obj = wne.f39444a;
        int i2 = wj20Var.k;
        if (i2 == 0) {
            z1x.P(objP);
            wj20Var.k = 1;
            objP = this.n0.f44690a.p(wj20Var);
            if (objP == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objP);
        }
        List list = (List) objP;
        boolean z2 = this.v.a().f32117a.f12063a.h;
        q4f q4fVarA = this.b0.a();
        boolean z3 = q4fVarA == q4f.c || q4fVarA == q4f.d || q4fVarA == q4f.m;
        if (q4fVarA != q4f.m) {
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((qu6) it.next()).w != uoy.LINE) {
                            z = false;
                        }
                    }
                }
            }
            z = true;
        } else {
            if (list == null || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((qu6) it2.next()).w == uoy.LINE) {
                            z = true;
                        }
                    }
                }
            }
            z = false;
        }
        return Boolean.valueOf(this.y.k() && z && z2 && z3);
    }

    public final xc20 e0() {
        int iA = ((hst) this.h0.f10580a).a();
        ctf0 ctf0Var = this.D;
        if (iA < 3) {
            return new pc20(new xdk0(pek0.f26859a, ctf0Var.b.a(R.string.need_more_blocks_for_multibet, Arrays.copyOf(new Object[0], 0)), null, null, null, null, 124));
        }
        if (this.i0.r()) {
            return null;
        }
        return new kc20(ctf0Var.b.a(R.string.uncorrect_multibet, Arrays.copyOf(new Object[0], 0)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f0(q4f q4fVar, zje zjeVar) {
        xj20 xj20Var;
        if (zjeVar instanceof xj20) {
            xj20Var = (xj20) zjeVar;
            int i = xj20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xj20Var.k = i - Integer.MIN_VALUE;
            } else {
                xj20Var = new xj20(this, zjeVar);
            }
        } else {
            xj20Var = new xj20(this, zjeVar);
        }
        Object objM = xj20Var.i;
        wne wneVar = wne.f39444a;
        int i2 = xj20Var.k;
        if (i2 == 0) {
            z1x.P(objM);
            if (q3d.j(q4f.c, q4f.d).contains(q4fVar)) {
                p7m0 p7m0Var = ((lye) ((khf0) this.b1.b).b).q;
                xj20Var.k = 1;
                objM = ntb.M(p7m0Var, xj20Var);
                if (objM == wneVar) {
                    return wneVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objM);
        d680 d680Var = (d680) objM;
        if (d680Var != null) {
            if (d680Var.f5540a == 0.0d) {
                d680Var = null;
            }
            if (d680Var != null) {
                return d680Var.b;
            }
        }
        return null;
    }

    public final double g0(double d) {
        if (((a820) D()).e.f27665a.b.p) {
            double d2 = this.Z0.c().e0;
            if (d2 != 0.0d) {
                return d2;
            }
        }
        return d;
    }

    public final String h0(boolean z, Double d) {
        if (d == null || d.doubleValue() <= 0.0d) {
            d = null;
        }
        boolean z2 = d != null;
        q4f q4fVar = ((a820) D()).j;
        nwo0 nwo0VarC = this.u.c();
        return gfx.G(q4fVar, nwo0VarC.f24244a || (((a820) D()).o && nwo0VarC.b && ((ovo0) this.X0.f27815a).f25934a) || z2, z, this.D);
    }

    public final String i0(boolean z) {
        if (!this.v.a().f32117a.c.h || z) {
            return null;
        }
        return this.D.b.a(R.string.share, Arrays.copyOf(new Object[0], 0));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object j0(double d, Double d2, zje zjeVar) throws Throwable {
        bk20 bk20Var;
        q4f q4fVarA;
        Double d3;
        kxu kxuVar;
        double d4;
        double d5 = d;
        if (zjeVar instanceof bk20) {
            bk20Var = (bk20) zjeVar;
            int i = bk20Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                bk20Var.p = i - Integer.MIN_VALUE;
            } else {
                bk20Var = new bk20(this, zjeVar);
            }
        } else {
            bk20Var = new bk20(this, zjeVar);
        }
        bk20 bk20Var2 = bk20Var;
        Object objG = bk20Var2.n;
        Object obj = wne.f39444a;
        int i2 = bk20Var2.p;
        if (i2 == 0) {
            z1x.P(objG);
            q4fVarA = this.b0.a();
            bm5 bm5Var = bm5.i;
            bk20Var2.k = d2;
            kxu kxuVar2 = this.U;
            bk20Var2.l = kxuVar2;
            bk20Var2.m = q4fVarA;
            bk20Var2.i = d5;
            bk20Var2.j = d5;
            bk20Var2.p = 1;
            objG = khf0.G(this.r, bm5Var, bk20Var2);
            if (objG != obj) {
                d3 = d2;
                kxuVar = kxuVar2;
                d4 = d5;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objG);
                return objG;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d5 = bk20Var2.j;
        d4 = bk20Var2.i;
        q4fVarA = bk20Var2.m;
        kxuVar = bk20Var2.l;
        d3 = bk20Var2.k;
        z1x.P(objG);
        long j = ((ql5) objG).e;
        ozc ozcVar = this.Z0.c().U;
        bk20Var2.k = null;
        bk20Var2.l = null;
        bk20Var2.m = null;
        bk20Var2.i = d4;
        bk20Var2.p = 2;
        Object objA = kxuVar.a(d5, q4fVarA, j, d3, ozcVar, bk20Var2);
        return objA == obj ? obj : objA;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object k0(hxu hxuVar, double d, double d2, boolean z, zje zjeVar) {
        ck20 ck20Var;
        duw duwVarB;
        double dI;
        hxu hxuVar2;
        duw duwVar;
        yk5 yk5Var;
        if (zjeVar instanceof ck20) {
            ck20Var = (ck20) zjeVar;
            int i = ck20Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ck20Var.n = i - Integer.MIN_VALUE;
            } else {
                ck20Var = new ck20(this, zjeVar);
            }
        } else {
            ck20Var = new ck20(this, zjeVar);
        }
        ck20 ck20Var2 = ck20Var;
        Object obj = ck20Var2.l;
        Object obj2 = wne.f39444a;
        int i2 = ck20Var2.n;
        if (i2 == 0) {
            z1x.P(obj);
            duwVarB = this.S.b();
            if (z) {
                ck20Var2.i = hxuVar;
                ck20Var2.j = duwVarB;
                yk5 yk5Var2 = this.T;
                ck20Var2.k = yk5Var2;
                ck20Var2.n = 1;
                Object objQ = Q(d, d2, ck20Var2);
                if (objQ == obj2) {
                    return obj2;
                }
                hxuVar2 = hxuVar;
                duwVar = duwVarB;
                obj = objQ;
                yk5Var = yk5Var2;
            } else {
                dI = 0.0d;
            }
            return ozb.h0(hxuVar, dI, duwVarB.f6716a);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        yk5Var = ck20Var2.k;
        duwVar = ck20Var2.j;
        hxuVar2 = ck20Var2.i;
        z1x.P(obj);
        double dDoubleValue = ((Number) obj).doubleValue();
        int i3 = duwVar.f6716a;
        double d3 = duwVar.b;
        double d4 = duwVar.c;
        yk5Var.getClass();
        dI = yk5.i(dDoubleValue, i3, d3, d4);
        duwVarB = duwVar;
        hxuVar = hxuVar2;
        return ozb.h0(hxuVar, dI, duwVarB.f6716a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object l0(zje zjeVar) {
        fk20 fk20Var;
        on20 on20Var;
        String strW;
        hx4 hx4Var;
        String str;
        if (zjeVar instanceof fk20) {
            fk20Var = (fk20) zjeVar;
            int i = fk20Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                fk20Var.m = i - Integer.MIN_VALUE;
            } else {
                fk20Var = new fk20(this, zjeVar);
            }
        } else {
            fk20Var = new fk20(this, zjeVar);
        }
        fk20 fk20Var2 = fk20Var;
        Object obj = fk20Var2.k;
        wne wneVar = wne.f39444a;
        int i2 = fk20Var2.m;
        if (i2 == 0) {
            z1x.P(obj);
            hx4 hx4Var2 = ((a820) D()).g;
            bx6 bx6Var = hx4Var2.c;
            double d = bx6Var.b.f34633a;
            double dDoubleValue = hx4Var2.b.f43459a.doubleValue();
            String str2 = bx6Var.b.f;
            if (q0()) {
                fk20Var2.i = hx4Var2;
                fk20Var2.j = str2;
                fk20Var2.m = 1;
                on20Var = this;
                Object objQ = on20Var.Q(d, dDoubleValue, fk20Var2);
                if (objQ == wneVar) {
                    return wneVar;
                }
                obj = objQ;
                hx4Var = hx4Var2;
                str = str2;
            } else {
                on20Var = this;
                strW = "";
                hx4Var = hx4Var2;
            }
            on20Var.H(new mtz(hx4Var, on20Var, strW, (byte) 12));
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = fk20Var2.j;
        hx4 hx4Var3 = fk20Var2.i;
        z1x.P(obj);
        on20Var = this;
        hx4Var = hx4Var3;
        strW = xdx.w(((Number) obj).doubleValue(), str, hxu.h, null);
        on20Var.H(new mtz(hx4Var, on20Var, strW, (byte) 12));
        return Unit.f46060a;
    }

    public final void m0(kuw kuwVar, String str, boolean z) {
        rek0 rek0Var = rek0.b;
        byte b = 2;
        yje yjeVar = null;
        if (!((ave) this.m0.f23572a.c).n.isEmpty()) {
            sac.V(jiu0.a(this), pl20.f27161a, null, this.c0.b, new hk20(this, yjeVar, b), 10);
        }
        if (z && kuwVar != i2o.q && this.b0.a() == q4f.m) {
            G(new pc20(new xdk0(rek0Var, this.D.b.a(R.string.bet_not_processed, Arrays.copyOf(new Object[0], 0)), null, null, null, null, 124)));
            return;
        }
        if (kuwVar == i2o.IdentificationNotPassed2) {
            B0();
            this.C.c(str);
            return;
        }
        if (kuwVar == i2o.q) {
            B0();
            G(new ac20(str));
            return;
        }
        if (kuwVar == i2o.BetExistsError) {
            G(new rb20(str));
            return;
        }
        if (kuwVar == i2o.CoefficientBlockCode || kuwVar == i2o.GameLocked || kuwVar == i2o.Locked) {
            B0();
            i3t0.K(this, null, null, new hj20(this, yjeVar, b), 3);
            return;
        }
        if (kuwVar == i2o.CoefficientChangeCode) {
            B0();
            i3t0.K(this, null, null, new lk20(this, null), 3);
        } else if (kuwVar == i2o.A || kuwVar == i2o.GameIsNotInLine || kuwVar == i2o.EventParameterChanged || kuwVar == i2o.WrongGameBet) {
            B0();
            i3t0.K(this, null, null, new ffd(this, str, yjeVar, (byte) 24), 3);
        } else {
            B0();
            G(new pc20(new xdk0(rek0Var, str, null, null, null, null, 124)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object n0(zje zjeVar) {
        sk20 sk20Var;
        on20 on20Var;
        String strW;
        String str;
        if (zjeVar instanceof sk20) {
            sk20Var = (sk20) zjeVar;
            int i = sk20Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                sk20Var.l = i - Integer.MIN_VALUE;
            } else {
                sk20Var = new sk20(this, zjeVar);
            }
        } else {
            sk20Var = new sk20(this, zjeVar);
        }
        sk20 sk20Var2 = sk20Var;
        Object obj = sk20Var2.j;
        wne wneVar = wne.f39444a;
        int i2 = sk20Var2.l;
        if (i2 == 0) {
            z1x.P(obj);
            tw6 tw6Var = ((a820) D()).e.f27665a.b;
            double d = tw6Var.f34633a;
            double dG0 = g0(this.X.i());
            String str2 = tw6Var.f;
            if (!t0() || dG0 == 0.0d) {
                on20Var = this;
                strW = "";
            } else {
                sk20Var2.i = str2;
                sk20Var2.l = 1;
                on20Var = this;
                Object objQ = on20Var.Q(d, dG0, sk20Var2);
                if (objQ == wneVar) {
                    return wneVar;
                }
                str = str2;
                obj = objQ;
            }
            on20Var.H(new k110((Object) on20Var, (Object) strW, (byte) 18));
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = sk20Var2.i;
        z1x.P(obj);
        on20Var = this;
        strW = xdx.w(((Number) obj).doubleValue(), str, hxu.h, null);
        on20Var.H(new k110((Object) on20Var, (Object) strW, (byte) 18));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x010e  */
    /* JADX WARN: Code duplicated, block: B:48:0x011c A[LOOP:0: B:46:0x0116->B:48:0x011c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x013c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0144  */
    /* JADX WARN: Code duplicated, block: B:56:0x0148 A[PHI: r1 r12
  0x0148: PHI (r1v9 boolean) = (r1v6 boolean), (r1v12 boolean) binds: [B:32:0x00c6, B:53:0x013d] A[DONT_GENERATE, DONT_INLINE]
  0x0148: PHI (r12v11 long) = (r12v3 long), (r12v12 long) binds: [B:32:0x00c6, B:53:0x013d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x0173  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0160, code lost:
    
        if (r19.J0.a(r4) == r5) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o0(a.q4f r20, long r21, java.util.ArrayList r23, java.util.ArrayList r24, boolean r25, a.zje r26) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.on20.o0(a.q4f, long, java.util.ArrayList, java.util.ArrayList, boolean, a.zje):java.lang.Object");
    }

    public final void p0() {
        i3t0.K(this, null, new ih20(this, (byte) 1), new yp00(this, null), 1);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    public final boolean q0() {
        boolean z;
        tw6 tw6Var = ((a820) D()).g.c.b;
        yyc yycVar = ((a820) D()).g.b;
        double d = tw6Var.f34633a;
        if (d == -1.0d) {
            z = false;
        } else {
            double d2 = tw6Var.d;
            double d3 = tw6Var.e;
            if ((d > d3 || d2 > d) && (d <= d3 || !(tw6Var.g || tw6Var.m))) {
                z = false;
            } else {
                z = true;
            }
        }
        BigDecimal bigDecimal = yycVar.d;
        BigDecimal bigDecimal2 = yycVar.e;
        BigDecimal bigDecimal3 = yycVar.f43459a;
        return z && (bigDecimal3.compareTo(bigDecimal) >= 0 && bigDecimal3.compareTo(bigDecimal2) <= 0);
    }

    public final boolean r0() {
        q4f q4fVarA = this.b0.a();
        this.U0.getClass();
        return bst.g(q4fVarA);
    }

    public final boolean s0() {
        return !Intrinsics.d(this.S.b(), duw.d) && ((a820) D()).c.equals(jo7.b);
    }

    public final boolean t0() {
        tw6 tw6Var = ((a820) D()).e.f27665a.b;
        double d = tw6Var.f34633a;
        if (d == -1.0d) {
            return false;
        }
        double d2 = tw6Var.d;
        if (d <= tw6Var.b() && d2 <= d) {
            return true;
        }
        if (d > tw6Var.b()) {
            return tw6Var.g || tw6Var.m;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:36:0x0104  */
    /* JADX WARN: Code duplicated, block: B:39:0x014a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0175  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x017e -> B:52:0x01eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01df -> B:51:0x01e7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object u0(java.util.List r27, java.util.List r28, a.q4f r29, boolean r30, a.g920 r31, a.zje r32) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.on20.u0(java.util.List, java.util.List, a.q4f, boolean, a.g920, a.zje):java.lang.Object");
    }

    @Override // a.diu0
    public final void v() {
        this.H.a(bm5.i);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x015f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0188  */
    /* JADX WARN: Code duplicated, block: B:57:0x019c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01cd, code lost:
    
        if (r22.C0.V(r4, r5, r6, r1, r8, r10, r11, r12, r14) == r2) goto L59;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v0(java.util.List r23, java.util.List r24, boolean r25, a.g920 r26, a.zje r27) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.on20.v0(java.util.List, java.util.List, boolean, a.g920, a.zje):java.lang.Object");
    }

    public final void w0() {
        G(hb20.f12751a);
        sac.V(jiu0.a(this), new yw10(1, this, on20.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 22), null, this.E.b, new nl20(this, null, (byte) 0), 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        BigDecimal bigDecimalAdd;
        BigDecimal bigDecimalSubtract;
        double dMin;
        l520 l520Var = (l520) obj;
        l520Var.getClass();
        boolean zEquals = l520Var.equals(x420.f40245a);
        byte b = 8;
        byte b2 = 2;
        byte b3 = 3;
        mne mneVar = this.E;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        yje yjeVar = null;
        if (zEquals) {
            i3t0.K(this, null, null, new hj20(this, yjeVar, objArr4 == true ? 1 : 0), 3);
            i3t0.K(this, null, null, new ej20(this, null), 3);
            p0();
            H(new lh20(this, (byte) 2));
            i3t0.K(this, mneVar.b, null, new hj20(this, yjeVar, b), 2);
            return;
        }
        if (l520Var instanceof d520) {
            ynd0 ynd0Var = ((d520) l520Var).f5484a;
            pvj0 pvj0Var = ((a820) D()).e;
            bx6 bx6Var = pvj0Var.f27665a;
            nnd0 nnd0Var = pvj0Var.d;
            if (ynd0Var instanceof und0) {
                dMin = nnd0Var.b;
            } else if (ynd0Var instanceof wnd0) {
                dMin = nnd0Var.c;
            } else if (ynd0Var instanceof xnd0) {
                dMin = nnd0Var.d;
            } else {
                if (!(ynd0Var instanceof vnd0)) {
                    t9f.b();
                    return;
                }
                double d = ((a820) D()).d.c.b;
                tw6 tw6Var = bx6Var.b;
                double dB = tw6Var.b();
                double d2 = ((a820) D()).d.d.f12411a;
                if (this.v.a().f32117a.f12063a.b && d2 > -1.0d) {
                    d += d2;
                }
                dMin = Math.min(d / tw6Var.c(), dB);
            }
            double d3 = dMin;
            H(new sh20(pvj0Var, d3, bx6Var.b.c() * d3, (byte) 0));
            O0(d3);
            R0();
            if (d3 < bx6Var.b.d) {
                G(new ac20(this.D.b.a(R.string.insufficient_funds, Arrays.copyOf(new Object[0], 0))));
                return;
            } else {
                w0();
                return;
            }
        }
        if (l520Var instanceof k420) {
            sac.V(jiu0.a(this), km20.f18519a, null, mneVar.b, new mm20(this, ((k420) l520Var).f17648a, null), 10);
            return;
        }
        if (l520Var instanceof l420) {
            String str = ((l420) l520Var).f19384a;
            ((a820) D()).f.f6938a.f33019a.setValue(str);
            H(new yh20(str, objArr3 == true ? 1 : 0));
            return;
        }
        if (l520Var.equals(c520.f3751a)) {
            sac.V(jiu0.a(this), new r520((byte) 27), null, mneVar.b, new mq10((diu0) this, yjeVar, (byte) 11), 10);
            return;
        }
        if (l520Var.equals(k320.f17598a)) {
            E();
            return;
        }
        if (l520Var.equals(e520.f7211a)) {
            H(new fd20((byte) 27));
            w0();
            return;
        }
        if (l520Var.equals(y420.f41981a)) {
            bby bbyVar = this.g1;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            bby bbyVar2 = this.h1;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            bby bbyVar3 = this.j1;
            if (bbyVar3 != null) {
                bbyVar3.cancel(null);
                return;
            }
            return;
        }
        if (l520Var.equals(i320.f14077a)) {
            this.W0.c("coupon");
            this.V0.i("coupon");
            G(wb20.f38855a);
            return;
        }
        boolean zEquals2 = l520Var.equals(j520.f15913a);
        byte b4 = 16;
        cmt cmtVar = this.f1;
        l7k l7kVar = this.e1;
        ih5 ih5Var = this.d1;
        char c = 1;
        if (zEquals2) {
            ih5Var.f(k7k.RegularCoupon);
            y1p y1pVar = y1p.MAIN;
            l7kVar.b("regular_coupon", cmtVar.g());
            i3t0.K(this, null, new ih20(this, (byte) 2), new xg0(this, yjeVar, b4), 1);
            return;
        }
        if (l520Var.equals(m320.f21093a)) {
            ih5Var.f(k7k.NoMoneyRegularCoupon);
            y1p y1pVar2 = y1p.MAIN;
            l7kVar.b("no_money_regular_coupone", cmtVar.g());
            i3t0.K(this, null, new ih20(this, (byte) 2), new xg0(this, yjeVar, b4), 1);
            return;
        }
        if (l520Var.equals(h320.f12365a)) {
            i3t0.K(this, null, null, new hj20(this, yjeVar, b3), 3);
            return;
        }
        byte b5 = 15;
        if (l520Var instanceof g520) {
            int i = ((g520) l520Var).f10697a;
            G(hb20.f12751a);
            H(new u49(b5, i, (boolean) (objArr2 == true ? 1 : 0)));
            R0();
            return;
        }
        byte b6 = 4;
        if (l520Var instanceof v420) {
            v420 v420Var = (v420) l520Var;
            if (v420Var.equals(q420.f28077a)) {
                double dO = O(((a820) D()).e.f27665a.b);
                O0(dO);
                N0(dO);
                H(new ks6(dO, (byte) 12));
                R0();
                i3t0.K(this, null, null, new hj20(this, yjeVar, b6), 3);
                return;
            }
            if (v420Var.equals(s420.f31584a)) {
                double dP = P(((a820) D()).e.f27665a.b);
                O0(dP);
                N0(dP);
                H(new ks6(dP, (byte) 8));
                R0();
                i3t0.K(this, null, null, new hj20(this, yjeVar, (byte) 5), 3);
                return;
            }
            if (v420Var instanceof u420) {
                A0(((u420) v420Var).f35024a);
                return;
            }
            if (v420Var.equals(r420.f29815a)) {
                H(new fd20((byte) 9));
                return;
            }
            if (!(v420Var instanceof t420)) {
                t9f.b();
                return;
            }
            float f = ((t420) v420Var).f33298a;
            tw6 tw6Var2 = ((a820) D()).e.f27665a.b;
            if (tw6Var2.b() <= tw6Var2.d) {
                return;
            }
            double dR = R(f, tw6Var2);
            if (dR == tw6Var2.f34633a) {
                return;
            }
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dR);
            String plainString = (bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros()).toPlainString();
            plainString.getClass();
            int length = plainString.length();
            A0(new a8q0(plainString, s7n0.e(length, length), 4));
            return;
        }
        if (l520Var instanceof a420) {
            a420 a420Var = (a420) l520Var;
            if (a420Var instanceof v320) {
                y0(((v320) a420Var).f36715a);
                return;
            }
            if (a420Var instanceof z320) {
                z0(((z320) a420Var).f43698a);
                return;
            }
            if (a420Var.equals(w320.f38479a)) {
                yyc yycVar = ((a820) D()).g.b;
                BigDecimal bigDecimal = yycVar.f43459a;
                BigDecimal bigDecimal2 = yycVar.c;
                if (bigDecimal.scale() == 1) {
                    bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
                    bigDecimalSubtract.getClass();
                } else {
                    bigDecimalSubtract = bigDecimal.setScale(1, RoundingMode.CEILING).subtract(bigDecimal2);
                    bigDecimalSubtract.getClass();
                }
                BigDecimal bigDecimalM = M(bigDecimalSubtract, yycVar);
                boolean z = bigDecimalSubtract.compareTo(yycVar.e) > 0;
                boolean z2 = bigDecimalM.compareTo(yycVar.d) < 0;
                H0(bigDecimalM);
                H(new jh20(bigDecimalM, z, z2, (byte) 1));
                R0();
                return;
            }
            if (a420Var.equals(x320.f40195a)) {
                yyc yycVar2 = ((a820) D()).g.b;
                BigDecimal bigDecimal3 = yycVar2.d;
                BigDecimal bigDecimal4 = yycVar2.f43459a;
                BigDecimal bigDecimal5 = yycVar2.c;
                if (bigDecimal4.compareTo(bigDecimal3) < 0) {
                    bigDecimalAdd = bigDecimal3;
                } else if (bigDecimal4.scale() == 1 || bigDecimal4.scale() == 0) {
                    bigDecimalAdd = bigDecimal4.add(bigDecimal5);
                    bigDecimalAdd.getClass();
                } else {
                    bigDecimalAdd = bigDecimal4.setScale(1, RoundingMode.FLOOR).add(bigDecimal5);
                    bigDecimalAdd.getClass();
                }
                BigDecimal bigDecimalM2 = M(bigDecimalAdd, yycVar2);
                boolean z3 = bigDecimalAdd.compareTo(yycVar2.e) > 0;
                boolean z4 = bigDecimalM2.compareTo(bigDecimal3) < 0;
                H0(bigDecimalM2);
                H(new jh20(bigDecimalM2, z3, z4, (byte) 0));
                R0();
                return;
            }
            if (a420Var.equals(r320.f29766a)) {
                final tw6 tw6Var3 = ((a820) D()).g.c.b;
                final double dO2 = O(tw6Var3);
                pn40 pn40Var = pn40.f27267a;
                String strC = pn40.c(dO2, p3u0.g);
                int length2 = strC.length();
                G0(new a8q0(strC, s7n0.e(length2, length2), 4), false);
                final Object[] objArr5 = objArr == true ? 1 : 0;
                H(new Function2() { // from class: a.vh20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (objArr5) {
                            case 0:
                                a820 a820Var = (a820) obj3;
                                ((oyg0) obj2).getClass();
                                a820Var.getClass();
                                hx4 hx4Var = a820Var.g;
                                return a820.a(a820Var, null, null, null, null, null, hx4.a(hx4Var, null, null, bx6.a(hx4Var.c, null, tw6.a(tw6Var3, dO2, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, 65534), false, 5), null, null, false, 59), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
                            default:
                                a820 a820Var2 = (a820) obj3;
                                ((oyg0) obj2).getClass();
                                a820Var2.getClass();
                                hx4 hx4Var2 = a820Var2.g;
                                return a820.a(a820Var2, null, null, null, null, null, hx4.a(hx4Var2, null, null, bx6.a(hx4Var2.c, null, tw6.a(tw6Var3, dO2, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, 65534), false, 5), null, null, false, 59), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
                        }
                    }
                });
                R0();
                return;
            }
            if (a420Var.equals(t320.f33245a)) {
                final tw6 tw6Var4 = ((a820) D()).g.c.b;
                final double dP2 = P(tw6Var4);
                pn40 pn40Var2 = pn40.f27267a;
                String strC2 = pn40.c(dP2, p3u0.g);
                int length3 = strC2.length();
                G0(new a8q0(strC2, s7n0.e(length3, length3), 4), false);
                final char c2 = c == true ? 1 : 0;
                H(new Function2() { // from class: a.vh20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (c2) {
                            case 0:
                                a820 a820Var = (a820) obj3;
                                ((oyg0) obj2).getClass();
                                a820Var.getClass();
                                hx4 hx4Var = a820Var.g;
                                return a820.a(a820Var, null, null, null, null, null, hx4.a(hx4Var, null, null, bx6.a(hx4Var.c, null, tw6.a(tw6Var4, dP2, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, 65534), false, 5), null, null, false, 59), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
                            default:
                                a820 a820Var2 = (a820) obj3;
                                ((oyg0) obj2).getClass();
                                a820Var2.getClass();
                                hx4 hx4Var2 = a820Var2.g;
                                return a820.a(a820Var2, null, null, null, null, null, hx4.a(hx4Var2, null, null, bx6.a(hx4Var2.c, null, tw6.a(tw6Var4, dP2, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, 65534), false, 5), null, null, false, 59), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
                        }
                    }
                });
                R0();
                return;
            }
            if (a420Var.equals(s320.f31535a)) {
                H(new fd20((byte) 16));
                return;
            }
            if (a420Var instanceof u320) {
                float f2 = ((u320) a420Var).f34976a;
                tw6 tw6Var5 = ((a820) D()).g.c.b;
                if (tw6Var5.e <= tw6Var5.d) {
                    return;
                }
                double dR2 = R(f2, tw6Var5);
                if (dR2 == tw6Var5.f34633a) {
                    return;
                }
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(dR2);
                String plainString2 = (bigDecimalValueOf2.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf2.stripTrailingZeros()).toPlainString();
                plainString2.getClass();
                int length4 = plainString2.length();
                y0(new a8q0(plainString2, s7n0.e(length4, length4), 4));
                return;
            }
            if (!(a420Var instanceof y320)) {
                t9f.b();
                return;
            }
            float f3 = ((y320) a420Var).f41930a;
            yyc yycVar3 = ((a820) D()).g.b;
            BigDecimal bigDecimal6 = yycVar3.e;
            BigDecimal bigDecimal7 = yycVar3.d;
            if (bigDecimal6.compareTo(bigDecimal7) <= 0) {
                return;
            }
            BigDecimal bigDecimalSubtract2 = bigDecimal6.subtract(bigDecimal7);
            BigDecimal bigDecimal8 = new BigDecimal(String.valueOf(f3));
            BigDecimal bigDecimal9 = new BigDecimal(100.0d);
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            BigDecimal bigDecimal10 = (BigDecimal) l1e0.h(bigDecimal7.add(bigDecimalSubtract2.multiply(bigDecimal8.divide(bigDecimal9, 6, roundingMode))).setScale(3, roundingMode), bigDecimal7, bigDecimal6);
            if (bigDecimal10.compareTo(yycVar3.f43459a) != 0) {
                String plainString3 = (bigDecimal10.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal10.stripTrailingZeros()).toPlainString();
                plainString3.getClass();
                int length5 = plainString3.length();
                z0(new a8q0(plainString3, s7n0.e(length5, length5), 4));
                return;
            }
            return;
        }
        boolean zEquals3 = l520Var.equals(o420.f24612a);
        i1w0 i1w0Var = this.J;
        if (zEquals3) {
            ((kt2) this.z.b).c("bet_place_settings");
            this.A.f40143a.a(xun.f41520a, 3174L);
            i1w0Var.d(new ih20(this, (byte) 0));
            return;
        }
        boolean zEquals4 = l520Var.equals(z420.f43748a);
        mne mneVar2 = this.c0;
        if (zEquals4) {
            sac.V(jiu0.a(this), new yw10(1, this, on20.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 24), null, mneVar2.b, new wl20(this, yjeVar, b2), 10);
            return;
        }
        if (l520Var instanceof a520) {
            sac.V(jiu0.a(this), new yw10(1, this, on20.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, mneVar2.b, new bh0(this, ((a520) l520Var).f249a, yjeVar, b5), 10);
            return;
        }
        if (l520Var.equals(b420.f1937a)) {
            hx4 hx4Var = ((a820) D()).g;
            double d4 = hx4Var.c.b.f34633a;
            double dDoubleValue = hx4Var.b.f43459a.doubleValue();
            zlt0 zlt0Var = this.y;
            H(new wh20(d4, dDoubleValue, zlt0Var.l(), zlt0Var.m(), (byte) 0));
            w0();
            return;
        }
        if (l520Var.equals(m420.f21146a)) {
            String str2 = (String) ((a820) D()).f.f6938a.f33019a.getValue();
            if (str2 == null) {
                return;
            }
            H(new hxk(str2, (byte) 29));
            w0();
            return;
        }
        if (l520Var.equals(w420.f38525a)) {
            H(new fd20((byte) 13));
            w0();
            return;
        }
        if (l520Var.equals(q320.f28029a)) {
            H(new fd20((byte) 17));
            w0();
            return;
        }
        if (l520Var.equals(e420.f7162a)) {
            B0();
            return;
        }
        if ((l520Var instanceof n320) || l520Var.equals(p320.f26279a) || l520Var.equals(o320.f24561a)) {
            return;
        }
        if (l520Var.equals(d420.f5434a)) {
            B0();
            return;
        }
        if (l520Var.equals(f420.f8892a)) {
            H(new fd20((byte) 4));
            w0();
            return;
        }
        if (l520Var.equals(i420.f14125a)) {
            return;
        }
        if (!l520Var.equals(p420.f26329a)) {
            if ((l520Var instanceof n420) || l520Var.equals(g420.f10642a) || l520Var.equals(b520.f1980a)) {
                return;
            }
            if (l520Var instanceof c420) {
                H(new b120(l520Var, b6));
                return;
            }
            if (l520Var.equals(h420.f12413a)) {
                G(gb20.f10995a);
                return;
            } else if (l520Var.equals(f520.f8939a)) {
                B0();
                return;
            } else {
                if (l520Var.equals(j420.f15864a)) {
                    return;
                }
                t9f.b();
                return;
            }
        }
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
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0119  */
    /* JADX WARN: Code duplicated, block: B:41:0x0130  */
    /* JADX WARN: Code duplicated, block: B:44:0x0150  */
    /* JADX WARN: Code duplicated, block: B:46:0x0158  */
    /* JADX WARN: Code duplicated, block: B:49:0x0179  */
    /* JADX WARN: Code duplicated, block: B:53:0x019f  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x0216  */
    /* JADX WARN: Code duplicated, block: B:78:0x021c  */
    /* JADX WARN: Code duplicated, block: B:81:0x022d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0230  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        if (r3 == r14) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r3 == r14) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0257, code lost:
    
        if (r0 == r14) goto L85;
     */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v7, types: [a.q4f, a.ql5, a.vtb0, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x0(a.q4f r26, a.vtb0 r27, a.zje r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.on20.x0(a.q4f, a.vtb0, a.zje):java.lang.Object");
    }

    public final void y0(a8q0 a8q0Var) {
        a8q0 a8q0VarA0 = a0(a8q0Var);
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(((a820) D()).g.c.b.i.b));
        a8q0 a8q0VarB0 = b0(a8q0VarA0, T(a8q0VarA0.f440a.b, bigDecimal) && ((a820) D()).g.c.b.i.f46472a, bigDecimal, 2);
        G0(a8q0VarB0, true);
        hx4 hx4Var = ((a820) D()).g;
        Double dI = kotlin.text.b.i(a8q0VarB0.f440a.b);
        double dDoubleValue = dI != null ? dI.doubleValue() : -1.0d;
        if (dDoubleValue == hx4Var.c.b.f34633a) {
            return;
        }
        H(new th20(hx4Var, dDoubleValue, (byte) 1));
        R0();
    }

    public final void z0(a8q0 a8q0Var) {
        BigDecimal bigDecimal;
        a8q0 a8q0VarA0 = a0(a8q0Var);
        boolean zT = T(a8q0VarA0.f440a.b, ((a820) D()).g.b.e);
        a8q0 a8q0VarB0 = b0(a8q0VarA0, zT, ((a820) D()).g.b.e, 3);
        H(new w1y(a8q0VarB0, (byte) 5));
        yyc yycVar = ((a820) D()).g.b;
        try {
            bigDecimal = new BigDecimal(a8q0VarB0.f440a.b);
        } catch (NumberFormatException unused) {
            bigDecimal = new BigDecimal(String.valueOf(-1.0d));
        }
        BigDecimal bigDecimal2 = bigDecimal;
        boolean z = bigDecimal2.compareTo(new BigDecimal(String.valueOf(-1.0d))) != 0;
        boolean z2 = bigDecimal2.compareTo(yycVar.e) > 0 || zT;
        boolean z3 = bigDecimal2.compareTo(yycVar.d) < 0;
        BigDecimal bigDecimal3 = yycVar.f43459a;
        H(new oh20(bigDecimal2, z2, z3, z, (byte) 0));
        if (bigDecimal3.equals(bigDecimal2)) {
            return;
        }
        R0();
    }
}
