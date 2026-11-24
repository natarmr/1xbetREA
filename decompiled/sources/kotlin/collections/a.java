package kotlin.collections;

import a.lc00;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static lc00 a(List list) {
        list.getClass();
        lc00 lc00Var = (lc00) list;
        lc00Var.j();
        lc00Var.c = true;
        return lc00Var.b > 0 ? lc00Var : lc00.e;
    }

    public static lc00 b() {
        return new lc00(0, 1, null);
    }

    public static List c(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List d(Iterable iterable) {
        iterable.getClass();
        List listH = CollectionsKt___CollectionsKt.H(iterable);
        Collections.shuffle(listH);
        return listH;
    }
}
