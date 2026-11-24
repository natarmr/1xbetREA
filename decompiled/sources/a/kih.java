package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kih {
    public static final boolean a(jih jihVar, CyberGamesPage cyberGamesPage, boolean z) {
        jihVar.getClass();
        cyberGamesPage.getClass();
        if (cyberGamesPage.equals(CyberGamesPage.Real.INSTANCE)) {
            List<j0g0> listE = e(jihVar, z);
            if (listE != null && listE.isEmpty()) {
                return true;
            }
            for (j0g0 j0g0Var : listE) {
                if (j0g0Var != null) {
                    Object obj = j0g0Var.f15681a;
                    if (obj instanceof g0g0) {
                        obj = null;
                    }
                    List list = (List) obj;
                    if (list != null && !list.isEmpty()) {
                        return false;
                    }
                }
            }
            return true;
        }
        List<j0g0> listJ = q3d.j(new j0g0(jihVar.b), new j0g0(jihVar.c), new j0g0(jihVar.f));
        if (listJ != null && listJ.isEmpty()) {
            return true;
        }
        for (j0g0 j0g0Var2 : listJ) {
            if (j0g0Var2 != null) {
                Object obj2 = j0g0Var2.f15681a;
                if (obj2 instanceof g0g0) {
                    obj2 = null;
                }
                List list2 = (List) obj2;
                if (list2 != null && !list2.isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean b(jih jihVar, CyberGamesPage cyberGamesPage, boolean z) {
        cyberGamesPage.getClass();
        if (cyberGamesPage.equals(CyberGamesPage.Real.INSTANCE)) {
            List<j0g0> listE = e(jihVar, z);
            if (listE == null || !listE.isEmpty()) {
                for (j0g0 j0g0Var : listE) {
                    if (j0g0Var == null || !(j0g0Var.f15681a instanceof g0g0)) {
                        return false;
                    }
                }
            }
        } else {
            List<j0g0> listJ = q3d.j(new j0g0(jihVar.b), new j0g0(jihVar.c), new j0g0(jihVar.f));
            if (listJ == null || !listJ.isEmpty()) {
                for (j0g0 j0g0Var2 : listJ) {
                    if (j0g0Var2 == null || !(j0g0Var2.f15681a instanceof g0g0)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final ArrayList c(jih jihVar) {
        List list;
        List list2 = null;
        if (jihVar != null) {
            Object obj = jihVar.c;
            e0g0 e0g0Var = j0g0.b;
            if (obj instanceof g0g0) {
                obj = null;
            }
            list = (List) obj;
        } else {
            list = null;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        if (jihVar != null) {
            Object obj2 = jihVar.d;
            e0g0 e0g0Var2 = j0g0.b;
            list2 = (List) (obj2 instanceof g0g0 ? null : obj2);
        }
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        ArrayList arrayListQ0 = CollectionsKt.q0(list, list2);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListQ0.iterator();
        while (it.hasNext()) {
            w3d.u(arrayList, ((eih) it.next()).e);
        }
        return arrayList;
    }

    public static final List d(jih jihVar) {
        ArrayList arrayList = null;
        if (jihVar != null) {
            Object obj = jihVar.i;
            e0g0 e0g0Var = j0g0.b;
            if (obj instanceof g0g0) {
                obj = null;
            }
            List list = (List) obj;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((xah) obj2).n) {
                        arrayList.add(obj2);
                    }
                }
            }
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    public static final List e(jih jihVar, boolean z) {
        return z ? q3d.j(new j0g0(jihVar.b), new j0g0(jihVar.c), new j0g0(jihVar.d), new j0g0(jihVar.f), new j0g0(jihVar.g)) : q3d.j(new j0g0(jihVar.b), new j0g0(jihVar.c), new j0g0(jihVar.d), new j0g0(jihVar.i));
    }
}
