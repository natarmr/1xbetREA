package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class y260 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Throwable l;
    public final /* synthetic */ v360 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y260(v360 v360Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = v360Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        v360 v360Var = this.m;
        kmq kmqVar = (kmq) obj;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                y260 y260Var = new y260(v360Var, yjeVar, (byte) 0);
                y260Var.k = kmqVar;
                y260Var.l = th;
                return y260Var.invokeSuspend(Unit.f46060a);
            default:
                y260 y260Var2 = new y260(v360Var, yjeVar, (byte) 1);
                y260Var2.k = kmqVar;
                y260Var2.l = th;
                return y260Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        v360 v360Var = this.m;
        switch (b) {
            case 0:
                kmq kmqVar = this.k;
                Throwable th = this.l;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = v360.x0;
                    v360Var.b0(th);
                    pz50 pz50Var = new pz50(th);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar.a(pz50Var, this) == wneVar) {
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
                Throwable th2 = this.l;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i2 = v360.x0;
                    v360Var.b0(th2);
                    pz50 pz50Var2 = new pz50(th2);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar2.a(pz50Var2, this) == wneVar2) {
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
