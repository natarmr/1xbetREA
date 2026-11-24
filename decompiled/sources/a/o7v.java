package a;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o7v extends dr30 {
    public static final /* synthetic */ iiy[] d = {new j0d0(o7v.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0)};
    public final h1 b;
    public final cu00 c;

    public o7v(eu00 eu00Var, h1 h1Var) {
        eu00Var.getClass();
        this.b = h1Var;
        this.c = new cu00(eu00Var, new t7t(this, (byte) 7));
    }

    @Override // a.dr30, a.cr30
    public final Collection a(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        List list = (List) yqm0.s(this.c, d[0]);
        if (list.isEmpty()) {
            return iun.f15405a;
        }
        mbk0 mbk0Var = new mbk0();
        for (Object obj : list) {
            if ((obj instanceof fyj0) && Intrinsics.d(((fyj0) obj).getName(), g950Var)) {
                mbk0Var.add(obj);
            }
        }
        return mbk0Var;
    }

    @Override // a.dr30, a.cr30
    public final Collection b(cek cekVar, Function1 function1) {
        cekVar.getClass();
        if (!cekVar.a(cek.n.b)) {
            return iun.f15405a;
        }
        return (List) yqm0.s(this.c, d[0]);
    }

    @Override // a.dr30, a.cr30
    public final Collection f(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        List list = (List) yqm0.s(this.c, d[0]);
        if (list.isEmpty()) {
            return iun.f15405a;
        }
        mbk0 mbk0Var = new mbk0();
        for (Object obj : list) {
            if ((obj instanceof d0d0) && Intrinsics.d(((d0d0) obj).getName(), g950Var)) {
                mbk0Var.add(obj);
            }
        }
        return mbk0Var;
    }

    public List h() {
        g950 g950Var = tuc.e;
        gne0 gne0Var = gmk0.x0;
        h1 h1Var = this.b;
        fyj0 fyj0VarZ1 = fyj0.z1(h1Var, g950Var, 1, gne0Var);
        c8z c8zVarF0 = h1Var.f0();
        iun iunVar = iun.f15405a;
        fyj0VarZ1.t1(null, c8zVarF0, iunVar, iunVar, iunVar, rek.i(h1Var).c().e(), gm40.d, uek.c);
        return kotlin.collections.a.c(fyj0VarZ1);
    }
}
