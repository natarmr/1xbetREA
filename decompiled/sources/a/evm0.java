package a;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class evm0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8477a;
    public final /* synthetic */ hvm0 b;

    public /* synthetic */ evm0(hvm0 hvm0Var, byte b) {
        this.f8477a = b;
        this.b = hvm0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f8477a;
        hvm0 hvm0Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = hvm0Var.e2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                j1l0 j1l0Var = hvm0Var.h2;
                j1l0Var.getClass();
                fxm0 fxm0Var = new fxm0(fxm0.f);
                fxm0Var.d.b(new gbn(new acm0((byte) 2), new asj0(3, (byte) 12), new zbm0(j1l0Var, (byte) 7), wjj0.s));
                return fxm0Var;
            default:
                y2m0 y2m0Var = hvm0.j2;
                Application application = hvm0Var.n0().getApplication();
                application.getClass();
                return application;
        }
    }
}
