package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class noe extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ rai0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ noe(rai0 rai0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = rai0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rai0 rai0Var = this.j;
        switch (b) {
            case 0:
                return new noe(rai0Var, yjeVar, (byte) 0);
            default:
                return new noe(rai0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((noe) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((noe) create(obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        rai0 rai0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                rai0Var.invoke(Boolean.TRUE);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                rai0Var.invoke(Boolean.FALSE);
                break;
        }
        return Unit.f46060a;
    }
}
