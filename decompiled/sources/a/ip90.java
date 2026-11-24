package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class ip90 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ kp90 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ip90(kp90 kp90Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = kp90Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        kp90 kp90Var = this.k;
        switch (b) {
            case 0:
                return new ip90(kp90Var, yjeVar, (byte) 0);
            default:
                return new ip90(kp90Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((ip90) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        kp90 kp90Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(200L, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = kp90.z;
                p7m0 p7m0Var = kp90Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    kp90Var.f.getClass();
                } while (!p7m0Var.m(value, br90.a((br90) value, null, null, null, true, 31)));
                kp90Var.o.e("KEY_CONTENT_VISIBILITY_STATUS", Boolean.TRUE);
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i2 = kp90.z;
                    p7m0 p7m0Var2 = kp90Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        kp90Var.f.getClass();
                    } while (!p7m0Var2.m(value2, br90.a((br90) value2, null, null, null, false, 31)));
                    kp90Var.o.e("KEY_CONTENT_VISIBILITY_STATUS", Boolean.FALSE);
                    this.j = true;
                    if (qcc.O(200L, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                kp90Var.v.d(new gp90(kp90Var, (byte) 2));
                return Unit.f46060a;
        }
    }
}
