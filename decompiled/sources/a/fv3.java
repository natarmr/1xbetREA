package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10195a;
    public final Object b;

    public fv3(Object obj, Object obj2) {
        this.f10195a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv3)) {
            return false;
        }
        fv3 fv3Var = (fv3) obj;
        return Intrinsics.d(this.f10195a, fv3Var.f10195a) && Intrinsics.d(this.b, fv3Var.b);
    }

    public final int hashCode() {
        Object obj = this.f10195a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f10195a + ", upper=" + this.b + ')';
    }
}
