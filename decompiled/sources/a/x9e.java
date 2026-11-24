package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class x9e extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public final /* synthetic */ fae j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x9e(fae faeVar, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.j = faeVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        fae faeVar = this.j;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                return new x9e(faeVar, yjeVar, (byte) 0).invokeSuspend(Unit.f46060a);
            default:
                return new x9e(faeVar, yjeVar, (byte) 1).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        fae faeVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                c4m0 c4m0Var = faeVar.Q;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = faeVar.M;
                p7m0Var.getClass();
                p7m0Var.o(null, r9e.f30075a);
                break;
        }
        return Unit.f46060a;
    }
}
