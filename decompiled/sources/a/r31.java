package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class r31 {
    public static final q31 Companion = new q31();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f29764a;
    public final String b;
    public final String c;

    public /* synthetic */ r31(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f29764a = null;
        } else {
            this.f29764a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r31)) {
            return false;
        }
        r31 r31Var = (r31) obj;
        return Intrinsics.d(this.f29764a, r31Var.f29764a) && Intrinsics.d(this.b, r31Var.b) && Intrinsics.d(this.c, r31Var.c);
    }

    public final int hashCode() {
        Long l = this.f29764a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f29764a, "AggregatorJackpotAmountResponse(campaignId=", ", currentJackpot=", this.b, ", currency="), this.c, Separators.RPAREN);
    }
}
