package a;

import android.gov.nist.core.Separators;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5431a;
    public final int b;
    public final BigDecimal c;

    public d41(long j, int i, BigDecimal bigDecimal) {
        this.f5431a = j;
        this.b = i;
        this.c = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d41)) {
            return false;
        }
        d41 d41Var = (d41) obj;
        return this.f5431a == d41Var.f5431a && this.b == d41Var.b && Intrinsics.d(this.c, d41Var.c);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, Long.hashCode(this.f5431a) * 31, 31);
        BigDecimal bigDecimal = this.c;
        return iA + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f5431a, "AggregatorJackpotCampaignModel(campaignId=", ", status=");
        sbQ.append(", currentJackpot=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
