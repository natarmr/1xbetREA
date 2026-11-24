package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class me0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ oe0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ me0(oe0 oe0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = oe0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        oe0 oe0Var = this.k;
        switch (b) {
            case 0:
                me0 me0Var = new me0(oe0Var, yjeVar, (byte) 0);
                me0Var.j = obj;
                return me0Var;
            default:
                me0 me0Var2 = new me0(oe0Var, yjeVar, (byte) 1);
                me0Var2.j = obj;
                return me0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((me0) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((me0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        oe0 oe0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                String str = (String) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = oe0Var.H;
                do {
                    value = p7m0Var.getValue();
                    if (!Intrinsics.d((String) value, str)) {
                        oe0Var.w.h(wgh0.AGGREGATOR_BRANDS_GLOBAL_SEARCH, str, 3);
                        oe0Var.x.D(3, "providers_global_search", str);
                    }
                } while (!p7m0Var.m(value, str));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                oe0Var.p.b((Throwable) obj2, new g20((byte) 10));
                break;
        }
        return Unit.f46060a;
    }
}
