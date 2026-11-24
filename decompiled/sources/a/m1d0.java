package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m1d0 extends o1d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21003a;
    public final Long b;
    public final Long c;
    public final boolean d;

    public m1d0(long j, Long l, Long l2, boolean z) {
        this.f21003a = j;
        this.b = l;
        this.c = l2;
        this.d = z;
    }

    @Override // a.o1d0
    public final long a() {
        return this.f21003a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1d0)) {
            return false;
        }
        m1d0 m1d0Var = (m1d0) obj;
        return this.f21003a == m1d0Var.f21003a && Intrinsics.d(this.b, m1d0Var.b) && Intrinsics.d(this.c, m1d0Var.c) && this.d == m1d0Var.d;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f21003a) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "NotifyData(requestTimeMillis=" + this.f21003a + ", dateStart=" + this.b + ", dateEnd=" + this.c + ", highLoad=" + this.d + Separators.RPAREN;
    }
}
