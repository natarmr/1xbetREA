package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rdd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nv20 f30285a;

    public /* synthetic */ rdd(nv20 nv20Var) {
        this.f30285a = nv20Var;
    }

    public void a(sh60 sh60Var) {
        Object value;
        tk60 tk60Var;
        sh60Var.getClass();
        tj60 tj60Var = (tj60) this.f30285a.f24171a;
        tj60Var.getClass();
        tj60Var.f34036a.d("KEY_ONBOARDING_COMPLETED_" + sh60Var.name(), true);
        p7m0 p7m0Var = tj60Var.b;
        do {
            value = p7m0Var.getValue();
            tk60Var = (tk60) value;
            qk60 qk60Var = qk60.f28870a;
            if (!Intrinsics.d(tk60Var, qk60Var)) {
                if (!(tk60Var instanceof rk60)) {
                    t9f.b();
                    return;
                } else if (((rk60) tk60Var).f30634a == sh60Var) {
                    tj60Var.c.n(null);
                    tk60Var = qk60Var;
                }
            }
        } while (!p7m0Var.m(value, tk60Var));
    }
}
