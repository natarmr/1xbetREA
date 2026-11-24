package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cmf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4601a;
    public final Map b;
    public final Map c;
    public final List d;
    public final onf0 e;
    public final dfx f;

    /* JADX WARN: Illegal instructions before constructor call */
    public cmf0(List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, ArrayList arrayList, onf0 onf0Var, int i) {
        Map map = linkedHashMap;
        if ((i & 2) != 0) {
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            map = lunVar;
        }
        Map map2 = map;
        Map map3 = linkedHashMap2;
        if ((i & 4) != 0) {
            lun lunVar2 = lun.f20680a;
            lunVar2.getClass();
            map3 = lunVar2;
        }
        this(list, map2, map3, (i & 8) != 0 ? iun.f15405a : arrayList, (i & 16) != 0 ? null : onf0Var, (dfx) null);
    }

    public final String toString() {
        String str;
        onf0 onf0Var = this.e;
        if (onf0Var == null) {
            str = "";
        } else {
            str = ", template=" + ((Object) onf0.b(onf0Var.f25544a));
        }
        return "Request(streams=" + this.f4601a + str + ")@" + Integer.toHexString(hashCode());
    }

    public cmf0(List list, Map map, Map map2, List list2, onf0 onf0Var, dfx dfxVar) {
        list.getClass();
        map.getClass();
        map2.getClass();
        list2.getClass();
        this.f4601a = list;
        this.b = map;
        this.c = map2;
        this.d = list2;
        this.e = onf0Var;
        this.f = dfxVar;
    }
}
