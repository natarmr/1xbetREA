package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k0g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f17465a;
    public final pz2 b;

    /* JADX WARN: Multi-variable type inference failed */
    public k0g0(int i, pz2 pz2Var) {
        this.f17465a = i;
        this.b = pz2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0g0)) {
            return false;
        }
        k0g0 k0g0Var = (k0g0) obj;
        return this.f17465a == k0g0Var.f17465a && Intrinsics.d(this.b, k0g0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f17465a) * 31;
        pz2 pz2Var = this.b;
        return iHashCode + (pz2Var == null ? 0 : pz2Var.hashCode());
    }

    public final String toString() {
        return "Result3A(status=" + ((Object) ("Status(value=" + ((int) this.f17465a) + ')')) + ", frameMetadata=" + this.b + ')';
    }
}
