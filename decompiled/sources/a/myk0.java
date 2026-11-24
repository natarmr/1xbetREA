package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class myk0 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Throwable k;
    public final /* synthetic */ tyk0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ myk0(tyk0 tyk0Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.l = tyk0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        tyk0 tyk0Var = this.l;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                myk0 myk0Var = new myk0(tyk0Var, yjeVar, (byte) 0);
                myk0Var.k = th;
                return myk0Var.invokeSuspend(Unit.f46060a);
            default:
                myk0 myk0Var2 = new myk0(tyk0Var, yjeVar, (byte) 1);
                myk0Var2.k = th;
                return myk0Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        tyk0 tyk0Var = this.l;
        switch (b) {
            case 0:
                Throwable th = this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    xcc xccVar = tyk0Var.g;
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
                    xcc xccVar2 = tyk0Var.g;
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
