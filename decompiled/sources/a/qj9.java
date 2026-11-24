package a;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class qj9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oj9 f28826a;

    public qj9(oj9 oj9Var) {
        oj9Var.getClass();
        this.f28826a = oj9Var;
    }

    public final void a(pbs0 pbs0Var) {
        p7m0 p7m0Var;
        Object value;
        ArrayList arrayListN0;
        oj9 oj9Var = this.f28826a;
        oj9Var.getClass();
        qz40 qz40VarA = oj9Var.a();
        do {
            p7m0Var = (p7m0) qz40VarA;
            value = p7m0Var.getValue();
            arrayListN0 = CollectionsKt.N0(((hj9) value).getData());
            Iterator it = arrayListN0.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                pbs0 pbs0Var2 = (pbs0) it.next();
                if (pbs0Var2 == pbs0Var || oj9.b(pbs0Var2.b, pbs0Var.b)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                arrayListN0.remove(i);
            }
            oj9Var.c(arrayListN0);
        } while (!p7m0Var.m(value, new gj9(arrayListN0)));
    }

    public final i89 b() {
        return new i89(this.f28826a.a(), (byte) 2);
    }
}
