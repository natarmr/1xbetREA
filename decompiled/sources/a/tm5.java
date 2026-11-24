package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tm5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34176a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;

    public tm5(long j, long j2, String str, String str2, boolean z) {
        str2.getClass();
        this.f34176a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm5)) {
            return false;
        }
        tm5 tm5Var = (tm5) obj;
        return this.f34176a == tm5Var.f34176a && this.b == tm5Var.b && this.c.equals(tm5Var.c) && Intrinsics.d(this.d, tm5Var.d) && this.e == tm5Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(rw2.b(Long.hashCode(this.f34176a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f34176a, "BalanceState(balanceId=", ", currencyId=");
        kng0.z(sbQ, this.b, ", balanceValue=", this.c);
        w6x.z(", currency=", this.d, ", isMultiCurrencyAvailable=", sbQ, this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
