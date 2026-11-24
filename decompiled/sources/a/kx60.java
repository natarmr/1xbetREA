package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class kx60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ l7m0 j;
    public final /* synthetic */ nyq0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kx60(l7m0 l7m0Var, nyq0 nyq0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = l7m0Var;
        this.k = nyq0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new kx60(this.j, this.k, yjeVar, (byte) 0);
            default:
                return new kx60(this.j, this.k, yjeVar, (byte) 1);
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
        return ((kx60) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        nyq0 nyq0Var = this.k;
        l7m0 l7m0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (l7m0Var.getValue() instanceof tx60) {
                    nyq0Var.getState().c(0.0f);
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (l7m0Var.getValue() instanceof i570) {
                    nyq0Var.getState().c(0.0f);
                }
                break;
        }
        return Unit.f46060a;
    }
}
