package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class oys extends bnn0 implements xdr {
    public /* synthetic */ boolean i;

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((Boolean) obj2).getClass();
        oys oysVar = new oys(3, (yje) obj3);
        oysVar.i = zBooleanValue;
        return oysVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z = this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        return Boolean.valueOf(z);
    }
}
