package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yd10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42411a;
    public final /* synthetic */ j1q0 b;

    public /* synthetic */ yd10(j1q0 j1q0Var, byte b) {
        this.f42411a = b;
        this.b = j1q0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f42411a;
        j1q0 j1q0Var = this.b;
        switch (b) {
            case 0:
                return new td10("", j1q0Var.f15748a.b(), true, false);
            case 1:
                q7d0 q7d0Var = j1q0Var.f15748a.f21021a;
                q7d0Var.getClass();
                return Boolean.valueOf(q7d0Var.a().getBoolean("INTERNET_EMULATION_ENABLED", false));
            default:
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return new p560("", lunVar, true, false, j1q0Var.f15748a.b());
        }
    }
}
