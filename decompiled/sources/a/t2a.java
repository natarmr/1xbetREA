package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t2a extends p2a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final az9 f33205a;

    public t2a(az9 az9Var) {
        this.f33205a = az9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2a) && Intrinsics.d(this.f33205a, ((t2a) obj).f33205a);
    }

    public final int hashCode() {
        az9 az9Var = this.f33205a;
        if (az9Var == null) {
            return 0;
        }
        return Integer.hashCode(az9Var.f1706a);
    }

    public final String toString() {
        return "CameraStateClosing(cameraErrorCode=" + this.f33205a + ')';
    }
}
