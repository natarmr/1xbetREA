package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vbo {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    public static final List a(List list, CyberGamesPage cyberGamesPage, List list2) {
        ?? arrayList;
        cyberGamesPage.getClass();
        list2.getClass();
        if (cyberGamesPage.equals(CyberGamesPage.Real.INSTANCE)) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((eih) it.next()).b));
            }
        } else if (cyberGamesPage.equals(CyberGamesPage.OneXCyber.INSTANCE) || cyberGamesPage.equals(CyberGamesPage.Virtual.INSTANCE)) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((eih) it2.next()).f7859a));
            }
        } else {
            arrayList = iun.f15405a;
        }
        if (!list2.isEmpty()) {
            if (arrayList.size() != list2.size() ? false : Intrinsics.d(CollectionsKt.z0(arrayList), CollectionsKt.z0(list2))) {
                return list2;
            }
        }
        return arrayList;
    }
}
