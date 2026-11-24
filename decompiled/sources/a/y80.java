package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class y80 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Throwable k;
    public final /* synthetic */ u90 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y80(u90 u90Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.l = u90Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        u90 u90Var = this.l;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                y80 y80Var = new y80(u90Var, yjeVar, (byte) 0);
                y80Var.k = th;
                return y80Var.invokeSuspend(Unit.f46060a);
            default:
                y80 y80Var2 = new y80(u90Var, yjeVar, (byte) 1);
                y80Var2.k = th;
                return y80Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        u90 u90Var = this.l;
        switch (b) {
            case 0:
                Throwable th = this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    xcc xccVar = u90Var.g;
                    this.k = null;
                    this.j = true;
                    if (xccVar.a(th, this) == wneVar) {
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
                Throwable th2 = this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    xcc xccVar2 = u90Var.g;
                    this.k = null;
                    this.j = true;
                    if (xccVar2.a(th2, this) == wneVar2) {
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
