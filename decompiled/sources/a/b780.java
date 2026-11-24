package a;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class b780 implements drd {
    public static final l13 b;
    public static final b780 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeMap f2093a;

    static {
        l13 l13Var = new l13((byte) 21);
        b = l13Var;
        c = new b780(new TreeMap(l13Var));
    }

    public b780(TreeMap treeMap) {
        this.f2093a = treeMap;
    }

    public static b780 j(drd drdVar) {
        if (b780.class.equals(drdVar.getClass())) {
            return (b780) drdVar;
        }
        TreeMap treeMap = new TreeMap(b);
        for (u15 u15Var : drdVar.c()) {
            Set<crd> setB = drdVar.b(u15Var);
            ArrayMap arrayMap = new ArrayMap();
            for (crd crdVar : setB) {
                arrayMap.put(crdVar, drdVar.h(u15Var, crdVar));
            }
            treeMap.put(u15Var, arrayMap);
        }
        return new b780(treeMap);
    }

    @Override // a.drd
    public final Set b(u15 u15Var) {
        Map map = (Map) this.f2093a.get(u15Var);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // a.drd
    public final Set c() {
        return Collections.unmodifiableSet(this.f2093a.keySet());
    }

    @Override // a.drd
    public final Object d(u15 u15Var) {
        Map map = (Map) this.f2093a.get(u15Var);
        if (map != null) {
            return map.get((crd) Collections.min(map.keySet()));
        }
        e9d0.i(u15Var, "Option does not exist: ");
        return null;
    }

    @Override // a.drd
    public final Object e(u15 u15Var, Object obj) {
        Map map = (Map) this.f2093a.get(u15Var);
        return map == null ? obj : map.get((crd) Collections.min(map.keySet()));
    }

    @Override // a.drd
    public final boolean f(u15 u15Var) {
        return this.f2093a.containsKey(u15Var);
    }

    @Override // a.drd
    public final crd g(u15 u15Var) {
        Map map = (Map) this.f2093a.get(u15Var);
        if (map != null) {
            return (crd) Collections.min(map.keySet());
        }
        e9d0.i(u15Var, "Option does not exist: ");
        return null;
    }

    @Override // a.drd
    public final Object h(u15 u15Var, crd crdVar) {
        Map map = (Map) this.f2093a.get(u15Var);
        if (map == null) {
            e9d0.i(u15Var, "Option does not exist: ");
            return null;
        }
        if (map.containsKey(crdVar)) {
            return map.get(crdVar);
        }
        itt0.l("Option does not exist: ", u15Var, " with priority=", crdVar);
        return null;
    }

    @Override // a.drd
    public final void i(uq uqVar) {
        for (Map.Entry entry : this.f2093a.tailMap(new u15("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((u15) entry.getKey()).f34886a.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            u15 u15Var = (u15) entry.getKey();
            peg0 peg0Var = (peg0) uqVar.b;
            drd drdVar = (drd) uqVar.c;
            u15Var.getClass();
            ((wy40) peg0Var.b).x(u15Var, drdVar.g(u15Var), drdVar.d(u15Var));
        }
    }
}
