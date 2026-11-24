package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class leo0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xcz k;
    public final /* synthetic */ ueo0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ leo0(xcz xczVar, ueo0 ueo0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xczVar;
        this.l = ueo0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ueo0 ueo0Var = this.l;
        xcz xczVar = this.k;
        switch (b) {
            case 0:
                return new leo0(xczVar, ueo0Var, yjeVar, (byte) 0);
            default:
                return new leo0(xczVar, ueo0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((leo0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ueo0 ueo0Var = this.l;
        xcz xczVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = ueo0Var.c;
                    this.j = true;
                    v0h0 v0h0Var = xcz.y;
                    if (xczVar.f(i, 0, this) == wneVar) {
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
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i2 = ueo0Var.c;
                    this.j = true;
                    v0h0 v0h0Var2 = xcz.y;
                    if (xczVar.f(i2, 0, this) == wneVar2) {
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
