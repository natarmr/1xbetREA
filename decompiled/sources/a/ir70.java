package a;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ir70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15243a;
    public final /* synthetic */ kr70 b;

    public /* synthetic */ ir70(kr70 kr70Var, byte b) {
        this.f15243a = b;
        this.b = kr70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f15243a;
        kr70 kr70Var = this.b;
        switch (b) {
            case 0:
                jh70 jh70Var = kr70.S1;
                fiu0 fiu0Var = kr70Var.O1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                jh70 jh70Var2 = kr70.S1;
                return m7x.P(kr70Var, "android.permission.USE_SIP", "android.permission.RECORD_AUDIO", "android.permission.CAMERA").d();
            case 2:
                jh70 jh70Var3 = kr70.S1;
                kr70Var.G0().x(gq70.f11718a);
                return Unit.f46060a;
            case 3:
                jh70 jh70Var4 = kr70.S1;
                kr70Var.G0().x(dq70.f6501a);
                return Unit.f46060a;
            case 4:
                jh70 jh70Var5 = kr70.S1;
                qog0 qog0Var = (qog0) kr70Var.Q1.getValue();
                lz9 lz9Var = new lz9(qog0Var, kr70Var, (byte) 1);
                qog0Var.getClass();
                qog0Var.f29072a.add(lz9Var);
                qog0Var.a();
                return Unit.f46060a;
            default:
                jh70 jh70Var6 = kr70.S1;
                kxq kxqVarN0 = kr70Var.n0();
                Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                intentJ.setData(Uri.fromParts("package", kxqVarN0.getPackageName(), null));
                kxqVarN0.startActivityForResult(intentJ, 555);
                return Unit.f46060a;
        }
    }
}
