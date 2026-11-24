package a;

import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ymr implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42904a;
    public final /* synthetic */ dnr b;

    public /* synthetic */ ymr(dnr dnrVar, byte b) {
        this.f42904a = b;
        this.b = dnrVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f42904a;
        dnr dnrVar = this.b;
        switch (b) {
            case 0:
                ddk ddkVar = dnr.c2;
                dnrVar.I0().x(new jmr(true));
                return Unit.f46060a;
            case 1:
                if (dnrVar.N1 == null) {
                    Intrinsics.h("quickBetDialogNavigator");
                    throw null;
                }
                androidx.fragment.app.e eVarC = dnrVar.C();
                eVarC.getClass();
                xi70.h(eVarC);
                return Unit.f46060a;
            case 2:
                ddk ddkVar2 = dnr.c2;
                Application application = dnrVar.n0().getApplication();
                application.getClass();
                return application;
            default:
                mhi mhiVar = dnrVar.L1;
                if (mhiVar != null) {
                    return new q0h0(mhiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
