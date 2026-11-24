package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class bae extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ fae k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bae(fae faeVar, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = faeVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        fae faeVar = this.k;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                bae baeVar = new bae(faeVar, yjeVar, (byte) 0);
                baeVar.j = th;
                return baeVar.invokeSuspend(Unit.f46060a);
            case 1:
                bae baeVar2 = new bae(faeVar, yjeVar, (byte) 1);
                baeVar2.j = th;
                return baeVar2.invokeSuspend(Unit.f46060a);
            case 2:
                bae baeVar3 = new bae(faeVar, yjeVar, (byte) 2);
                baeVar3.j = th;
                return baeVar3.invokeSuspend(Unit.f46060a);
            default:
                bae baeVar4 = new bae(faeVar, yjeVar, (byte) 3);
                baeVar4.j = th;
                return baeVar4.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        fae faeVar = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                faeVar.y(th);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                faeVar.y(th);
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                faeVar.y(th);
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                faeVar.y(th);
                break;
        }
        return Unit.f46060a;
    }
}
