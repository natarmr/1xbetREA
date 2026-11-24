package a;

import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ja9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16179a;
    public final /* synthetic */ ka9 b;

    public /* synthetic */ ja9(ka9 ka9Var, byte b) {
        this.f16179a = b;
        this.b = ka9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f16179a;
        ka9 ka9Var = this.b;
        switch (b) {
            case 0:
                cl5 cl5Var = ka9.Q1;
                Application application = ka9Var.n0().getApplication();
                application.getClass();
                return application;
            case 1:
                cl5 cl5Var2 = ka9.Q1;
                fiu0 fiu0Var = ka9Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                cl5 cl5Var3 = ka9.Q1;
                ((k3t0) ka9Var.P1.getValue()).x(aa9.f514a);
                return Unit.f46060a;
            default:
                cl5 cl5Var4 = ka9.Q1;
                Application application2 = ka9Var.n0().getApplication();
                application2.getClass();
                return application2;
        }
    }
}
