package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vm5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37661a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;

    public vm5(long j, long j2, String str, String str2, boolean z) {
        str2.getClass();
        this.f37661a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm5)) {
            return false;
        }
        vm5 vm5Var = (vm5) obj;
        return this.f37661a == vm5Var.f37661a && this.b == vm5Var.b && this.c.equals(vm5Var.c) && Intrinsics.d(this.d, vm5Var.d) && this.e == vm5Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(rw2.b(Long.hashCode(this.f37661a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f37661a, "BalanceState(balanceId=", ", currencyId=");
        kng0.z(sbQ, this.b, ", balanceValue=", this.c);
        w6x.z(", currency=", this.d, ", isMultiCurrencyAvailable=", sbQ, this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
