package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nm20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ ln20 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nm20(ln20 ln20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = ln20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ln20 ln20Var = this.j;
        switch (b) {
            case 0:
                return new nm20(ln20Var, yjeVar, (byte) 0);
            default:
                return new nm20(ln20Var, yjeVar, (byte) 1);
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
        return ((nm20) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        sg20 sg20Var;
        qvj0 qvj0Var;
        byte b = this.i;
        ln20 ln20Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                iun iunVar = iun.f15405a;
                q4f q4fVar = q4f.c;
                mc20 mc20Var = new mc20(new ngc0(iunVar, q4fVar, q4fVar.a()));
                int i = ln20.o0;
                ln20Var.G(mc20Var);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = ln20.o0;
                nwo0 nwo0VarC = ln20Var.M.c();
                boolean zD = Intrinsics.d(ln20Var.B.b(), duw.d);
                boolean z = ((sg20) ln20Var.D()).i;
                if (((sg20) ln20Var.D()).h && (nwo0VarC.f24244a || ((!zD && z) || (nwo0VarC.b && z)))) {
                    p7m0 p7m0Var = ln20Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        sg20Var = (sg20) value;
                        qvj0Var = sg20Var.e;
                    } while (!p7m0Var.m(value, sg20.a(sg20Var, null, null, null, qvj0.a(qvj0Var, null, null, jwo0.a(qvj0Var.c, true, true, 0.0d, null, 54), null, 27), null, false, false, false, 0, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS)));
                }
                break;
        }
        return Unit.f46060a;
    }
}
