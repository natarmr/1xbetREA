package a;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class yf20 extends bnn0 implements xdr {
    public /* synthetic */ double i;
    public /* synthetic */ double j;

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        double dDoubleValue = ((Number) obj).doubleValue();
        double dDoubleValue2 = ((Number) obj2).doubleValue();
        yf20 yf20Var = new yf20(3, (yje) obj3);
        yf20Var.i = dDoubleValue;
        yf20Var.j = dDoubleValue2;
        return yf20Var.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        double d = this.i;
        double d2 = this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        return new Pair(new Double(d), new Double(d2));
    }
}
