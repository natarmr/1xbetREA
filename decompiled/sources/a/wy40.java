package a;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class wy40 extends b780 {
    public static wy40 l() {
        return new wy40(new TreeMap(b780.b));
    }

    public static wy40 p(drd drdVar) {
        TreeMap treeMap = new TreeMap(b780.b);
        for (u15 u15Var : drdVar.c()) {
            Set<crd> setB = drdVar.b(u15Var);
            ArrayMap arrayMap = new ArrayMap();
            for (crd crdVar : setB) {
                arrayMap.put(crdVar, drdVar.h(u15Var, crdVar));
            }
            treeMap.put(u15Var, arrayMap);
        }
        return new wy40(treeMap);
    }

    public final void x(u15 u15Var, crd crdVar, Object obj) {
        crd crdVar2;
        TreeMap treeMap = this.f2093a;
        Map map = (Map) treeMap.get(u15Var);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(u15Var, arrayMap);
            arrayMap.put(crdVar, obj);
            return;
        }
        crd crdVar3 = (crd) Collections.min(map.keySet());
        if (Objects.equals(map.get(crdVar3), obj) || crdVar3 != (crdVar2 = crd.c) || crdVar != crdVar2) {
            map.put(crdVar, obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Option values conflicts: ");
        sb.append(u15Var.f34886a);
        sb.append(", existing value (");
        sb.append(crdVar3);
        Object obj2 = map.get(crdVar3);
        sb.append(")=");
        sb.append(obj2);
        sb.append(", conflicting (");
        sb.append(crdVar);
        sb.append(")=");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void y(u15 u15Var, Object obj) {
        x(u15Var, crd.d, obj);
    }

    public final void z(u15 u15Var) {
        this.f2093a.remove(u15Var);
    }
}
