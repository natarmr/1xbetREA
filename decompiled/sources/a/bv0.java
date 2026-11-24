package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3259a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;
    public final long f;

    public bv0(String str, String str2, String str3, boolean z, long j, long j2) {
        brm0.B(str, str2, str3);
        this.f3259a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv0)) {
            return false;
        }
        bv0 bv0Var = (bv0) obj;
        return Intrinsics.d(this.f3259a, bv0Var.f3259a) && Intrinsics.d(this.b, bv0Var.b) && Intrinsics.d(this.c, bv0Var.c) && this.d == bv0Var.d && this.e == bv0Var.e && this.f == bv0Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + rw2.b(brm0.e(ua80.b(ua80.b(this.f3259a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AggregatorGameModel(title=", this.f3259a, ", url=", this.b, ", lobbyUrl=");
        brm0.C(this.c, ", paymentEnabled=", ", balanceId=", sbN, this.d);
        sbN.append(this.e);
        return rw2.n(sbN, this.f, ", productId=", Separators.RPAREN);
    }
}
