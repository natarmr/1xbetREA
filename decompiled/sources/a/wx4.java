package a;

import android.text.SpannableString;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_constructor.impl.makebet.domain.model.StepInputConfigModel;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.coupon.impl.make_bet.presentation.model.AutoMaxUiModel;
import org.xplatform.coupon.impl.make_bet.presentation.model.CoefStepInputUiModel;
import org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;

/* JADX INFO: loaded from: classes3.dex */
public final class wx4 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx4(DsButton dsButton, DsLottieEmpty dsLottieEmpty, Function0 function0, yje yjeVar) {
        super(3, yjeVar);
        this.i = (byte) 5;
        this.l = dsButton;
        this.j = dsLottieEmpty;
        this.k = function0;
    }

    private final Object G(Object obj) {
        double d;
        String strC;
        ank0 ank0Var;
        double d2;
        ank0 ank0VarS;
        String strF;
        CoefStepInputUiModel coefStepInputUiModel = (CoefStepInputUiModel) this.l;
        StepInputUiModel stepInputUiModel = (StepInputUiModel) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        coefStepInputUiModel.getClass();
        stepInputUiModel.getClass();
        double d3 = stepInputUiModel.e;
        double d4 = stepInputUiModel.d;
        double d5 = stepInputUiModel.f46474a;
        boolean z = stepInputUiModel.g;
        h620 h620Var = (h620) this.k;
        ctf0 ctf0Var = h620Var.i;
        boolean z2 = h620Var.b;
        ctf0Var.getClass();
        BigDecimal bigDecimal = coefStepInputUiModel.f46473a;
        String plainString = bigDecimal.toPlainString();
        plainString.getClass();
        BigDecimal bigDecimal2 = coefStepInputUiModel.d;
        BigDecimal bigDecimal3 = coefStepInputUiModel.e;
        ArrayList arrayList = new ArrayList();
        bnk0 bnk0Var = new bnk0();
        if (coefStepInputUiModel.h) {
            d = d3;
            pzw.E(bnk0Var, ctf0Var.f(R.string.min_coef_v2, bigDecimal2), 0, R.color.static_red, 0, 0, 54);
        } else {
            d = d3;
            if (coefStepInputUiModel.g) {
                pn40 pn40Var = pn40.f27267a;
                pzw.E(bnk0Var, ctf0Var.f(R.string.max_coef_v2, pn40.g(bigDecimal3)), 0, R.color.static_red, 0, 0, 54);
            }
        }
        ank0 ank0VarL = w6x.l(arrayList, bnk0Var.f2888a, arrayList);
        boolean z3 = true;
        if (bigDecimal.compareTo(bigDecimal3) >= 0) {
            z3 = false;
        }
        boolean z4 = bigDecimal.compareTo(bigDecimal2) > 0 ? z3 : false;
        boolean z5 = (((bigDecimal.compareTo(bigDecimal2) < 0 || bigDecimal.compareTo(bigDecimal3) > 0) ? false : z3) && (((((d4 > d5 ? 1 : (d4 == d5 ? 0 : -1)) > 0 || (d5 > d ? 1 : (d5 == d ? 0 : -1)) > 0) && !((!z || (d5 > d4 ? 1 : (d5 == d4 ? 0 : -1)) < 0) ? false : z3)) || (d5 > (-1.0d) ? 1 : (d5 == (-1.0d) ? 0 : -1)) == 0) ? false : z3)) ? z3 : false;
        if (d5 == -1.0d) {
            strC = "";
        } else {
            pn40 pn40Var2 = pn40.f27267a;
            strC = pn40.c(d5, p3u0.g);
        }
        double d6 = stepInputUiModel.d;
        double d7 = stepInputUiModel.e;
        String str = stepInputUiModel.f;
        if ((d6 > d5 || d5 > d7) && d5 != -1.0d) {
            ank0Var = ank0VarL;
            d2 = d5;
            z = z;
            if (d2 < d6) {
                ank0VarS = h8x.u(ctf0Var, d6, str);
            } else {
                ank0VarS = d2 > d7 ? h8x.s(ctf0Var, d7, str) : new ank0(iun.f15405a);
            }
        } else if (z2) {
            ank0VarS = h8x.r(stepInputUiModel.g, d6, str, d7);
            ank0Var = ank0VarL;
            d2 = d5;
            z = z;
        } else {
            ank0Var = ank0VarL;
            d2 = d5;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (z) {
                pn40 pn40Var3 = pn40.f27267a;
                strF = ctf0Var.f(R.string.unlimited_max_bet_value_v2, pn40.d(d6, str, p3u0.c));
            } else {
                pn40 pn40Var4 = pn40.f27267a;
                p3u0 p3u0Var = p3u0.c;
                strF = ctf0Var.f(R.string.min_max_bet_input, pn40.d(d6, str, p3u0Var), pn40.d(d7, str, p3u0Var));
            }
            ank0VarS = axq.d(arrayList3, new zmk0(strF, -1, -1.0f, -1, -1, R.attr.uikitSecondary), arrayList2, arrayList3, arrayList2);
        }
        boolean z6 = stepInputUiModel.m;
        boolean z7 = coefStepInputUiModel.f;
        pn40 pn40Var5 = pn40.f27267a;
        String strF2 = ctf0Var.f(R.string.bet_enter_coefficient_v2, pn40.c(bigDecimal2.doubleValue(), p3u0.c));
        AutoMaxUiModel autoMaxUiModel = stepInputUiModel.i;
        return new y05(plainString, ank0Var, z3, z4, z5, strC, ank0VarS, z7, z6, strF2, new AutoMaxUiModel(autoMaxUiModel.b, autoMaxUiModel.f46472a && !z), ((bigDecimal.compareTo(bigDecimal2) < 0 || bigDecimal.compareTo(bigDecimal3) > 0) && bigDecimal.doubleValue() != -1.0d) ? z3 : false, !(((d4 > d2 || d2 > d) && d2 != -1.0d) ? false : z3), ctf0Var.f(R.string.input_coef_range_v2, bigDecimal2.toString()), coefStepInputUiModel.g, stepInputUiModel.q);
    }

    private final Object H(Object obj) {
        StepInputUiModel stepInputUiModel = (StepInputUiModel) this.l;
        ql5 ql5Var = (ql5) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        p7m0 p7m0Var = ((h620) this.k).q0;
        double d = stepInputUiModel.f46474a;
        double d2 = ql5Var.b;
        Object obj2 = (d > d2 || d2 == 0.0d) ? xg5.f40823a : bh5.f2588a;
        p7m0Var.getClass();
        p7m0Var.o(null, obj2);
        return Unit.f46060a;
    }

    private final Object I(Object obj) {
        StepInputConfigModel stepInputConfigModel = (StepInputConfigModel) this.l;
        ql5 ql5Var = (ql5) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        p7m0 p7m0Var = ((rg20) this.k).H;
        double d = stepInputConfigModel.f46382a;
        double d2 = ql5Var.b;
        Object obj2 = (d > d2 || d2 == 0.0d) ? id20.f14562a : jd20.f16309a;
        p7m0Var.getClass();
        p7m0Var.o(null, obj2);
        return Unit.f46060a;
    }

    private final Object J(Object obj) {
        StepInputUiModel stepInputUiModel = (StepInputUiModel) this.l;
        ql5 ql5Var = (ql5) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        p7m0 p7m0Var = ((qg20) this.k).s1;
        double d = (stepInputUiModel.r ? 2.0d : 1.0d) * stepInputUiModel.f46474a;
        double d2 = ql5Var.b;
        Object obj2 = (d > d2 || d2 == 0.0d) ? xg5.f40823a : bh5.f2588a;
        p7m0Var.getClass();
        p7m0Var.o(null, obj2);
        return Unit.f46060a;
    }

    private final Object K(Object obj) {
        Iterable iterable = (List) this.l;
        List list = (List) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        List<ef40> listN0 = CollectionsKt.n0(list, iterable);
        d650 d650Var = (d650) this.k;
        for (ef40 ef40Var : listN0) {
            int i = d650.k1;
            if ((ef40Var.getState() instanceof ubj) || (ef40Var.getState() instanceof pbj)) {
                if (ef40Var instanceof me40) {
                    d650Var.V(((me40) ef40Var).getKey());
                } else if (ef40Var instanceof oe40) {
                    d650Var.W(ef40Var.getKey());
                } else if (ef40Var instanceof ye40) {
                    d650Var.O(ef40Var.getKey());
                } else if (ef40Var instanceof xe40) {
                    d650Var.N(ef40Var.getKey());
                } else if (ef40Var instanceof ze40) {
                    d650Var.Q();
                } else if (ef40Var instanceof re40) {
                    if (d650Var.r0.f15225a.a()) {
                        d650Var.P();
                    } else {
                        d650Var.Q();
                    }
                } else if (ef40Var instanceof af40) {
                    d650Var.R(ef40Var.getKey());
                } else if (ef40Var instanceof qe40) {
                    qe40 qe40Var = (qe40) ef40Var;
                    d650Var.J(qe40Var.getKey(), qe40Var.f28565a, true);
                } else if (ef40Var instanceof te40) {
                    d650Var.L(ef40Var.getKey());
                } else if (ef40Var instanceof we40) {
                    d650Var.M(ef40Var.getKey());
                } else if (ef40Var instanceof cf40) {
                    d650Var.T(ef40Var.getKey());
                } else if (ef40Var instanceof se40) {
                    d650Var.K(ef40Var.getKey());
                } else {
                    if (!(ef40Var instanceof bf40)) {
                        t9f.b();
                        return null;
                    }
                    d650Var.S(ef40Var.getKey());
                }
            }
        }
        return list;
    }

    private final Object L(Object obj) {
        Object value;
        Throwable th = (Throwable) this.l;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        bs60 bs60Var = (bs60) this.j;
        int i = bs60.h0;
        p7m0 p7m0Var = bs60Var.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
        } while (!p7m0Var.m(value, w370.a((w370) value, false, false, null, null, null, null, null, false, false, false, false, 16382)));
        String str = (String) this.k;
        if (bs60Var.X(str)) {
            if (Intrinsics.d(bs60Var.e0, bs60Var.M(str))) {
                bs60Var.e0 = null;
            }
            bs60Var.Y();
        } else {
            bs60Var.P(th);
        }
        return Unit.f46060a;
    }

    private final Object M(Object obj) {
        boolean zE0;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        rjt rjtVar = (rjt) this.l;
        rjt rjtVar2 = (rjt) this.j;
        gp00 gp00Var = (gp00) this.k;
        rjtVar2.getClass();
        rjtVar.getClass();
        int i = rjtVar2.f30612a;
        int i2 = rjtVar.f30612a;
        if (i > i2) {
            zE0 = true;
        } else {
            zE0 = i < i2 ? false : qcc.e0(rjtVar2.b, rjtVar.b, gp00Var);
        }
        return zE0 ? rjtVar2 : rjtVar;
    }

    private final Object Q(Object obj) {
        wj80 wj80Var = (wj80) this.l;
        List list = (List) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        return fk80.e(wj80Var, list);
    }

    private final Object R(Object obj) {
        List list = (List) this.l;
        String str = (String) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (str.length() <= 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            nq90 nq90Var = (nq90) obj2;
            boolean z = true;
            if (!StringsKt.O(nq90Var.getTitle(), str, true)) {
                boolean z2 = nq90Var instanceof gq90;
                boolean zO = false;
                if (z2 || (nq90Var instanceof kq90)) {
                    if ((!z2 || !kotlin.text.c.x(((gq90) nq90Var).f, str, true)) && (!(nq90Var instanceof kq90) || !kotlin.text.c.x(((kq90) nq90Var).g, str, true))) {
                        z = false;
                    }
                    zO = z;
                } else if (nq90Var instanceof hq90) {
                    zO = StringsKt.O(((hq90) nq90Var).d, str, true);
                }
                if (zO) {
                }
            }
            arrayList.add(obj2);
        }
        return arrayList;
    }

    private final Object l(Object obj) {
        Long l;
        xvm0 xvm0Var = (xvm0) this.l;
        js20 js20Var = (js20) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        k4s k4sVar = (k4s) this.k;
        z2s z2sVar = (z2s) k4sVar.D();
        long j = z2sVar.f43686a;
        long j2 = z2sVar.e;
        t3z t3zVar = z2sVar.i;
        u3z u3zVar = new u3z(j, t3zVar, j2);
        Long lValueOf = null;
        if (js20Var != null) {
            boolean z = js20Var instanceof gs20;
            if (z || (js20Var instanceof hs20)) {
                l = null;
            } else if (js20Var instanceof is20) {
                l = new Long(((is20) js20Var).f15285a);
            }
            if (((z2s) k4sVar.D()).J == null || ((z2s) k4sVar.D()).K == null) {
                k4sVar.H(new gup((Object) xvm0Var, (Object) js20Var, (byte) 25));
            } else {
                byte b = 1;
                if (!Intrinsics.d(l, ((z2s) k4sVar.D()).g)) {
                    k4sVar.H(new j7b(js20Var, b));
                    z2s z2sVar2 = (z2s) k4sVar.D();
                    u3z u3zVar2 = new u3z(z2sVar2.f43686a, z2sVar2.i, z2sVar2.e);
                    if (!z && !(js20Var instanceof hs20)) {
                        if (!(js20Var instanceof is20)) {
                            t9f.b();
                            return null;
                        }
                        lValueOf = Long.valueOf(((is20) js20Var).f15285a);
                    }
                    k4sVar.N(u3zVar2, lValueOf);
                } else if (xvm0Var.getId() != ((z2s) k4sVar.D()).f) {
                    if (l == null) {
                        k4sVar.H(new s7b(xvm0Var, b));
                        if (xvm0Var instanceof tvm0) {
                            c4m0 c4m0Var = k4sVar.X;
                            if (c4m0Var != null) {
                                c4m0Var.cancel(null);
                            }
                            k4sVar.N(u3z.a(u3zVar, ((tvm0) xvm0Var).f34607a), null);
                        } else if (xvm0Var instanceof svm0) {
                            k4sVar.O(j2, ((svm0) xvm0Var).b);
                            k4sVar.N(u3zVar, null);
                        } else {
                            c4m0 c4m0Var2 = k4sVar.X;
                            if (c4m0Var2 != null) {
                                c4m0Var2.cancel(null);
                            }
                            k4sVar.P(xvm0Var.getId(), xvm0Var.a(), j2, t3zVar == t3z.c, k4sVar.V.D0);
                        }
                    } else {
                        k4sVar.H(new s7b(xvm0Var, (byte) 2));
                    }
                }
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    private final Object m(Object obj) {
        Long l;
        final xvm0 xvm0Var = (xvm0) this.l;
        js20 js20Var = (js20) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        final g9s g9sVar = (g9s) this.k;
        r7s r7sVar = (r7s) g9sVar.D();
        long j = r7sVar.f29992a;
        long j2 = r7sVar.e;
        t3z t3zVar = r7sVar.h;
        u3z u3zVar = new u3z(j, t3zVar, j2);
        Long lValueOf = null;
        if (js20Var != null) {
            boolean z = js20Var instanceof gs20;
            if (z || (js20Var instanceof hs20)) {
                l = null;
            } else if (js20Var instanceof is20) {
                l = new Long(((is20) js20Var).f15285a);
            }
            if (((r7s) g9sVar.D()).P == null || ((r7s) g9sVar.D()).Q == null) {
                g9sVar.H(new cbr((Object) xvm0Var, (Object) js20Var, (Object) l, (Object) g9sVar, (byte) 2));
            } else if (!Intrinsics.d(l, ((r7s) g9sVar.D()).R)) {
                g9sVar.H(new gup((Object) js20Var, (Object) g9sVar, (byte) 28));
                r7s r7sVar2 = (r7s) g9sVar.D();
                u3z u3zVar2 = new u3z(r7sVar2.f29992a, r7sVar2.h, r7sVar2.e);
                if (!z && !(js20Var instanceof hs20)) {
                    if (!(js20Var instanceof is20)) {
                        t9f.b();
                        return null;
                    }
                    lValueOf = Long.valueOf(((is20) js20Var).f15285a);
                }
                g9sVar.O(u3zVar2, lValueOf);
            } else if (xvm0Var.getId() != ((r7s) g9sVar.D()).f) {
                final byte b = 1;
                if (l == null) {
                    final byte b2 = 0;
                    g9sVar.H(new Function2() { // from class: a.d8s
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            byte b3 = b2;
                            g9s g9sVar2 = g9sVar;
                            switch (b3) {
                                case 0:
                                    r7s r7sVar3 = (r7s) obj3;
                                    ((oyg0) obj2).getClass();
                                    r7sVar3.getClass();
                                    xvm0 xvm0Var2 = xvm0Var;
                                    r7s r7sVarA = r7s.a(r7sVar3, 0L, null, null, false, 0L, xvm0Var2.getId(), null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, false, xvm0Var2, null, null, null, null, null, null, null, null, false, -33, 1048063);
                                    g9sVar2.o.e("KEY_SUB_GAME_ID", Long.valueOf(r7sVarA.f));
                                    return r7sVarA;
                                default:
                                    xvm0 xvm0Var3 = xvm0Var;
                                    r7s r7sVarA2 = r7s.a((r7s) obj3, 0L, null, null, false, 0L, xvm0Var3.getId(), null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, false, xvm0Var3, null, null, null, null, null, null, null, null, false, -33, 1048063);
                                    g9sVar2.o.e("KEY_SUB_GAME_ID", Long.valueOf(r7sVarA2.f));
                                    return r7sVarA2;
                            }
                        }
                    });
                    if (xvm0Var instanceof tvm0) {
                        bby bbyVar = g9sVar.m0;
                        if (bbyVar != null) {
                            bbyVar.cancel(null);
                        }
                        g9sVar.O(u3zVar, null);
                    } else if (xvm0Var instanceof svm0) {
                        g9sVar.P(j2, ((svm0) xvm0Var).b);
                        g9sVar.O(u3zVar, null);
                    } else {
                        bby bbyVar2 = g9sVar.m0;
                        if (bbyVar2 != null) {
                            bbyVar2.cancel(null);
                        }
                        g9sVar.Q(xvm0Var.getId(), xvm0Var.a(), j2, t3zVar == t3z.c, g9sVar.M().D0);
                    }
                } else {
                    g9sVar.H(new Function2() { // from class: a.d8s
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            byte b3 = b;
                            g9s g9sVar2 = g9sVar;
                            switch (b3) {
                                case 0:
                                    r7s r7sVar3 = (r7s) obj3;
                                    ((oyg0) obj2).getClass();
                                    r7sVar3.getClass();
                                    xvm0 xvm0Var2 = xvm0Var;
                                    r7s r7sVarA = r7s.a(r7sVar3, 0L, null, null, false, 0L, xvm0Var2.getId(), null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, false, xvm0Var2, null, null, null, null, null, null, null, null, false, -33, 1048063);
                                    g9sVar2.o.e("KEY_SUB_GAME_ID", Long.valueOf(r7sVarA.f));
                                    return r7sVarA;
                                default:
                                    xvm0 xvm0Var3 = xvm0Var;
                                    r7s r7sVarA2 = r7s.a((r7s) obj3, 0L, null, null, false, 0L, xvm0Var3.getId(), null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, false, xvm0Var3, null, null, null, null, null, null, null, null, false, -33, 1048063);
                                    g9sVar2.o.e("KEY_SUB_GAME_ID", Long.valueOf(r7sVarA2.f));
                                    return r7sVarA2;
                            }
                        }
                    });
                }
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    private final Object o(Object obj) {
        Long l;
        final xvm0 xvm0Var = (xvm0) this.l;
        js20 js20Var = (js20) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        final yks yksVar = (yks) this.k;
        njs njsVar = (njs) yksVar.D();
        long j = njsVar.f23650a;
        long j2 = njsVar.e;
        t3z t3zVar = njsVar.h;
        u3z u3zVar = new u3z(j, t3zVar, j2);
        Long lValueOf = null;
        if (js20Var != null) {
            boolean z = js20Var instanceof gs20;
            if (z || (js20Var instanceof hs20)) {
                l = null;
            } else if (js20Var instanceof is20) {
                l = new Long(((is20) js20Var).f15285a);
            }
            if (((njs) yksVar.D()).M == null || ((njs) yksVar.D()).N == null) {
                yksVar.H(new cbr((Object) xvm0Var, (Object) js20Var, (Object) l, (Object) yksVar, (byte) 3));
            } else {
                final byte b = 1;
                if (!Intrinsics.d(l, ((njs) yksVar.D()).O)) {
                    yksVar.H(new sjs(js20Var, yksVar, b));
                    njs njsVar2 = (njs) yksVar.D();
                    u3z u3zVar2 = new u3z(njsVar2.f23650a, njsVar2.h, njsVar2.e);
                    if (!z && !(js20Var instanceof hs20)) {
                        if (!(js20Var instanceof is20)) {
                            t9f.b();
                            return null;
                        }
                        lValueOf = Long.valueOf(((is20) js20Var).f15285a);
                    }
                    yksVar.N(u3zVar2, lValueOf);
                } else if (xvm0Var.getId() != ((njs) yksVar.D()).f) {
                    if (l == null) {
                        final byte b2 = 0;
                        yksVar.H(new Function2() { // from class: a.ujs
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                byte b3 = b2;
                                yks yksVar2 = yksVar;
                                switch (b3) {
                                    case 0:
                                        njs njsVar3 = (njs) obj3;
                                        ((oyg0) obj2).getClass();
                                        njsVar3.getClass();
                                        xvm0 xvm0Var2 = xvm0Var;
                                        njs njsVarA = njs.a(njsVar3, 0L, null, null, false, 0L, xvm0Var2.getId(), null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, xvm0Var2, null, null, null, null, null, null, null, null, -33, 65471);
                                        yksVar2.o.e("KEY_SUB_GAME_ID", Long.valueOf(njsVarA.f));
                                        return njsVarA;
                                    default:
                                        xvm0 xvm0Var3 = xvm0Var;
                                        njs njsVarA2 = njs.a((njs) obj3, 0L, null, null, false, 0L, xvm0Var3.getId(), null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, xvm0Var3, null, null, null, null, null, null, null, null, -33, 65471);
                                        yksVar2.o.e("KEY_SUB_GAME_ID", Long.valueOf(njsVarA2.f));
                                        return njsVarA2;
                                }
                            }
                        });
                        if (xvm0Var instanceof tvm0) {
                            bby bbyVar = yksVar.l0;
                            if (bbyVar != null) {
                                bbyVar.cancel(null);
                            }
                            yksVar.N(u3zVar, null);
                        } else if (xvm0Var instanceof svm0) {
                            yksVar.O(j2, ((svm0) xvm0Var).b);
                            yksVar.N(u3zVar, null);
                        } else {
                            bby bbyVar2 = yksVar.l0;
                            if (bbyVar2 != null) {
                                bbyVar2.cancel(null);
                            }
                            yksVar.P(xvm0Var.getId(), xvm0Var.a(), j2, t3zVar == t3z.c, yksVar.M().D0);
                        }
                    } else {
                        yksVar.H(new Function2() { // from class: a.ujs
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                byte b3 = b;
                                yks yksVar2 = yksVar;
                                switch (b3) {
                                    case 0:
                                        njs njsVar3 = (njs) obj3;
                                        ((oyg0) obj2).getClass();
                                        njsVar3.getClass();
                                        xvm0 xvm0Var2 = xvm0Var;
                                        njs njsVarA = njs.a(njsVar3, 0L, null, null, false, 0L, xvm0Var2.getId(), null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, xvm0Var2, null, null, null, null, null, null, null, null, -33, 65471);
                                        yksVar2.o.e("KEY_SUB_GAME_ID", Long.valueOf(njsVarA.f));
                                        return njsVarA;
                                    default:
                                        xvm0 xvm0Var3 = xvm0Var;
                                        njs njsVarA2 = njs.a((njs) obj3, 0L, null, null, false, 0L, xvm0Var3.getId(), null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, xvm0Var3, null, null, null, null, null, null, null, null, -33, 65471);
                                        yksVar2.o.e("KEY_SUB_GAME_ID", Long.valueOf(njsVarA2.f));
                                        return njsVarA2;
                                }
                            }
                        });
                    }
                }
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    private final Object r(Object obj) {
        k9s k9sVar = (k9s) this.l;
        List list = (List) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        p7m0 p7m0Var = (p7m0) ((f3j) this.k).q;
        while (true) {
            Object value = p7m0Var.getValue();
            yus yusVar = (yus) value;
            String str = k9sVar.j;
            String str2 = k9sVar.F;
            long j = k9sVar.f17929a;
            String str3 = k9sVar.g;
            long j2 = k9sVar.b;
            boolean z = k9sVar.z;
            boolean z2 = k9sVar.W;
            boolean zS = k9sVar.s();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                List list2 = list;
                yus yusVar2 = yusVar;
                if (obj2 instanceof rvm0) {
                    arrayList.add(obj2);
                }
                yusVar = yusVar2;
                list = list2;
            }
            List list3 = list;
            yus yusVar3 = yusVar;
            boolean z3 = !arrayList.isEmpty();
            boolean z4 = k9sVar.v;
            long j3 = k9sVar.s;
            String str4 = k9sVar.A;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list3) {
                k9s k9sVar2 = k9sVar;
                boolean z5 = z4;
                if (obj3 instanceof uvm0) {
                    arrayList2.add(obj3);
                }
                z4 = z5;
                k9sVar = k9sVar2;
            }
            k9s k9sVar3 = k9sVar;
            if (p7m0Var.m(value, yus.a(yusVar3, j, str3, j2, z, j3, str4, str, str2, false, false, z2, zS, false, z3, z4, 0L, null, !arrayList2.isEmpty(), 206592))) {
                return Unit.f46060a;
            }
            list = list3;
            k9sVar = k9sVar3;
        }
    }

    private final Object s(Object obj) {
        List list;
        boolean z;
        Map map;
        Object next;
        List list2 = (List) this.l;
        List list3 = (List) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        d0t d0tVar = (d0t) CollectionsKt.U(list2);
        g45 g45Var = (g45) this.k;
        boolean zA = ((yyt) g45Var.c).f43483a.a();
        Map map2 = ((sln) ((pq) g45Var.f).f27394a.f8305a).c;
        Map map3 = ((sln) ((a8u) g45Var.g).f444a.f8305a).d;
        List listI = ((pq) g45Var.h).f27394a.i();
        d0tVar.getClass();
        map2.getClass();
        list3.getClass();
        listI.getClass();
        long j = d0tVar.f5282a;
        List list4 = d0tVar.K;
        ArrayList arrayListN0 = CollectionsKt.N0(list4);
        ArrayList arrayList = new ArrayList();
        ArrayList<vt20> arrayList2 = new ArrayList();
        for (Object obj2 : list3) {
            if (((vt20) obj2).c != 0) {
                arrayList2.add(obj2);
            }
        }
        for (vt20 vt20Var : arrayList2) {
            Iterator it = list4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    list = list4;
                    z = zA;
                    map = map2;
                    next = null;
                    break;
                }
                next = it.next();
                list = list4;
                z = zA;
                map = map2;
                if (((BetGroupZip) next).b == vt20Var.f37982a) {
                    break;
                }
                zA = z;
                list4 = list;
                map2 = map;
            }
            BetGroupZip betGroupZip = (BetGroupZip) next;
            if (betGroupZip != null) {
                arrayListN0.remove(betGroupZip);
                zA = z;
                map2 = map;
                arrayList.add(u1c.T(betGroupZip, zA, map2, map3, list3, listI));
            } else {
                zA = z;
                map2 = map;
            }
            list4 = list;
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayListN0, 10));
        Iterator it2 = arrayListN0.iterator();
        while (it2.hasNext()) {
            arrayList3.add(u1c.T((BetGroupZip) it2.next(), zA, map2, map3, list3, listI));
        }
        arrayList.addAll(arrayList3);
        return new ion(j, arrayList, d0tVar.v, d0tVar.o, d0tVar.s, qzb.c0(d0tVar), qzb.r0(d0tVar), d0tVar.i, qzb.D0(d0tVar));
    }

    private final Object t(Object obj) {
        Object objP0;
        Object obj2 = this.l;
        Object obj3 = this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        ypl0 ypl0Var = (ypl0) this.k;
        e0g0 e0g0Var = j0g0.b;
        List list = (List) (obj2 instanceof g0g0 ? null : obj2);
        if (list == null) {
            list = iun.f15405a;
        }
        List list2 = (List) (obj3 instanceof g0g0 ? null : obj3);
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        list.getClass();
        list2.getClass();
        vbb vbbVarK = sac.K(sac.j0(list));
        if (vbbVarK == null) {
            vbbVarK = sac.K(sac.j0(list2));
        }
        if (vbbVarK != null) {
            objP0 = sac.p0(vbbVarK, ikw.f14949a);
        } else {
            vbb vbbVarK2 = sac.K(sac.J(list));
            if (vbbVarK2 == null) {
                vbbVarK2 = sac.K(sac.J(list2));
            }
            objP0 = vbbVarK2 != null ? sac.p0(vbbVarK2, ikw.b) : new g0g0(new ff5(null));
        }
        return new viw(obj2, obj3, ypl0Var, new j0g0(objP0));
    }

    private final Object x(Object obj) {
        List list = (List) this.l;
        List<zlb> list2 = (List) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        for (zlb zlbVar : list2) {
            List<rbb> list3 = zlbVar.c;
            ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
            for (rbb rbbVar : list3) {
                boolean zContains = list.contains(Long.valueOf(rbbVar.f30176a));
                List<sum0> list4 = rbbVar.d;
                ArrayList arrayList3 = new ArrayList(r3d.q(list4, 10));
                for (sum0 sum0Var : list4) {
                    arrayList3.add(sum0.a(sum0Var, list.contains(Long.valueOf(sum0Var.f32829a)), null, 31743));
                }
                arrayList2.add(rbb.a(rbbVar, arrayList3, zContains, null, 129015));
            }
            arrayList.add(zlb.a(zlbVar, arrayList2));
        }
        return arrayList;
    }

    private final Object y(Object obj) {
        List list = (List) this.l;
        knb knbVar = (knb) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        List<rbb> list2 = knbVar.f18576a;
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        for (rbb rbbVar : list2) {
            boolean zContains = list.contains(Long.valueOf(rbbVar.f30176a));
            List<sum0> list3 = rbbVar.d;
            ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
            for (sum0 sum0Var : list3) {
                arrayList2.add(sum0.a(sum0Var, list.contains(Long.valueOf(sum0Var.f32829a)), null, 31743));
            }
            arrayList.add(rbb.a(rbbVar, arrayList2, zContains, null, 129015));
        }
        return knb.a(knbVar, arrayList);
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.k;
        switch (b) {
            case 0:
                wx4 wx4Var = new wx4(obj4, (yje) obj3, (byte) 0);
                wx4Var.l = (org.xplatform.make_bet.impl.presentation.model.CoefStepInputUiModel) obj;
                wx4Var.j = (org.xplatform.make_bet.impl.presentation.model.StepInputUiModel) obj2;
                return wx4Var.invokeSuspend(Unit.f46060a);
            case 1:
                wx4 wx4Var2 = new wx4(obj4, (yje) obj3, (byte) 1);
                wx4Var2.j = (org.xplatform.make_bet.impl.presentation.model.StepInputUiModel) obj;
                wx4Var2.l = (qm5) obj2;
                return wx4Var2.invokeSuspend(Unit.f46060a);
            case 2:
                wx4 wx4Var3 = new wx4(obj4, (yje) obj3, (byte) 2);
                wx4Var3.l = (List) obj;
                wx4Var3.j = (Set) obj2;
                return wx4Var3.invokeSuspend(Unit.f46060a);
            case 3:
                wx4 wx4Var4 = new wx4(obj4, (yje) obj3, (byte) 3);
                wx4Var4.l = (o4g) obj;
                wx4Var4.j = (c5g) obj2;
                return wx4Var4.invokeSuspend(Unit.f46060a);
            case 4:
                wx4 wx4Var5 = new wx4(obj4, (yje) obj3, (byte) 4);
                wx4Var5.l = (l0j) obj;
                wx4Var5.j = (sw00) obj2;
                return wx4Var5.invokeSuspend(Unit.f46060a);
            case 5:
                return new wx4((DsButton) this.l, (DsLottieEmpty) this.j, (Function0) obj4, (yje) obj3).invokeSuspend(Unit.f46060a);
            case 6:
                wx4 wx4Var6 = new wx4(obj4, (yje) obj3, (byte) 6);
                wx4Var6.l = (List) obj;
                wx4Var6.j = (String) obj2;
                return wx4Var6.invokeSuspend(Unit.f46060a);
            case 7:
                wx4 wx4Var7 = new wx4(obj4, (yje) obj3, (byte) 7);
                wx4Var7.l = (y3h) obj;
                wx4Var7.j = (ljg) obj2;
                return wx4Var7.invokeSuspend(Unit.f46060a);
            case 8:
                wx4 wx4Var8 = new wx4(obj4, (yje) obj3, (byte) 8);
                wx4Var8.l = (ljg) obj;
                wx4Var8.j = (qrh) obj2;
                return wx4Var8.invokeSuspend(Unit.f46060a);
            case 9:
                wx4 wx4Var9 = new wx4(obj4, (yje) obj3, (byte) 9);
                wx4Var9.l = (xvm0) obj;
                wx4Var9.j = (js20) obj2;
                return wx4Var9.invokeSuspend(Unit.f46060a);
            case 10:
                wx4 wx4Var10 = new wx4(obj4, (yje) obj3, (byte) 10);
                wx4Var10.l = (xvm0) obj;
                wx4Var10.j = (js20) obj2;
                return wx4Var10.invokeSuspend(Unit.f46060a);
            case 11:
                wx4 wx4Var11 = new wx4(obj4, (yje) obj3, (byte) 11);
                wx4Var11.l = (List) obj;
                wx4Var11.j = (String) obj2;
                return wx4Var11.invokeSuspend(Unit.f46060a);
            case 12:
                wx4 wx4Var12 = new wx4(obj4, (yje) obj3, (byte) 12);
                wx4Var12.l = (xvm0) obj;
                wx4Var12.j = (js20) obj2;
                return wx4Var12.invokeSuspend(Unit.f46060a);
            case 13:
                wx4 wx4Var13 = new wx4(obj4, (yje) obj3, (byte) 13);
                wx4Var13.l = (k9s) obj;
                wx4Var13.j = (List) obj2;
                return wx4Var13.invokeSuspend(Unit.f46060a);
            case 14:
                wx4 wx4Var14 = new wx4(obj4, (yje) obj3, (byte) 14);
                wx4Var14.l = (eh6) obj;
                wx4Var14.j = (u5s) obj2;
                return wx4Var14.invokeSuspend(Unit.f46060a);
            case 15:
                wx4 wx4Var15 = new wx4(obj4, (yje) obj3, (byte) 15);
                wx4Var15.l = (List) obj;
                wx4Var15.j = (List) obj2;
                return wx4Var15.invokeSuspend(Unit.f46060a);
            case 16:
                Object obj5 = ((j0g0) obj).f15681a;
                Object obj6 = ((j0g0) obj2).f15681a;
                wx4 wx4Var16 = new wx4(obj4, (yje) obj3, (byte) 16);
                wx4Var16.l = obj5;
                wx4Var16.j = obj6;
                return wx4Var16.invokeSuspend(Unit.f46060a);
            case 17:
                wx4 wx4Var17 = new wx4(obj4, (yje) obj3, (byte) 17);
                wx4Var17.l = (List) obj;
                wx4Var17.j = (List) obj2;
                return wx4Var17.invokeSuspend(Unit.f46060a);
            case 18:
                wx4 wx4Var18 = new wx4(obj4, (yje) obj3, (byte) 18);
                wx4Var18.l = (List) obj;
                wx4Var18.j = (List) obj2;
                return wx4Var18.invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wx4 wx4Var19 = new wx4(obj4, (yje) obj3, (byte) 19);
                wx4Var19.l = (List) obj;
                wx4Var19.j = (knb) obj2;
                return wx4Var19.invokeSuspend(Unit.f46060a);
            case 20:
                wx4 wx4Var20 = new wx4(obj4, (yje) obj3, (byte) 20);
                wx4Var20.l = (CoefStepInputUiModel) obj;
                wx4Var20.j = (StepInputUiModel) obj2;
                return wx4Var20.invokeSuspend(Unit.f46060a);
            case 21:
                wx4 wx4Var21 = new wx4(obj4, (yje) obj3, (byte) 21);
                wx4Var21.l = (StepInputUiModel) obj;
                wx4Var21.j = (ql5) obj2;
                return wx4Var21.invokeSuspend(Unit.f46060a);
            case 22:
                wx4 wx4Var22 = new wx4(obj4, (yje) obj3, (byte) 22);
                wx4Var22.l = (StepInputUiModel) obj;
                wx4Var22.j = (ql5) obj2;
                return wx4Var22.invokeSuspend(Unit.f46060a);
            case 23:
                wx4 wx4Var23 = new wx4(obj4, (yje) obj3, (byte) 23);
                wx4Var23.l = (StepInputConfigModel) obj;
                wx4Var23.j = (ql5) obj2;
                return wx4Var23.invokeSuspend(Unit.f46060a);
            case 24:
                wx4 wx4Var24 = new wx4(obj4, (yje) obj3, (byte) 24);
                wx4Var24.l = (List) obj;
                wx4Var24.j = (List) obj2;
                return wx4Var24.invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wx4 wx4Var25 = new wx4((bs60) this.j, (String) obj4, (yje) obj3);
                wx4Var25.l = (Throwable) obj2;
                return wx4Var25.invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wx4 wx4Var26 = new wx4(obj4, (yje) obj3, (byte) 26);
                wx4Var26.l = (rjt) obj;
                wx4Var26.j = (rjt) obj2;
                return wx4Var26.invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wx4 wx4Var27 = new wx4(obj4, (yje) obj3, (byte) 27);
                wx4Var27.l = (wj80) obj;
                wx4Var27.j = (List) obj2;
                return wx4Var27.invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wx4 wx4Var28 = new wx4(obj4, (yje) obj3, (byte) 28);
                wx4Var28.l = (List) obj;
                wx4Var28.j = (String) obj2;
                return wx4Var28.invokeSuspend(Unit.f46060a);
            default:
                wx4 wx4Var29 = new wx4(obj4, (yje) obj3, (byte) 29);
                wx4Var29.l = (List) obj;
                wx4Var29.j = (List) obj2;
                return wx4Var29.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:233:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:234:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:457:0x0c1e  */
    /* JADX WARN: Code duplicated, block: B:460:0x0c3e  */
    /* JADX WARN: Code duplicated, block: B:463:0x0c4e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v158 */
    /* JADX WARN: Type inference failed for: r1v94, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v95, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v99 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        double d;
        String strC;
        ank0 ank0VarS;
        List list;
        int iIndexOf;
        List list2;
        boolean zContains;
        sq00 sq00Var;
        Object obj2;
        Set set;
        List list3;
        String str;
        Throwable th;
        yxb yxbVar;
        Iterator it;
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        p6t0 rde0Var;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        long j;
        String str3;
        String strA;
        rlf0 qlf0Var;
        String str4;
        rlf0 nlf0Var;
        boolean z8;
        p310 p310Var;
        d0u0 d0u0Var;
        Object value;
        byte b = this.i;
        String str5 = "";
        boolean z9 = false;
        boolean z10 = true;
        Throwable th2 = null;
        Object obj3 = this.k;
        switch (b) {
            case 0:
                org.xplatform.make_bet.impl.presentation.model.CoefStepInputUiModel coefStepInputUiModel = (org.xplatform.make_bet.impl.presentation.model.CoefStepInputUiModel) this.l;
                org.xplatform.make_bet.impl.presentation.model.StepInputUiModel stepInputUiModel = (org.xplatform.make_bet.impl.presentation.model.StepInputUiModel) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                coefStepInputUiModel.getClass();
                stepInputUiModel.getClass();
                double d2 = stepInputUiModel.e;
                double d3 = stepInputUiModel.d;
                double d4 = stepInputUiModel.f46773a;
                boolean z11 = stepInputUiModel.g;
                boolean z12 = stepInputUiModel.p;
                ctf0 ctf0Var = ((fy4) obj3).l;
                ctf0Var.getClass();
                BigDecimal bigDecimal = coefStepInputUiModel.f46771a;
                String plainString = bigDecimal.toPlainString();
                plainString.getClass();
                BigDecimal bigDecimal2 = coefStepInputUiModel.d;
                BigDecimal bigDecimal3 = coefStepInputUiModel.e;
                ArrayList arrayList = new ArrayList();
                bnk0 bnk0Var = new bnk0();
                if (coefStepInputUiModel.h) {
                    d = d2;
                    pzw.E(bnk0Var, ctf0Var.f(R.string.min_coef_v2, bigDecimal2), 0, R.color.static_red, 0, 0, 54);
                } else {
                    d = d2;
                    if (coefStepInputUiModel.g) {
                        pn40 pn40Var = pn40.f27267a;
                        pzw.E(bnk0Var, ctf0Var.f(R.string.max_coef_v2, pn40.g(bigDecimal3)), 0, R.color.static_red, 0, 0, 54);
                    }
                }
                ank0 ank0VarL = w6x.l(arrayList, bnk0Var.f2888a, arrayList);
                boolean z13 = bigDecimal.compareTo(bigDecimal3) < 0 && !z12;
                boolean z14 = bigDecimal.compareTo(bigDecimal2) > 0 && !z12;
                boolean z15 = (bigDecimal.compareTo(bigDecimal2) >= 0 && bigDecimal.compareTo(bigDecimal3) <= 0) && ((((d3 > d4 ? 1 : (d3 == d4 ? 0 : -1)) <= 0 && (d4 > d ? 1 : (d4 == d ? 0 : -1)) <= 0) || (z11 && (d4 > d3 ? 1 : (d4 == d3 ? 0 : -1)) >= 0)) && (d4 > (-1.0d) ? 1 : (d4 == (-1.0d) ? 0 : -1)) != 0);
                if (d4 == -1.0d) {
                    strC = "";
                } else {
                    pn40 pn40Var2 = pn40.f27267a;
                    strC = pn40.c(d4, p3u0.g);
                }
                double d5 = d;
                double d6 = stepInputUiModel.d;
                double d7 = stepInputUiModel.e;
                String str6 = stepInputUiModel.f;
                boolean z16 = stepInputUiModel.g;
                if ((d6 <= d4 && d4 <= d7) || d4 == -1.0d) {
                    ank0VarS = h8x.r(z16, d6, str6, d7);
                } else if (d4 < d6) {
                    ank0VarS = h8x.u(ctf0Var, d6, str6);
                } else {
                    ank0VarS = d4 > d7 ? h8x.s(ctf0Var, d7, str6) : new ank0(iun.f15405a);
                }
                ank0 ank0Var = ank0VarS;
                boolean z17 = stepInputUiModel.l;
                boolean z18 = coefStepInputUiModel.f;
                pn40 pn40Var3 = pn40.f27267a;
                String strF = ctf0Var.f(R.string.bet_enter_coefficient_v2, pn40.c(bigDecimal2.doubleValue(), p3u0.c));
                org.xplatform.make_bet.impl.presentation.model.AutoMaxUiModel autoMaxUiModel = stepInputUiModel.i;
                return new x05(plainString, ank0VarL, z13, z14, z15, strC, ank0Var, z18, z17, strF, org.xplatform.make_bet.impl.presentation.model.AutoMaxUiModel.a(autoMaxUiModel, autoMaxUiModel.f46769a && !z11, 0.0d, 2), ((bigDecimal.compareTo(bigDecimal2) >= 0 && bigDecimal.compareTo(bigDecimal3) <= 0) || (bigDecimal.compareTo(new BigDecimal(String.valueOf(-1.0d))) == 0)) ? false : true, !((d3 <= d4 && d4 <= d5) || d4 == -1.0d), coefStepInputUiModel.g, stepInputUiModel.p);
            case 1:
                org.xplatform.make_bet.impl.presentation.model.StepInputUiModel stepInputUiModel2 = (org.xplatform.make_bet.impl.presentation.model.StepInputUiModel) this.j;
                qm5 qm5Var = (qm5) this.l;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (qm5Var instanceof mm5) {
                    p7m0 p7m0Var = ((fy4) obj3).i0;
                    double d8 = stepInputUiModel2.f46773a;
                    double d9 = ((mm5) qm5Var).c.b;
                    Object obj4 = (d8 > d9 || d9 == 0.0d) ? vg5.f37365a : zg5.f44327a;
                    p7m0Var.getClass();
                    p7m0Var.o(null, obj4);
                }
                return Unit.f46060a;
            case 2:
                List list4 = (List) this.l;
                Set set2 = (Set) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                yxb yxbVar2 = (yxb) obj3;
                HashMap map = yxbVar2.q;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list4.iterator();
                boolean z19 = false;
                while (it2.hasNext()) {
                    a640 a640Var = (a640) it2.next();
                    if (!Intrinsics.d(yxbVar2.p, pm50.c) && !z19 && yxbVar2.p.b < a640Var.b()) {
                        arrayList2.add(yxbVar2.p);
                        z19 = z10;
                    }
                    p6t0 sft0Var = (p6t0) map.get(a640Var);
                    if (Intrinsics.d(sft0Var, a640Var)) {
                        set = set2;
                        list3 = list4;
                        str = str5;
                        th = th2;
                        yxbVar = yxbVar2;
                        it = it2;
                        z = z19;
                        z2 = z9;
                    } else {
                        nhf0 nhf0Var = yxbVar2.j;
                        ctf0 ctf0Var2 = yxbVar2.l;
                        ywu ywuVar = yxbVar2.m;
                        a640Var.getClass();
                        ctf0Var2.getClass();
                        th = th2;
                        if (a640Var instanceof x540) {
                            x540 x540Var = (x540) a640Var;
                            x640 x640Var = x540Var.k;
                            boolean z20 = z10;
                            xrt0 xrt0Var = x540Var.f;
                            List list5 = x540Var.h;
                            String str7 = x540Var.g;
                            str = str5;
                            boolean z21 = xrt0Var instanceof srt0;
                            int i = x540Var.c;
                            if (z21) {
                                list3 = list4;
                                yxbVar = yxbVar2;
                                it = it2;
                                z = z19;
                                sft0Var = new lfi0(i, x540Var.d, j0x.r(str7, ctf0Var2, list5, ywuVar), x640Var, x540Var.l, j0x.K(x640Var), j0x.z(x640Var));
                                z2 = false;
                                set = set2;
                            } else {
                                ilf0 ilf0Var = x540Var.e;
                                it = it2;
                                Object obj5 = ilf0Var != null ? ilf0Var.e : th;
                                if (obj5 == null) {
                                    set = set2;
                                    list3 = list4;
                                    z = z19;
                                } else {
                                    z = z19;
                                    if (obj5 instanceof jlf0) {
                                        int i2 = ilf0Var.f14976a;
                                        set = set2;
                                        String strB = j0x.B(ilf0Var.c, ctf0Var2);
                                        jlf0 jlf0Var = (jlf0) obj5;
                                        list3 = list4;
                                        ?? r1 = jlf0Var.f16714a;
                                        if (r1.length() == 0) {
                                            o540 o540Var = (o540) CollectionsKt.firstOrNull(jlf0Var.b);
                                            r1 = o540Var != null ? o540Var.f24670a : th;
                                            if (r1 == 0) {
                                                r1 = str;
                                            }
                                        }
                                        nlf0Var = new nlf0(i2, strB, r1, ilf0Var.d);
                                        qlf0Var = nlf0Var;
                                    } else {
                                        set = set2;
                                        list3 = list4;
                                        if (obj5 instanceof klf0) {
                                            int i3 = ilf0Var.f14976a;
                                            klf0 klf0Var = (klf0) obj5;
                                            ArrayList arrayList3 = klf0Var.b;
                                            q540 q540Var = (q540) CollectionsKt.firstOrNull(arrayList3);
                                            String str8 = (q540Var == null || (str4 = q540Var.f28132a) == null) ? str : str4;
                                            q540 q540Var2 = (q540) CollectionsKt.firstOrNull(arrayList3);
                                            String strJ0 = q540Var2 != null ? ibc.j0(q540Var2.b) : str;
                                            String strB2 = j0x.B(ilf0Var.c, ctf0Var2);
                                            String strA2 = klf0Var.f18484a;
                                            if (strA2.length() == 0) {
                                                strA2 = ctf0Var2.b.a(R.string.tab_image, Arrays.copyOf(new Object[0], 0));
                                            }
                                            qlf0Var = new olf0(i3, str8, strJ0, strB2, strA2, ilf0Var.d);
                                        } else if (obj5 instanceof llf0) {
                                            qlf0Var = new qlf0(ilf0Var.f14976a, j0x.B(ilf0Var.c, ctf0Var2), ((llf0) obj5).f20245a, ilf0Var.d);
                                        }
                                    }
                                    if (str7.length() > 0) {
                                        z8 = z20;
                                    } else {
                                        z8 = false;
                                    }
                                    SpannableString spannableStringR = j0x.r(str7, ctf0Var2, list5, ywuVar);
                                    Date date = x540Var.l;
                                    List list6 = x540Var.i;
                                    List list7 = x540Var.j;
                                    rde0Var = new ude0(i, qlf0Var, z8, spannableStringR, x540Var.k, date, xrt0Var instanceof vrt0, !list7.isEmpty(), list6, list7, btm0.w(xrt0Var, nhf0Var, ctf0Var2));
                                    yxbVar = yxbVar2;
                                    sft0Var = rde0Var;
                                    z2 = false;
                                }
                                nlf0Var = plf0.f27180a;
                                qlf0Var = nlf0Var;
                                if (str7.length() > 0) {
                                    z8 = z20;
                                } else {
                                    z8 = false;
                                }
                                SpannableString spannableStringR2 = j0x.r(str7, ctf0Var2, list5, ywuVar);
                                Date date2 = x540Var.l;
                                List list8 = x540Var.i;
                                List list9 = x540Var.j;
                                rde0Var = new ude0(i, qlf0Var, z8, spannableStringR2, x540Var.k, date2, xrt0Var instanceof vrt0, !list9.isEmpty(), list8, list9, btm0.w(xrt0Var, nhf0Var, ctf0Var2));
                                yxbVar = yxbVar2;
                                sft0Var = rde0Var;
                                z2 = false;
                            }
                        } else {
                            set = set2;
                            list3 = list4;
                            str = str5;
                            boolean z22 = z10;
                            it = it2;
                            z = z19;
                            if (a640Var instanceof w540) {
                                w540 w540Var = (w540) a640Var;
                                int i4 = w540Var.c;
                                s540 s540Var = w540Var.d;
                                int iOrdinal = s540Var.b.ordinal();
                                if (iOrdinal == 0) {
                                    strA = ctf0Var2.b.a(R.string.support_chat_system_message_invocked_operator, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    if (iOrdinal != z22) {
                                        if (iOrdinal == 2) {
                                            int iOrdinal2 = s540Var.c.ordinal();
                                            if (iOrdinal2 == 0) {
                                                strA = ctf0Var2.b.a(R.string.support_chat_system_message_invocked_operator_low_time, Arrays.copyOf(new Object[0], 0));
                                            } else if (iOrdinal2 == z22) {
                                                strA = ctf0Var2.b.a(R.string.support_chat_system_message_invocked_operator_medium_time, Arrays.copyOf(new Object[0], 0));
                                            } else if (iOrdinal2 == 2) {
                                                strA = ctf0Var2.b.a(R.string.support_chat_system_msg_invocked_operator_long_time, Arrays.copyOf(new Object[0], 0));
                                            } else {
                                                t9f.b();
                                            }
                                        } else {
                                            t9f.b();
                                        }
                                        return th;
                                    }
                                    int iOrdinal3 = s540Var.f31639a.ordinal();
                                    strA = iOrdinal3 != 3 ? iOrdinal3 != 4 ? ctf0Var2.b.a(R.string.support_chat_system_message_invocked_operator_failed_no_online, Arrays.copyOf(new Object[0], 0)) : ctf0Var2.b.a(R.string.support_chat_system_message_invocked_operator_failed_no_online, Arrays.copyOf(new Object[0], 0)) : ctf0Var2.b.a(R.string.support_chat_system_message_invocked_operator_failed_timeout, Arrays.copyOf(new Object[0], 0));
                                }
                                sft0Var = new z9o0(i4, strA, w540Var.f, w540Var.g);
                                yxbVar = yxbVar2;
                                z2 = false;
                            } else {
                                if (a640Var instanceof p540) {
                                    p540 p540Var = (p540) a640Var;
                                    xrt0 xrt0Var2 = p540Var.f;
                                    x640 x640Var2 = p540Var.g;
                                    List list10 = p540Var.j;
                                    String str9 = p540Var.i;
                                    List list11 = p540Var.k;
                                    ArrayList arrayList4 = new ArrayList(r3d.q(list11, 10));
                                    Iterator it3 = list11.iterator();
                                    while (it3.hasNext()) {
                                        o540 o540Var2 = (o540) it3.next();
                                        Iterator it4 = it3;
                                        String str10 = o540Var2.f24670a;
                                        yos0 yos0Var = o540Var2.d;
                                        x640 x640Var3 = x640Var2;
                                        String upperCase = mbc.Y(str10).toUpperCase(Locale.ROOT);
                                        upperCase.getClass();
                                        qos0 qos0VarA = yos0Var.a();
                                        String str11 = o540Var2.f24670a;
                                        List list12 = list11;
                                        yxb yxbVar3 = yxbVar2;
                                        long j2 = o540Var2.b;
                                        String str12 = o540Var2.c;
                                        float f = j2;
                                        if (f >= 1048576.0f) {
                                            j = j2;
                                            String strF2 = ctf0Var2.f(R.string.support_chat_file_size_mbytes, new Object[0]);
                                            DecimalFormat decimalFormat = new DecimalFormat("#.#");
                                            decimalFormat.setRoundingMode(RoundingMode.HALF_EVEN);
                                            String str13 = decimalFormat.format(Float.valueOf(f / 1048576.0f));
                                            str13.getClass();
                                            str3 = String.format(strF2, Arrays.copyOf(new Object[]{str13, upperCase}, 2));
                                        } else {
                                            j = j2;
                                            if (f >= 1024.0f) {
                                                String strF3 = ctf0Var2.f(R.string.support_chat_file_size_kbytes, new Object[0]);
                                                DecimalFormat decimalFormat2 = new DecimalFormat("#.#");
                                                decimalFormat2.setRoundingMode(RoundingMode.HALF_EVEN);
                                                String str14 = decimalFormat2.format(Float.valueOf(f / 1024.0f));
                                                str14.getClass();
                                                str3 = String.format(strF3, Arrays.copyOf(new Object[]{str14, upperCase}, 2));
                                            } else {
                                                str3 = String.format(ctf0Var2.f(R.string.support_chat_file_size_bytes, new Object[0]), Arrays.copyOf(new Object[]{Long.valueOf(j), upperCase}, 2));
                                            }
                                        }
                                        arrayList4.add(new jzp(qos0VarA, str11, j, str12, yos0Var, str3));
                                        it3 = it4;
                                        x640Var2 = x640Var3;
                                        yxbVar2 = yxbVar3;
                                        list11 = list12;
                                    }
                                    x640 x640Var4 = x640Var2;
                                    List list13 = list11;
                                    yxbVar = yxbVar2;
                                    boolean z23 = xrt0Var2 instanceof srt0;
                                    int i5 = p540Var.c;
                                    if (z23) {
                                        String str15 = p540Var.e;
                                        SpannableString spannableStringR3 = j0x.r(str9, ctf0Var2, list10, ywuVar);
                                        int iK = j0x.K(x640Var4);
                                        Date date3 = p540Var.h;
                                        if (j0x.z(x640Var4)) {
                                            z7 = true;
                                        } else {
                                            if (!list13.isEmpty()) {
                                                Iterator it5 = list13.iterator();
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                        if (btm0.p(((o540) it5.next()).d)) {
                                                            z7 = true;
                                                        }
                                                    }
                                                }
                                            }
                                            z7 = false;
                                        }
                                        rde0Var = new rdi0(i5, str15, spannableStringR3, x640Var4, iK, date3, xrt0Var2, arrayList4, z7);
                                    } else {
                                        SpannableString spannableStringR4 = j0x.r(str9, ctf0Var2, list10, ywuVar);
                                        x640 x640Var5 = p540Var.g;
                                        Date date4 = p540Var.h;
                                        boolean z24 = xrt0Var2 instanceof vrt0;
                                        dtt0 dtt0VarW = btm0.w(xrt0Var2, nhf0Var, ctf0Var2);
                                        if (j0x.z(x640Var4)) {
                                            z6 = true;
                                        } else {
                                            if (!list13.isEmpty()) {
                                                Iterator it6 = list13.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        if (btm0.p(((o540) it6.next()).d)) {
                                                            z6 = true;
                                                        }
                                                    }
                                                }
                                            }
                                            z6 = false;
                                        }
                                        rde0Var = new pde0(i5, x640Var5, dtt0VarW, spannableStringR4, arrayList4, date4, z24, z6);
                                    }
                                } else {
                                    yxbVar = yxbVar2;
                                    if (a640Var instanceof r540) {
                                        r540 r540Var = (r540) a640Var;
                                        xrt0 xrt0Var3 = r540Var.f;
                                        String str16 = r540Var.i;
                                        List list14 = r540Var.j;
                                        List list15 = r540Var.k;
                                        x640 x640Var6 = r540Var.g;
                                        if (!(xrt0Var3 instanceof srt0)) {
                                            if (list15.size() == 1) {
                                                q540 q540Var3 = (q540) CollectionsKt.U(list15);
                                                int i6 = r540Var.c;
                                                SpannableString spannableStringR5 = j0x.r(str16, ctf0Var2, list14, ywuVar);
                                                x640 x640Var7 = r540Var.g;
                                                Date date5 = r540Var.h;
                                                yos0 yos0Var2 = q540Var3.b;
                                                yos0 yos0Var3 = q540Var3.b;
                                                rde0Var = new rde0(i6, spannableStringR5, x640Var7, date5, new g0x(yos0Var2.a(), q540Var3.d, q540Var3.c, q540Var3.f28132a, yos0Var3), xrt0Var3 instanceof vrt0, btm0.w(xrt0Var3, nhf0Var, ctf0Var2), j0x.z(x640Var6) || btm0.p(yos0Var3));
                                            } else {
                                                int i7 = r540Var.c;
                                                SpannableString spannableStringR6 = j0x.r(str16, ctf0Var2, list14, ywuVar);
                                                x640 x640Var8 = r540Var.g;
                                                Date date6 = r540Var.h;
                                                ArrayList arrayList5 = new ArrayList(r3d.q(list15, 10));
                                                Iterator it7 = list15.iterator();
                                                int i8 = 0;
                                                while (it7.hasNext()) {
                                                    Object next = it7.next();
                                                    int i9 = i8 + 1;
                                                    if (i8 < 0) {
                                                        q3d.p();
                                                        throw th;
                                                    }
                                                    q540 q540Var4 = (q540) next;
                                                    Date date7 = date6;
                                                    Iterator it8 = it7;
                                                    SpannableString spannableString = spannableStringR6;
                                                    x640 x640Var9 = x640Var8;
                                                    arrayList5.add(new k1d(new g0x(q540Var4.b.a(), q540Var4.d, q540Var4.c, q540Var4.f28132a, q540Var4.b), x640Var6, (i8 == 0 && list15.size() % 2 == 1) ? j1d.RECTANGLE : j1d.SQUARE));
                                                    i8 = i9;
                                                    date6 = date7;
                                                    it7 = it8;
                                                    spannableStringR6 = spannableString;
                                                    x640Var8 = x640Var9;
                                                }
                                                Date date8 = date6;
                                                SpannableString spannableString2 = spannableStringR6;
                                                x640 x640Var10 = x640Var8;
                                                boolean z25 = xrt0Var3 instanceof vrt0;
                                                dtt0 dtt0VarW2 = btm0.w(xrt0Var3, nhf0Var, ctf0Var2);
                                                if (j0x.z(x640Var6)) {
                                                    z3 = true;
                                                } else {
                                                    if (!list15.isEmpty()) {
                                                        Iterator it9 = list15.iterator();
                                                        while (true) {
                                                            if (it9.hasNext()) {
                                                                if (btm0.p(((q540) it9.next()).b)) {
                                                                    z3 = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z3 = false;
                                                }
                                                sft0Var = new sde0(i7, x640Var10, dtt0VarW2, spannableString2, arrayList5, date8, z25, z3);
                                            }
                                            z2 = false;
                                        } else if (list15.size() == 1) {
                                            q540 q540Var5 = (q540) CollectionsKt.U(list15);
                                            int i10 = r540Var.c;
                                            String str17 = r540Var.e;
                                            SpannableString spannableStringR7 = j0x.r(str16, ctf0Var2, list14, ywuVar);
                                            int iK2 = j0x.K(x640Var6);
                                            Date date9 = r540Var.h;
                                            g0x g0xVar = new g0x(q540Var5.b.a(), q540Var5.d, q540Var5.c, q540Var5.f28132a, q540Var5.b);
                                            if (j0x.z(x640Var6)) {
                                                z5 = true;
                                            } else {
                                                if (!list15.isEmpty()) {
                                                    Iterator it10 = list15.iterator();
                                                    while (true) {
                                                        if (it10.hasNext()) {
                                                            if (btm0.p(((q540) it10.next()).b)) {
                                                                z5 = true;
                                                            }
                                                        }
                                                    }
                                                }
                                                z5 = false;
                                            }
                                            rde0Var = new xdi0(i10, str17, spannableStringR7, x640Var6, iK2, date9, g0xVar, z5);
                                        } else {
                                            int i11 = r540Var.c;
                                            String str18 = r540Var.e;
                                            SpannableString spannableStringR8 = j0x.r(str16, ctf0Var2, list14, ywuVar);
                                            int iK3 = j0x.K(x640Var6);
                                            Date date10 = r540Var.h;
                                            ArrayList arrayList6 = new ArrayList(r3d.q(list15, 10));
                                            Iterator it11 = list15.iterator();
                                            int i12 = 0;
                                            while (it11.hasNext()) {
                                                Object next2 = it11.next();
                                                int i13 = i12 + 1;
                                                if (i12 < 0) {
                                                    q3d.p();
                                                    throw th;
                                                }
                                                q540 q540Var6 = (q540) next2;
                                                Date date11 = date10;
                                                Iterator it12 = it11;
                                                arrayList6.add(new k1d(new g0x(q540Var6.b.a(), q540Var6.d, q540Var6.c, q540Var6.f28132a, q540Var6.b), x640Var6, (i12 == 0 && list15.size() % 2 == 1) ? j1d.RECTANGLE : j1d.SQUARE));
                                                i12 = i13;
                                                date10 = date11;
                                                it11 = it12;
                                            }
                                            Date date12 = date10;
                                            if (j0x.z(x640Var6)) {
                                                z4 = true;
                                            } else {
                                                if (!list15.isEmpty()) {
                                                    Iterator it13 = list15.iterator();
                                                    while (true) {
                                                        if (it13.hasNext()) {
                                                            if (btm0.p(((q540) it13.next()).b)) {
                                                                z4 = true;
                                                            }
                                                        }
                                                    }
                                                }
                                                z4 = false;
                                            }
                                            rde0Var = new ydi0(i11, str18, spannableStringR8, x640Var6, iK3, date12, arrayList6, z4);
                                        }
                                    } else if (a640Var instanceof n540) {
                                        n540 n540Var = (n540) a640Var;
                                        int i14 = n540Var.c;
                                        m540 m540Var = n540Var.d;
                                        if (m540Var instanceof k540) {
                                            ArrayList arrayList7 = ((k540) m540Var).f17701a;
                                            ArrayList arrayList8 = new ArrayList();
                                            for (Object obj6 : arrayList7) {
                                                if (obj6 instanceof urt0) {
                                                    arrayList8.add(obj6);
                                                }
                                            }
                                            urt0 urt0Var = (urt0) CollectionsKt.firstOrNull(arrayList8);
                                            Object obj7 = urt0Var != null ? urt0Var.c : th;
                                            if (obj7 == null) {
                                                obj7 = str;
                                            }
                                            str2 = String.format(ctf0Var2.b.a(R.string.support_chat_event_operator_will_help_you, Arrays.copyOf(new Object[0], 0)), Arrays.copyOf(new Object[]{obj7}, 1));
                                            z2 = false;
                                        } else {
                                            if (!(m540Var instanceof l540)) {
                                                t9f.b();
                                                return th;
                                            }
                                            ArrayList arrayList9 = ((l540) m540Var).f19437a;
                                            ArrayList arrayList10 = new ArrayList();
                                            for (Object obj8 : arrayList9) {
                                                if (obj8 instanceof urt0) {
                                                    arrayList10.add(obj8);
                                                }
                                            }
                                            urt0 urt0Var2 = (urt0) CollectionsKt.firstOrNull(arrayList10);
                                            Object obj9 = urt0Var2 != null ? urt0Var2.c : th;
                                            if (obj9 == null) {
                                                obj9 = str;
                                            }
                                            z2 = false;
                                            str2 = String.format(ctf0Var2.b.a(R.string.support_chat_event_operator_escaped, Arrays.copyOf(new Object[0], 0)), Arrays.copyOf(new Object[]{obj9}, 1));
                                        }
                                        sft0Var = new z9o0(i14, str2, n540Var.f, n540Var.g);
                                    } else {
                                        z2 = false;
                                        if (!(a640Var instanceof y540)) {
                                            t9f.b();
                                            return th;
                                        }
                                        y540 y540Var = (y540) a640Var;
                                        sft0Var = new sft0(y540Var.c, y540Var.e, y540Var.f);
                                    }
                                }
                                sft0Var = rde0Var;
                                z2 = false;
                            }
                        }
                        map.put(a640Var, sft0Var);
                    }
                    arrayList2.add(sft0Var);
                    z19 = z;
                    z9 = z2;
                    th2 = th;
                    set2 = set;
                    list4 = list3;
                    yxbVar2 = yxbVar;
                    str5 = str;
                    z10 = true;
                    it2 = it;
                }
                Set set3 = set2;
                List list16 = list4;
                Throwable th3 = th2;
                if (Intrinsics.d(yxbVar2.p, pm50.c)) {
                    List list17 = list16;
                    ListIterator listIterator = list17.listIterator(list16.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            Object objPrevious = listIterator.previous();
                            a640 a640Var2 = (a640) objPrevious;
                            if ((a640Var2.e() instanceof srt0) || Intrinsics.d(a640Var2.d(), u640.f35121a)) {
                                obj2 = objPrevious;
                            }
                        } else {
                            obj2 = th3;
                        }
                    }
                    a640 a640Var3 = (a640) obj2;
                    list = list17;
                    if (a640Var3 != null) {
                        int iIndexOf2 = list17.indexOf(a640Var3);
                        int size = list17.size() - 1;
                        list = list17;
                        if (iIndexOf2 != size) {
                            iIndexOf = list17.indexOf(a640Var3) + 1;
                            pm50 pm50Var = new pm50(a640Var3.b(), new Date(a640Var3.a().getTime() + 1));
                            yxbVar2.p = pm50Var;
                            arrayList2.add(iIndexOf, pm50Var);
                            list2 = list17;
                        }
                    }
                    if (Intrinsics.d(yxbVar2.p, pm50.c)) {
                        yxbVar2.p = new pm50(Integer.MAX_VALUE, new Date(Long.MAX_VALUE));
                    }
                    zContains = set3.contains(ixb.f15534a);
                    sq00Var = sq00.f32609a;
                    if (zContains) {
                        arrayList2 = CollectionsKt.q0(kotlin.collections.a.c(sq00Var), arrayList2);
                    }
                    if (set3.contains(ixb.b)) {
                        arrayList2 = CollectionsKt.q0(arrayList2, kotlin.collections.a.c(sq00Var));
                    }
                    return new kxb(iIndexOf, arrayList2, list2);
                }
                list = list16;
                iIndexOf = -1;
                list2 = list;
                if (Intrinsics.d(yxbVar2.p, pm50.c)) {
                    yxbVar2.p = new pm50(Integer.MAX_VALUE, new Date(Long.MAX_VALUE));
                }
                zContains = set3.contains(ixb.f15534a);
                sq00Var = sq00.f32609a;
                if (zContains) {
                    arrayList2 = CollectionsKt.q0(kotlin.collections.a.c(sq00Var), arrayList2);
                }
                if (set3.contains(ixb.b)) {
                    arrayList2 = CollectionsKt.q0(arrayList2, kotlin.collections.a.c(sq00Var));
                }
                return new kxb(iIndexOf, arrayList2, list2);
            case 3:
                o4g o4gVar = (o4g) this.l;
                c5g c5gVar = (c5g) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                try {
                    k8g k8gVar = (k8g) obj3;
                    p7m0 p7m0Var2 = k8gVar.i;
                    Integer num = (Integer) k8gVar.b.a("selected_month_key");
                    ll9 ll9Var = new ll9(v3c.e0(c5gVar, o4gVar, num != null ? num.intValue() : -1));
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, ll9Var);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return Unit.f46060a;
            case 4:
                l0j l0jVar = (l0j) this.l;
                sw00 sw00Var = (sw00) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                hl1 hl1Var = ((sff0) ((f3j) obj3).o).b;
                d3j d3jVarU = ieb.U(hl1Var.z, hl1Var.A, sw00Var.f32897a, l0jVar.c, l0jVar.f19205a, l0jVar.b);
                return d3jVarU instanceof b3j ? j3j.f15836a : new i3j(d3jVarU);
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                ((DsButton) this.l).setEnabled(true);
                DsLottieEmpty dsLottieEmpty = (DsLottieEmpty) this.j;
                dsLottieEmpty.getCaptionView().animate().alpha(0.0f);
                dsLottieEmpty.getCaptionView().setVisibility(8);
                e3c.n(dsLottieEmpty.getCountDownTimerJob());
                ((Function0) obj3).invoke();
                return Unit.f46060a;
            case 6:
                List list18 = (List) this.l;
                String str19 = (String) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (str19.length() > 0) {
                    ArrayList arrayList11 = new ArrayList();
                    for (Object obj10 : list18) {
                        d0t d0tVar = (d0t) obj10;
                        int i15 = org.xplatform.favorites.impl.presentation.category.a.L;
                        if (str19.length() == 0 || StringsKt.O(d0tVar.o, str19, true) || StringsKt.O(d0tVar.b, str19, true) || StringsKt.O(qzb.c0(d0tVar), str19, true) || StringsKt.O(qzb.r0(d0tVar), str19, true)) {
                            arrayList11.add(obj10);
                        }
                    }
                    list18 = arrayList11;
                }
                if (!list18.isEmpty()) {
                    org.xplatform.favorites.impl.presentation.category.a aVar = (org.xplatform.favorites.impl.presentation.category.a) obj3;
                    i3t0.A(aVar, aVar.q, new did(list18), null, null, 6);
                }
                return list18;
            case 7:
                y3h y3hVar = (y3h) this.l;
                ljg ljgVar = (ljg) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                m9s m9sVar = (m9s) obj3;
                cqg cqgVar = m9sVar.I;
                p310 p310Var2 = cqgVar instanceof p310 ? (p310) cqgVar : null;
                y3hVar.getClass();
                ljgVar.getClass();
                ic6 ic6Var = new ic6(uc9.T(y3hVar.f41953a, y3hVar.c), uc9.T(y3hVar.e, y3hVar.g));
                if (p310Var2 == null) {
                    iun iunVar = iun.f15405a;
                    d310 d310Var = d310.UNKNOWN;
                    p310Var = new p310(new o310(0L, 0L, 0, 0, 0, new a610(0, -1, -1, -1, -1, iunVar, d310Var, -1.0f, iunVar), new a610(0, -1, -1, -1, -1, iunVar, d310Var, -1.0f, iunVar), iunVar, iunVar, iunVar, iunVar, zz00.f45230a, 0L, 0L, iunVar, iunVar, iunVar), iunVar);
                } else {
                    p310Var = p310Var2;
                }
                o310 o310Var = p310Var.f26277a;
                boolean z26 = (idx.I(o310Var) && idx.J(o310Var) && idx.G(o310Var) && p310Var.b.isEmpty() && idx.E(y3hVar) && rq8.R(ic6Var) && idx.F(o310Var) && idx.H(o310Var) && x2x.b0(ljgVar, m9sVar) && x2x.Y(y3hVar.d, y3hVar.h)) ? false : true;
                if (p310Var2 == null) {
                    iun iunVar2 = iun.f15405a;
                    d310 d310Var2 = d310.UNKNOWN;
                    p310Var2 = new p310(new o310(0L, 0L, 0, 0, 0, new a610(0, -1, -1, -1, -1, iunVar2, d310Var2, -1.0f, iunVar2), new a610(0, -1, -1, -1, -1, iunVar2, d310Var2, -1.0f, iunVar2), iunVar2, iunVar2, iunVar2, iunVar2, zz00.f45230a, 0L, 0L, iunVar2, iunVar2, iunVar2), iunVar2);
                }
                return new k4h(p310Var2, z26, y3hVar, ic6Var, ljgVar);
            case 8:
                ljg ljgVar2 = (ljg) this.l;
                qrh qrhVar = (qrh) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                m9s m9sVar2 = (m9s) obj3;
                cqg cqgVar2 = m9sVar2.I;
                d0u0 d0u0Var2 = cqgVar2 instanceof d0u0 ? (d0u0) cqgVar2 : null;
                ljgVar2.getClass();
                qrhVar.getClass();
                if (d0u0Var2 == null) {
                    iun iunVar3 = iun.f15405a;
                    i1u0 i1u0Var = new i1u0("", iunVar3, 0);
                    lun lunVar = lun.f20680a;
                    lunVar.getClass();
                    u1u0 u1u0Var = u1u0.c;
                    d0u0Var = new d0u0(i1u0Var, new g2u0(0, lunVar, u1u0Var, iunVar3), new g2u0(0, lunVar, u1u0Var, iunVar3), false, "");
                } else {
                    d0u0Var = d0u0Var2;
                }
                if (ofm0.q(qrhVar) && ofm0.r(d0u0Var, m9sVar2) && x2x.b0(ljgVar2, m9sVar2) && ofm0.u(d0u0Var) && ofm0.t(d0u0Var) && ofm0.s(qrhVar)) {
                    z10 = false;
                }
                if (d0u0Var2 == null) {
                    iun iunVar4 = iun.f15405a;
                    i1u0 i1u0Var2 = new i1u0("", iunVar4, 0);
                    lun lunVar2 = lun.f20680a;
                    lunVar2.getClass();
                    u1u0 u1u0Var2 = u1u0.c;
                    d0u0Var2 = new d0u0(i1u0Var2, new g2u0(0, lunVar2, u1u0Var2, iunVar4), new g2u0(0, lunVar2, u1u0Var2, iunVar4), false, "");
                }
                return new vxt0(d0u0Var2, z10, qrhVar, ljgVar2);
            case 9:
                return l(obj);
            case 10:
                return m(obj);
            case 11:
                List list19 = (List) this.l;
                String str20 = (String) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                int i16 = uhs.J;
                if (str20.length() <= 0) {
                    return list19;
                }
                ArrayList arrayList12 = new ArrayList();
                for (Object obj11 : list19) {
                    if (((klr) obj11).a(str20)) {
                        arrayList12.add(obj11);
                    }
                }
                return arrayList12;
            case 12:
                return o(obj);
            case 13:
                return r(obj);
            case 14:
                eh6 eh6Var = (eh6) this.l;
                u5s u5sVar = (u5s) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                ((uii) obj3).getClass();
                if (Intrinsics.d(eh6Var, ch6.f4346a)) {
                    z9 = u5sVar instanceof j5s;
                } else if (Intrinsics.d(eh6Var, bh6.f2590a)) {
                    z9 = true;
                } else {
                    if (!(eh6Var instanceof dh6)) {
                        t9f.b();
                        return null;
                    }
                    ArrayList arrayList13 = ((dh6) eh6Var).f6078a;
                    if (arrayList13.isEmpty()) {
                        z9 = true;
                    } else {
                        Iterator it14 = arrayList13.iterator();
                        while (it14.hasNext()) {
                            if (!((xf6) it14.next()).b.isEmpty()) {
                            }
                        }
                        z9 = true;
                    }
                }
                return new ml6(z9);
            case 15:
                return s(obj);
            case 16:
                return t(obj);
            case 17:
                return x(obj);
            case 18:
                List list20 = (List) this.l;
                List list21 = (List) this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                return gu1.a((gu1) obj3, false, new k98(list20), null, 0L, list21, 130943);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return y(obj);
            case 20:
                return G(obj);
            case 21:
                return H(obj);
            case 22:
                return J(obj);
            case 23:
                return I(obj);
            case 24:
                return K(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return L(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return M(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Q(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return R(obj);
            default:
                List list22 = (List) this.l;
                List list23 = (List) this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                int i17 = b3a0.x;
                p7m0 p7m0Var3 = ((b3a0) obj3).i.f25029a;
                do {
                    value = p7m0Var3.getValue();
                    value.getClass();
                } while (!p7m0Var3.m(value, p2a0.a((p2a0) value, false, list22, list23, false, 7)));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx4(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx4(bs60 bs60Var, String str, yje yjeVar) {
        super(3, yjeVar);
        this.i = (byte) 25;
        this.j = bs60Var;
        this.k = str;
    }
}
