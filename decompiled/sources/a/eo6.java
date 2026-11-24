package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class eo6 extends c2 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eo6(Object obj, byte b) {
        super((byte) 8);
        this.c = b;
        this.d = obj;
    }

    @Override // a.c2
    public final int q(int i) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                kj5 kj5Var = fo6.W1;
                p6t0 p6t0Var = (p6t0) ((xv6) ((fo6) obj).V1.getValue()).e.f.get(i);
                if (p6t0Var != null) {
                    if ((p6t0Var instanceof npp0) || (p6t0Var instanceof gpp0) || (p6t0Var instanceof r07)) {
                        return 6;
                    }
                    if (p6t0Var instanceof ah) {
                        return 2;
                    }
                    if (p6t0Var instanceof de7) {
                        return ((de7) p6t0Var).g;
                    }
                }
                return 3;
            case 1:
                sek sekVar = org.xplatform.favorites.impl.presentation.category.e.V1;
                List list = ((y3p) ((org.xplatform.favorites.impl.presentation.category.e) obj).R1.getValue()).e.f;
                list.getClass();
                p6t0 p6t0Var2 = (p6t0) CollectionsKt.W(i, list);
                return (p6t0Var2 != null && (p6t0Var2 instanceof b0s)) ? 1 : 2;
            case 2:
                return ((qn50) obj).c.size() != 1 ? 1 : 2;
            default:
                nh70 nh70Var = w4b0.Q1;
                List list2 = ((w4b0) obj).G0().e.f;
                list2.getClass();
                return ((p6t0) CollectionsKt.W(i, list2)) instanceof ghj ? 2 : 1;
        }
    }
}
