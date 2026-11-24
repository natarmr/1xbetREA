package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class opj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ppj0 k;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ opj0(ppj0 ppj0Var, float f, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ppj0Var;
        this.l = f;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        float f = this.l;
        ppj0 ppj0Var = this.k;
        switch (b) {
            case 0:
                return new opj0(ppj0Var, f, yjeVar, (byte) 0);
            case 1:
                return new opj0(ppj0Var, f, yjeVar, (byte) 1);
            default:
                return new opj0(ppj0Var, f, yjeVar, (byte) 2);
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
        return ((opj0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        float f = this.l;
        ppj0 ppj0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    t33 t33Var = ppj0Var.f27378a;
                    Float f2 = new Float(l1e0.c(((Number) t33Var.d()).floatValue() + f, ppj0Var.c.l(), ppj0Var.d.l()));
                    this.j = true;
                    if (t33Var.f(this, f2) == wneVar) {
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
                    Float f3 = new Float(f);
                    this.j = true;
                    if (t33Var2.f(this, f3) == wneVar2) {
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
                    Float f4 = new Float(f);
                    nul0 nul0Var = ppj0Var.e;
                    this.j = true;
                    if (t33.a(t33Var3, f4, nul0Var, null, null, this, 12) == wneVar3) {
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
