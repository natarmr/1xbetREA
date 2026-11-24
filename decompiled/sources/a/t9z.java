package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t9z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g950 f33590a;
    public final mqe0 b;

    public t9z(g950 g950Var, mqe0 mqe0Var) {
        g950Var.getClass();
        this.f33590a = g950Var;
        this.b = mqe0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t9z) {
            return Intrinsics.d(this.f33590a, ((t9z) obj).f33590a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33590a.hashCode();
    }
}
