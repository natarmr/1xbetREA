package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ide implements ode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f14580a;

    public ide(a4x a4xVar) {
        a4xVar.getClass();
        this.f14580a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ide) && Intrinsics.d(this.f14580a, ((ide) obj).f14580a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f14580a.hashCode() * 31);
    }

    public final String toString() {
        return h97.i(this.f14580a, "Shimmers(items=", ", enableTwoRows=false)");
    }
}
