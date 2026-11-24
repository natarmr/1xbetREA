package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface sv40 {
    default int a(cnx cnxVar, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new cvj((pj30) list2.get(i3), dnx.f6392a, hnx.b, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new rnx(cnxVar, cnxVar.getLayoutDirection()), arrayList2, r4e.b(0, i, 0, 0, 13)).f();
    }

    uj30 b(vj30 vj30Var, List list, long j);

    default int c(cnx cnxVar, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new cvj((pj30) list2.get(i3), dnx.b, hnx.b, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new rnx(cnxVar, cnxVar.getLayoutDirection()), arrayList2, r4e.b(0, i, 0, 0, 13)).f();
    }

    default int d(cnx cnxVar, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new cvj((pj30) list2.get(i3), dnx.f6392a, hnx.f13367a, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new rnx(cnxVar, cnxVar.getLayoutDirection()), arrayList2, r4e.b(0, 0, 0, i, 7)).j();
    }

    default int e(cnx cnxVar, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new cvj((pj30) list2.get(i3), dnx.b, hnx.f13367a, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new rnx(cnxVar, cnxVar.getLayoutDirection()), arrayList2, r4e.b(0, 0, 0, i, 7)).j();
    }
}
