package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class tbr {
    public static final rbr Companion = new rbr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f33679a;
    public final Integer b;

    public /* synthetic */ tbr(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f33679a = null;
        } else {
            this.f33679a = num;
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
        if (!(obj instanceof tbr)) {
            return false;
        }
        tbr tbrVar = (tbr) obj;
        return Intrinsics.d(this.f33679a, tbrVar.f33679a) && Intrinsics.d(this.b, tbrVar.b);
    }

    public final int hashCode() {
        Integer num = this.f33679a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("FullScoreDetailResponse(scoreOpp1=", this.f33679a, ", scoreOpp2=", this.b, Separators.RPAREN);
    }
}
