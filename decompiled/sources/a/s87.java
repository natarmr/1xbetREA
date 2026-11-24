package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class s87 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ f97 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s87(f97 f97Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = f97Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        f97 f97Var = this.k;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                s87 s87Var = new s87(f97Var, yjeVar, (byte) 0);
                s87Var.j = th;
                return s87Var.invokeSuspend(Unit.f46060a);
            default:
                s87 s87Var2 = new s87(f97Var, yjeVar, (byte) 1);
                s87Var2.j = th;
                return s87Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        f97 f97Var = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                f97Var.F.b(th, new i87((byte) 2));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                f97Var.F.b(th, new g87(f97Var, (byte) 6));
                break;
        }
        return Unit.f46060a;
    }
}
