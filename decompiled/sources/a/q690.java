package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class q690 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ s690 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q690(s690 s690Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = s690Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        s690 s690Var = this.k;
        switch (b) {
            case 0:
                q690 q690Var = new q690(s690Var, yjeVar, (byte) 0);
                q690Var.j = ((Boolean) obj).booleanValue();
                return q690Var;
            default:
                return new q690(s690Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((q690) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((q690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        s690 s690Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                s690Var.u = z;
                p7m0 p7m0Var = s690Var.v;
                g690 g690Var = new g690(s690Var.A, z);
                p7m0Var.getClass();
                p7m0Var.o(null, g690Var);
                if (z) {
                    s690Var.x(s690Var.b);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    hse0 hse0Var = s690Var.c;
                    this.j = true;
                    if (hse0.a(hse0Var, null, true, this, 5) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                s690Var.x(s690Var.b);
                return Unit.f46060a;
        }
    }
}
