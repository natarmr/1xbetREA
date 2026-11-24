package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class k1d0 extends o1d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f17518a;
    public final long b;

    public k1d0(Throwable th, long j) {
        this.f17518a = th;
        this.b = j;
    }

    @Override // a.o1d0
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1d0)) {
            return false;
        }
        k1d0 k1d0Var = (k1d0) obj;
        return this.f17518a.equals(k1d0Var.f17518a) && this.b == k1d0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f17518a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(throwable=" + this.f17518a + ", requestTimeMillis=" + this.b + Separators.RPAREN;
    }
}
