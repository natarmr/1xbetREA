package a;

import android.hardware.Camera;

/* JADX INFO: loaded from: classes2.dex */
public final class nz4 implements Camera.AutoFocusCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oz4 f24356a;

    public nz4(oz4 oz4Var) {
        this.f24356a = oz4Var;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        this.f24356a.e.post(new w1((Object) this, (byte) 16));
    }
}
