package a;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface drd {
    static void m(wy40 wy40Var, drd drdVar, drd drdVar2, u15 u15Var) {
        if (!Objects.equals(u15Var, w0x.s0)) {
            wy40Var.x(u15Var, drdVar2.g(u15Var), drdVar2.d(u15Var));
            return;
        }
        isf0 isf0Var = (isf0) drdVar2.e(u15Var, null);
        isf0 isf0Var2 = (isf0) drdVar.e(u15Var, null);
        crd crdVarG = drdVar2.g(u15Var);
        if (isf0Var == null) {
            isf0Var = isf0Var2;
        } else if (isf0Var2 != null) {
            m2a m2aVar = isf0Var2.f15301a;
            jsf0 jsf0Var = isf0Var2.b;
            int i = isf0Var2.c;
            m2a m2aVar2 = isf0Var.f15301a;
            if (m2aVar2 != null) {
                m2aVar = m2aVar2;
            }
            jsf0 jsf0Var2 = isf0Var.b;
            if (jsf0Var2 != null) {
                jsf0Var = jsf0Var2;
            }
            int i2 = isf0Var.c;
            if (i2 != 0) {
                i = i2;
            }
            isf0Var = new isf0(m2aVar, jsf0Var, i);
        }
        wy40Var.x(u15Var, crdVarG, isf0Var);
    }

    static b780 r(drd drdVar, drd drdVar2) {
        if (drdVar == null && drdVar2 == null) {
            return b780.c;
        }
        wy40 wy40VarP = drdVar2 != null ? wy40.p(drdVar2) : wy40.l();
        if (drdVar != null) {
            Iterator it = drdVar.c().iterator();
            while (it.hasNext()) {
                m(wy40VarP, drdVar2, drdVar, (u15) it.next());
            }
        }
        return b780.j(wy40VarP);
    }

    Set b(u15 u15Var);

    Set c();

    Object d(u15 u15Var);

    Object e(u15 u15Var, Object obj);

    boolean f(u15 u15Var);

    crd g(u15 u15Var);

    Object h(u15 u15Var, crd crdVar);

    void i(uq uqVar);
}
