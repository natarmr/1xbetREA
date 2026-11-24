package a;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class t9a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t7a f33552a;

    public t9a() {
        HashSet hashSet = new HashSet();
        wy40 wy40VarL = wy40.l();
        ArrayList arrayList = new ArrayList();
        tz40 tz40VarA = tz40.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        b780 b780VarJ = b780.j(wy40VarL);
        ArrayList arrayList3 = new ArrayList(arrayList);
        eoo0 eoo0Var = eoo0.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = tz40VarA.f8147a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        this.f33552a = new t7a(arrayList2, b780VarJ, -1, arrayList3, new eoo0(arrayMap));
    }
}
