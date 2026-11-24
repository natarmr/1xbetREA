package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xplatform.cyber.cyberstatistic.api.navigation.CyberGameStatisticScreenParams;
import org.xplatform.cyber.cyberstatistic.impl.navigation.CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getUfcPostGameScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class g2g0 extends x2t0 {
    public static final /* synthetic */ int s = 0;
    public final /* synthetic */ byte h = 1;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2g0(oeg0 oeg0Var, ivn ivnVar, pru pruVar, lhf0 lhf0Var, gr00 gr00Var, yfm0 yfm0Var, kys0 kys0Var, bn6 bn6Var, je jeVar, pv00 pv00Var) {
        super(new b4f0((byte) 28));
        oeg0Var.getClass();
        this.i = oeg0Var;
        this.j = ivnVar;
        this.k = pruVar;
        this.l = lhf0Var;
        this.m = gr00Var;
        this.n = yfm0Var;
        this.o = kys0Var;
        this.p = bn6Var;
        this.q = jeVar;
        this.r = pv00Var;
    }

    @Override // a.j3t0
    public final /* bridge */ /* synthetic */ Object a(Object obj, bnn0 bnn0Var) {
        switch (this.h) {
            case 0:
                return i((d2g0) obj, bnn0Var);
            default:
                return j((uyq0) obj, bnn0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object i(d2g0 d2g0Var, zje zjeVar) {
        f2g0 f2g0Var;
        String strR;
        String strValueOf;
        String strValueOf2;
        String value;
        Object value2;
        k2g0 k2g0Var;
        Object value3;
        k2g0 k2g0Var2;
        v1g0 v1g0Var;
        d2g0 d2g0Var2 = d2g0Var;
        if (zjeVar instanceof f2g0) {
            f2g0Var = (f2g0) zjeVar;
            int i = f2g0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                f2g0Var.l = i - Integer.MIN_VALUE;
            } else {
                f2g0Var = new f2g0(this, zjeVar);
            }
        } else {
            f2g0Var = new f2g0(this, zjeVar);
        }
        Object obj = f2g0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = f2g0Var.l;
        Object obj2 = null;
        if (i2 == 0) {
            z1x.P(obj);
            f2g0Var.i = d2g0Var2;
            f2g0Var.l = 1;
            if (x2t0.f(this, d2g0Var2, f2g0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d2g0Var2 = f2g0Var.i;
            z1x.P(obj);
        }
        if (d2g0Var2 != null) {
            boolean z = d2g0Var2 instanceof v1g0;
            ocj ocjVar = this.b;
            if (z) {
                ocjVar.getClass();
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    k2g0Var2 = (k2g0) value3;
                    k2g0Var2.getClass();
                    v1g0Var = (v1g0) d2g0Var2;
                } while (!p7m0Var.m(value3, k2g0.a(k2g0Var2, v1g0Var.f36628a, null, v1g0Var.b, 4)));
            } else if (d2g0Var2 instanceof w1g0) {
                ocjVar.getClass();
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    k2g0Var = (k2g0) value2;
                    k2g0Var.getClass();
                } while (!p7m0Var2.m(value2, k2g0.a(k2g0Var, null, ((w1g0) d2g0Var2).f38397a, null, 11)));
            } else if (d2g0Var2 instanceof u1g0) {
                e();
            } else if (d2g0Var2 instanceof c2g0) {
                c2g0 c2g0Var = (c2g0) d2g0Var2;
                oeg0 oeg0Var = (oeg0) this.i;
                if (c2g0Var instanceof y1g0) {
                    k(((y1g0) c2g0Var).f41853a);
                } else if (c2g0Var instanceof z1g0) {
                    k(((z1g0) c2g0Var).f43618a);
                } else if (c2g0Var instanceof a2g0) {
                    long j = ((a2g0) c2g0Var).f123a;
                    for (Object obj3 : ((k2g0) d()).c) {
                        if (((l2g0) obj3).f19307a == j) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    l2g0 l2g0Var = (l2g0) obj2;
                    if (l2g0Var == null) {
                        throw new ss3();
                    }
                    oeg0Var.c().d(new qi4((Object) this, l2g0Var.b, (byte) 15));
                } else if (!c2g0Var.equals(x1g0.f40121a)) {
                    if (!(c2g0Var instanceof b2g0)) {
                        t9f.b();
                        return null;
                    }
                    long j2 = ((b2g0) c2g0Var).f1851a;
                    for (Object obj4 : ((k2g0) d()).c) {
                        if (((l2g0) obj4).f19307a == j2) {
                            obj2 = obj4;
                            break;
                        }
                    }
                    final l2g0 l2g0Var2 = (l2g0) obj2;
                    if (l2g0Var2 != null) {
                        String str = l2g0Var2.p;
                        long j3 = l2g0Var2.c;
                        String str2 = l2g0Var2.e;
                        if (str2.length() == 0) {
                            g(new i2g0());
                        } else {
                            pv00 pv00Var = (pv00) this.r;
                            if (j3 == 66 || j3 == 99) {
                                strR = kotlin.text.c.r(str, "-", Separators.COLON, false);
                            } else if (j3 == 106 || j3 == 277 || gql0.a().contains(Long.valueOf(j3))) {
                                bh30 bh30VarB = new Regex("(\\d+\\s*[:-]\\s*\\d+)").b(str);
                                if (bh30VarB == null || (value = bh30VarB.getValue()) == null) {
                                    value = Separators.COLON;
                                }
                                strR = kotlin.text.c.r(value, "-", Separators.COLON, false);
                            } else {
                                bh30 bh30VarB2 = new Regex("(\\d+\\s*[:-]\\s*\\d+)").b(str);
                                if (bh30VarB2 == null || (strR = bh30VarB2.getValue()) == null) {
                                    strR = Separators.COLON;
                                }
                            }
                            List listSplit$default = StringsKt__StringsKt.split$default(strR, new String[]{Separators.COLON}, false, 0, 6, null);
                            String str3 = (String) CollectionsKt.W(0, listSplit$default);
                            if (str3 == null) {
                                str3 = "";
                            }
                            if (str3.length() == 0) {
                                str3 = "0";
                            }
                            String string = StringsKt.u0(str3).toString();
                            String str4 = (String) CollectionsKt.W(1, listSplit$default);
                            String str5 = str4 != null ? str4 : "";
                            if (str5.length() == 0) {
                                str5 = "0";
                            }
                            String string2 = StringsKt.u0(str5).toString();
                            long j4 = l2g0Var2.c;
                            long j5 = l2g0Var2.s;
                            Long l = (Long) CollectionsKt.firstOrNull(l2g0Var2.j);
                            if (l == null || (strValueOf = String.valueOf(l.longValue())) == null) {
                                strValueOf = "0";
                            }
                            y6p0 y6p0VarO = ycm0.o(l2g0Var2.n, strValueOf, l2g0Var2.l);
                            Long l2 = (Long) CollectionsKt.firstOrNull(l2g0Var2.k);
                            if (l2 == null || (strValueOf2 = String.valueOf(l2.longValue())) == null) {
                                strValueOf2 = "0";
                            }
                            final byte b = 0;
                            pv00Var.n(new vcm0(str2, j4, "", j5, str, string, string2, y6p0VarO, ycm0.o(l2g0Var2.o, strValueOf2, l2g0Var2.m), 0, 0, true, l2g0Var2.g, true, false, string, string2));
                            ((bn6) this.p).e(l2g0Var2.c, l2g0Var2.d, l2g0Var2.h, true, false, ((k2g0) d()).f17570a, null, null);
                            ((je) this.q).h(l2g0Var2.c, l2g0Var2.d, l2g0Var2.h, ((k2g0) d()).f17570a);
                            if (j3 == 189 && ((pru) this.k).a().c.d) {
                                oeg0Var.c().d(new Function1(this) { // from class: a.e2g0
                                    public final /* synthetic */ g2g0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        byte b2 = b;
                                        l2g0 l2g0Var3 = l2g0Var2;
                                        g2g0 g2g0Var = this.b;
                                        switch (b2) {
                                            case 0:
                                                k0w0 k0w0Var = (k0w0) obj5;
                                                k0w0Var.getClass();
                                                kys0 kys0Var = (kys0) g2g0Var.o;
                                                String str6 = l2g0Var3.e;
                                                long j6 = l2g0Var3.f19307a;
                                                long j7 = l2g0Var3.c;
                                                kys0Var.getClass();
                                                k0w0Var.h(new UfcScreensFactoryImpl$getUfcPostGameScreen$1(j6, j7, str6));
                                                break;
                                            default:
                                                k0w0 k0w0Var2 = (k0w0) obj5;
                                                k0w0Var2.getClass();
                                                gr00 gr00Var = (gr00) g2g0Var.m;
                                                String str7 = l2g0Var3.e;
                                                long j8 = l2g0Var3.d;
                                                int i3 = l2g0Var3.w;
                                                String str8 = l2g0Var3.l;
                                                String str9 = l2g0Var3.m;
                                                String str10 = (String) CollectionsKt.firstOrNull(l2g0Var3.n);
                                                if (str10 == null) {
                                                    str10 = "";
                                                }
                                                String str11 = (String) CollectionsKt.firstOrNull(l2g0Var3.o);
                                                if (str11 == null) {
                                                    str11 = "";
                                                }
                                                CyberGameStatisticScreenParams cyberGameStatisticScreenParams = new CyberGameStatisticScreenParams(str7, j8, 0, i3, str8, str9, str10, str11, l2g0Var3.s, l2g0Var3.p);
                                                gr00Var.getClass();
                                                k0w0Var2.h(new CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1(cyberGameStatisticScreenParams, gr00Var));
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                            } else if (!gql0.b().contains(Long.valueOf(l2g0Var2.d))) {
                                i1w0 i1w0VarC = oeg0Var.c();
                                k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
                                k0w0VarI.h(((zfm0) ((yfm0) this.n)).a(j3, str2));
                                ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
                                while (true) {
                                    paw pawVar = (paw) listIteratorO;
                                    if (!pawVar.hasNext()) {
                                        break;
                                    }
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                            } else {
                                final byte b2 = 1;
                                oeg0Var.c().d(new Function1(this) { // from class: a.e2g0
                                    public final /* synthetic */ g2g0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        byte b3 = b2;
                                        l2g0 l2g0Var3 = l2g0Var2;
                                        g2g0 g2g0Var = this.b;
                                        switch (b3) {
                                            case 0:
                                                k0w0 k0w0Var = (k0w0) obj5;
                                                k0w0Var.getClass();
                                                kys0 kys0Var = (kys0) g2g0Var.o;
                                                String str6 = l2g0Var3.e;
                                                long j6 = l2g0Var3.f19307a;
                                                long j7 = l2g0Var3.c;
                                                kys0Var.getClass();
                                                k0w0Var.h(new UfcScreensFactoryImpl$getUfcPostGameScreen$1(j6, j7, str6));
                                                break;
                                            default:
                                                k0w0 k0w0Var2 = (k0w0) obj5;
                                                k0w0Var2.getClass();
                                                gr00 gr00Var = (gr00) g2g0Var.m;
                                                String str7 = l2g0Var3.e;
                                                long j8 = l2g0Var3.d;
                                                int i3 = l2g0Var3.w;
                                                String str8 = l2g0Var3.l;
                                                String str9 = l2g0Var3.m;
                                                String str10 = (String) CollectionsKt.firstOrNull(l2g0Var3.n);
                                                if (str10 == null) {
                                                    str10 = "";
                                                }
                                                String str11 = (String) CollectionsKt.firstOrNull(l2g0Var3.o);
                                                if (str11 == null) {
                                                    str11 = "";
                                                }
                                                CyberGameStatisticScreenParams cyberGameStatisticScreenParams = new CyberGameStatisticScreenParams(str7, j8, 0, i3, str8, str9, str10, str11, l2g0Var3.s, l2g0Var3.p);
                                                gr00Var.getClass();
                                                k0w0Var2.h(new CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1(cyberGameStatisticScreenParams, gr00Var));
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                            }
                        }
                    }
                }
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f0  */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0243, code lost:
    
        if (r0 == r7) goto L115;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(a.uyq0 r20, a.zje r21) {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g2g0.j(a.uyq0, a.zje):java.lang.Object");
    }

    public void k(long j) {
        Object value;
        k2g0 k2g0Var;
        Set set = ((k2g0) d()).d;
        LinkedHashSet linkedHashSetE = set.contains(Long.valueOf(j)) ? eui0.e(CollectionsKt.O0(set), Long.valueOf(j)) : eui0.h(CollectionsKt.O0(set), Long.valueOf(j));
        ocj ocjVar = this.b;
        ocjVar.getClass();
        p7m0 p7m0Var = ocjVar.f25029a;
        do {
            value = p7m0Var.getValue();
            k2g0Var = (k2g0) value;
            k2g0Var.getClass();
        } while (!p7m0Var.m(value, k2g0.a(k2g0Var, null, null, linkedHashSetE, 7)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2g0(i1w0 i1w0Var, yox yoxVar, uzc0 uzc0Var, gg5 gg5Var, yo4 yo4Var, grj grjVar, jlx jlxVar, qyg0 qyg0Var, pyg0 pyg0Var, x20 x20Var) {
        super(new joq0((byte) 7));
        i1w0Var.getClass();
        this.i = i1w0Var;
        this.j = yoxVar;
        this.k = uzc0Var;
        this.l = gg5Var;
        this.m = yo4Var;
        this.n = grjVar;
        this.o = jlxVar;
        this.p = qyg0Var;
        this.q = pyg0Var;
        this.r = x20Var;
    }
}
