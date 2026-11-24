package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class haw extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ naw j;
    public final /* synthetic */ ql5 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ haw(naw nawVar, ql5 ql5Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = nawVar;
        this.k = ql5Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ql5 ql5Var = this.k;
        naw nawVar = this.j;
        switch (b) {
            case 0:
                return new haw(nawVar, ql5Var, yjeVar, (byte) 0);
            default:
                return new haw(nawVar, ql5Var, yjeVar, (byte) 1);
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
        return ((haw) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        ql5 ql5Var = this.k;
        naw nawVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                List list = naw.d1;
                nawVar.x(ql5Var);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                List list2 = naw.d1;
                nawVar.x(ql5Var);
                p7m0 p7m0Var = nawVar.W0;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, l9h0.a((l9h0) value, false, false, false, null, false, false, false, false, false, null, null, false, false, 32766)));
                break;
        }
        return Unit.f46060a;
    }
}
