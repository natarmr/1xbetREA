package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ck2 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ fk2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ck2(fk2 fk2Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = fk2Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        fk2 fk2Var = this.k;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                ck2 ck2Var = new ck2(fk2Var, yjeVar, (byte) 0);
                ck2Var.j = th;
                return ck2Var.invokeSuspend(Unit.f46060a);
            default:
                ck2 ck2Var2 = new ck2(fk2Var, yjeVar, (byte) 1);
                ck2Var2.j = th;
                return ck2Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        fk2 fk2Var = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = fk2.K;
                fk2Var.O(th);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = fk2.K;
                fk2Var.O(th);
                break;
        }
        return Unit.f46060a;
    }
}
