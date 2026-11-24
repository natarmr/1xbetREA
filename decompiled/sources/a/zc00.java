package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zc00 extends dd00 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(Object obj, int i, long j) {
        List listN;
        List list = (List) hft0.j(obj, j);
        if (list.isEmpty()) {
            if (list instanceof rez) {
                listN = new qez(i);
            } else {
                listN = ((list instanceof awb0) && (list instanceof zlx)) ? ((zlx) list).n(i) : new ArrayList(i);
            }
            hft0.q(obj, j, listN);
            return listN;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            hft0.q(obj, j, arrayList);
            return arrayList;
        }
        if (list instanceof jet0) {
            jet0 jet0Var = (jet0) list;
            qez qezVar = new qez(jet0Var.f16393a.size() + i);
            qezVar.addAll(jet0Var);
            hft0.q(obj, j, qezVar);
            return qezVar;
        }
        if ((list instanceof awb0) && (list instanceof zlx)) {
            zlx zlxVar = (zlx) list;
            if (!((m4) zlxVar).f21141a) {
                zlx zlxVarN = zlxVar.n(list.size() + i);
                hft0.q(obj, j, zlxVarN);
                return zlxVarN;
            }
        }
        return list;
    }
}
