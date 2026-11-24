package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class xbp extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ ccp k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xbp(ccp ccpVar, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = ccpVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        ccp ccpVar = this.k;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                xbp xbpVar = new xbp(ccpVar, yjeVar, (byte) 0);
                xbpVar.j = th;
                return xbpVar.invokeSuspend(Unit.f46060a);
            default:
                xbp xbpVar2 = new xbp(ccpVar, yjeVar, (byte) 1);
                xbpVar2.j = th;
                return xbpVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ccp ccpVar = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = ccp.u0;
                ccpVar.T(th);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = ccp.u0;
                ccpVar.T(th);
                break;
        }
        return Unit.f46060a;
    }
}
