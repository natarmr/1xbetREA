package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class baw extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ naw k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ baw(naw nawVar, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = nawVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        naw nawVar = this.k;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                baw bawVar = new baw(nawVar, yjeVar, (byte) 0);
                bawVar.j = th;
                return bawVar.invokeSuspend(Unit.f46060a);
            case 1:
                baw bawVar2 = new baw(nawVar, yjeVar, (byte) 1);
                bawVar2.j = th;
                return bawVar2.invokeSuspend(Unit.f46060a);
            default:
                baw bawVar3 = new baw(nawVar, yjeVar, (byte) 2);
                bawVar3.j = th;
                return bawVar3.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        naw nawVar = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                nawVar.M.b(th, new x2w((byte) 7));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                nawVar.M.b(th, new x2w((byte) 8));
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                nawVar.M.b(th, new x2w((byte) 9));
                break;
        }
        return Unit.f46060a;
    }
}
