package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nq5 implements pq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq5 f23942a;
    public final i4 b;

    public nq5(lq5 lq5Var, i4 i4Var) {
        lq5Var.getClass();
        i4Var.getClass();
        this.f23942a = lq5Var;
        this.b = i4Var;
    }

    @Override // a.pq5
    public final lq5 a() {
        return this.f23942a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq5)) {
            return false;
        }
        nq5 nq5Var = (nq5) obj;
        return Intrinsics.d(this.f23942a, nq5Var.f23942a) && Intrinsics.d(this.b, nq5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23942a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(style=" + this.f23942a + ", items=" + this.b + Separators.RPAREN;
    }
}
