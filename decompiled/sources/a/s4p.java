package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class s4p extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ org.xplatform.favorites.impl.presentation.category.a k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s4p(org.xplatform.favorites.impl.presentation.category.a aVar, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = aVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        org.xplatform.favorites.impl.presentation.category.a aVar = this.k;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                s4p s4pVar = new s4p(aVar, yjeVar, (byte) 0);
                s4pVar.j = th;
                return s4pVar.invokeSuspend(Unit.f46060a);
            default:
                s4p s4pVar2 = new s4p(aVar, yjeVar, (byte) 1);
                s4pVar2.j = th;
                return s4pVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        org.xplatform.favorites.impl.presentation.category.a aVar = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = org.xplatform.favorites.impl.presentation.category.a.L;
                aVar.B.b(th, new q4p(aVar, (byte) 1));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = org.xplatform.favorites.impl.presentation.category.a.L;
                aVar.B.b(th, new q4p(aVar, (byte) 1));
                break;
        }
        return Unit.f46060a;
    }
}
