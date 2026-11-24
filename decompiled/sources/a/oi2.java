package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class oi2 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ qi2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi2(qi2 qi2Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = qi2Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        qi2 qi2Var = this.k;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                oi2 oi2Var = new oi2(qi2Var, yjeVar, (byte) 0);
                oi2Var.j = th;
                return oi2Var.invokeSuspend(Unit.f46060a);
            default:
                oi2 oi2Var2 = new oi2(qi2Var, yjeVar, (byte) 1);
                oi2Var2.j = th;
                return oi2Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        qi2 qi2Var = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = qi2.D;
                qi2Var.N(th);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = qi2.D;
                qi2Var.N(th);
                break;
        }
        return Unit.f46060a;
    }
}
