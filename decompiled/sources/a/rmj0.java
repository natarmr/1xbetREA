package a;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rmj0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30746a;
    public final /* synthetic */ umj0 b;

    public /* synthetic */ rmj0(umj0 umj0Var, byte b) {
        this.f30746a = b;
        this.b = umj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30746a;
        umj0 umj0Var = this.b;
        switch (b) {
            case 0:
                lme0 lme0Var = umj0.S1;
                fiu0 fiu0Var = umj0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                lme0 lme0Var2 = umj0.S1;
                return m7x.P(umj0Var, j120.V(), new String[0]).d();
            default:
                lme0 lme0Var3 = umj0.S1;
                kxq kxqVarB = umj0Var.B();
                if (kxqVarB != null) {
                    Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intentJ.setData(Uri.fromParts("package", kxqVarB.getPackageName(), null));
                    kxqVarB.startActivityForResult(intentJ, 555);
                }
                return Unit.f46060a;
        }
    }
}
