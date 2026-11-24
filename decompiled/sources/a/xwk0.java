package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class xwk0 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Throwable k;
    public final /* synthetic */ yhi l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xwk0(yhi yhiVar, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.l = yhiVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (this.i) {
            case 0:
                xwk0 xwk0Var = new xwk0(this.l, yjeVar, (byte) 0);
                xwk0Var.k = th;
                return xwk0Var.invokeSuspend(Unit.f46060a);
            case 1:
                xwk0 xwk0Var2 = new xwk0(this.l, yjeVar, (byte) 1);
                xwk0Var2.k = th;
                return xwk0Var2.invokeSuspend(Unit.f46060a);
            default:
                xwk0 xwk0Var3 = new xwk0(this.l, yjeVar, (byte) 2);
                xwk0Var3.k = th;
                return xwk0Var3.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        yhi yhiVar = this.l;
        switch (b) {
            case 0:
                Throwable th = this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    zpx zpxVar = (zpx) yhiVar.j;
                    bqk0 bqk0Var = new bqk0(th);
                    n0w n0wVar = (n0w) yhiVar.v;
                    this.k = null;
                    this.j = true;
                    if (zpxVar.a(bqk0Var, n0wVar, this) == wneVar) {
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
            case 1:
                Throwable th2 = this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    aqx aqxVar = (aqx) yhiVar.h;
                    bqk0 bqk0Var2 = new bqk0(th2);
                    this.k = null;
                    this.j = true;
                    if (aqxVar.a(bqk0Var2, this) == wneVar2) {
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
            default:
                Throwable th3 = this.k;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    bqx bqxVar = (bqx) yhiVar.i;
                    bqk0 bqk0Var3 = new bqk0(th3);
                    this.k = null;
                    this.j = true;
                    if (bqxVar.a(bqk0Var3, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
