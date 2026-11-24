package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class pj9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj9 f27077a;

    public pj9(qj9 qj9Var, uzc uzcVar) {
        qj9Var.getClass();
        this.f27077a = qj9Var;
    }

    public void a(pbs0 pbs0Var) {
        p7m0 p7m0Var;
        Object value;
        List data;
        pbs0 pbs0Var2;
        qj9 qj9Var = this.f27077a;
        qj9Var.getClass();
        oj9 oj9Var = qj9Var.f28826a;
        oj9Var.getClass();
        qz40 qz40VarA = oj9Var.a();
        do {
            p7m0Var = (p7m0) qz40VarA;
            value = p7m0Var.getValue();
            data = ((hj9) value).getData();
            if (!data.isEmpty() && !data.isEmpty()) {
                Iterator it = data.iterator();
                do {
                    if (!it.hasNext()) {
                        ArrayList arrayList = new ArrayList(data);
                        arrayList.add(pbs0Var);
                        data = arrayList;
                        break;
                    } else {
                        pbs0Var2 = (pbs0) it.next();
                        if (pbs0Var2 == pbs0Var) {
                            break;
                        }
                    }
                } while (!oj9.b(pbs0Var2.b, pbs0Var.b));
            } else {
                ArrayList arrayList2 = new ArrayList(data);
                arrayList2.add(pbs0Var);
                data = arrayList2;
                break;
            }
            oj9Var.c(data);
        } while (!p7m0Var.m(value, new gj9(data)));
    }

    public boolean b(pbs0 pbs0Var) {
        qj9 qj9Var = this.f27077a;
        qj9Var.getClass();
        oj9 oj9Var = qj9Var.f28826a;
        oj9Var.getClass();
        List<pbs0> data = ((hj9) ((p7m0) oj9Var.a()).getValue()).getData();
        if (data != null && data.isEmpty()) {
            return false;
        }
        for (pbs0 pbs0Var2 : data) {
            if (pbs0Var2 == pbs0Var || oj9.b(pbs0Var2.b, pbs0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public pj9(qj9 qj9Var) {
        this.f27077a = qj9Var;
    }
}
