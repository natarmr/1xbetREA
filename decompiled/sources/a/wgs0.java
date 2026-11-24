package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wgs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39133a;
    public final Long b;
    public final Long c;
    public final boolean d;

    public wgs0(int i, Long l, Long l2, boolean z) {
        this.f39133a = i;
        this.b = l;
        this.c = l2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgs0)) {
            return false;
        }
        wgs0 wgs0Var = (wgs0) obj;
        return this.f39133a == wgs0Var.f39133a && Intrinsics.d(this.b, wgs0Var.b) && Intrinsics.d(this.c, wgs0Var.c) && this.d == wgs0Var.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f39133a) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 961);
    }

    public final String toString() {
        return "TransactionsHistoryPagingRequest(limit=" + this.f39133a + ", lastId=" + this.b + ", lastDate=" + this.c + ", moveIds=null, isArchive=" + this.d + Separators.RPAREN;
    }
}
