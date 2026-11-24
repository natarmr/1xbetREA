package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class sn2 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ yn2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sn2(yn2 yn2Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = yn2Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        yn2 yn2Var = this.k;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                sn2 sn2Var = new sn2(yn2Var, yjeVar, (byte) 0);
                sn2Var.j = th;
                return sn2Var.invokeSuspend(Unit.f46060a);
            default:
                sn2 sn2Var2 = new sn2(yn2Var, yjeVar, (byte) 1);
                sn2Var2.j = th;
                return sn2Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        yn2 yn2Var = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = yn2.g0;
                yn2Var.N(th);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = yn2.g0;
                yn2Var.N(th);
                break;
        }
        return Unit.f46060a;
    }
}
