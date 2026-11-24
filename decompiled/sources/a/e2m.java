package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e2m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7094a;
    public final /* synthetic */ egk0 b;

    public /* synthetic */ e2m(egk0 egk0Var, byte b) {
        this.f7094a = b;
        this.b = egk0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7094a;
        egk0 egk0Var = this.b;
        switch (b) {
            case 0:
                return Long.valueOf((egk0Var.l() / 3600000) % 24);
            case 1:
                return Long.valueOf((egk0Var.l() / 1000) % 60);
            case 2:
                return Long.valueOf((((egk0Var.l() / 1000) / 60) / 60) % 24);
            case 3:
                return Long.valueOf(((egk0Var.l() / 1000) / 60) % 60);
            case 4:
                return Long.valueOf((egk0Var.l() / 1000) % 60);
            default:
                return Long.valueOf((egk0Var.l() / 1000) % 60);
        }
    }
}
