package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface tj30 {
    default int a(cnx cnxVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new cvj((pj30) list.get(i2), dnx.f6392a, hnx.b, b));
        }
        return b(new rnx(cnxVar, cnxVar.getLayoutDirection()), arrayList, r4e.b(0, i, 0, 0, 13)).f();
    }

    uj30 b(vj30 vj30Var, List list, long j);

    default int c(cnx cnxVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new cvj((pj30) list.get(i2), dnx.b, hnx.b, b));
        }
        return b(new rnx(cnxVar, cnxVar.getLayoutDirection()), arrayList, r4e.b(0, i, 0, 0, 13)).f();
    }

    default int d(cnx cnxVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new cvj((pj30) list.get(i2), dnx.f6392a, hnx.f13367a, b));
        }
        return b(new rnx(cnxVar, cnxVar.getLayoutDirection()), arrayList, r4e.b(0, 0, 0, i, 7)).j();
    }

    default int e(cnx cnxVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new cvj((pj30) list.get(i2), dnx.b, hnx.f13367a, b));
        }
        return b(new rnx(cnxVar, cnxVar.getLayoutDirection()), arrayList, r4e.b(0, 0, 0, i, 7)).j();
    }
}
