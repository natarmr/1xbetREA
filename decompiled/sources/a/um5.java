package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class um5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35904a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;

    public um5(long j, long j2, String str, String str2, boolean z) {
        str2.getClass();
        this.f35904a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um5)) {
            return false;
        }
        um5 um5Var = (um5) obj;
        return this.f35904a == um5Var.f35904a && this.b == um5Var.b && this.c.equals(um5Var.c) && Intrinsics.d(this.d, um5Var.d) && this.e == um5Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(rw2.b(Long.hashCode(this.f35904a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f35904a, "BalanceState(balanceId=", ", currencyId=");
        kng0.z(sbQ, this.b, ", balanceValue=", this.c);
        w6x.z(", currency=", this.d, ", isMultiCurrencyAvailable=", sbQ, this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
