package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f0v0 implements i0v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f8734a;
    public final ql5 b;
    public final long c;

    public f0v0(ql5 ql5Var, ql5 ql5Var2, long j) {
        ql5Var.getClass();
        ql5Var2.getClass();
        this.f8734a = ql5Var;
        this.b = ql5Var2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0v0)) {
            return false;
        }
        f0v0 f0v0Var = (f0v0) obj;
        return Intrinsics.d(this.f8734a, f0v0Var.f8734a) && Intrinsics.d(this.b, f0v0Var.b) && this.c == f0v0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.f8734a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowDeleteConfirmDialog(balanceInfo=");
        sb.append(this.f8734a);
        sb.append(", primaryInfo=");
        sb.append(this.b);
        sb.append(", lastBalanceId=");
        return brm0.k(this.c, Separators.RPAREN, sb);
    }
}
