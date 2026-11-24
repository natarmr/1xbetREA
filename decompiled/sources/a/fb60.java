package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class fb60 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ pzu j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb60(pzu pzuVar, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.j = pzuVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        pzu pzuVar = this.j;
        switch (b) {
            case 0:
                return new fb60(pzuVar, yjeVar, (byte) 0);
            default:
                return new fb60(pzuVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((fb60) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pzu pzuVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                break;
        }
        return Boolean.valueOf(pzuVar.x());
    }
}
