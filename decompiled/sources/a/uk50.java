package a;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uk50 implements nqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0o0 f35810a;
    public final n0o0 b;
    public final g090 c;
    public final n0o0 d;

    public uk50(Function0 function0) {
        th50 th50Var = new th50((byte) 4);
        tk50 tk50Var = tk50.f34079a;
        th50 th50Var2 = new th50((byte) 5);
        this.f35810a = maz.b(function0);
        this.b = maz.b(th50Var);
        g090 g090Var = new g090();
        g090Var.f10448a = tk50Var;
        g090Var.b = pek0.f;
        this.c = g090Var;
        this.d = maz.b(th50Var2);
    }

    @Override // a.nqp
    public final oqp a(Object obj, a780 a780Var, gbe0 gbe0Var) {
        aot0 aot0Var = (aot0) obj;
        if (!Intrinsics.d(aot0Var.c, "http") && !Intrinsics.d(aot0Var.c, "https")) {
            return null;
        }
        String str = aot0Var.f1219a;
        n0o0 n0o0Var = this.f35810a;
        n0o0 n0o0VarB = maz.b(new np30(gbe0Var, (byte) 20));
        n0o0 n0o0Var2 = this.b;
        g090 g090Var = this.c;
        Context context = a780Var.f354a;
        Object obj2 = g090Var.b;
        pek0 pek0Var = pek0.f;
        if (obj2 == pek0Var) {
            synchronized (g090Var) {
                obj2 = g090Var.b;
                if (obj2 == pek0Var) {
                    Function1 function1 = (Function1) g090Var.f10448a;
                    function1.getClass();
                    Object objInvoke = function1.invoke(context);
                    g090Var.b = objInvoke;
                    g090Var.f10448a = null;
                    obj2 = objInvoke;
                }
            }
        }
        return new zk50(str, a780Var, n0o0Var, n0o0VarB, n0o0Var2, new obx(obj2), this.d);
    }
}
