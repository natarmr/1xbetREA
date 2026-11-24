package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a7d0 implements c7d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final az9 f363a;

    public a7d0(az9 az9Var) {
        this.f363a = az9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7d0) && Intrinsics.d(this.f363a, ((a7d0) obj).f363a);
    }

    public final int hashCode() {
        az9 az9Var = this.f363a;
        if (az9Var == null) {
            return 0;
        }
        return Integer.hashCode(az9Var.f1706a);
    }

    public final String toString() {
        return "Error(lastCameraError=" + this.f363a + ')';
    }
}
