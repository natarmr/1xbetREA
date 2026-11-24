package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class p2b0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Function1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2b0(Function1 function1, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new p2b0(this.j, yjeVar, (byte) 0);
            default:
                return new p2b0(this.j, yjeVar, (byte) 1);
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
        return ((p2b0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Function1 function1 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                function1.invoke(q1b0.f27945a);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                function1.invoke(r1b0.f29671a);
                break;
        }
        return Unit.f46060a;
    }
}
