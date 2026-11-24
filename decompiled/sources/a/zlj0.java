package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class zlj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ bmj0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zlj0(bmj0 bmj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bmj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bmj0 bmj0Var = this.k;
        switch (b) {
            case 0:
                return new zlj0(bmj0Var, yjeVar, (byte) 0);
            default:
                zlj0 zlj0Var = new zlj0(bmj0Var, yjeVar, (byte) 1);
                zlj0Var.j = ((Boolean) obj).booleanValue();
                return zlj0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zlj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((zlj0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        byte b = this.i;
        bmj0 bmj0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    tpt tptVar = bmj0Var.p;
                    this.j = true;
                    obj = tptVar.a(this);
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
                int i = bmj0.A;
                p7m0 p7m0Var = bmj0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, vlj0.a((vlj0) value, 0, null, list, false, false, 43)));
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!bmj0Var.z && z2) {
                    bmj0Var.M();
                } else if (!z2 && ((vlj0) bmj0Var.D()).c.isEmpty()) {
                    v3c.N(bmj0Var.y);
                    p7m0 p7m0Var2 = bmj0Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        bmj0Var.f.getClass();
                    } while (!p7m0Var2.m(value2, vlj0.a((vlj0) value2, 0, null, null, false, true, 47)));
                }
                bmj0Var.z = z2;
                return Unit.f46060a;
        }
    }
}
