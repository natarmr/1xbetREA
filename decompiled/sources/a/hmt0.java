package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class hmt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kgr0 f13323a;

    public hmt0(kgr0 kgr0Var) {
        kgr0Var.getClass();
        this.f13323a = kgr0Var;
    }

    public final void a(long j, long j2, long j3, double d) {
        lgr0 lgr0Var;
        Object value;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object next;
        jgr0 jgr0Var = this.f13323a.f18254a;
        List list = (List) jgr0Var.a(j).getValue();
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((lgr0) next).f20021a != j2);
            lgr0Var = (lgr0) next;
        } else {
            lgr0Var = null;
        }
        p7m0 p7m0VarA = jgr0Var.a(j);
        do {
            value = p7m0VarA.getValue();
            List<lgr0> list2 = (List) value;
            arrayList = new ArrayList();
            if (lgr0Var == null) {
                if (list2 != null) {
                    arrayList.addAll(list2);
                }
                arrayList.add(new lgr0(d, j2, j3));
            } else {
                if (list2 != null) {
                    arrayList2 = new ArrayList(r3d.q(list2, 10));
                    for (lgr0 lgr0Var2 : list2) {
                        if (lgr0Var2.f20021a == j2) {
                            lgr0Var2 = new lgr0(d, j2, j3);
                        }
                        arrayList2.add(lgr0Var2);
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
            }
        } while (!p7m0VarA.m(value, arrayList));
    }
}
