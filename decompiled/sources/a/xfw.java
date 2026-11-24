package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class xfw extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xk80 k;
    public final /* synthetic */ pa00 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xfw(xk80 xk80Var, pa00 pa00Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xk80Var;
        this.l = pa00Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pa00 pa00Var = this.l;
        xk80 xk80Var = this.k;
        switch (b) {
            case 0:
                return new xfw(xk80Var, pa00Var, yjeVar, (byte) 0);
            default:
                return new xfw(xk80Var, pa00Var, yjeVar, (byte) 1);
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
        return ((xfw) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pa00 pa00Var = this.l;
        xk80 xk80Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int iK = xk80Var.k();
                    int i = pa00Var.e;
                    if (iK != i) {
                        this.j = true;
                        if (xk80.g(xk80Var, i, null, this, 6) == wneVar) {
                            return wneVar;
                        }
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
                    int iK2 = xk80Var.k();
                    int i2 = pa00Var.e;
                    if (iK2 != i2) {
                        this.j = true;
                        if (xk80.g(xk80Var, i2, null, this, 6) == wneVar2) {
                            return wneVar2;
                        }
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
