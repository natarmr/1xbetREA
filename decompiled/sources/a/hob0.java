package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hob0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13386a;
    public final /* synthetic */ kob0 b;

    public /* synthetic */ hob0(kob0 kob0Var, byte b) {
        this.f13386a = b;
        this.b = kob0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13386a;
        znb0 znb0Var = znb0.f44669a;
        kob0 kob0Var = this.b;
        switch (b) {
            case 0:
                rl70 rl70Var = kob0.R1;
                kob0Var.G0().x(znb0Var);
                return Unit.f46060a;
            case 1:
                rl70 rl70Var2 = kob0.R1;
                kob0Var.G0().x(znb0Var);
                return Unit.f46060a;
            default:
                jpi jpiVar = kob0Var.L1;
                if (jpiVar != null) {
                    return new q0h0(jpiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
