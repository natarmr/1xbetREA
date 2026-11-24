package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q01 implements b11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27871a;
    public final long b;
    public final String c;

    public q01(long j, long j2, String str) {
        str.getClass();
        this.f27871a = j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q01)) {
            return false;
        }
        q01 q01Var = (q01) obj;
        return this.f27871a == q01Var.f27871a && this.b == q01Var.b && Intrinsics.d(this.c, q01Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(Long.hashCode(this.f27871a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f27871a, "OnCategoryAllClick(id=", ", partId=");
        kng0.z(sbQ, this.b, ", title=", this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
