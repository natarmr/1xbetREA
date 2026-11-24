package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class oa5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yy9 f24914a;
    public final tw2 b;

    public oa5(yy9 yy9Var, tw2 tw2Var) {
        this.f24914a = yy9Var;
        this.b = tw2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa5)) {
            return false;
        }
        oa5 oa5Var = (oa5) obj;
        return Intrinsics.d(this.f24914a, oa5Var.f24914a) && Intrinsics.d(this.b, oa5Var.b);
    }

    public final int hashCode() {
        yy9 yy9Var = this.f24914a;
        int iHashCode = (yy9Var == null ? 0 : yy9Var.hashCode()) * 31;
        tw2 tw2Var = this.b;
        return iHashCode + (tw2Var != null ? tw2Var.hashCode() : 0);
    }

    public final String toString() {
        return "AwaitOpenCameraResult(cameraDeviceWrapper=" + this.f24914a + ", androidCameraState=" + this.b + ')';
    }
}
