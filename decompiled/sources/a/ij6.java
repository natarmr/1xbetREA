package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ij6 implements nj6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14857a;
    public final String b;

    public ij6(long j, String str) {
        str.getClass();
        this.f14857a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij6)) {
            return false;
        }
        ij6 ij6Var = (ij6) obj;
        return this.f14857a == ij6Var.f14857a && Intrinsics.d(this.b, ij6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f14857a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f14857a, "AllMarketsHidden(selectedSubGameId=", ", message=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
