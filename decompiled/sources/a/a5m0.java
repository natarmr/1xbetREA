package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a5m0 implements l5u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l5u0 f278a;
    public final long b;

    public a5m0(l5u0 l5u0Var, long j) {
        this.f278a = l5u0Var;
        this.b = j;
    }

    @Override // a.l5u0
    public final boolean a() {
        return this.f278a.a();
    }

    @Override // a.l5u0
    public final long b(t73 t73Var, t73 t73Var2, t73 t73Var3) {
        return this.f278a.b(t73Var, t73Var2, t73Var3) + this.b;
    }

    @Override // a.l5u0
    public final t73 c(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        long j2 = this.b;
        return j < j2 ? t73Var : this.f278a.c(j - j2, t73Var, t73Var2, t73Var3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a5m0)) {
            return false;
        }
        a5m0 a5m0Var = (a5m0) obj;
        return a5m0Var.b == this.b && Intrinsics.d(a5m0Var.f278a, this.f278a);
    }

    @Override // a.l5u0
    public final t73 h(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        long j2 = this.b;
        return j < j2 ? t73Var3 : this.f278a.h(j - j2, t73Var, t73Var2, t73Var3);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f278a.hashCode() * 31);
    }
}
