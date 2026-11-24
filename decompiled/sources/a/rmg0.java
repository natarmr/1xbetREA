package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class rmg0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ umg0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rmg0(umg0 umg0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = umg0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        umg0 umg0Var = this.k;
        switch (b) {
            case 0:
                rmg0 rmg0Var = new rmg0(umg0Var, yjeVar, (byte) 0);
                rmg0Var.j = ((Boolean) obj).booleanValue();
                return rmg0Var;
            default:
                return new rmg0(umg0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((rmg0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((rmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        umg0 umg0Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z) {
                    mne mneVar = umg0Var.d;
                    int i = umg0Var.b.f46908a;
                    if (i >= 0) {
                        mmg0 mmg0Var = new mmg0(umg0Var.c.b(i));
                        sac.V(jiu0.a(umg0Var), new wtf0((byte) 23), null, mneVar.c, new k6d0(umg0Var, mmg0Var, (yje) null, (byte) 24), 10);
                    } else {
                        sac.V(jiu0.a(umg0Var), new wtf0((byte) 23), null, mneVar.c, new k6d0(umg0Var, nmg0.f23771a, (yje) null, (byte) 24), 10);
                    }
                }
                return Unit.f46060a;
            default:
                p7m0 p7m0Var = umg0Var.i;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, pmg0.f27233a));
                    this.j = true;
                    if (qcc.O(2000L, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                do {
                    value2 = p7m0Var.getValue();
                } while (!p7m0Var.m(value2, pmg0.b));
                return Unit.f46060a;
        }
    }
}
