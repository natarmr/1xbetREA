package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class jta extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xcz k;
    public final /* synthetic */ cgk0 l;
    public final /* synthetic */ cgk0 m;
    public final /* synthetic */ t33 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jta(xcz xczVar, cgk0 cgk0Var, cgk0 cgk0Var2, t33 t33Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xczVar;
        this.l = cgk0Var;
        this.m = cgk0Var2;
        this.n = t33Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new jta(this.k, this.l, this.m, this.n, yjeVar, (byte) 0);
            default:
                return new jta(this.k, this.l, this.m, this.n, yjeVar, (byte) 1);
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
        return ((jta) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        t33 t33Var = this.n;
        cgk0 cgk0Var = this.m;
        cgk0 cgk0Var2 = this.l;
        xcz xczVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new eb(xczVar, (byte) 13));
                    ita itaVar = new ita(cgk0Var2, cgk0Var, t33Var, (byte) 0);
                    this.j = true;
                    if (vsg0VarV.c(itaVar, this) == wneVar) {
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
                    vsg0 vsg0VarV2 = ydx.V(null, new eb(xczVar, (byte) 14));
                    ita itaVar2 = new ita(cgk0Var2, cgk0Var, t33Var, (byte) 1);
                    this.j = true;
                    if (vsg0VarV2.c(itaVar2, this) == wneVar2) {
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
