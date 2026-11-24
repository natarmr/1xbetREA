package a;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qu5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29331a;
    public final /* synthetic */ tu5 b;

    public /* synthetic */ qu5(tu5 tu5Var, byte b) {
        this.f29331a = b;
        this.b = tu5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29331a;
        tu5 tu5Var = this.b;
        switch (b) {
            case 0:
                q9i q9iVar = tu5Var.L1;
                if (q9iVar != null) {
                    return new q0h0(q9iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                yk5 yk5Var = tu5.V1;
                return new kb6(tu5Var.n0());
            case 2:
                yk5 yk5Var2 = tu5.V1;
                tu5Var.H0().w();
                return Unit.f46060a;
            default:
                yk5 yk5Var3 = tu5.V1;
                kxq kxqVarN0 = tu5Var.n0();
                Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                intentJ.setData(Uri.fromParts("package", kxqVarN0.getPackageName(), null));
                kxqVarN0.startActivityForResult(intentJ, 250);
                return Unit.f46060a;
        }
    }
}
