package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class nsr0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ psr0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nsr0(psr0 psr0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = psr0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        psr0 psr0Var = this.k;
        switch (b) {
            case 0:
                return new nsr0(psr0Var, yjeVar, (byte) 0);
            case 1:
                return new nsr0(psr0Var, yjeVar, (byte) 1);
            default:
                nsr0 nsr0Var = new nsr0(psr0Var, yjeVar, (byte) 2);
                nsr0Var.j = ((Boolean) obj).booleanValue();
                return nsr0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((nsr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((nsr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((nsr0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        psr0 psr0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    xex xexVar = psr0Var.F;
                    this.j = true;
                    obj = xexVar.H(this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    int i = psr0.K;
                    psr0Var.G(oqr0.f25703a);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    lhf0 lhf0Var = psr0Var.w;
                    this.j = true;
                    if (lhf0Var.x(this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                v3c.N(psr0Var.J);
                return Unit.f46060a;
            default:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z3 && (((tqr0) psr0Var.D()).b instanceof c3y)) {
                    psr0Var.O(false);
                }
                return Unit.f46060a;
        }
    }
}
