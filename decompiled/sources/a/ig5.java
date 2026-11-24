package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ig5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f14719a;
    public final String b;
    public final boolean c;

    public ig5(double d, String str, boolean z) {
        str.getClass();
        this.f14719a = d;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig5)) {
            return false;
        }
        ig5 ig5Var = (ig5) obj;
        return Double.compare(this.f14719a, ig5Var.f14719a) == 0 && Intrinsics.d(this.b, ig5Var.b) && this.c == ig5Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Double.hashCode(this.f14719a) * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(vqd.s("BalanceInPartnerModel(balance=", this.f14719a, ", currency=", this.b), ", needSms=", this.c, Separators.RPAREN);
    }
}
