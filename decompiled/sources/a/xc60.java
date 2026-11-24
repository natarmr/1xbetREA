package a;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class xc60 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xc60(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        int i = 3;
        j0g0 j0g0Var = (j0g0) obj;
        switch (this.i) {
            case 0:
                Object obj4 = j0g0Var.f15681a;
                Object obj5 = ((j0g0) obj2).f15681a;
                xc60 xc60Var = new xc60(i, (yje) obj3, (byte) 0);
                xc60Var.j = obj4;
                xc60Var.k = obj5;
                return xc60Var.invokeSuspend(Unit.f46060a);
            default:
                Object obj6 = j0g0Var.f15681a;
                Object obj7 = ((j0g0) obj2).f15681a;
                xc60 xc60Var2 = new xc60(i, (yje) obj3, (byte) 1);
                xc60Var2.j = obj6;
                xc60Var2.k = obj7;
                return xc60Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.i) {
            case 0:
                Object obj2 = this.j;
                Object obj3 = this.k;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                boolean z = obj3 instanceof g0g0;
                if (z && (obj2 instanceof g0g0)) {
                    Throwable thA = j0g0.a(obj3);
                    if (thA != null) {
                        throw thA;
                    }
                    Throwable thA2 = j0g0.a(obj2);
                    if (thA2 == null) {
                        throw new c44((byte) 11);
                    }
                    throw thA2;
                }
                iun iunVar = iun.f15405a;
                if (obj2 instanceof g0g0) {
                    obj2 = iunVar;
                }
                Collection collection = (Collection) obj2;
                if (z) {
                    obj3 = iunVar;
                }
                return CollectionsKt.q0(collection, (Iterable) obj3);
            default:
                Object obj4 = this.j;
                Object obj5 = this.k;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                Object obj6 = iun.f15405a;
                e0g0 e0g0Var2 = j0g0.b;
                Collection collection2 = (Collection) (obj4 instanceof g0g0 ? obj6 : obj4);
                if (!(obj5 instanceof g0g0)) {
                    obj6 = obj5;
                }
                ArrayList arrayListQ0 = CollectionsKt.q0(collection2, (Iterable) obj6);
                if (arrayListQ0.isEmpty()) {
                    Throwable thA3 = j0g0.a(obj5);
                    if (thA3 != null) {
                        throw thA3;
                    }
                    Throwable thA4 = j0g0.a(obj4);
                    if (thA4 != null) {
                        throw thA4;
                    }
                }
                return arrayListQ0;
        }
    }
}
