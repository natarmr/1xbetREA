package a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class xo20 {
    public static void a(Object obj, Object obj2) {
        uo20 uo20Var = (uo20) obj;
        if (obj2 != null) {
            hny.b();
            return;
        }
        if (uo20Var.isEmpty()) {
            return;
        }
        Iterator it = uo20Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static uo20 b(Object obj, Object obj2) {
        uo20 uo20VarD = (uo20) obj;
        uo20 uo20Var = (uo20) obj2;
        if (!uo20Var.isEmpty()) {
            if (!uo20VarD.f35991a) {
                uo20VarD = uo20VarD.d();
            }
            uo20VarD.b();
            if (!uo20Var.isEmpty()) {
                uo20VarD.putAll(uo20Var);
            }
        }
        return uo20VarD;
    }
}
