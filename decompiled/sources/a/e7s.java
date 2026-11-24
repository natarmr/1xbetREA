package a;

import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e7s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7341a;
    public final /* synthetic */ i7s b;

    public /* synthetic */ e7s(i7s i7sVar, byte b) {
        this.f7341a = b;
        this.b = i7sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7341a;
        i7s i7sVar = this.b;
        switch (b) {
            case 0:
                nek nekVar = i7s.a2;
                i7sVar.I0().x(new j6s(true));
                return Unit.f46060a;
            case 1:
                if (i7sVar.N1 == null) {
                    Intrinsics.h("quickBetDialogNavigator");
                    throw null;
                }
                androidx.fragment.app.e eVarC = i7sVar.C();
                eVarC.getClass();
                xi70.h(eVarC);
                return Unit.f46060a;
            case 2:
                nek nekVar2 = i7s.a2;
                Application application = i7sVar.n0().getApplication();
                application.getClass();
                return application;
            default:
                phi phiVar = i7sVar.L1;
                if (phiVar != null) {
                    return new q0h0(phiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
