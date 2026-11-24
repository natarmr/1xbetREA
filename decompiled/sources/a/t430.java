package a;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t430 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33300a;
    public final /* synthetic */ w430 b;

    public /* synthetic */ t430(w430 w430Var, byte b) {
        this.f33300a = b;
        this.b = w430Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f33300a;
        w430 w430Var = this.b;
        switch (b) {
            case 0:
                u430 u430Var = w430.Y1;
                Application application = w430Var.n0().getApplication();
                application.getClass();
                return application;
            default:
                x430 x430Var = w430Var.O1;
                if (x430Var != null) {
                    return new q0h0(x430Var);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
