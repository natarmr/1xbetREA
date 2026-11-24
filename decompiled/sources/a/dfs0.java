package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dfs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6015a;
    public final Long b;
    public final Long c;

    public dfs0(long j, Long l, Long l2) {
        this.f6015a = j;
        this.b = l;
        this.c = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfs0)) {
            return false;
        }
        dfs0 dfs0Var = (dfs0) obj;
        return this.f6015a == dfs0Var.f6015a && Intrinsics.d(this.b, dfs0Var.b) && Intrinsics.d(this.c, dfs0Var.c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f6015a) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "TransactionHistoryKey(lastBalanceId=" + this.f6015a + ", lastId=" + this.b + ", lastDate=" + this.c + Separators.RPAREN;
    }
}
