package a;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class aym0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1676a;
    public final /* synthetic */ eym0 b;

    public /* synthetic */ aym0(eym0 eym0Var, byte b) {
        this.f1676a = b;
        this.b = eym0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1676a;
        eym0 eym0Var = this.b;
        switch (b) {
            case 0:
                zui zuiVar = eym0Var.L1;
                if (zuiVar != null) {
                    return new q0h0(zuiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                g9m0 g9m0Var = eym0.S1;
                Application application = eym0Var.n0().getApplication();
                application.getClass();
                return application;
        }
    }
}
