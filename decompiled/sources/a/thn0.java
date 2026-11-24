package a;

import android.content.Intent;
import android.net.Uri;
import android.webkit.PermissionRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class thn0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33970a = 0;
    public final /* synthetic */ PermissionRequest b;
    public final /* synthetic */ whn0 c;

    public thn0(whn0 whn0Var, PermissionRequest permissionRequest) {
        this.c = whn0Var;
        this.b = permissionRequest;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f33970a;
        whn0 whn0Var = this.c;
        PermissionRequest permissionRequest = this.b;
        switch (b) {
            case 0:
                s2m0 s2m0Var = whn0.Y1;
                qog0 qog0Var = (qog0) whn0Var.S1.getValue();
                if (qog0Var != null) {
                    qog0Var.f29072a.add(new p790(qog0Var, permissionRequest, whn0Var, (byte) 2));
                    qog0Var.a();
                }
                break;
            default:
                permissionRequest.deny();
                kxq kxqVarN0 = whn0Var.n0();
                Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                intentJ.setData(Uri.fromParts("package", kxqVarN0.getPackageName(), null));
                kxqVarN0.startActivityForResult(intentJ, 531);
                break;
        }
        return Unit.f46060a;
    }

    public thn0(PermissionRequest permissionRequest, whn0 whn0Var) {
        this.b = permissionRequest;
        this.c = whn0Var;
    }
}
