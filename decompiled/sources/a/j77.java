package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class j77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f16027a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public static ArrayList a(HistoryTypeModel historyTypeModel, boolean z) {
        int iOrdinal = historyTypeModel.ordinal();
        if (iOrdinal == 1) {
            List listJ = q3d.j(i0w.b, i0w.c, i0w.d, i0w.e, i0w.f);
            ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
            Iterator it = listJ.iterator();
            while (it.hasNext()) {
                arrayList.add(new h0w((i0w) it.next(), true));
            }
            return arrayList;
        }
        if (iOrdinal == 2) {
            c0o c0oVar = zw4.e;
            ArrayList arrayList2 = new ArrayList(r3d.q(c0oVar, 10));
            Iterator it2 = c0oVar.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new h0w((zw4) it2.next(), true));
            }
            return arrayList2;
        }
        if (iOrdinal == 5) {
            List listJ2 = q3d.j(w21.f38428a, w21.b, j31.f15808a, j31.b);
            ArrayList arrayList3 = new ArrayList(r3d.q(listJ2, 10));
            Iterator it3 = listJ2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new h0w((jvw) it3.next(), true));
            }
            return arrayList3;
        }
        if (iOrdinal == 7) {
            c0o c0oVar2 = rc10.e;
            ArrayList arrayList4 = new ArrayList(r3d.q(c0oVar2, 10));
            Iterator it4 = c0oVar2.iterator();
            while (it4.hasNext()) {
                arrayList4.add(new h0w((rc10) it4.next(), true));
            }
            return arrayList4;
        }
        i0w i0wVar = i0w.b;
        i0w i0wVar2 = i0w.c;
        i0w i0wVar3 = i0w.d;
        i0w i0wVar4 = i0w.e;
        i0w i0wVar5 = i0w.f;
        i0w i0wVar6 = i0w.i;
        if (!z) {
            i0wVar6 = null;
        }
        List listZ = tx3.z(new i0w[]{i0wVar, i0wVar2, i0wVar3, i0wVar4, i0wVar5, i0wVar6, i0w.h});
        ArrayList arrayList5 = new ArrayList(r3d.q(listZ, 10));
        Iterator it5 = ((ArrayList) listZ).iterator();
        while (it5.hasNext()) {
            arrayList5.add(new h0w((i0w) it5.next(), true));
        }
        return arrayList5;
    }
}
