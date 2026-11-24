package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uw20 implements vw20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36375a;
    public final String b;
    public final long c;

    public uw20(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.f36375a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // a.vw20
    public final long a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw20)) {
            return false;
        }
        uw20 uw20Var = (uw20) obj;
        return Intrinsics.d(this.f36375a, uw20Var.f36375a) && Intrinsics.d(this.b, uw20Var.b) && this.c == uw20Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ua80.b(this.f36375a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return brm0.k(this.c, Separators.RPAREN, b1j.n("MarketAndOutcome(marketText=", this.f36375a, ", outcomeText=", this.b, ", marketId="));
    }
}
