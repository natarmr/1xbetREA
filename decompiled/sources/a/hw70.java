package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hw70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tw2 f13757a;
    public final az9 b;

    public hw70(tw2 tw2Var, az9 az9Var, int i) {
        tw2Var = (i & 1) != 0 ? null : tw2Var;
        az9Var = (i & 2) != 0 ? null : az9Var;
        this.f13757a = tw2Var;
        this.b = az9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw70)) {
            return false;
        }
        hw70 hw70Var = (hw70) obj;
        return Intrinsics.d(this.f13757a, hw70Var.f13757a) && Intrinsics.d(this.b, hw70Var.b);
    }

    public final int hashCode() {
        tw2 tw2Var = this.f13757a;
        int iHashCode = (tw2Var == null ? 0 : tw2Var.hashCode()) * 31;
        az9 az9Var = this.b;
        return iHashCode + (az9Var != null ? Integer.hashCode(az9Var.f1706a) : 0);
    }

    public final String toString() {
        return "OpenCameraResult(cameraState=" + this.f13757a + ", errorCode=" + this.b + ')';
    }
}
