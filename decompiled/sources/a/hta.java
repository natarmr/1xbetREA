package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class hta extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xcz k;
    public final /* synthetic */ cgk0 l;
    public final /* synthetic */ cgk0 m;
    public final /* synthetic */ cgk0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hta(xcz xczVar, cgk0 cgk0Var, cgk0 cgk0Var2, cgk0 cgk0Var3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xczVar;
        this.l = cgk0Var;
        this.m = cgk0Var2;
        this.n = cgk0Var3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new hta(this.k, this.l, this.m, this.n, yjeVar, (byte) 0);
            default:
                return new hta(this.k, this.l, this.m, this.n, yjeVar, (byte) 1);
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
        return ((hta) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    xcz xczVar = this.k;
                    vsg0 vsg0VarV = ydx.V(null, new eb(xczVar, (byte) 11));
                    gta gtaVar = new gta(this.l, this.m, xczVar, this.n, (byte) 0);
                    this.j = true;
                    if (vsg0VarV.c(gtaVar, this) == wneVar) {
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
                    xcz xczVar2 = this.k;
                    vsg0 vsg0VarV2 = ydx.V(null, new eb(xczVar2, (byte) 12));
                    gta gtaVar2 = new gta(this.l, this.m, xczVar2, this.n, (byte) 1);
                    this.j = true;
                    if (vsg0VarV2.c(gtaVar2, this) == wneVar2) {
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
