package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yc00 extends cd00 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // a.cd00
    public final void b(Object obj, long j, Object obj2) {
        List list;
        List list2;
        List listN;
        List list3 = (List) ift0.j(obj2, j);
        int size = list3.size();
        List list4 = (List) ift0.j(obj, j);
        if (list4.isEmpty()) {
            if (list4 instanceof sez) {
                listN = new oez(size);
            } else {
                listN = ((list4 instanceof sjx) && (list4 instanceof amx)) ? ((amx) list4).n(size) : new ArrayList(size);
            }
            ift0.p(obj, j, listN);
            list2 = listN;
        } else {
            if (c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                ift0.p(obj, j, arrayList);
                list = arrayList;
            } else if (list4 instanceof het0) {
                het0 het0Var = (het0) list4;
                oez oezVar = new oez(het0Var.size() + size);
                oezVar.addAll(het0Var);
                ift0.p(obj, j, oezVar);
                list = oezVar;
            } else {
                boolean z = list4 instanceof sjx;
                list2 = list4;
                if (z) {
                    boolean z2 = list4 instanceof amx;
                    list2 = list4;
                    if (z2) {
                        amx amxVar = (amx) list4;
                        list2 = list4;
                        if (!((n4) amxVar).f22873a) {
                            amx amxVarN = amxVar.n(list4.size() + size);
                            ift0.p(obj, j, amxVarN);
                            list2 = amxVarN;
                        }
                    }
                }
            }
            list2 = list;
        }
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        ift0.p(obj, j, list3);
    }
}
