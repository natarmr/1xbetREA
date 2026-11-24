package a;

import android.gov.nist.core.Separators;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ltr0 extends i3t0 {
    public static final /* synthetic */ int Q = 0;
    public final ilt0 A;
    public final trm0 B;
    public final mrt C;
    public final ot D;
    public final mii0 E;
    public final m0u F;
    public final xfu G;
    public final m1e H;
    public final ouu I;
    public final ih5 J;
    public final gg5 K;
    public final ih5 L;
    public final l7k M;
    public final cmt N;
    public final duj O;
    public bby P;
    public final i1w0 o;
    public final v88 p;
    public final ctf0 q;
    public final khf0 r;
    public final nou s;
    public final pmi0 t;
    public final zku u;
    public final hsj v;
    public final nv20 w;
    public final zku x;
    public final pv00 y;
    public final fvt0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ltr0(i1w0 i1w0Var, mne mneVar, v88 v88Var, ctf0 ctf0Var, khf0 khf0Var, nou nouVar, pmi0 pmi0Var, zku zkuVar, hsj hsjVar, nv20 nv20Var, zku zkuVar2, pv00 pv00Var, fvt0 fvt0Var, ilt0 ilt0Var, trm0 trm0Var, mrt mrtVar, ot otVar, mii0 mii0Var, m0u m0uVar, xfu xfuVar, m1e m1eVar, b8u b8uVar, b8u b8uVar2, ctu ctuVar, hru hruVar, ouu ouuVar, ih5 ih5Var, gg5 gg5Var, pru pruVar, wyu wyuVar, lk5 lk5Var, ih5 ih5Var2, l7k l7kVar, cmt cmtVar, duj dujVar) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        wyuVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        yje yjeVar = null;
        super(new ng0(wyuVar, ctuVar, hruVar, lk5Var, pruVar), g090VarP, new h0j0(ctf0Var, (byte) 23), (yzn0) null);
        this.o = i1w0Var;
        this.p = v88Var;
        this.q = ctf0Var;
        this.r = khf0Var;
        this.s = nouVar;
        this.t = pmi0Var;
        this.u = zkuVar;
        this.v = hsjVar;
        this.w = nv20Var;
        this.x = zkuVar2;
        this.y = pv00Var;
        this.z = fvt0Var;
        this.A = ilt0Var;
        this.B = trm0Var;
        this.C = mrtVar;
        this.D = otVar;
        this.E = mii0Var;
        this.F = m0uVar;
        this.G = xfuVar;
        this.H = m1eVar;
        this.I = ouuVar;
        this.J = ih5Var;
        this.K = gg5Var;
        this.L = ih5Var2;
        this.M = l7kVar;
        this.N = cmtVar;
        this.O = dujVar;
        fnq fnqVar = new fnq(b8uVar.a(bm5.l), new kpb0(this, yjeVar, (byte) 24));
        efr0 efr0Var = new efr0((byte) 5);
        eoh0 eoh0Var = i120.f;
        zys0.e(2, efr0Var);
        i3t0.L(this, new p6d(i120.X(fnqVar, eoh0Var, efr0Var), m1eVar.b(), new ws6(this, yjeVar, (byte) 2), (byte) 1), null, null, 3);
        i3t0.L(this, new fnq(new i89(((dlr0) ((yuu) b8uVar2.f2175a).c).f6298a, (byte) 22), new rtq0(this, yjeVar, (byte) 3), (byte) 4), null, null, 3);
        if (pruVar.a().l.g) {
            i3t0.K(this, null, null, new olb(this, null), 3);
        }
    }

    public static a8q0 M(BigDecimal bigDecimal) {
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(bigDecimal.doubleValue(), p3u0.g);
        int length = strC.length();
        return new a8q0(strC, s7n0.e(length, length), 4);
    }

    public final void N(Throwable th) {
        G(ysr0.f43185a);
        G(xsr0.f41429a);
        this.O.b(th, new a6p0(th, this, (byte) 28));
    }

    public final void O() {
        pek0 pek0Var = pek0.f26859a;
        ctf0 ctf0Var = this.q;
        G(new dtr0(new xdk0(pek0Var, ctf0Var.b.a(R.string.no_connection_title_with_hyphen, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.no_connection_description, Arrays.copyOf(new Object[0], 0)), null, null, null, 120)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P(ql5 ql5Var, zje zjeVar) {
        ktr0 ktr0Var;
        if (zjeVar instanceof ktr0) {
            ktr0Var = (ktr0) zjeVar;
            int i = ktr0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ktr0Var.l = i - Integer.MIN_VALUE;
            } else {
                ktr0Var = new ktr0(this, zjeVar);
            }
        } else {
            ktr0Var = new ktr0(this, zjeVar);
        }
        Object objC = ktr0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ktr0Var.l;
        if (i2 == 0) {
            z1x.P(objC);
            long j = ql5Var.e;
            ktr0Var.i = ql5Var;
            ktr0Var.l = 1;
            objC = this.F.f20973a.c(j, ktr0Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ql5Var = ktr0Var.i;
            z1x.P(objC);
        }
        H(new htr0(ql5Var, new BigDecimal(String.valueOf(((xuf) objC).n)), (byte) 0));
        return Unit.f46060a;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        ftr0 ftr0Var;
        pur0 pur0Var;
        Object value2;
        ftr0 ftr0Var2;
        pur0 pur0Var2;
        Object value3;
        ftr0 ftr0Var3;
        pur0 pur0Var3;
        long jE;
        Object value4;
        ftr0 ftr0Var4;
        vsr0 vsr0Var;
        l520 l520Var = (l520) obj;
        l520Var.getClass();
        super.x(l520Var);
        boolean z = l520Var instanceof g520;
        final byte b = 1;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            int i = ((g520) l520Var).f10697a;
            G(xsr0.f41429a);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value4 = p7m0Var.getValue();
                value4.getClass();
                ftr0Var4 = (ftr0) value4;
                oyg0Var.getClass();
                vsr0Var = (i == 0 || i != 1) ? vsr0.SIMPLE : vsr0.PROMO;
            } while (!p7m0Var.m(value4, ftr0.a(ftr0Var4, vsr0Var, null, null, false, null, 247)));
            return;
        }
        boolean zEquals = l520Var.equals(j520.f15913a);
        i1w0 i1w0Var = this.o;
        v88 v88Var = this.p;
        cmt cmtVar = this.N;
        l7k l7kVar = this.M;
        ih5 ih5Var = this.L;
        if (zEquals) {
            ih5Var.f(k7k.Toto);
            y1p y1pVar = y1p.MAIN;
            l7kVar.b("toto", cmtVar.g());
            v88.b(v88Var, i1w0Var, ((ftr0) D()).e.f30729a, 2);
            return;
        }
        if (l520Var.equals(m320.f21093a)) {
            ih5Var.f(k7k.NoMoneyToto);
            y1p y1pVar2 = y1p.MAIN;
            l7kVar.b("no_money_toto", cmtVar.g());
            v88.b(v88Var, i1w0Var, ((ftr0) D()).e.f30729a, 2);
            return;
        }
        if (l520Var.equals(i320.f14077a)) {
            this.J.c("toto");
            this.K.i("toto");
            G(atr0.f1446a);
            return;
        }
        yje yjeVar = null;
        if (l520Var.equals(w420.f38525a)) {
            i3t0.K(this, null, new mjr0(1, this, ltr0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 14), new fwk0(this, yjeVar, (byte) 5), 1);
            return;
        }
        if (l520Var.equals(m420.f21146a)) {
            i3t0.K(this, null, new mjr0(1, this, ltr0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 13), new dir0(this, yjeVar, b), 1);
            return;
        }
        final byte b2 = 0;
        if (l520Var instanceof l420) {
            String str = ((l420) l520Var).f19384a;
            jur0 jur0Var = ((ftr0) D()).h;
            if (jur0Var != null) {
                jur0Var.b.setValue(str);
            }
            i3t0.K(this, null, null, new jtr0(this, yjeVar, b2), 3);
            return;
        }
        if (!(l520Var instanceof v420)) {
            if (l520Var.equals(k320.f17598a)) {
                E();
                return;
            }
            return;
        }
        v420 v420Var = (v420) l520Var;
        if (v420Var instanceof u420) {
            a8q0 a8q0Var = ((u420) v420Var).f35024a;
            String strConcat = a8q0.b(a8q0Var, twn.p("[^0-9.]", a8q0Var.f440a.b, ""), 0L, 6).f440a.b;
            boolean z2 = strConcat.length() > 0 && strConcat.charAt(0) == '.';
            if (z2) {
                strConcat = "0".concat(strConcat);
            } else {
                int iU = StringsKt.U('.', 0, 6, strConcat);
                if (iU != -1) {
                    int i2 = iU + 1;
                    strConcat = ttm0.L(i2, strConcat).concat(kotlin.text.c.r(strConcat.substring(i2), Separators.DOT, "", false));
                }
            }
            if (StringsKt.P(strConcat, '.')) {
                String strQ0 = StringsKt.q0(strConcat, '.');
                String strN0 = StringsKt.n0(strConcat, '.');
                if (strQ0.length() > 13) {
                    strQ0 = ttm0.L(13, strQ0);
                }
                if (strN0.length() > 2) {
                    strN0 = ttm0.L(2, strN0);
                }
                strConcat = kng0.l(strQ0, Separators.DOT, strN0);
            } else if (strConcat.length() > 13) {
                strConcat = ttm0.L(13, strConcat);
            }
            if (strConcat.length() > 1 && strConcat.charAt(0) == '0' && strConcat.charAt(1) != '.') {
                strConcat = strConcat.substring(1);
            }
            if (z2) {
                int length = strConcat.length();
                jE = s7n0.e(length, length);
            } else {
                jE = a8q0Var.b;
            }
            a8q0 a8q0VarB = a8q0.b(a8q0Var, strConcat, jE, 4);
            BigDecimal bigDecimalH = kotlin.text.b.h(a8q0VarB.f440a.b);
            if (bigDecimalH == null) {
                bigDecimalH = BigDecimal.valueOf(0.0d);
            }
            H(new a6p0(a8q0VarB, bigDecimalH, (byte) 29));
            return;
        }
        if (v420Var.equals(q420.f28077a)) {
            H(new Function2(this) { // from class: a.gtr0
                public final /* synthetic */ ltr0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    BigDecimal bigDecimal;
                    BigDecimal bigDecimal2;
                    byte b3 = b2;
                    ltr0 ltr0Var = this.b;
                    switch (b3) {
                        case 0:
                            ftr0 ftr0Var5 = (ftr0) obj3;
                            ((oyg0) obj2).getClass();
                            ftr0Var5.getClass();
                            pur0 pur0Var4 = ftr0Var5.f;
                            rjr0 rjr0Var = pur0Var4.f27632a;
                            BigDecimal bigDecimal3 = rjr0Var.b;
                            BigDecimal bigDecimal4 = rjr0Var.c;
                            BigDecimal bigDecimalSubtract = rjr0Var.d;
                            BigDecimal bigDecimal5 = rjr0Var.e;
                            BigDecimal bigDecimalSubtract2 = bigDecimal3.subtract(bigDecimal4);
                            bigDecimalSubtract2.getClass();
                            if (bigDecimalSubtract2.compareTo(bigDecimalSubtract) < 0) {
                                bigDecimal = bigDecimalSubtract;
                            } else if (bigDecimal3.compareTo(bigDecimal5) > 0) {
                                bigDecimal = bigDecimal5;
                            } else {
                                bigDecimalSubtract = bigDecimal3.subtract(bigDecimal4);
                                bigDecimalSubtract.getClass();
                                bigDecimal = bigDecimalSubtract;
                            }
                            a8q0 a8q0VarM = ltr0.M(bigDecimal);
                            p7m0 p7m0Var2 = ltr0Var.i.f25029a;
                            while (true) {
                                Object value5 = p7m0Var2.getValue();
                                value5.getClass();
                                ftr0 ftr0Var6 = (ftr0) value5;
                                ltr0Var.f.getClass();
                                pur0 pur0Var5 = ftr0Var6.f;
                                ltr0 ltr0Var2 = ltr0Var;
                                ftr0 ftr0Var7 = ftr0Var5;
                                if (p7m0Var2.m(value5, ftr0.a(ftr0Var6, null, null, pur0.a(pur0Var5, rjr0.a(pur0Var5.f27632a, a8q0VarM, null, null, null, null, null, false, false, 254), null, 2), false, null, 223))) {
                                    return ftr0.a(ftr0Var7, null, null, pur0.a(pur0Var4, rjr0.a(rjr0Var, null, bigDecimal, null, null, null, null, false, false, 253), null, 2), false, null, 223);
                                }
                                ltr0Var = ltr0Var2;
                                ftr0Var5 = ftr0Var7;
                            }
                            break;
                        default:
                            ftr0 ftr0Var8 = (ftr0) obj3;
                            ((oyg0) obj2).getClass();
                            ftr0Var8.getClass();
                            pur0 pur0Var6 = ftr0Var8.f;
                            rjr0 rjr0Var2 = pur0Var6.f27632a;
                            BigDecimal bigDecimal6 = rjr0Var2.b;
                            BigDecimal bigDecimal7 = rjr0Var2.c;
                            BigDecimal bigDecimalAdd = rjr0Var2.d;
                            BigDecimal bigDecimal8 = rjr0Var2.e;
                            BigDecimal bigDecimalAdd2 = bigDecimal6.add(bigDecimal7);
                            bigDecimalAdd2.getClass();
                            if (bigDecimalAdd2.compareTo(bigDecimal8) > 0) {
                                bigDecimal2 = bigDecimal8;
                            } else {
                                if (bigDecimal6.compareTo(bigDecimalAdd) >= 0) {
                                    bigDecimalAdd = bigDecimal6.add(bigDecimal7);
                                    bigDecimalAdd.getClass();
                                }
                                bigDecimal2 = bigDecimalAdd;
                            }
                            a8q0 a8q0VarM2 = ltr0.M(bigDecimal2);
                            p7m0 p7m0Var3 = ltr0Var.i.f25029a;
                            while (true) {
                                Object value6 = p7m0Var3.getValue();
                                value6.getClass();
                                ftr0 ftr0Var9 = (ftr0) value6;
                                ltr0Var.f.getClass();
                                pur0 pur0Var7 = ftr0Var9.f;
                                rjr0 rjr0Var3 = rjr0Var2;
                                ftr0 ftr0Var10 = ftr0Var8;
                                if (p7m0Var3.m(value6, ftr0.a(ftr0Var9, null, null, pur0.a(pur0Var7, rjr0.a(pur0Var7.f27632a, a8q0VarM2, null, null, null, null, null, false, false, 254), null, 2), false, null, 223))) {
                                    return ftr0.a(ftr0Var10, null, null, pur0.a(pur0Var6, rjr0.a(rjr0Var3, null, bigDecimal2, null, null, null, null, false, false, 253), null, 2), false, null, 223);
                                }
                                ftr0Var8 = ftr0Var10;
                                rjr0Var2 = rjr0Var3;
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (v420Var.equals(s420.f31584a)) {
            H(new Function2(this) { // from class: a.gtr0
                public final /* synthetic */ ltr0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    BigDecimal bigDecimal;
                    BigDecimal bigDecimal2;
                    byte b3 = b;
                    ltr0 ltr0Var = this.b;
                    switch (b3) {
                        case 0:
                            ftr0 ftr0Var5 = (ftr0) obj3;
                            ((oyg0) obj2).getClass();
                            ftr0Var5.getClass();
                            pur0 pur0Var4 = ftr0Var5.f;
                            rjr0 rjr0Var = pur0Var4.f27632a;
                            BigDecimal bigDecimal3 = rjr0Var.b;
                            BigDecimal bigDecimal4 = rjr0Var.c;
                            BigDecimal bigDecimalSubtract = rjr0Var.d;
                            BigDecimal bigDecimal5 = rjr0Var.e;
                            BigDecimal bigDecimalSubtract2 = bigDecimal3.subtract(bigDecimal4);
                            bigDecimalSubtract2.getClass();
                            if (bigDecimalSubtract2.compareTo(bigDecimalSubtract) < 0) {
                                bigDecimal = bigDecimalSubtract;
                            } else if (bigDecimal3.compareTo(bigDecimal5) > 0) {
                                bigDecimal = bigDecimal5;
                            } else {
                                bigDecimalSubtract = bigDecimal3.subtract(bigDecimal4);
                                bigDecimalSubtract.getClass();
                                bigDecimal = bigDecimalSubtract;
                            }
                            a8q0 a8q0VarM = ltr0.M(bigDecimal);
                            p7m0 p7m0Var2 = ltr0Var.i.f25029a;
                            while (true) {
                                Object value5 = p7m0Var2.getValue();
                                value5.getClass();
                                ftr0 ftr0Var6 = (ftr0) value5;
                                ltr0Var.f.getClass();
                                pur0 pur0Var5 = ftr0Var6.f;
                                ltr0 ltr0Var2 = ltr0Var;
                                ftr0 ftr0Var7 = ftr0Var5;
                                if (p7m0Var2.m(value5, ftr0.a(ftr0Var6, null, null, pur0.a(pur0Var5, rjr0.a(pur0Var5.f27632a, a8q0VarM, null, null, null, null, null, false, false, 254), null, 2), false, null, 223))) {
                                    return ftr0.a(ftr0Var7, null, null, pur0.a(pur0Var4, rjr0.a(rjr0Var, null, bigDecimal, null, null, null, null, false, false, 253), null, 2), false, null, 223);
                                }
                                ltr0Var = ltr0Var2;
                                ftr0Var5 = ftr0Var7;
                            }
                            break;
                        default:
                            ftr0 ftr0Var8 = (ftr0) obj3;
                            ((oyg0) obj2).getClass();
                            ftr0Var8.getClass();
                            pur0 pur0Var6 = ftr0Var8.f;
                            rjr0 rjr0Var2 = pur0Var6.f27632a;
                            BigDecimal bigDecimal6 = rjr0Var2.b;
                            BigDecimal bigDecimal7 = rjr0Var2.c;
                            BigDecimal bigDecimalAdd = rjr0Var2.d;
                            BigDecimal bigDecimal8 = rjr0Var2.e;
                            BigDecimal bigDecimalAdd2 = bigDecimal6.add(bigDecimal7);
                            bigDecimalAdd2.getClass();
                            if (bigDecimalAdd2.compareTo(bigDecimal8) > 0) {
                                bigDecimal2 = bigDecimal8;
                            } else {
                                if (bigDecimal6.compareTo(bigDecimalAdd) >= 0) {
                                    bigDecimalAdd = bigDecimal6.add(bigDecimal7);
                                    bigDecimalAdd.getClass();
                                }
                                bigDecimal2 = bigDecimalAdd;
                            }
                            a8q0 a8q0VarM2 = ltr0.M(bigDecimal2);
                            p7m0 p7m0Var3 = ltr0Var.i.f25029a;
                            while (true) {
                                Object value6 = p7m0Var3.getValue();
                                value6.getClass();
                                ftr0 ftr0Var9 = (ftr0) value6;
                                ltr0Var.f.getClass();
                                pur0 pur0Var7 = ftr0Var9.f;
                                rjr0 rjr0Var3 = rjr0Var2;
                                ftr0 ftr0Var10 = ftr0Var8;
                                if (p7m0Var3.m(value6, ftr0.a(ftr0Var9, null, null, pur0.a(pur0Var7, rjr0.a(pur0Var7.f27632a, a8q0VarM2, null, null, null, null, null, false, false, 254), null, 2), false, null, 223))) {
                                    return ftr0.a(ftr0Var10, null, null, pur0.a(pur0Var6, rjr0.a(rjr0Var3, null, bigDecimal2, null, null, null, null, false, false, 253), null, 2), false, null, 223);
                                }
                                ftr0Var8 = ftr0Var10;
                                rjr0Var2 = rjr0Var3;
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (v420Var.equals(r420.f29815a)) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                ftr0Var3 = (ftr0) value3;
                oyg0Var.getClass();
                pur0Var3 = ftr0Var3.f;
            } while (!p7m0Var2.m(value3, ftr0.a(ftr0Var3, null, null, pur0.a(pur0Var3, rjr0.a(pur0Var3.f27632a, null, null, null, null, null, null, false, false, 191), null, 2), false, null, 223)));
            return;
        }
        if (!(v420Var instanceof t420)) {
            t9f.b();
            return;
        }
        float f = ((t420) v420Var).f33298a;
        rjr0 rjr0Var = ((ftr0) D()).f.f27632a;
        BigDecimal bigDecimal = rjr0Var.e;
        BigDecimal bigDecimal2 = rjr0Var.d;
        if (bigDecimal.compareTo(bigDecimal2) <= 0) {
            return;
        }
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
        bigDecimalSubtract.getClass();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(f);
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(100.0d);
        bigDecimalValueOf2.getClass();
        BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimalValueOf2, RoundingMode.HALF_EVEN);
        bigDecimalDivide.getClass();
        BigDecimal bigDecimalMultiply = bigDecimalSubtract.multiply(bigDecimalDivide);
        bigDecimalMultiply.getClass();
        BigDecimal bigDecimalAdd = bigDecimal2.add(bigDecimalMultiply);
        bigDecimalAdd.getClass();
        Comparable comparableH = l1e0.h(bigDecimalAdd.setScale(2, RoundingMode.HALF_UP), bigDecimal2, bigDecimal);
        comparableH.getClass();
        BigDecimal bigDecimal3 = (BigDecimal) comparableH;
        if (bigDecimal3.equals(rjr0Var.b)) {
            return;
        }
        String plainString = (bigDecimal3.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal3.stripTrailingZeros()).toPlainString();
        plainString.getClass();
        int length2 = plainString.length();
        a8q0 a8q0Var2 = new a8q0(plainString, s7n0.e(length2, length2), 4);
        p7m0 p7m0Var3 = ocjVar.f25029a;
        do {
            value = p7m0Var3.getValue();
            value.getClass();
            ftr0Var = (ftr0) value;
            oyg0Var.getClass();
            pur0Var = ftr0Var.f;
        } while (!p7m0Var3.m(value, ftr0.a(ftr0Var, null, null, pur0.a(pur0Var, rjr0.a(pur0Var.f27632a, a8q0Var2, null, null, null, null, null, false, false, 254), null, 2), false, null, 223)));
        p7m0 p7m0Var4 = ocjVar.f25029a;
        do {
            value2 = p7m0Var4.getValue();
            value2.getClass();
            ftr0Var2 = (ftr0) value2;
            oyg0Var.getClass();
            pur0Var2 = ftr0Var2.f;
        } while (!p7m0Var4.m(value2, ftr0.a(ftr0Var2, null, null, pur0.a(pur0Var2, rjr0.a(pur0Var2.f27632a, null, bigDecimal3, null, null, null, null, false, false, 253), null, 2), false, null, 223)));
    }
}
