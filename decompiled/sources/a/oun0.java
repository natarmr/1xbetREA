package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class oun0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ pun0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oun0(pun0 pun0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = pun0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pun0 pun0Var = this.j;
        switch (b) {
            case 0:
                return new oun0(pun0Var, yjeVar, (byte) 0);
            case 1:
                return new oun0(pun0Var, yjeVar, (byte) 1);
            case 2:
                return new oun0(pun0Var, yjeVar, (byte) 2);
            default:
                return new oun0(pun0Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((oun0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((oun0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((oun0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((oun0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pun0 pun0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                sac.V(jiu0.a(pun0Var), new dun0(pun0Var, (byte) 0), null, pun0Var.d.f22085a, new wk20(false, pun0Var, (yje) null), 10);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                pun0Var.w.f(kun0.f18919a);
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                pun0Var.w.f(mun0.f22421a);
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                vzg0 vzg0Var = pun0Var.i;
                Boolean bool = (Boolean) vzg0Var.a("SUM_STEPPER_FIRST_FOCUS_KEY");
                if (!(bool != null ? bool.booleanValue() : false)) {
                    pun0Var.w.f(lun0.f20681a);
                    vzg0Var.e("SUM_STEPPER_FIRST_FOCUS_KEY", Boolean.TRUE);
                }
                break;
        }
        return Unit.f46060a;
    }
}
