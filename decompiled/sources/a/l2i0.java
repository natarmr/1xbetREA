package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l2i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19310a;
    public final long b;
    public final Long c;
    public final String d;
    public final boolean e;

    public l2i0(long j, long j2, Long l, String str, boolean z) {
        str.getClass();
        this.f19310a = j;
        this.b = j2;
        this.c = l;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2i0)) {
            return false;
        }
        l2i0 l2i0Var = (l2i0) obj;
        return this.f19310a == l2i0Var.f19310a && this.b == l2i0Var.b && Intrinsics.d(this.c, l2i0Var.c) && Intrinsics.d(this.d, l2i0Var.d) && this.e == l2i0Var.e;
    }

    public final int hashCode() {
        int iB = rw2.b(Long.hashCode(this.f19310a) * 31, 31, this.b);
        Long l = this.c;
        return Boolean.hashCode(this.e) + ua80.b((iB + (l == null ? 0 : l.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f19310a, "SelectDateViewModelState(minTimeMs=", ", maxTimeMs=");
        sbQ.append(this.b);
        sbQ.append(", chosenDateMs=");
        sbQ.append(this.c);
        w6x.z(", requestKey=", this.d, ", activeApplyButton=", sbQ, this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
