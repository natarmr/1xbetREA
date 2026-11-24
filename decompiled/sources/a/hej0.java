package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface hej0 extends p6t0 {
    default void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
    }

    @Override // a.p6t0
    default List o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof hej0) || !(p6t0Var2 instanceof hej0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        d(arrayList, p6t0Var, p6t0Var2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
