package a;

import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class dp {
    public static final List c = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gnk0 f6436a = new gnk0(0);
    public gbn b;

    public final void a(int i, gbn gbnVar) {
        if (i == 2147483646) {
            jf4.o("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
            return;
        }
        gnk0 gnk0Var = this.f6436a;
        if (j2e.L(gnk0Var, i) == null) {
            gnk0Var.c(i, gbnVar);
        } else {
            c99.q(b1j.m(i, "An AdapterDelegate is already registered for the viewType = ", ". Already registered AdapterDelegate is "), j2e.L(gnk0Var, i));
        }
    }

    public final void b(gbn gbnVar) {
        gnk0 gnk0Var = this.f6436a;
        int i = gnk0Var.c;
        while (j2e.L(gnk0Var, i) != null) {
            i++;
            if (i == 2147483646) {
                jf4.o("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
                return;
            }
        }
        a(i, gbnVar);
    }

    public final gbn c(int i) {
        Object obj;
        Object obj2 = this.b;
        gnk0 gnk0Var = this.f6436a;
        int iX = jd8.X(gnk0Var.c, i, gnk0Var.f11593a);
        if (iX >= 0 && (obj = gnk0Var.b[iX]) != j2e.a0) {
            obj2 = obj;
        }
        return (gbn) obj2;
    }

    public final int d(int i, Object obj) {
        if (obj == null) {
            hny.u("Items datasource is null!");
            return 0;
        }
        gnk0 gnk0Var = this.f6436a;
        int i2 = gnk0Var.c;
        for (int i3 = 0; i3 < i2; i3++) {
            gbn gbnVar = (gbn) gnk0Var.d(i3);
            gbnVar.getClass();
            List list = (List) obj;
            if (((Boolean) gbnVar.b.F(list.get(i), list, Integer.valueOf(i))).booleanValue()) {
                return gnk0Var.b(i3);
            }
        }
        if (this.b != null) {
            return 2147483646;
        }
        hny.u(obj instanceof List ? dw9.n(i, "No AdapterDelegate added that matches item=", ((List) obj).get(i).toString(), " at position=", " in data source") : "No AdapterDelegate added for item at position=" + i + ". items=" + obj);
        return 0;
    }

    public final void e(Object obj, int i, xhe0 xhe0Var, List list) {
        if (c(xhe0Var.f) == null) {
            StringBuilder sbM = b1j.m(i, "No delegate found for item at position = ", " for viewType = ");
            sbM.append(xhe0Var.f);
            throw new NullPointerException(sbM.toString());
        }
        if (list == null) {
            list = c;
        }
        Object obj2 = ((List) obj).get(i);
        cp cpVar = (cp) xhe0Var;
        list.getClass();
        if (obj2 == null) {
            hny.u("null cannot be cast to non-null type kotlin.Any");
            return;
        }
        cpVar.v = obj2;
        Function1 function1 = cpVar.x;
        if (function1 == null) {
            return;
        }
        function1.invoke(list);
    }

    public final cp f(ViewGroup viewGroup, int i) {
        gbn gbnVarC = c(i);
        if (gbnVarC == null) {
            hny.u(twn.m(i, "No AdapterDelegate added for ViewType "));
            return null;
        }
        cp cpVar = new cp((yfu0) gbnVarC.f11022a.invoke(gbnVarC.d.invoke(viewGroup), viewGroup));
        gbnVarC.c.invoke(cpVar);
        return cpVar;
    }

    public final boolean g(xhe0 xhe0Var) {
        if (c(xhe0Var.f) != null) {
            Function0 function0 = ((cp) xhe0Var).z;
            if (function0 == null) {
                return false;
            }
            return ((Boolean) function0.invoke()).booleanValue();
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(xhe0Var);
        jf4.m(sb, xhe0Var.d(), xhe0Var.f);
        return false;
    }

    public final void h(xhe0 xhe0Var) {
        if (c(xhe0Var.f) == null) {
            StringBuilder sb = new StringBuilder("No delegate found for ");
            sb.append(xhe0Var);
            jf4.m(sb, xhe0Var.d(), xhe0Var.f);
        } else {
            Function0 function0 = ((cp) xhe0Var).A;
            if (function0 == null) {
                return;
            }
            function0.invoke();
        }
    }

    public final void i(xhe0 xhe0Var) {
        if (c(xhe0Var.f) == null) {
            StringBuilder sb = new StringBuilder("No delegate found for ");
            sb.append(xhe0Var);
            jf4.m(sb, xhe0Var.d(), xhe0Var.f);
        } else {
            Function0 function0 = ((cp) xhe0Var).B;
            if (function0 == null) {
                return;
            }
            function0.invoke();
        }
    }

    public final void j(xhe0 xhe0Var) {
        if (c(xhe0Var.f) == null) {
            StringBuilder sb = new StringBuilder("No delegate found for ");
            sb.append(xhe0Var);
            jf4.m(sb, xhe0Var.d(), xhe0Var.f);
        } else {
            Function0 function0 = ((cp) xhe0Var).y;
            if (function0 == null) {
                return;
            }
            function0.invoke();
        }
    }
}
