package a;

import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xis implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40960a;
    public final /* synthetic */ cjs b;

    public /* synthetic */ xis(cjs cjsVar, byte b) {
        this.f40960a = b;
        this.b = cjsVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40960a;
        cjs cjsVar = this.b;
        switch (b) {
            case 0:
                nek nekVar = cjs.a2;
                cjsVar.I0().x(new his(true));
                return Unit.f46060a;
            case 1:
                nek nekVar2 = cjs.a2;
                Application application = cjsVar.n0().getApplication();
                application.getClass();
                return application;
            case 2:
                thi thiVar = cjsVar.L1;
                if (thiVar != null) {
                    return new q0h0(thiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                if (cjsVar.N1 == null) {
                    Intrinsics.h("quickBetDialogNavigator");
                    throw null;
                }
                androidx.fragment.app.e eVarC = cjsVar.C();
                eVarC.getClass();
                xi70.h(eVarC);
                return Unit.f46060a;
        }
    }
}
