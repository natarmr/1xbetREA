package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z4m0 implements j73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j73 f43777a;
    public final long b;

    public z4m0(cfq cfqVar, long j) {
        this.f43777a = cfqVar;
        this.b = j;
    }

    @Override // a.j73
    public final l5u0 a(lxs0 lxs0Var) {
        return new a5m0(this.f43777a.a(lxs0Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z4m0)) {
            return false;
        }
        z4m0 z4m0Var = (z4m0) obj;
        return z4m0Var.b == this.b && Intrinsics.d(z4m0Var.f43777a, this.f43777a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f43777a.hashCode() * 31);
    }
}
