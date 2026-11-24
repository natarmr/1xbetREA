package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class l92 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ n92 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l92(n92 n92Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = n92Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        n92 n92Var = this.k;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                l92 l92Var = new l92(n92Var, yjeVar, (byte) 0);
                l92Var.j = th;
                return l92Var.invokeSuspend(Unit.f46060a);
            case 1:
                l92 l92Var2 = new l92(n92Var, yjeVar, (byte) 1);
                l92Var2.j = th;
                return l92Var2.invokeSuspend(Unit.f46060a);
            default:
                l92 l92Var3 = new l92(n92Var, yjeVar, (byte) 2);
                l92Var3.j = th;
                return l92Var3.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        n92 n92Var = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (th == null && (((d92) n92Var.D()).f instanceof wi50)) {
                    p7m0 p7m0Var = n92Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, d92.a((d92) value, null, null, null, vi50.f37461a, null, 0L, null, 2015)));
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                n92Var.J.b(th, new xg1((byte) 28));
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                n92Var.J.b(th, new xg1((byte) 29));
                p7m0 p7m0Var2 = n92Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, d92.a((d92) value2, null, null, null, null, null, 0L, null, 1791)));
                break;
        }
        return Unit.f46060a;
    }
}
