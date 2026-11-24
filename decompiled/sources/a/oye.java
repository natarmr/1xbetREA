package a;

import android.os.Looper;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.xplatform.coupon.impl.make_bet.presentation.model.CoefStepInputUiModel;
import org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oye extends rer implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26056a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oye(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f26056a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        CoefStepInputUiModel coefStepInputUiModel;
        BigDecimal bigDecimal;
        BigDecimal bigDecimalAdd;
        Object value2;
        CoefStepInputUiModel coefStepInputUiModel2;
        BigDecimal bigDecimalSubtract;
        Object value3;
        StepInputUiModel stepInputUiModel;
        double dJ0;
        double d;
        Object value4;
        StepInputUiModel stepInputUiModel2;
        double dDoubleValue;
        Object value5;
        byte b = 22;
        byte b2 = 4;
        byte b3 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.f26056a) {
            case 0:
                h620 h620Var = (h620) this.receiver;
                h620Var.Q.f(k7k.RegularCoupon);
                l7k l7kVar = h620Var.R;
                y1p y1pVar = y1p.MAIN;
                l7kVar.b("regular_coupon", h620Var.S.g());
                sac.V(jiu0.a(h620Var), new p520(h620Var, b3), null, h620Var.c.f22085a, new cm10(h620Var, null), 10);
                return Unit.f46060a;
            case 1:
                ((h620) this.receiver).D(true);
                return Unit.f46060a;
            case 2:
                h620 h620Var2 = (h620) this.receiver;
                h620Var2.Q.f(k7k.NoMoneyRegularCoupon);
                l7k l7kVar2 = h620Var2.R;
                y1p y1pVar2 = y1p.MAIN;
                l7kVar2.b("no_money_regular_coupone", h620Var2.S.g());
                sac.V(jiu0.a(h620Var2), new p520(h620Var2, b3), null, h620Var2.c.f22085a, new cm10(h620Var2, null), 10);
                return Unit.f46060a;
            case 3:
                h620 h620Var3 = (h620) this.receiver;
                c4m0 c4m0Var = h620Var3.d0;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                p7m0 p7m0Var = h620Var3.h0;
                do {
                    value = p7m0Var.getValue();
                    coefStepInputUiModel = (CoefStepInputUiModel) value;
                    BigDecimal bigDecimal2 = coefStepInputUiModel.f46473a;
                    bigDecimal = coefStepInputUiModel.d;
                    BigDecimal bigDecimal3 = coefStepInputUiModel.c;
                    if (bigDecimal2.compareTo(bigDecimal) < 0) {
                        bigDecimalAdd = bigDecimal;
                    } else if (bigDecimal2.scale() == 1 || bigDecimal2.scale() == 0) {
                        bigDecimalAdd = bigDecimal2.add(bigDecimal3);
                        bigDecimalAdd.getClass();
                    } else {
                        bigDecimalAdd = bigDecimal2.setScale(1, RoundingMode.FLOOR).add(bigDecimal3);
                        bigDecimalAdd.getClass();
                    }
                } while (!p7m0Var.m(value, CoefStepInputUiModel.a(coefStepInputUiModel, h620.w(bigDecimalAdd, coefStepInputUiModel), null, false, bigDecimalAdd.compareTo(coefStepInputUiModel.e) > 0, bigDecimalAdd.compareTo(bigDecimal) < 0, false, 286)));
                return Unit.f46060a;
            case 4:
                h620 h620Var4 = (h620) this.receiver;
                c4m0 c4m0Var2 = h620Var4.d0;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                }
                p7m0 p7m0Var2 = h620Var4.h0;
                do {
                    value2 = p7m0Var2.getValue();
                    coefStepInputUiModel2 = (CoefStepInputUiModel) value2;
                    BigDecimal bigDecimal4 = coefStepInputUiModel2.f46473a;
                    BigDecimal bigDecimal5 = coefStepInputUiModel2.c;
                    if (bigDecimal4.scale() == 1 || bigDecimal4.scale() == 0) {
                        bigDecimalSubtract = bigDecimal4.subtract(bigDecimal5);
                        bigDecimalSubtract.getClass();
                    } else {
                        bigDecimalSubtract = bigDecimal4.setScale(1, RoundingMode.CEILING).subtract(bigDecimal5);
                        bigDecimalSubtract.getClass();
                    }
                } while (!p7m0Var2.m(value2, CoefStepInputUiModel.a(coefStepInputUiModel2, h620.w(bigDecimalSubtract, coefStepInputUiModel2), null, false, bigDecimalSubtract.compareTo(coefStepInputUiModel2.e) > 0, bigDecimalSubtract.compareTo(coefStepInputUiModel2.d) < 0, false, 286)));
                return Unit.f46060a;
            case 5:
                qg20 qg20Var = (qg20) this.receiver;
                qg20Var.I0.f(k7k.RegularCoupon);
                l7k l7kVar3 = qg20Var.J0;
                y1p y1pVar3 = y1p.MAIN;
                l7kVar3.b("regular_coupon", qg20Var.K0.g());
                sac.V(jiu0.a(qg20Var), new cd20(qg20Var, b2), null, qg20Var.d.f22085a, new v620(qg20Var, objArr == true ? 1 : 0, b), 10);
                return Unit.f46060a;
            case 6:
                qg20 qg20Var2 = (qg20) this.receiver;
                qg20Var2.I0.f(k7k.NoMoneyRegularCoupon);
                l7k l7kVar4 = qg20Var2.J0;
                y1p y1pVar4 = y1p.MAIN;
                l7kVar4.b("no_money_regular_coupone", qg20Var2.K0.g());
                sac.V(jiu0.a(qg20Var2), new cd20(qg20Var2, b2), null, qg20Var2.d.f22085a, new v620(qg20Var2, objArr2 == true ? 1 : 0, b), 10);
                return Unit.f46060a;
            case 7:
                qg20 qg20Var3 = (qg20) this.receiver;
                p7m0 p7m0Var3 = qg20Var3.d1;
                do {
                    value3 = p7m0Var3.getValue();
                    stepInputUiModel = (StepInputUiModel) value3;
                    double d2 = stepInputUiModel.f46474a;
                    if (d2 == -1.0d) {
                        boolean z = stepInputUiModel.h;
                        dJ0 = stepInputUiModel.b;
                        if (!z) {
                            dJ0 = qg20Var3.j0(dJ0, stepInputUiModel.c, stepInputUiModel.b());
                        }
                    } else {
                        dJ0 = qg20Var3.j0(d2, stepInputUiModel.c, stepInputUiModel.b());
                    }
                    d = dJ0;
                    qg20Var3.l0(d);
                } while (!p7m0Var3.m(value3, StepInputUiModel.a(stepInputUiModel, d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, false, 258046)));
                return Unit.f46060a;
            case 8:
                qg20 qg20Var4 = (qg20) this.receiver;
                p7m0 p7m0Var4 = qg20Var4.d1;
                do {
                    value4 = p7m0Var4.getValue();
                    stepInputUiModel2 = (StepInputUiModel) value4;
                    BigDecimal bigDecimal6 = new BigDecimal(String.valueOf(stepInputUiModel2.f46474a));
                    BigDecimal bigDecimal7 = new BigDecimal(String.valueOf(stepInputUiModel2.c));
                    dDoubleValue = stepInputUiModel2.d;
                    BigDecimal bigDecimal8 = new BigDecimal(String.valueOf(dDoubleValue));
                    BigDecimal bigDecimal9 = new BigDecimal(String.valueOf(stepInputUiModel2.b()));
                    if (stepInputUiModel2.f46474a == -1.0d) {
                        dDoubleValue = stepInputUiModel2.b;
                    } else {
                        BigDecimal bigDecimalSubtract2 = bigDecimal6.subtract(bigDecimal7);
                        bigDecimalSubtract2.getClass();
                        if (bigDecimalSubtract2.compareTo(bigDecimal8) >= 0) {
                            if (bigDecimal6.compareTo(bigDecimal9) > 0) {
                                dDoubleValue = stepInputUiModel2.b();
                            } else {
                                BigDecimal bigDecimalSubtract3 = bigDecimal6.subtract(bigDecimal7);
                                bigDecimalSubtract3.getClass();
                                dDoubleValue = bigDecimalSubtract3.doubleValue();
                            }
                        }
                    }
                    qg20Var4.l0(dDoubleValue);
                } while (!p7m0Var4.m(value4, StepInputUiModel.a(stepInputUiModel2, dDoubleValue, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, false, 258046)));
                return Unit.f46060a;
            case 9:
                ((baf) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                name.getClass();
                return Boolean.valueOf(StringsKt.O(name, "Firebase Background Thread #", false));
            case 10:
                ((baf) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                name2.getClass();
                return Boolean.valueOf(StringsKt.O(name2, "Firebase Blocking Thread #", false));
            case 11:
                ((baf) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
            case 12:
                ((hbg) this.receiver).B();
                return Unit.f46060a;
            case 13:
                h6g h6gVar = (h6g) this.receiver;
                h6gVar.getClass();
                h6gVar.A(da10.TIMER_ERROR);
                h6gVar.y();
                return Unit.f46060a;
            case 14:
                h6g h6gVar2 = (h6g) this.receiver;
                h6gVar2.getClass();
                h6gVar2.A(da10.DEFAULT_ERROR);
                return Unit.f46060a;
            case 15:
                w6g w6gVar = (w6g) this.receiver;
                w6gVar.getClass();
                w6gVar.y(da10.TIMER_ERROR);
                w6gVar.q = null;
                c4m0 c4m0Var3 = w6gVar.r;
                if (c4m0Var3 != null) {
                    c4m0Var3.cancel(null);
                }
                w6gVar.x();
                return Unit.f46060a;
            case 16:
                w6g w6gVar2 = (w6g) this.receiver;
                w6gVar2.getClass();
                w6gVar2.y(da10.DEFAULT_ERROR);
                return Unit.f46060a;
            case 17:
                u8g u8gVar = (u8g) this.receiver;
                u8gVar.getClass();
                u8gVar.z(da10.TIMER_ERROR);
                c4m0 c4m0Var4 = u8gVar.p;
                if (c4m0Var4 != null) {
                    c4m0Var4.cancel(null);
                }
                u8gVar.y();
                return Unit.f46060a;
            case 18:
                u8g u8gVar2 = (u8g) this.receiver;
                u8gVar2.getClass();
                u8gVar2.z(da10.DEFAULT_ERROR);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                i1w0 i1w0VarC = ((hbg) this.receiver).c.c.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarC.a((oe50) pawVar.next());
                }
                break;
            case 20:
                tag tagVar = ((hbg) this.receiver).c;
                qjj.W(jiu0.a(tagVar.s()), null, null, new oag(tagVar, objArr3 == true ? 1 : 0, (byte) 2), 3);
                return Unit.f46060a;
            case 21:
                vqg vqgVar = (vqg) this.receiver;
                ((uzg) vqgVar.d).c(vqgVar.b.b, CyberGamesPage.Real.INSTANCE, k1g.OPEN_REGULAR);
                return Unit.f46060a;
            case 22:
                vqg vqgVar2 = (vqg) this.receiver;
                vqgVar2.getClass();
                vqgVar2.G = da10.DEFAULT_ERROR;
                p7m0 p7m0Var5 = vqgVar2.I;
                Object value6 = p7m0Var5.getValue();
                mch mchVar = value6 instanceof mch ? (mch) value6 : null;
                if (mchVar != null) {
                    mch mchVar2 = new mch(mchVar.f21551a, vqgVar2.G.f5727a);
                    do {
                        value5 = p7m0Var5.getValue();
                    } while (!p7m0Var5.m(value5, mchVar2));
                }
                return Unit.f46060a;
            case 23:
                vqg vqgVar3 = (vqg) this.receiver;
                vqgVar3.getClass();
                vqgVar3.G = da10.TIMER_ERROR;
                bby bbyVar = vqgVar3.C;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                vqgVar3.w();
                return Unit.f46060a;
            case 24:
                vqg vqgVar4 = (vqg) this.receiver;
                ((uzg) vqgVar4.d).c(vqgVar4.b.b, CyberGamesPage.Real.INSTANCE, k1g.OPEN_REGULAR);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                p7m0 p7m0Var6 = ((rsh) this.receiver).o;
                p7m0Var6.o(null, Boolean.valueOf(!((Boolean) p7m0Var6.getValue()).booleanValue()));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                rsh rshVar = (rsh) this.receiver;
                rshVar.getClass();
                rshVar.y(da10.TIMER_ERROR);
                rshVar.w();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                rsh rshVar2 = (rsh) this.receiver;
                rshVar2.getClass();
                rshVar2.y(da10.DEFAULT_ERROR);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((vcj) this.receiver).x0();
                return Unit.f46060a;
            default:
                ((dej) this.receiver).x0();
                return Unit.f46060a;
        }
    }
}
