package a;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class ptt {
    public static cn7 a(wdj wdjVar, long j, int i, List list, int i2, List list2, BetHistoryScreenModel betHistoryScreenModel) {
        ArrayList arrayList;
        long jN;
        long jN2;
        list.getClass();
        list2.getClass();
        betHistoryScreenModel.getClass();
        if (betHistoryScreenModel.getC() == k77.TABS_EXPANDABLE_CARDS || betHistoryScreenModel.getC() == k77.COMPACT_NO_EXPAND) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (((un7) obj).b) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Integer numO = zjb.O(((un7) it.next()).f35947a);
                if (numO != null) {
                    arrayList3.add(numO);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            if (((h0w) obj2).b) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            arrayList5.add(Integer.valueOf(xnm0.k((h0w) it2.next())));
        }
        if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
            return new cn7(i, j, 0L, 0L, arrayList5, ((BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel).f, arrayList);
        }
        if (!(betHistoryScreenModel instanceof BetHistoryScreenModel.BetHistory)) {
            t9f.b();
            return null;
        }
        rv00 rv00Var = rv00.k;
        udj udjVar = udj.f35481a;
        if (wdjVar.equals(udjVar)) {
            jN = rv00.n(rv00Var, Calendar.getInstance().getTimeInMillis() - (((long) (i2 - 1)) * 86400000), 14) / 1000;
        } else if (wdjVar instanceof tdj) {
            jN = ((tdj) wdjVar).f33771a;
        } else {
            if (!(wdjVar instanceof vdj)) {
                t9f.b();
                return null;
            }
            jN = ((vdj) wdjVar).f37235a;
        }
        long j2 = jN;
        if (wdjVar.equals(udjVar)) {
            jN2 = 0;
        } else if (wdjVar instanceof tdj) {
            jN2 = rv00.n(rv00Var, ((tdj) wdjVar).f33771a, 12);
        } else {
            if (!(wdjVar instanceof vdj)) {
                t9f.b();
                return null;
            }
            jN2 = ((vdj) wdjVar).b;
        }
        return new cn7(i, j, j2, jN2, arrayList5, "", arrayList);
    }
}
