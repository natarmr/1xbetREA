package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class pv1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ uv1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pv1(uv1 uv1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = uv1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        uv1 uv1Var = this.j;
        switch (b) {
            case 0:
                return new pv1(uv1Var, yjeVar, (byte) 0);
            default:
                return new pv1(uv1Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((pv1) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((pv1) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        uv1 uv1Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = uv1.X;
                uv1Var.R(true);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = uv1.X;
                uv1Var.R(true);
                break;
        }
        return Unit.f46060a;
    }
}
