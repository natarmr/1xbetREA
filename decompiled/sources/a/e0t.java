package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e0t {
    public static final b0s a(d0t d0tVar, ctf0 ctf0Var, y78 y78Var, boolean z, boolean z2, wcb wcbVar, List list) {
        Object next;
        d0tVar.getClass();
        ctf0Var.getClass();
        y78Var.getClass();
        wcbVar.getClass();
        list.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((lok0) next).f20396a != d0tVar.O);
        lok0 lok0Var = (lok0) next;
        String strA = wcbVar.a(d0tVar.v, d0tVar.u);
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((lok0) it2.next()).f20396a));
        }
        boolean z3 = lok0Var != null ? lok0Var.n : false;
        boolean z4 = lok0Var != null ? lok0Var.p : false;
        String str = lok0Var != null ? lok0Var.u : null;
        if (str == null) {
            str = "";
        }
        return fxb.Q(d0tVar, ctf0Var, y78Var, z, z2, strA, arrayList, z3, z4, str);
    }
}
