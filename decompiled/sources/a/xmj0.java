package a;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xmj0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41128a;
    public final /* synthetic */ cnj0 b;

    public /* synthetic */ xmj0(cnj0 cnj0Var, byte b) {
        this.f41128a = b;
        this.b = cnj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41128a;
        cnj0 cnj0Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = cnj0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                gne0 gne0Var = cnj0.R1;
                return m7x.P(cnj0Var, j120.V(), new String[0]).d();
            default:
                gne0 gne0Var2 = cnj0.R1;
                kxq kxqVarB = cnj0Var.B();
                if (kxqVarB != null) {
                    Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intentJ.setData(Uri.fromParts("package", kxqVarB.getPackageName(), null));
                    kxqVarB.startActivityForResult(intentJ, 555);
                }
                return Unit.f46060a;
        }
    }
}
