package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class is80 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ nyq0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ is80(nyq0 nyq0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = nyq0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new is80(this.j, yjeVar, (byte) 0);
            default:
                return new is80(this.j, yjeVar, (byte) 1);
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
        return ((is80) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        nyq0 nyq0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                float fL = nyq0Var.getState().c.l();
                float f = nyq0Var.getState().f26070a;
                if (fL < 0.0f && fL != f) {
                    nyq0Var.getState().c(f);
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                float fL2 = nyq0Var.getState().c.l();
                float f2 = nyq0Var.getState().f26070a;
                if (fL2 < 0.0f && fL2 != f2) {
                    nyq0Var.getState().c(f2);
                }
                break;
        }
        return Unit.f46060a;
    }
}
