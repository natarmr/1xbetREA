package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class v82 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ qno0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v82(yje yjeVar, qno0 qno0Var, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = qno0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (this.i) {
            case 0:
                v82 v82Var = new v82(yjeVar, this.m, (byte) 0);
                v82Var.k = kmqVar;
                v82Var.l = obj2;
                return v82Var.invokeSuspend(Unit.f46060a);
            default:
                v82 v82Var2 = new v82(yjeVar, this.m, (byte) 1);
                v82Var2.k = kmqVar;
                v82Var2.l = obj2;
                return v82Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        qno0 qno0Var = this.m;
        switch (b) {
            case 0:
                kmq kmqVar = this.k;
                Object obj2 = this.l;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    p7m0 p7m0Var = qno0Var.a(((Number) obj2).intValue()).f7529a;
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar, p7m0Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                kmq kmqVar2 = this.k;
                Object obj3 = this.l;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    p7m0 p7m0Var2 = qno0Var.a(((Number) obj3).intValue()).f7529a;
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar2, p7m0Var2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
