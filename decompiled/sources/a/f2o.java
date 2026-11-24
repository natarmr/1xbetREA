package a;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class f2o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2o f8821a = new f2o();
    public static final o1o b = o1o.f24491a;
    public static final s0o c;
    public static final a2o d;
    public static final a2o e;
    public static final Set f;

    static {
        b1o[] b1oVarArr = b1o.f1816a;
        c = new s0o(g950.i(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
        d = c(c2o.h, new String[0]);
        e = c(c2o.u, new String[0]);
        f = cui0.b(new p1o());
    }

    public static final t1o a(u1o u1oVar, boolean z, String... strArr) {
        if (!z) {
            return new t1o(u1oVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new gdq0(u1oVar, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static final t1o b(u1o u1oVar, String... strArr) {
        return a(u1oVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final a2o c(c2o c2oVar, String... strArr) {
        c2oVar.getClass();
        iun iunVar = iun.f15405a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        iunVar.getClass();
        return e(c2oVar, iunVar, d(c2oVar, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static b2o d(c2o c2oVar, String... strArr) {
        c2oVar.getClass();
        return new b2o(c2oVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static a2o e(c2o c2oVar, List list, iys0 iys0Var, String... strArr) {
        c2oVar.getClass();
        list.getClass();
        return new a2o(iys0Var, b(u1o.ERROR_TYPE_SCOPE, iys0Var.toString()), c2oVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(vjj vjjVar) {
        if (vjjVar != null) {
            return (vjjVar instanceof s0o) || (vjjVar.j() instanceof s0o) || vjjVar == b;
        }
        return false;
    }
}
