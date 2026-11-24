package a;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ag90 extends v0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag90(Class cls) {
        super(cls);
        TimeUnit.MINUTES.getClass();
        ppv0 ppv0Var = (ppv0) this.c;
        String str = ppv0.z;
        ppv0Var.h = 900000L;
        if (900000 > 900000) {
            wv00.f().j(str, "Flex duration greater than interval duration; Changed to 900000");
        }
        ppv0Var.i = l1e0.f(900000L, 300000L, ppv0Var.h);
    }

    @Override // a.v0
    public final lpv0 m() {
        ppv0 ppv0Var = (ppv0) this.c;
        if (!ppv0Var.q) {
            return new bg90((UUID) this.b, ppv0Var, (Set) this.d);
        }
        jf4.o("PeriodicWorkRequests cannot be expedited");
        return null;
    }

    @Override // a.v0
    public final v0 r() {
        return this;
    }
}
