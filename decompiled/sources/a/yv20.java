package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yv20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43299a;
    public final int b;
    public final long c;

    public yv20(String str, int i, long j) {
        str.getClass();
        this.f43299a = str;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv20)) {
            return false;
        }
        yv20 yv20Var = (yv20) obj;
        return Intrinsics.d(this.f43299a, yv20Var.f43299a) && this.b == yv20Var.b && this.c == yv20Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + twn.a(this.b, this.f43299a.hashCode() * 31, 31);
    }

    public final String toString() {
        return brm0.k(this.c, Separators.RPAREN, kng0.p(this.b, "MarketInfoModel(name=", this.f43299a, ", marketId=", ", polybetRuleId="));
    }
}
