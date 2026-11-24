package a;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xl3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41055a;
    public final /* synthetic */ dm3 b;

    public /* synthetic */ xl3(dm3 dm3Var, byte b) {
        this.f41055a = b;
        this.b = dm3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41055a;
        ck3 ck3Var = ck3.f4487a;
        dm3 dm3Var = this.b;
        switch (b) {
            case 0:
                m8i m8iVar = dm3Var.L1;
                if (m8iVar != null) {
                    return new q0h0(m8iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                qek0 qek0Var = dm3.U1;
                return new am3(dm3Var);
            case 2:
                qek0 qek0Var2 = dm3.U1;
                dm3Var.I0().x(ck3Var);
                return Unit.f46060a;
            case 3:
                qek0 qek0Var3 = dm3.U1;
                dm3Var.I0().x(rv00.c);
                return Unit.f46060a;
            case 4:
                qek0 qek0Var4 = dm3.U1;
                dm3Var.I0().x(fk3.f9671a);
                return Unit.f46060a;
            case 5:
                qek0 qek0Var5 = dm3.U1;
                dm3Var.I0().x(ck3Var);
                return Unit.f46060a;
            case 6:
                ywq ywqVar = dm3Var.S1;
                Intent intent = new Intent();
                intent.setAction(Build.VERSION.SDK_INT >= 26 ? "android.settings.MANAGE_UNKNOWN_APP_SOURCES" : "android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", dm3Var.n0().getPackageName(), null));
                ywqVar.a(intent);
                return Unit.f46060a;
            default:
                qek0 qek0Var6 = dm3.U1;
                dm3Var.I0().x(dk3.f6213a);
                return Unit.f46060a;
        }
    }
}
