package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ztv0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ buv0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ztv0(buv0 buv0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = buv0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        buv0 buv0Var = this.k;
        switch (b) {
            case 0:
                return new ztv0(buv0Var, yjeVar, (byte) 0);
            default:
                return new ztv0(buv0Var, yjeVar, (byte) 1);
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
        return ((ztv0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        buv0 buv0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new utv0(buv0Var, (byte) 1));
                    ytv0 ytv0Var = new ytv0(buv0Var, (byte) 0);
                    this.j = true;
                    if (vsg0VarV.c(ytv0Var, this) == wneVar) {
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
                    vsg0 vsg0VarV2 = ydx.V(null, new utv0(buv0Var, (byte) 2));
                    ytv0 ytv0Var2 = new ytv0(buv0Var, (byte) 1);
                    this.j = true;
                    if (vsg0VarV2.c(ytv0Var2, this) == wneVar2) {
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
