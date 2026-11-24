package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class lip extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ e2d j;
    public final /* synthetic */ float k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lip(e2d e2dVar, float f, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = e2dVar;
        this.k = f;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new lip(this.j, this.k, yjeVar, (byte) 0);
            default:
                return new lip(this.j, this.k, yjeVar, (byte) 1);
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
        return ((lip) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        float f = this.k;
        e2d e2dVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                oyq0 oyq0Var = e2dVar.f7077a;
                if (oyq0Var.f26070a != (-f)) {
                    oyq0Var.f26070a = -f;
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                oyq0 oyq0Var2 = e2dVar.f7077a;
                if (oyq0Var2.f26070a != (-f)) {
                    oyq0Var2.f26070a = -f;
                }
                break;
        }
        return Unit.f46060a;
    }
}
