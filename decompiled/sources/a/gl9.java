package a;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class gl9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f11479a;
    public final p7m0 b;
    public final p7m0 c;
    public final a1g d;

    public gl9() {
        p7m0 p7m0VarA = q7m0.a(null);
        this.f11479a = p7m0VarA;
        p7m0 p7m0VarA2 = q7m0.a(null);
        this.b = p7m0VarA2;
        p7m0 p7m0VarA3 = q7m0.a(null);
        this.c = p7m0VarA3;
        this.d = dub.f0(p7m0VarA, p7m0VarA2, p7m0VarA3, new fl9(this, null, (byte) 0));
    }

    public static Set a(Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ofj ofjVar = (ofj) it.next();
            ofj ofjVar2 = (ofj) linkedHashMap.get(ofjVar.f25173a);
            Date date = ofjVar.f25173a;
            if (ofjVar2 != null) {
                boolean z = true;
                boolean z2 = ofjVar2.b || ofjVar.b;
                if (!ofjVar2.c && !ofjVar.c) {
                    z = false;
                }
                Date date2 = ofjVar2.f25173a;
                date2.getClass();
                ofjVar = new ofj(date2, z2, z);
            }
            linkedHashMap.put(date, ofjVar);
        }
        return CollectionsKt.P0(linkedHashMap.values());
    }

    public static void b(HashMap map, Pair pair, boolean z, boolean z2) {
        Object obj = pair.b;
        Object linkedHashSet = map.get(-321L);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
        }
        ((Set) linkedHashSet).add(new ofj((Date) obj, z, z2));
        map.put(-321L, linkedHashSet);
        Object obj2 = pair.f46059a;
        Object linkedHashSet2 = map.get(obj2);
        if (linkedHashSet2 == null) {
            linkedHashSet2 = new LinkedHashSet();
        }
        ((Set) linkedHashSet2).add(new ofj((Date) obj, z, z2));
        map.put(obj2, linkedHashSet2);
    }
}
