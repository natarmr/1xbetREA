package a;

import android.webkit.PermissionRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class p790 implements rg90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26496a;
    public final /* synthetic */ qog0 b;
    public final /* synthetic */ PermissionRequest c;
    public final /* synthetic */ yx5 d;

    public /* synthetic */ p790(qog0 qog0Var, PermissionRequest permissionRequest, yx5 yx5Var, byte b) {
        this.f26496a = b;
        this.b = qog0Var;
        this.c = permissionRequest;
        this.d = yx5Var;
    }

    @Override // a.rg90
    public final void d(ArrayList arrayList) {
        byte b = this.f26496a;
        qog0 qog0Var = this.b;
        yx5 yx5Var = this.d;
        PermissionRequest permissionRequest = this.c;
        switch (b) {
            case 0:
                r790 r790Var = (r790) yx5Var;
                if (n7x.p(arrayList)) {
                    permissionRequest.grant(permissionRequest.getResources());
                } else if (n7x.t(arrayList)) {
                    xi70 xi70Var = r790.Z1;
                    r790Var.J0(false, permissionRequest);
                } else if (n7x.s(arrayList)) {
                    xi70 xi70Var2 = r790.Z1;
                    r790Var.J0(true, permissionRequest);
                }
                qog0Var.f29072a.remove(this);
                break;
            case 1:
                o890 o890Var = (o890) yx5Var;
                if (n7x.p(arrayList)) {
                    permissionRequest.grant(permissionRequest.getResources());
                } else if (n7x.t(arrayList)) {
                    jh70 jh70Var = o890.f2;
                    o890Var.O0(false, permissionRequest);
                } else if (n7x.s(arrayList)) {
                    jh70 jh70Var2 = o890.f2;
                    o890Var.O0(true, permissionRequest);
                }
                qog0Var.f29072a.remove(this);
                break;
            default:
                whn0 whn0Var = (whn0) yx5Var;
                if (n7x.p(arrayList)) {
                    permissionRequest.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
                } else if (n7x.t(arrayList)) {
                    s2m0 s2m0Var = whn0.Y1;
                    whn0Var.K0();
                    ccq0.V(whn0Var, "CAMERA_PERMISSION_DIALOG", new thn0(whn0Var, permissionRequest));
                    ccq0.T(whn0Var, "CAMERA_PERMISSION_DIALOG", new uhn0(permissionRequest, (byte) 0));
                } else if (n7x.s(arrayList)) {
                    s2m0 s2m0Var2 = whn0.Y1;
                    whn0Var.K0();
                    ccq0.V(whn0Var, "CAMERA_PERMISSION_DIALOG", new thn0(permissionRequest, whn0Var));
                    ccq0.T(whn0Var, "CAMERA_PERMISSION_DIALOG", new uhn0(permissionRequest, (byte) 1));
                }
                qog0Var.f29072a.remove(this);
                break;
        }
    }
}
