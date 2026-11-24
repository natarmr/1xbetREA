package a;

import android.webkit.PermissionRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class uhn0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35689a;
    public final /* synthetic */ PermissionRequest b;

    public /* synthetic */ uhn0(PermissionRequest permissionRequest, byte b) {
        this.f35689a = b;
        this.b = permissionRequest;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f35689a;
        PermissionRequest permissionRequest = this.b;
        switch (b) {
            case 0:
                permissionRequest.deny();
                break;
            default:
                permissionRequest.deny();
                break;
        }
        return Unit.f46060a;
    }
}
