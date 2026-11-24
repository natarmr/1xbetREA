package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class rmo0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ umo0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rmo0(umo0 umo0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = umo0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        umo0 umo0Var = this.k;
        switch (b) {
            case 0:
                rmo0 rmo0Var = new rmo0(umo0Var, yjeVar, (byte) 0);
                rmo0Var.j = ((Boolean) obj).booleanValue();
                return rmo0Var;
            default:
                return new rmo0(umo0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((rmo0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((rmo0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        umo0 umo0Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z) {
                    int i = umo0.I;
                    umo0Var.M();
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                p7m0 p7m0Var = ((q2m0) umo0Var.E.b).c.b;
                lpn0 lpn0Var = new lpn0(umo0Var, (byte) 20);
                this.j = true;
                p7m0Var.c(lpn0Var, this);
                return wneVar2;
        }
    }
}
