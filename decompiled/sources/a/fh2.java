package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class fh2 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ hh2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh2(hh2 hh2Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = hh2Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        hh2 hh2Var = this.k;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                fh2 fh2Var = new fh2(hh2Var, yjeVar, (byte) 0);
                fh2Var.j = th;
                return fh2Var.invokeSuspend(Unit.f46060a);
            default:
                fh2 fh2Var2 = new fh2(hh2Var, yjeVar, (byte) 1);
                fh2Var2.j = th;
                return fh2Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        hh2 hh2Var = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = hh2.O;
                hh2Var.S(th);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = hh2.O;
                hh2Var.S(th);
                break;
        }
        return Unit.f46060a;
    }
}
