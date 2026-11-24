package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class ej60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7892a;
    public final /* synthetic */ k3t0 b;
    public final /* synthetic */ lk60 c;

    public /* synthetic */ ej60(k3t0 k3t0Var, lk60 lk60Var, byte b) {
        this.f7892a = b;
        this.b = k3t0Var;
        this.c = lk60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7892a;
        lk60 lk60Var = this.c;
        k3t0 k3t0Var = this.b;
        switch (b) {
            case 0:
                k3t0Var.x(new yi60(lk60Var));
                break;
            default:
                k3t0Var.x(new yi60(lk60Var));
                break;
        }
        return Unit.f46060a;
    }
}
