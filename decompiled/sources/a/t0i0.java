package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t0i0 implements w0i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f33121a;
    public final long b;
    public final r0i0 c;

    public t0i0(a4x a4xVar, long j, r0i0 r0i0Var) {
        a4xVar.getClass();
        this.f33121a = a4xVar;
        this.b = j;
        this.c = r0i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0i0)) {
            return false;
        }
        t0i0 t0i0Var = (t0i0) obj;
        return Intrinsics.d(this.f33121a, t0i0Var.f33121a) && this.b == t0i0Var.b && this.c.equals(t0i0Var.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.c.hashCode() + rw2.b(this.f33121a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "Content(items=" + this.f33121a + ", pointsAccumulated=" + this.b + ", selectMode=" + this.c + ", loading=false)";
    }
}
