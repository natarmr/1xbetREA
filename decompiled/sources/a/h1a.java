package a;

import android.hardware.camera2.CameraDevice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h1a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraDevice.StateCallback f12273a;
    public final chf0 b;
    public final zen c;

    public h1a(CameraDevice.StateCallback stateCallback, chf0 chf0Var, zen zenVar) {
        this.f12273a = stateCallback;
        this.b = chf0Var;
        this.c = zenVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1a)) {
            return false;
        }
        h1a h1aVar = (h1a) obj;
        return Intrinsics.d(this.f12273a, h1aVar.f12273a) && Intrinsics.d(this.b, h1aVar.b) && Intrinsics.d(this.c, h1aVar.c);
    }

    public final int hashCode() {
        CameraDevice.StateCallback stateCallback = this.f12273a;
        int iHashCode = (stateCallback == null ? 0 : stateCallback.hashCode()) * 31;
        chf0 chf0Var = this.b;
        int iHashCode2 = (iHashCode + (chf0Var == null ? 0 : chf0Var.hashCode())) * 31;
        zen zenVar = this.c;
        return iHashCode2 + (zenVar != null ? Long.hashCode(zenVar.f44260a) : 0);
    }

    public final String toString() {
        return "CameraInteropConfig(cameraDeviceStateCallback=" + this.f12273a + ", cameraCaptureSessionListener=" + this.b + ", cameraOpenRetryMaxTimeoutNs=" + this.c + ')';
    }
}
