package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class uxu extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ ywq0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uxu(byte b, yje yjeVar, ywq0 ywq0Var) {
        super(1, yjeVar);
        this.i = b;
        this.j = ywq0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        switch (this.i) {
            case 0:
                return new uxu((byte) 0, yjeVar, this.j);
            default:
                return new uxu((byte) 1, yjeVar, this.j);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((uxu) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ywq0 ywq0Var = this.j;
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
        return Boolean.valueOf(ywq0Var.d());
    }
}
