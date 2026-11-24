package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tw20 implements vw20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34628a;
    public final long b;

    public tw20(String str, long j) {
        str.getClass();
        this.f34628a = str;
        this.b = j;
    }

    @Override // a.vw20
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw20)) {
            return false;
        }
        tw20 tw20Var = (tw20) obj;
        return Intrinsics.d(this.f34628a, tw20Var.f34628a) && this.b == tw20Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f34628a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "Market(marketText=", this.f34628a, ", marketId=");
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
