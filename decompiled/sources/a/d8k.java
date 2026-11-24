package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d8k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5653a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;

    public d8k(long j, long j2, long j3, String str, boolean z) {
        str.getClass();
        this.f5653a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8k)) {
            return false;
        }
        d8k d8kVar = (d8k) obj;
        return this.f5653a == d8kVar.f5653a && this.b == d8kVar.b && this.c == d8kVar.c && this.d == d8kVar.d && Intrinsics.d(this.e, d8kVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rw2.b(rw2.b(rw2.b(Boolean.hashCode(this.f5653a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DepositLimitIeModel(isFreeValue=");
        sb.append(this.f5653a);
        sb.append(", depositLimitValue=");
        sb.append(this.b);
        kng0.A(sb, ", currentDepositLimitValue=", this.c, ", pendingDepositLimitValue=");
        kng0.z(sb, this.d, ", currency=", this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
