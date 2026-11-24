package a;

import android.os.Bundle;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m87 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21356a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m87(lea leaVar) {
        this.f21356a = (byte) 27;
        this.b = leaVar;
    }

    private final Object a(Object obj, Object obj2) {
        ka9 ka9Var = (ka9) this.b;
        a8z a8zVar = ka9Var.P1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        cl5 cl5Var = ka9.Q1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            va9 va9Var = (va9) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue();
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI = fetVar.i(ka9Var);
            Object objP = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (zI || objP == cl5Var2) {
                li8 li8Var = new li8(1, ka9Var, ka9.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/playersduel/impl/presentation/build_duel/BuildDuelSideEffect;)V", 0, (byte) 15);
                fetVar.o0(li8Var);
                objP = li8Var;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(ka9Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var2) {
                ua7 ua7Var = new ua7(k3t0Var, ka9Var, pz40VarF, null, (byte) 10);
                fetVar.o0(ua7Var);
                objP2 = ua7Var;
            }
            m0x0.t(fetVar, ka9Var, (Function2) objP2);
            k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
            boolean zI3 = fetVar.i(k3t0Var2);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var2) {
                li8 li8Var2 = new li8(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 16);
                fetVar.o0(li8Var2);
                objP3 = li8Var2;
            }
            xf0.g(null, va9Var, (Function1) ((jhy) objP3), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2) {
        lea leaVar = (lea) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(hea.f);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 214.0f);
            long jM71getBlack300d7_KjU = StaticColors.INSTANCE.m71getBlack300d7_KjU();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, jM71getBlack300d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 12.0f, 8.0f, 12.0f, 0.0f, 8);
            zx7 zx7Var = gqw0.b;
            jr8 jr8Var = jr8.f16991a;
            jd8.D(jr8Var.b(mm40VarN, zx7Var), leaVar.b, fetVar, 0);
            mm40 mm40VarE2 = o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), 104.0f);
            zx7 zx7Var2 = gqw0.h;
            k7x.a(leaVar.f19892a, null, jr8Var.b(mm40VarE2, zx7Var2), null, null, fetVar, 48, 2040);
            dea.b(jr8Var.b(o7k0.d(jm40Var, 1.0f), zx7Var2), leaVar.c, pz40Var, fetVar, 384);
            mm40 mm40VarB = jr8Var.b(o7k0.A(jm40Var, null, 3), zx7Var2);
            nea neaVar = leaVar.d;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new ca6(pz40Var, (byte) 9);
                fetVar.o0(objP2);
            }
            ffb0.i(mm40VarB, neaVar, (Function1) objP2, fetVar, 384);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:306:0x0b19  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kuw kuwVar;
        Object value;
        w2d w2dVar;
        pz40 pz40Var;
        Object value2;
        byte b = this.f21356a;
        byte b2 = 19;
        pcy pcyVar = e7z.u1;
        yje yjeVar = null;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        byte b3 = 2;
        byte b4 = 3;
        byte b5 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return i77.a((i77) obj2, false, false, false, null, null, null, null, false, null, null, !((xl80) ((am80) obj3)).b, false, false, null, null, null, null, false, null, false, false, false, null, null, null, null, null, -49153, 2047);
            case 1:
                ze7 ze7Var = (ze7) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                cl5 cl5Var2 = ze7.P1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if7 if7Var = (if7) ((i3t0) ze7Var.G0()).y(fetVar).getValue();
                    k3t0 k3t0VarG0 = ze7Var.G0();
                    boolean zI = fetVar.i(k3t0VarG0);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        ye7 ye7Var = new ye7(1, k3t0VarG0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 0);
                        fetVar.o0(ye7Var);
                        objP = ye7Var;
                    }
                    nia0.l(if7Var, (Function1) ((jhy) objP), fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 2:
                kf7 kf7Var = (kf7) obj3;
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                th.getClass();
                str.getClass();
                String strA = kf7Var.q.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0));
                if (th instanceof zhi0) {
                    zhi0 zhi0Var = (zhi0) th;
                    if (zhi0Var.f44396a == i2o.Forbidden.getErrorCode() && ((kuwVar = zhi0Var.c) == i2o.DayDepositLimitInvalidRange || kuwVar == i2o.WeekDepositLimitInvalidRange || kuwVar == i2o.MonthDepositLimitInvalidRange || kuwVar == i2o.DayMonthLimitHierarchyViolationWarning || kuwVar == i2o.DayYearLimitHierarchyViolationWarning || kuwVar == i2o.MonthDayDepositLimitsInvalidRange || kuwVar == i2o.CurrentDepositLimitsInvalidValue || kuwVar == i2o.CurrentDepositLimitsExpensesInvalid)) {
                        String str2 = StringsKt.W(str) ? strA : str;
                        p7m0 p7m0Var = kf7Var.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                            kf7Var.f.getClass();
                        } while (!p7m0Var.m(value, hf7.a((hf7) value, null, null, false, str2, 23)));
                        kf7Var.o.e("TEXT_FIELD_ERROR", str2);
                    } else {
                        kf7Var.G(new ff7(strA));
                    }
                } else {
                    kf7Var.G(new ff7(strA));
                }
                return Unit.f46060a;
            case 3:
                uf7 uf7Var = (uf7) obj3;
                Throwable th2 = (Throwable) obj;
                String str3 = (String) obj2;
                th2.getClass();
                str3.getClass();
                if (th2 instanceof zhi0) {
                    uf7Var.x(new pf7(str3));
                } else {
                    uf7Var.x(qf7.f28617a);
                }
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                i120.K((fuy) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                mp7 mp7Var = (mp7) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                bj5 bj5Var = mp7.S1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) mp7Var.G0()).y(fetVar2);
                    w2d w2dVarW0 = uzb.w0(0, fetVar2);
                    w2dVarW0.d = pz40VarY.getValue() instanceof aq7;
                    boolean zI2 = fetVar2.i(mp7Var);
                    Object objP2 = fetVar2.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new kp7(mp7Var, b3);
                        fetVar2.o0(objP2);
                    }
                    Function0 function0 = (Function0) objP2;
                    boolean zI3 = fetVar2.i(mp7Var);
                    Object objP3 = fetVar2.P();
                    if (zI3 || objP3 == cl5Var) {
                        objP3 = new kp7(mp7Var, b4);
                        fetVar2.o0(objP3);
                    }
                    v3c.z(function0, (Function0) objP3, null, fetVar2, 0, 4);
                    Boolean boolValueOf = Boolean.valueOf(w2dVarW0.f38442a.a() == 1.0f);
                    boolean zI4 = fetVar2.i(mp7Var) | fetVar2.i(w2dVarW0);
                    Object objP4 = fetVar2.P();
                    yje yjeVar2 = null;
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new yp6(mp7Var, w2dVarW0, yjeVar2, (byte) 10);
                        fetVar2.o0(objP4);
                    }
                    m0x0.t(fetVar2, boolValueOf, (Function2) objP4);
                    k3t0 k3t0VarG1 = mp7Var.G0();
                    boolean zI5 = fetVar2.i(mp7Var);
                    Object objP5 = fetVar2.P();
                    if (zI5 || objP5 == cl5Var) {
                        w2dVar = w2dVarW0;
                        pz40Var = pz40VarY;
                        ye7 ye7Var2 = new ye7(1, mp7Var, mp7.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/promotions/news/impl/presentation/bet_without_risk/models/BetWithoutRiskSideEffect;)V", 0, (byte) 9);
                        fetVar2.o0(ye7Var2);
                        objP5 = ye7Var2;
                    } else {
                        pz40Var = pz40VarY;
                        w2dVar = w2dVarW0;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP5), fetVar2);
                    boolean zI6 = fetVar2.i(k3t0VarG1) | fetVar2.i(mp7Var) | fetVar2.e(3) | fetVar2.g(pz40VarF);
                    Object objP6 = fetVar2.P();
                    if (zI6 || objP6 == cl5Var) {
                        ua7 ua7Var = new ua7(k3t0VarG1, mp7Var, pz40VarF, null, (byte) 2);
                        fetVar2.o0(ua7Var);
                        objP6 = ua7Var;
                    }
                    m0x0.t(fetVar2, mp7Var, (Function2) objP6);
                    k3t0 k3t0VarG2 = mp7Var.G0();
                    boolean zI7 = fetVar2.i(k3t0VarG2);
                    Object objP7 = fetVar2.P();
                    if (zI7 || objP7 == cl5Var) {
                        ye7 ye7Var3 = new ye7(1, k3t0VarG2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 10);
                        fetVar2.o0(ye7Var3);
                        objP7 = ye7Var3;
                    }
                    oja0.f(pz40Var, w2dVar, (Function1) ((jhy) objP7), fetVar2, 64);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 6:
                eq7 eq7Var = (eq7) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM = fetVar3.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar3, jm40Var);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, tj30VarC, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                    k7x.b(eq7Var.a(), null, o7k0.d(jm40Var, 1.0f), a8k0.F(R.drawable.plug_news, 0, fetVar3), a8k0.F(R.drawable.plug_news, 0, fetVar3), null, null, null, null, null, null, null, fetVar3, 37296, 0, 32736);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 7:
                hq7 hq7Var = (hq7) obj3;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var2 = hq7Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    hq7Var.f.getClass();
                } while (!p7m0Var2.m(value2, zp7.a((zp7) value2, null, false, true, false, 1017)));
                th3.printStackTrace();
                return Unit.f46060a;
            case 8:
                sw7 sw7Var = (sw7) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x7z x7zVar = new x7z(1.0f, false);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar4, 48);
                    int iHashCode2 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM2 = fetVar4.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar4, x7zVar);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, thg0VarA, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC1, gqw0.v);
                    zcl zclVar = qmk.f28987a;
                    jm40 jm40Var2 = jm40.b;
                    v8q0.a(sw7Var.f32907a, o2e.e0(s5x0.N(jm40Var2, 0.0f, 0.0f, 2.0f, 0.0f, 11).e(new x7z(1.0f, false)), "WALLET_SUM"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.m(), fetVar4), fetVar4, 0, 24960, 110588);
                    v8q0.a(sw7Var.b, o2e.e0(jm40Var2, "WALLET_CURRENCY"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.t(g1t0.m(), fetVar4), fetVar4, 48, 24576, 114684);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 9:
                rw7 rw7Var = (rw7) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x7z x7zVar2 = new x7z(1.0f, false);
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar5, 48);
                    int iHashCode3 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM3 = fetVar5.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar5, x7zVar2);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC2, gqw0.v);
                    zcl zclVar2 = qmk.f28987a;
                    v8q0.a(rw7Var.f31205a, dw9.h(1.0f, s5x0.N(jm40.b, 0.0f, 0.0f, 2.0f, 0.0f, 11), false), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.m(), fetVar5), fetVar5, 0, 24960, 110588);
                    v8q0.a(rw7Var.b, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.t(g1t0.m(), fetVar5), fetVar5, 0, 24576, 114686);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                d18.e((zz7) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                d48 d48Var = (d48) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                sac.V(jiu0.a(d48Var), new d38(d48Var, b5), null, d48Var.d.f22085a, new z38(d48Var, yjeVar, b5), 10);
                return Unit.f46060a;
            case 12:
                uc8 uc8Var = (uc8) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                yk5 yk5Var = uc8.P1;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    pz40 pz40VarY2 = ((i3t0) uc8Var.G0()).y(fetVar6);
                    k3t0 k3t0VarG3 = uc8Var.G0();
                    boolean zI8 = fetVar6.i(uc8Var);
                    Object objP8 = fetVar6.P();
                    if (zI8 || objP8 == cl5Var) {
                        ye7 ye7Var4 = new ye7(1, uc8Var, uc8.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/bonus_agreements/impl/presentation/model/BonusAgreementsSideEffect;)V", 0, (byte) 21);
                        fetVar6.o0(ye7Var4);
                        objP8 = ye7Var4;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP8), fetVar6);
                    boolean zI9 = fetVar6.i(k3t0VarG3) | fetVar6.i(uc8Var) | fetVar6.e(3) | fetVar6.g(pz40VarF2);
                    Object objP9 = fetVar6.P();
                    if (zI9 || objP9 == cl5Var) {
                        ua7 ua7Var2 = new ua7(k3t0VarG3, uc8Var, pz40VarF2, null, (byte) 4);
                        uc8Var = uc8Var;
                        fetVar6.o0(ua7Var2);
                        objP9 = ua7Var2;
                    }
                    m0x0.t(fetVar6, uc8Var, (Function2) objP9);
                    k3t0 k3t0VarG4 = uc8Var.G0();
                    boolean zI10 = fetVar6.i(k3t0VarG4);
                    Object objP10 = fetVar6.P();
                    if (zI10 || objP10 == cl5Var) {
                        ye7 ye7Var5 = new ye7(1, k3t0VarG4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                        fetVar6.o0(ye7Var5);
                        objP10 = ye7Var5;
                    }
                    ny9.c(pz40VarY2, (Function1) ((jhy) objP10), fetVar6, 6);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 13:
                oi8 oi8Var = (oi8) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                cl5 cl5Var3 = oi8.P1;
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    pz40 pz40VarY3 = ((i3t0) oi8Var.G0()).y(fetVar7);
                    k3t0 k3t0VarG5 = oi8Var.G0();
                    boolean zI11 = fetVar7.i(oi8Var);
                    Object objP11 = fetVar7.P();
                    if (zI11 || objP11 == cl5Var) {
                        ye7 ye7Var6 = new ye7(1, oi8Var, oi8.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/bonuses/impl/presentation/model/BonusesSideEffect;)V", 0, (byte) 29);
                        fetVar7.o0(ye7Var6);
                        objP11 = ye7Var6;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP11), fetVar7);
                    boolean zI12 = fetVar7.i(k3t0VarG5) | fetVar7.i(oi8Var) | fetVar7.e(3) | fetVar7.g(pz40VarF3);
                    Object objP12 = fetVar7.P();
                    if (zI12 || objP12 == cl5Var) {
                        ua7 ua7Var3 = new ua7(k3t0VarG5, oi8Var, pz40VarF3, null, (byte) 5);
                        fetVar7.o0(ua7Var3);
                        objP12 = ua7Var3;
                    }
                    m0x0.t(fetVar7, oi8Var, (Function2) objP12);
                    k3t0 k3t0VarG6 = oi8Var.G0();
                    boolean zI13 = fetVar7.i(k3t0VarG6);
                    Object objP13 = fetVar7.P();
                    if (zI13 || objP13 == cl5Var) {
                        li8 li8Var = new li8(1, k3t0VarG6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 0);
                        fetVar7.o0(li8Var);
                        objP13 = li8Var;
                    }
                    f1t0.j(0, fetVar7, null, pz40VarY3, (Function1) ((jhy) objP13));
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                ahy.g((cj8) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                lj8 lj8Var = (lj8) obj3;
                a8z a8zVar = lj8Var.M1;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                gl5 gl5Var = lj8.O1;
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    sj8 sj8Var = (sj8) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar8).getValue();
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI14 = fetVar8.i(lj8Var);
                    Object objP14 = fetVar8.P();
                    if (zI14 || objP14 == cl5Var) {
                        objP14 = new nk7((byte) 18);
                        fetVar8.o0(objP14);
                    }
                    clz clzVar = (clz) fetVar8.k(or00.f25714a);
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) objP14, fetVar8);
                    boolean zI15 = fetVar8.i(k3t0Var) | fetVar8.i(clzVar) | fetVar8.e(3) | fetVar8.g(pz40VarF4);
                    Object objP15 = fetVar8.P();
                    if (zI15 || objP15 == cl5Var) {
                        pc pcVar = new pc(k3t0Var, clzVar, pz40VarF4, null, (byte) 5);
                        fetVar8.o0(pcVar);
                        objP15 = pcVar;
                    }
                    m0x0.t(fetVar8, clzVar, (Function2) objP15);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
                    boolean zI16 = fetVar8.i(k3t0Var2);
                    Object objP16 = fetVar8.P();
                    if (zI16 || objP16 == cl5Var) {
                        li8 li8Var2 = new li8(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 2);
                        fetVar8.o0(li8Var2);
                        objP16 = li8Var2;
                    }
                    rsr0.k(mm40VarD, sj8Var, (Function1) ((jhy) objP16), fetVar8, 6);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 16:
                yj8 yj8Var = (yj8) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                sac.V(jiu0.a(yj8Var), new nk7(b2), null, yj8Var.d.c, new xw5(yj8Var, new uj8((ra10) yj8Var.h.getValue()), yjeVar, (byte) 25), 10);
                return Unit.f46060a;
            case 17:
                tv8 tv8Var = (tv8) obj3;
                a8z a8zVar2 = tv8Var.M1;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                yk5 yk5Var2 = tv8.N1;
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    k3t0 k3t0Var3 = (k3t0) a8zVar2.getValue();
                    boolean zI17 = fetVar9.i(tv8Var);
                    Object objP17 = fetVar9.P();
                    if (zI17 || objP17 == cl5Var) {
                        li8 li8Var3 = new li8(1, tv8Var, tv8.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/aggregator/impl/brands/presentation/filters/models/BrandGamesFiltersSideEffect;)V", 0, (byte) 8);
                        fetVar9.o0(li8Var3);
                        objP17 = li8Var3;
                    }
                    lkz lkzVar5 = lkz.f20223a;
                    pz40 pz40VarF5 = androidx.compose.runtime.e.f((Function1) ((jhy) objP17), fetVar9);
                    boolean zI18 = fetVar9.i(k3t0Var3) | fetVar9.i(tv8Var) | fetVar9.e(3) | fetVar9.g(pz40VarF5);
                    Object objP18 = fetVar9.P();
                    if (zI18 || objP18 == cl5Var) {
                        ua7 ua7Var4 = new ua7(k3t0Var3, tv8Var, pz40VarF5, null, (byte) 6);
                        fetVar9.o0(ua7Var4);
                        objP18 = ua7Var4;
                    }
                    m0x0.t(fetVar9, tv8Var, (Function2) objP18);
                    pz40 pz40VarY4 = ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar9);
                    k3t0 k3t0Var4 = (k3t0) a8zVar2.getValue();
                    boolean zI19 = fetVar9.i(k3t0Var4);
                    Object objP19 = fetVar9.P();
                    if (zI19 || objP19 == cl5Var) {
                        li8 li8Var4 = new li8(1, k3t0Var4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 9);
                        fetVar9.o0(li8Var4);
                        objP19 = li8Var4;
                    }
                    hew0.d(0, fetVar9, null, pz40VarY4, (Function1) ((jhy) objP19));
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 18:
                ux8 ux8VarA = (ux8) obj3;
                jw8 jw8Var = (jw8) obj2;
                ((oyg0) obj).getClass();
                jw8Var.getClass();
                vw8 vw8Var = new vw8(iun.f15405a);
                if (ux8VarA instanceof qx8) {
                    qx8 qx8Var = (qx8) ux8VarA;
                    List list = qx8Var.f29469a;
                    if (!list.isEmpty()) {
                        ux8VarA = qx8.a(qx8Var, (AggregatorSortingOptionModel) CollectionsKt.U(list));
                    }
                }
                return jw8.a(jw8Var, ux8VarA, vw8Var, 19);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                cy8 cy8Var = (cy8) obj3;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    k7x.a(cy8Var.f5160a.a(), null, s5x0.N(o7k0.e(jm40Var, 40.0f), 16.0f, 0.0f, 16.0f, 6.0f, 2), gqw0.B, null, fetVar10, 1572912, 1976);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 20:
                dy8 dy8Var = (dy8) obj3;
                fet fetVar11 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(mm40VarD2, 16.0f, 0.0f, 2);
                    String str4 = dy8Var.f6880a;
                    long jM123getWhite0d7_KjU = ((StaticColors) fetVar11.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                    qrq qrqVar = j1t0.f15753a;
                    long j = qmk.A;
                    v8q0.a(str4, mm40VarL, jM123getWhite0d7_KjU, new n05(qmk.s, j, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.L, 16646109), fetVar11, 0, 24960, 110576);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 21:
                yy8 yy8Var = (yy8) obj3;
                a8z a8zVar3 = yy8Var.M1;
                fet fetVar12 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                gl5 gl5Var2 = yy8.Q1;
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    k3t0 k3t0Var5 = (k3t0) a8zVar3.getValue();
                    boolean zI20 = fetVar12.i(yy8Var);
                    Object objP20 = fetVar12.P();
                    if (zI20 || objP20 == cl5Var) {
                        li8 li8Var5 = new li8(1, yy8Var, yy8.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/impl/brands/presentation/info/model/BrandInfoSideEffect;)V", 0, (byte) 11);
                        fetVar12.o0(li8Var5);
                        objP20 = li8Var5;
                    }
                    lkz lkzVar6 = lkz.f20223a;
                    pz40 pz40VarF6 = androidx.compose.runtime.e.f((Function1) ((jhy) objP20), fetVar12);
                    boolean zI21 = fetVar12.i(k3t0Var5) | fetVar12.i(yy8Var) | fetVar12.e(3) | fetVar12.g(pz40VarF6);
                    Object objP21 = fetVar12.P();
                    if (zI21 || objP21 == cl5Var) {
                        ua7 ua7Var5 = new ua7(k3t0Var5, yy8Var, pz40VarF6, null, (byte) 8);
                        fetVar12.o0(ua7Var5);
                        objP21 = ua7Var5;
                    }
                    m0x0.t(fetVar12, yy8Var, (Function2) objP21);
                    pz40 pz40VarY5 = ((i3t0) ((k3t0) a8zVar3.getValue())).y(fetVar12);
                    boolean zBooleanValue = yy8Var.P1.n(yy8Var, yy8.R1[3]).booleanValue();
                    k3t0 k3t0Var6 = (k3t0) a8zVar3.getValue();
                    boolean zI22 = fetVar12.i(k3t0Var6);
                    Object objP22 = fetVar12.P();
                    if (zI22 || objP22 == cl5Var) {
                        objP22 = new li8(1, k3t0Var6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 12);
                        fetVar12.o0(objP22);
                    }
                    m0x0.h(null, pz40VarY5, zBooleanValue, (Function1) ((jhy) objP22), fetVar12, 0);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 22:
                a8z a8zVar4 = ((uz8) obj3).M1;
                fet fetVar13 = (fet) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                bj5 bj5Var2 = uz8.N1;
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    c09 c09Var = (c09) ((i3t0) ((k3t0) a8zVar4.getValue())).y(fetVar13).getValue();
                    k3t0 k3t0Var7 = (k3t0) a8zVar4.getValue();
                    boolean zI23 = fetVar13.i(k3t0Var7);
                    Object objP23 = fetVar13.P();
                    if (zI23 || objP23 == cl5Var) {
                        li8 li8Var6 = new li8(1, k3t0Var7, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 13);
                        fetVar13.o0(li8Var6);
                        objP23 = li8Var6;
                    }
                    y0x0.g(null, c09Var, (Function1) ((jhy) objP23), fetVar13, 0);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 23:
                eke ekeVar = (eke) obj3;
                fet fetVar14 = (fet) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    pm80 pm80VarF = a8k0.F(ekeVar.b ? R.drawable.ic_glyph_sound_on : R.drawable.ic_glyph_sound_off, 0, fetVar14);
                    long j2 = y3d.c;
                    zcl zclVar5 = qmk.f28987a;
                    dww.c(pm80VarF, null, o7k0.n(jm40Var, 24.0f), j2, fetVar14, 3128, 0);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 24:
                return a(obj, obj2);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((clz) obj).getClass();
                ((blz) obj2).getClass();
                ((nl9) obj3).q.invoke();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                kl5 kl5Var = br9.S1;
                ((String) obj).getClass();
                ((Bundle) obj2).getClass();
                mr9 mr9VarH0 = ((br9) obj3).H0();
                sac.V(jiu0.a(mr9VarH0), lr9.f20518a, null, mr9VarH0.e.c, new gr9(mr9VarH0, yjeVar, b5), 10);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return b(obj, obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                kc5.r0((kc90) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                j47.c0((oc90) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ m87(Object obj, byte b) {
        this.f21356a = b;
        this.b = obj;
    }

    public /* synthetic */ m87(Object obj, int i, byte b) {
        this.f21356a = b;
        this.b = obj;
    }
}
