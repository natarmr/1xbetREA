package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class qep extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ org.xplatform.favorites.impl.presentation.category.f k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qep(org.xplatform.favorites.impl.presentation.category.f fVar, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = fVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        org.xplatform.favorites.impl.presentation.category.f fVar = this.k;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                qep qepVar = new qep(fVar, yjeVar, (byte) 0);
                qepVar.j = th;
                return qepVar.invokeSuspend(Unit.f46060a);
            default:
                qep qepVar2 = new qep(fVar, yjeVar, (byte) 1);
                qepVar2.j = th;
                return qepVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        org.xplatform.favorites.impl.presentation.category.f fVar = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                fVar.x(th);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                fVar.x(th);
                break;
        }
        return Unit.f46060a;
    }
}
