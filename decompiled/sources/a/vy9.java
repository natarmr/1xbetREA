package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface vy9 {
    static jzj a(e0a e0aVar, z40 z40Var, q70 q70Var, va5 va5Var, List list, List list2, List list3, int i) {
        z40 z40Var2 = (i & 1) != 0 ? null : z40Var;
        q70 q70Var2 = (i & 2) != 0 ? null : q70Var;
        va5 va5Var2 = (i & 4) != 0 ? null : va5Var;
        List list4 = (i & 8) != 0 ? null : list;
        List list5 = (i & 16) != 0 ? null : list2;
        List list6 = (i & 32) != 0 ? null : list3;
        if (!e0aVar.f6978a.a()) {
            return hke.b(e0aVar.c, z40Var2, q70Var2, va5Var2, null, list4, list5, list6, 8);
        }
        c99.t(e0aVar, " after close.", "Cannot call update3A on ");
        return null;
    }
}
