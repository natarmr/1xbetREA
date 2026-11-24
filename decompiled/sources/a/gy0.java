package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gy0 implements jy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12102a;
    public final long b;
    public final String c;

    public gy0(long j, long j2, String str) {
        str.getClass();
        this.f12102a = j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy0)) {
            return false;
        }
        gy0 gy0Var = (gy0) obj;
        return this.f12102a == gy0Var.f12102a && this.b == gy0Var.b && Intrinsics.d(this.c, gy0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(Long.hashCode(this.f12102a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f12102a, "OnGameClick(gameId=", ", categoryId=");
        kng0.z(sbQ, this.b, ", title=", this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
