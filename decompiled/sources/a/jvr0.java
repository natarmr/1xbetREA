package a;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jvr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17219a;
    public final /* synthetic */ mvr0 b;

    public /* synthetic */ jvr0(mvr0 mvr0Var, byte b) {
        this.f17219a = b;
        this.b = mvr0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17219a;
        mvr0 mvr0Var = this.b;
        switch (b) {
            case 0:
                g9m0 g9m0Var = mvr0.W1;
                fiu0 fiu0Var = mvr0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                g9m0 g9m0Var2 = mvr0.W1;
                return m7x.P(mvr0Var, j120.V(), new String[0]).d();
            case 2:
                g9m0 g9m0Var3 = mvr0.W1;
                kxq kxqVarN0 = mvr0Var.n0();
                Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                intentJ.setData(Uri.fromParts("package", kxqVarN0.getPackageName(), null));
                kxqVarN0.startActivityForResult(intentJ, 555);
                return Unit.f46060a;
            default:
                g9m0 g9m0Var4 = mvr0.W1;
                mvr0Var.G0().x(avr0.f1541a);
                return Unit.f46060a;
        }
    }
}
