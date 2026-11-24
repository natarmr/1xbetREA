package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class bsu {
    public static /* synthetic */ ArrayList b(bsu bsuVar, bm5 bm5Var, List list, zje zjeVar) {
        tl5 tl5Var = tl5.f34128a;
        return bsuVar.a(bm5Var, list);
    }

    public final ArrayList a(bm5 bm5Var, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ql5) obj).i.e()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((ql5) obj2).i.a()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            ql5 ql5Var = (ql5) obj3;
            boolean z = true;
            switch (bm5Var.ordinal()) {
                case 1:
                case 8:
                    if (!ql5Var.l || ql5Var.i != txs0.e) {
                        z = false;
                    }
                    break;
                case 2:
                    if (ql5Var.i != txs0.e) {
                        z = false;
                    }
                    break;
                case 3:
                    if (!ql5Var.l || !q3d.j(txs0.f, txs0.h).contains(ql5Var.i)) {
                        z = false;
                    }
                    break;
                case 4:
                    if (!ql5Var.l || ql5Var.i != txs0.f) {
                        z = false;
                    }
                    break;
                case 5:
                    z = ql5Var.l;
                    break;
                case 6:
                    if (!ql5Var.l || ql5Var.i != txs0.e) {
                        z = false;
                    }
                    break;
                case 7:
                default:
                    z = false;
                    break;
            }
            if (z) {
                arrayList3.add(obj3);
            }
        }
        return CollectionsKt.q0(arrayList, arrayList3);
    }
}
