package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lr8 implements ir8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w6k f20517a;
    public final long b;

    public lr8(c5n0 c5n0Var, long j) {
        this.f20517a = c5n0Var;
        this.b = j;
    }

    @Override // a.ir8
    public final mm40 a(mm40 mm40Var) {
        return new xq8(gqw0.e, true);
    }

    @Override // a.ir8
    public final mm40 b(mm40 mm40Var, u12 u12Var) {
        return mm40Var.e(new xq8(u12Var, false));
    }

    public final float c() {
        long j = this.b;
        if (!p4e.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f20517a.r0(p4e.h(j));
    }

    public final float d() {
        long j = this.b;
        if (!p4e.e(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f20517a.r0(p4e.i(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr8)) {
            return false;
        }
        lr8 lr8Var = (lr8) obj;
        return Intrinsics.d(this.f20517a, lr8Var.f20517a) && p4e.c(this.b, lr8Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f20517a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f20517a + ", constraints=" + p4e.m(this.b) + Separators.RPAREN;
    }
}
