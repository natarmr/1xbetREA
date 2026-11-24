package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class o7n0 {
    public static final n7n0 Companion = new n7n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f24794a;
    public final Integer b;

    public /* synthetic */ o7n0(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f24794a = null;
        } else {
            this.f24794a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7n0)) {
            return false;
        }
        o7n0 o7n0Var = (o7n0) obj;
        return Intrinsics.d(this.f24794a, o7n0Var.f24794a) && Intrinsics.d(this.b, o7n0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f24794a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("SubscriptionFullScoreDetailResponse(scoreOpp1=", this.f24794a, ", scoreOpp2=", this.b, Separators.RPAREN);
    }
}
