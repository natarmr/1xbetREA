package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class xhj extends bnn0 implements ydr {
    public /* synthetic */ Throwable i;

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        return Boolean.valueOf(th instanceof hr30);
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        xhj xhjVar = new xhj(4, (yje) obj4);
        xhjVar.i = (Throwable) obj2;
        return xhjVar.invokeSuspend(Unit.f46060a);
    }
}
