package a;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wcm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f38932a = q3d.j("defaultlogo.png", "teamdefault.png");

    public static final y6p0 a(a2w a2wVar) {
        String str;
        String str2;
        String strValueOf;
        String strValueOf2;
        List listJ;
        String strValueOf3;
        List list = a2wVar.b;
        String str3 = a2wVar.f144a;
        List list2 = a2wVar.c;
        boolean z = list.size() == 2;
        List list3 = f38932a;
        String str4 = "";
        if (list3 == null || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = (String) CollectionsKt.firstOrNull(list);
                    if (str == null) {
                    }
                } else if (list.contains((String) it.next())) {
                }
                str = "";
            }
        } else {
            str = (String) CollectionsKt.firstOrNull(list);
            if (str == null) {
                str = "";
            }
        }
        if (list3 == null || !list3.isEmpty()) {
            Iterator it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    str2 = (String) CollectionsKt.f0(list);
                    if (str2 == null) {
                    }
                } else if (list.contains((String) it2.next())) {
                }
                str2 = "";
            }
        } else {
            str2 = (String) CollectionsKt.f0(list);
            if (str2 == null) {
                str2 = "";
            }
        }
        Long l = (Long) CollectionsKt.firstOrNull(list2);
        String strS = vsm0.s(l != null ? l.longValue() : 0L, str);
        Long l2 = (Long) CollectionsKt.W(1, list2);
        String strS2 = vsm0.s(l2 != null ? l2.longValue() : 0L, str2);
        Long l3 = (Long) CollectionsKt.firstOrNull(list2);
        if (l3 == null || (strValueOf = String.valueOf(l3.longValue())) == null) {
            strValueOf = "0";
        }
        if (z) {
            Long l4 = (Long) CollectionsKt.firstOrNull(list2);
            if (l4 == null || (strValueOf2 = String.valueOf(l4.longValue())) == null) {
                strValueOf2 = "";
            }
            iun iunVar = iun.f15405a;
            y6p0 y6p0Var = new y6p0(iunVar, strValueOf2, str3, strS);
            Long l5 = (Long) CollectionsKt.W(1, list2);
            if (l5 != null && (strValueOf3 = String.valueOf(l5.longValue())) != null) {
                str4 = strValueOf3;
            }
            listJ = q3d.j(y6p0Var, new y6p0(iunVar, str4, str3, strS2));
        } else {
            listJ = iun.f15405a;
        }
        return new y6p0(listJ, strValueOf, str3, strS);
    }
}
