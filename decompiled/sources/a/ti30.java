package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ti30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33989a;
    public final double b;

    public ti30(String str, double d) {
        str.getClass();
        this.f33989a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti30)) {
            return false;
        }
        ti30 ti30Var = (ti30) obj;
        return Intrinsics.d(this.f33989a, ti30Var.f33989a) && Double.compare(this.b, ti30Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.f33989a.hashCode() * 31);
    }

    public final String toString() {
        return "FpuProfile(bitMaskHex=" + this.f33989a + ", executionTimeMs=" + this.b + ')';
    }
}
