package a;

import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;

/* JADX INFO: loaded from: classes4.dex */
public final class s560 extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (permissionRequest != null) {
            permissionRequest.grant(permissionRequest.getResources());
        }
    }
}
