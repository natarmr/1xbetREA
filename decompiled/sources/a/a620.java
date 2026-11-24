package a;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.coupon.impl.make_bet.presentation.model.CoefStepInputUiModel;
import org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class a620 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ h620 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a620(h620 h620Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = h620Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        h620 h620Var = this.j;
        switch (b) {
            case 0:
                return new a620(h620Var, yjeVar, (byte) 0);
            case 1:
                return new a620(h620Var, yjeVar, (byte) 1);
            case 2:
                return new a620(h620Var, yjeVar, (byte) 2);
            default:
                return new a620(h620Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((a620) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((a620) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((a620) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a620) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoefStepInputUiModel coefStepInputUiModel;
        Object value2;
        byte b = this.i;
        byte b2 = 0;
        h620 h620Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                BigDecimal scale = new BigDecimal(String.valueOf(h620Var.g.i())).setScale(3, RoundingMode.FLOOR);
                BigDecimal bigDecimal = scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros();
                bigDecimal.getClass();
                p7m0 p7m0Var = h620Var.h0;
                do {
                    value = p7m0Var.getValue();
                    coefStepInputUiModel = (CoefStepInputUiModel) value;
                } while (!p7m0Var.m(value, coefStepInputUiModel.i ? CoefStepInputUiModel.a(coefStepInputUiModel, null, null, false, false, false, false, 255) : CoefStepInputUiModel.a(coefStepInputUiModel, bigDecimal, bigDecimal, false, false, false, false, 252)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ol60 ol60Var = h620Var.p0;
                Unit unit = Unit.f46060a;
                ol60Var.f(unit);
                sac.V(jiu0.a(h620Var), new p520(h620Var, (byte) 1), null, h620Var.c.b, new z520(h620Var, null, b2), 10);
                return unit;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                h620Var.E(cwo0.f5091a);
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = h620Var.i0;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, StepInputUiModel.a((StepInputUiModel) value2, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, true, false, 196607)));
                return Unit.f46060a;
        }
    }
}
