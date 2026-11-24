package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class qtq0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ xtq0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qtq0(xtq0 xtq0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = xtq0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xtq0 xtq0Var = this.j;
        switch (b) {
            case 0:
                return new qtq0(xtq0Var, yjeVar, (byte) 0);
            default:
                return new qtq0(xtq0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qtq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((qtq0) create((ab50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        xtq0 xtq0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                xtq0Var.i.k(pzb.C(new t6q0((byte) 21)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                xtq0Var.C0.f(dtq0.f6667a);
                break;
        }
        return Unit.f46060a;
    }
}
