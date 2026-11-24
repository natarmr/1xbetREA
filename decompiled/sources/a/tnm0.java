package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xplatform.bethistory.history.domain.model.BetHistoryFilterItemModel;

/* JADX INFO: loaded from: classes3.dex */
public final class tnm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qoj0 f34244a = roj0.b(1, 0, null, 6);
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public u21 d = new u21(iun.f15405a, v21.ALL, r21.ALL);

    public static List d(s77 s77Var, boolean z, boolean z2, boolean z3) {
        int iOrdinal = s77Var.ordinal();
        if (iOrdinal == 2) {
            return q3d.j(e4f.k, e4f.m, e4f.l);
        }
        if (iOrdinal == 5) {
            return q3d.j(e4f.e, e4f.d);
        }
        ArrayList arrayListL = q3d.l(e4f.c, e4f.d, e4f.e, e4f.f, e4f.i, e4f.g);
        if ((z || z2 || z3) && s77Var == s77.EVENTS) {
            arrayListL.add(e4f.j);
        }
        return arrayListL;
    }

    public final List a(sys0 sys0Var, s77 s77Var, boolean z, boolean z2, boolean z3) {
        sys0Var.getClass();
        s77Var.getClass();
        ArrayList arrayListB = b(sys0Var, s77Var, z, z2, z3);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListB) {
            if (((BetHistoryFilterItemModel) obj).b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(ieb.e0(((BetHistoryFilterItemModel) it.next()).f46411a)));
        }
        return CollectionsKt.L0(arrayList2);
    }

    public final ArrayList b(sys0 sys0Var, s77 s77Var, boolean z, boolean z2, boolean z3) {
        BetHistoryFilterItemModel betHistoryFilterItemModel;
        sys0Var.getClass();
        s77Var.getClass();
        List listD = d(s77Var, z, z2, z3);
        ArrayList arrayList = new ArrayList(r3d.q(listD, 10));
        int i = 0;
        for (Object obj : listD) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            e4f e4fVar = (e4f) obj;
            List list = (List) c(sys0Var).get(s77Var);
            arrayList.add(new BetHistoryFilterItemModel(e4fVar, (list == null || (betHistoryFilterItemModel = (BetHistoryFilterItemModel) CollectionsKt.W(i, list)) == null) ? true : betHistoryFilterItemModel.b, true));
            i = i2;
        }
        return arrayList;
    }

    public final LinkedHashMap c(sys0 sys0Var) {
        return snm0.f32503a[sys0Var.ordinal()] == 1 ? this.c : this.b;
    }
}
