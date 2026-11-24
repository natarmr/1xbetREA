package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class bv60 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ hv60 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bv60(hv60 hv60Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = hv60Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        hv60 hv60Var = this.k;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                bv60 bv60Var = new bv60(hv60Var, yjeVar, (byte) 0);
                bv60Var.j = th;
                return bv60Var.invokeSuspend(Unit.f46060a);
            default:
                bv60 bv60Var2 = new bv60(hv60Var, yjeVar, (byte) 1);
                bv60Var2.j = th;
                return bv60Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        hv60 hv60Var = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = hv60.i0;
                hv60Var.N(th);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = hv60.i0;
                hv60Var.N(th);
                break;
        }
        return Unit.f46060a;
    }
}
