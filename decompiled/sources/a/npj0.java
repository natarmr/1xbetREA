package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class npj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ppj0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ npj0(ppj0 ppj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ppj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ppj0 ppj0Var = this.k;
        switch (b) {
            case 0:
                return new npj0(ppj0Var, yjeVar, (byte) 0);
            case 1:
                return new npj0(ppj0Var, yjeVar, (byte) 1);
            default:
                return new npj0(ppj0Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((npj0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ppj0 ppj0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    t33 t33Var = ppj0Var.f27378a;
                    Float f = new Float(ppj0Var.d.l());
                    nul0 nul0Var = ppj0Var.e;
                    this.j = true;
                    if (t33.a(t33Var, f, nul0Var, null, null, this, 12) == wneVar) {
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
                    t33 t33Var2 = ppj0Var.f27378a;
                    Float f2 = new Float(ppj0Var.c.l());
                    nul0 nul0Var2 = ppj0Var.e;
                    this.j = true;
                    if (t33.a(t33Var2, f2, nul0Var2, null, null, this, 12) == wneVar2) {
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
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    t33 t33Var3 = ppj0Var.f27378a;
                    this.j = true;
                    if (t33Var3.g(this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
