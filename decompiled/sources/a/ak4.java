package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class ak4 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ hk4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak4(hk4 hk4Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hk4Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hk4 hk4Var = this.k;
        switch (b) {
            case 0:
                ak4 ak4Var = new ak4(hk4Var, yjeVar, (byte) 0);
                ak4Var.j = ((Boolean) obj).booleanValue();
                return ak4Var;
            default:
                return new ak4(hk4Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ak4) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ak4) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        hk4 hk4Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (((tj4) hk4Var.D()).g.c.length() == 0 && z) {
                    hk4Var.Q();
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i = hk4.b0;
                    p7m0 p7m0Var = hk4Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, tj4.a((tj4) value, false, false, true, null, null, null, 0, false, null, null, false, 65527)));
                    x860 x860Var = hk4Var.V;
                    this.j = true;
                    if (x860Var.b(this) == wneVar2) {
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
