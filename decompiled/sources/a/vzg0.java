package a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vzg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f38298a = new LinkedHashMap();
    public final w5z b;

    public vzg0() {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.b = new w5z(lunVar);
    }

    public final Object a(String str) {
        Object value;
        str.getClass();
        w5z w5zVar = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) w5zVar.f38604a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) w5zVar.d;
        try {
            qz40 qz40Var = (qz40) linkedHashMap2.get(str);
            if (qz40Var != null && (value = ((p7m0) qz40Var).getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) w5zVar.c).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final qz40 b() {
        if (!this.f38298a.containsKey("QUERY_STATE_KEY")) {
            return this.b.D("", "QUERY_STATE_KEY");
        }
        c99.s("StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key 'QUERY_STATE_KEY', but not both.");
        return null;
    }

    public final xae0 c(Object obj, String str) {
        w5z w5zVar = this.b;
        if (((LinkedHashMap) w5zVar.d).containsKey(str)) {
            return vtb.N(w5zVar.D(obj, str));
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) w5zVar.f38604a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) w5zVar.c;
        Object objA = linkedHashMap2.get(str);
        if (objA == null) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, obj);
            }
            objA = q7m0.a(linkedHashMap.get(str));
            linkedHashMap2.put(str, objA);
        }
        return vtb.N((qz40) objA);
    }

    public final Object d(String str) {
        str.getClass();
        w5z w5zVar = this.b;
        Object objRemove = ((LinkedHashMap) w5zVar.f38604a).remove(str);
        ((LinkedHashMap) w5zVar.c).remove(str);
        ((LinkedHashMap) w5zVar.d).remove(str);
        if (this.f38298a.remove(str) == null) {
            return objRemove;
        }
        hny.b();
        return null;
    }

    public final void e(String str, Object obj) {
        str.getClass();
        if (obj != null) {
            List list = xzg0.f41752a;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!((Class) it.next()).isInstance(obj));
            }
            e9d0.u(obj.getClass(), " into saved state", "Can't put value with type ");
            return;
        }
        List list2 = xzg0.f41752a;
        Object obj2 = this.f38298a.get(str);
        hy40 hy40Var = obj2 instanceof hy40 ? (hy40) obj2 : null;
        if (hy40Var != null) {
            hy40Var.l(obj);
        }
        this.b.j0(str, obj);
    }

    public vzg0(jo20 jo20Var) {
        this.b = new w5z(jo20Var);
    }
}
