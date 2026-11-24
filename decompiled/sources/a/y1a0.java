package a;

import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y1a0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41846a;
    public final /* synthetic */ z1a0 b;

    public /* synthetic */ y1a0(z1a0 z1a0Var, byte b) {
        this.f41846a = b;
        this.b = z1a0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41846a;
        z1a0 z1a0Var = this.b;
        switch (b) {
            case 0:
                fl70 fl70Var = z1a0.U1;
                z1a0Var.G0().x(r1a0.f29669a);
                return Unit.f46060a;
            case 1:
                fl70 fl70Var2 = z1a0.U1;
                z1a0Var.G0().x(q1a0.f27943a);
                return Unit.f46060a;
            case 2:
                fl70 fl70Var3 = z1a0.U1;
                Application application = z1a0Var.n0().getApplication();
                application.getClass();
                return application;
            default:
                fl70 fl70Var4 = z1a0.U1;
                fiu0 fiu0Var = z1a0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
