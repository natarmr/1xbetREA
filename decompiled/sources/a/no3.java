package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class no3 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ to3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no3(to3 to3Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = to3Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        to3 to3Var = this.k;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                no3 no3Var = new no3(to3Var, yjeVar, (byte) 0);
                no3Var.j = th;
                return no3Var.invokeSuspend(Unit.f46060a);
            default:
                no3 no3Var2 = new no3(to3Var, yjeVar, (byte) 1);
                no3Var2.j = th;
                return no3Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        to3 to3Var = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                to3Var.i(th);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                to3Var.j(th);
                to3Var.s.g(c56.f3755a);
                to3Var.d();
                break;
        }
        return Unit.f46060a;
    }
}
