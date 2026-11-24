package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class o2w extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ r2w k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2w(r2w r2wVar, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = r2wVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        r2w r2wVar = this.k;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                o2w o2wVar = new o2w(r2wVar, yjeVar, (byte) 0);
                o2wVar.j = th;
                return o2wVar.invokeSuspend(Unit.f46060a);
            case 1:
                o2w o2wVar2 = new o2w(r2wVar, yjeVar, (byte) 1);
                o2wVar2.j = th;
                return o2wVar2.invokeSuspend(Unit.f46060a);
            default:
                o2w o2wVar3 = new o2w(r2wVar, yjeVar, (byte) 2);
                o2wVar3.j = th;
                return o2wVar3.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        r2w r2wVar = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                r2wVar.z(th);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                r2wVar.z(th);
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                r2wVar.z(th);
                break;
        }
        return Unit.f46060a;
    }
}
