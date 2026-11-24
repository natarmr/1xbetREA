package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class xpc0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ aqc0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xpc0(aqc0 aqc0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = aqc0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        aqc0 aqc0Var = this.k;
        switch (b) {
            case 0:
                return new xpc0(aqc0Var, yjeVar, (byte) 0);
            default:
                return new xpc0(aqc0Var, yjeVar, (byte) 1);
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
        return ((xpc0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        aqc0 aqc0Var = this.k;
        switch (b) {
            case 0:
                ocj ocjVar = aqc0Var.i;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = aqc0.A;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, wpc0.a((wpc0) value, true, false, false, null, 25)));
                    gpu gpuVar = aqc0Var.q;
                    long j = aqc0Var.o;
                    this.j = true;
                    obj = gpuVar.b(j, this);
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
                List list = (List) obj;
                int i2 = aqc0.A;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                while (true) {
                    Object value2 = p7m0Var2.getValue();
                    value2.getClass();
                    List list2 = list;
                    if (p7m0Var2.m(value2, wpc0.a((wpc0) value2, false, false, false, list, 9))) {
                        return Unit.f46060a;
                    }
                    list = list2;
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    qnq qnqVarU = dtb.U(new wk30(aqc0Var.p.b(), (byte) 24), 1);
                    hmc0 hmc0Var = new hmc0(aqc0Var, (byte) 7);
                    this.j = true;
                    if (qnqVarU.c(hmc0Var, this) == wneVar2) {
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
