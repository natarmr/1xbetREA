package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sm5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32428a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public sm5(long j, long j2, String str, String str2, boolean z, boolean z2) {
        str2.getClass();
        this.f32428a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm5)) {
            return false;
        }
        sm5 sm5Var = (sm5) obj;
        return this.f32428a == sm5Var.f32428a && this.b == sm5Var.b && this.c.equals(sm5Var.c) && Intrinsics.d(this.d, sm5Var.d) && this.e == sm5Var.e && this.f == sm5Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(ua80.b(ua80.b(rw2.b(Long.hashCode(this.f32428a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f32428a, "BalanceState(balanceId=", ", currencyId=");
        kng0.z(sbQ, this.b, ", balanceValue=", this.c);
        w6x.z(", currency=", this.d, ", isMultiCurrencyAvailable=", sbQ, this.e);
        return f140.n(sbQ, ", isInsufficientFunds=", this.f, Separators.RPAREN);
    }
}
