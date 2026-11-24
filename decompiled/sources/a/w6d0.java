package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w6d0 implements y6d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final az9 f38620a;

    public w6d0(az9 az9Var) {
        this.f38620a = az9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6d0) && Intrinsics.d(this.f38620a, ((w6d0) obj).f38620a);
    }

    public final int hashCode() {
        az9 az9Var = this.f38620a;
        if (az9Var == null) {
            return 0;
        }
        return Integer.hashCode(az9Var.f1706a);
    }

    public final String toString() {
        return "Error(lastCameraError=" + this.f38620a + ')';
    }
}
