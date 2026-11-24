package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class by60 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ dy60 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ by60(dy60 dy60Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = dy60Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        dy60 dy60Var = this.k;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                by60 by60Var = new by60(dy60Var, yjeVar, (byte) 0);
                by60Var.j = th;
                return by60Var.invokeSuspend(Unit.f46060a);
            default:
                by60 by60Var2 = new by60(dy60Var, yjeVar, (byte) 1);
                by60Var2.j = th;
                return by60Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        dy60 dy60Var = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = dy60.S;
                dy60Var.M(th);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = dy60.S;
                dy60Var.M(th);
                break;
        }
        return Unit.f46060a;
    }
}
