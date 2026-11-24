package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class vla0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ cma0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vla0(cma0 cma0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = cma0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        cma0 cma0Var = this.k;
        switch (b) {
            case 0:
                return new vla0(cma0Var, yjeVar, (byte) 0);
            case 1:
                return new vla0(cma0Var, yjeVar, (byte) 1);
            default:
                vla0 vla0Var = new vla0(cma0Var, yjeVar, (byte) 2);
                vla0Var.j = ((Boolean) obj).booleanValue();
                return vla0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((vla0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((vla0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((vla0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        cma0 cma0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    jwu jwuVar = cma0Var.B;
                    String str = cma0Var.o;
                    this.j = true;
                    if (jwuVar.b(str, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    jwu jwuVar2 = cma0Var.B;
                    String str2 = cma0Var.o;
                    this.j = true;
                    if (jwuVar2.b(str2, this) == wneVar2) {
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
            default:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                boolean z4 = !z3 && ((lla0) cma0Var.D()).k;
                boolean z5 = z3 && ((lla0) cma0Var.D()).l;
                if (z4 || z5) {
                    int i = cma0.M;
                    cma0Var.N();
                }
                return Unit.f46060a;
        }
    }
}
