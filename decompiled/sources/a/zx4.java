package a;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.make_bet.impl.presentation.model.CoefStepInputUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class zx4 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ fy4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zx4(fy4 fy4Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = fy4Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        fy4 fy4Var = this.k;
        switch (b) {
            case 0:
                return new zx4(fy4Var, yjeVar, (byte) 0);
            default:
                return new zx4(fy4Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((zx4) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoefStepInputUiModel coefStepInputUiModel;
        byte b = this.i;
        fy4 fy4Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    f3c f3cVar = fy4Var.j;
                    this.j = true;
                    obj = f3cVar.a(this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                BigDecimal scale = new BigDecimal(String.valueOf(((m97) obj).l)).setScale(3, RoundingMode.FLOOR);
                BigDecimal bigDecimal = scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros();
                bigDecimal.getClass();
                p7m0 p7m0Var = fy4Var.b0;
                do {
                    value = p7m0Var.getValue();
                    coefStepInputUiModel = (CoefStepInputUiModel) value;
                } while (!p7m0Var.m(value, coefStepInputUiModel.i ? CoefStepInputUiModel.a(coefStepInputUiModel, null, null, false, false, false, false, 255) : CoefStepInputUiModel.a(coefStepInputUiModel, bigDecimal, bigDecimal, false, false, false, false, 252)));
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    sd60 sd60Var = fy4Var.M;
                    this.j = true;
                    if (sd60Var.h(this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
