package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class h69 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ k69 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h69(k69 k69Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = k69Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        k69 k69Var = this.k;
        switch (b) {
            case 0:
                h69 h69Var = new h69(k69Var, yjeVar, (byte) 0);
                h69Var.j = ((Boolean) obj).booleanValue();
                return h69Var;
            default:
                return new h69(k69Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.i;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        yje yjeVar = (yje) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((h69) create(bool, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        z59 z59Var;
        byte b = this.i;
        k69 k69Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                oyg0 oyg0Var = k69Var.f;
                ocj ocjVar = k69Var.i;
                if (z) {
                    int i = k69.K;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        z59Var = (z59) value2;
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, z59.a(z59Var, null, !z59Var.k, false, false, false, null, false, true, null, null, 518111)));
                } else {
                    int i2 = k69.K;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value, z59.a((z59) value, null, false, false, false, false, null, false, false, null, null, 520191)));
                    k69Var.S();
                    k69Var.R();
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    int i3 = k69.K;
                    if (k69Var.N(this) == wneVar2) {
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
