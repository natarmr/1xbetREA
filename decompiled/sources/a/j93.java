package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class j93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g93 f16117a;

    public j93(g93 g93Var) {
        g93Var.getClass();
        this.f16117a = g93Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j93) {
            return Intrinsics.d(((j93) obj).f16117a, this.f16117a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16117a.hashCode();
    }
}
