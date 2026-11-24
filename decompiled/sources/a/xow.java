package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class xow extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ yow k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xow(yow yowVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = yowVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        yow yowVar = this.k;
        switch (b) {
            case 0:
                xow xowVar = new xow(yowVar, yjeVar, (byte) 0);
                xowVar.j = ((Boolean) obj).booleanValue();
                return xowVar;
            default:
                return new xow(yowVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((xow) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xow) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        low lowVar;
        Object value2;
        byte b = this.i;
        yow yowVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z && (((low) yowVar.D()).f20410a || ((low) yowVar.D()).b)) {
                    yowVar.M(false);
                } else {
                    int i = yow.v;
                    p7m0 p7m0Var = yowVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        lowVar = (low) value;
                        yowVar.f.getClass();
                    } while (!p7m0Var.m(value, low.a(lowVar, false, lowVar.d.f11654a.isEmpty(), 12)));
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(300L, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i2 = yow.v;
                p7m0 p7m0Var2 = yowVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, low.a((low) value2, true, false, 14)));
                return Unit.f46060a;
        }
    }
}
