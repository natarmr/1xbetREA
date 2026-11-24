package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class kh6 {
    public static final jh6 Companion = new jh6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f18274a;
    public final Integer b;

    public /* synthetic */ kh6(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f18274a = null;
        } else {
            this.f18274a = num;
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
        if (!(obj instanceof kh6)) {
            return false;
        }
        kh6 kh6Var = (kh6) obj;
        return Intrinsics.d(this.f18274a, kh6Var.f18274a) && Intrinsics.d(this.b, kh6Var.b);
    }

    public final int hashCode() {
        Integer num = this.f18274a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("BetBuilderFullScoreDetailResponse(scoreOpp1=", this.f18274a, ", scoreOpp2=", this.b, Separators.RPAREN);
    }
}
