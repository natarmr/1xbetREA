package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f28422a;
    public final zb0 b;

    public qb0(ql5 ql5Var, zb0 zb0Var) {
        ql5Var.getClass();
        this.f28422a = ql5Var;
        this.b = zb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb0)) {
            return false;
        }
        qb0 qb0Var = (qb0) obj;
        return Intrinsics.d(this.f28422a, qb0Var.f28422a) && this.b == qb0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28422a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatorBalanceModel(balance=" + this.f28422a + ", warningType=" + this.b + Separators.RPAREN;
    }
}
