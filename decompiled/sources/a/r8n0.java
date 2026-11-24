package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class r8n0 {
    public static final q8n0 Companion = new q8n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f30036a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ r8n0(int i, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f30036a = null;
        } else {
            this.f30036a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8n0)) {
            return false;
        }
        r8n0 r8n0Var = (r8n0) obj;
        return Intrinsics.d(this.f30036a, r8n0Var.f30036a) && Intrinsics.d(this.b, r8n0Var.b) && Intrinsics.d(this.c, r8n0Var.c);
    }

    public final int hashCode() {
        Integer num = this.f30036a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(hne.q("SubscriptionPeriodScoreResponse(period=", this.f30036a, ", scoreOpp1=", this.b, ", scoreOpp2="), this.c, Separators.RPAREN);
    }
}
