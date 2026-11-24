package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class r2r0 {
    public static final ArrayList a(eih eihVar, v5l0 v5l0Var, y78 y78Var, ctf0 ctf0Var, boolean z, List list, boolean z2, boolean z3) {
        Object next;
        m5l0 m5l0Var;
        eihVar.getClass();
        ctf0Var.getClass();
        ArrayList<d0t> arrayList = eihVar.e;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (d0t d0tVar : arrayList) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((lok0) next).f20396a != d0tVar.O);
            lok0 lok0Var = (lok0) next;
            String str = eihVar.f;
            ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf(((lok0) it2.next()).f20396a));
            }
            boolean z4 = lok0Var != null ? lok0Var.n : false;
            boolean z5 = lok0Var != null ? lok0Var.p : false;
            if (d0tVar.K.isEmpty()) {
                List list2 = d0tVar.k;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!((d0t) it3.next()).K.isEmpty()) {
                                m5l0Var = l5l0.f19463a;
                            }
                        }
                    }
                }
                m5l0Var = i5l0.f14197a;
            } else {
                m5l0Var = l5l0.f19463a;
            }
            m5l0 m5l0Var2 = m5l0Var;
            String str2 = lok0Var != null ? lok0Var.u : null;
            if (str2 == null) {
                str2 = "";
            }
            arrayList2.add(wwb.V(d0tVar, ctf0Var, y78Var, z, z2, str, false, arrayList3, z4, z5, false, v5l0Var, m5l0Var2, str2, z3));
        }
        return arrayList2;
    }
}
