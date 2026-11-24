package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class jog {
    public static final iog Companion = new iog();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f16856a;
    public final Integer b;

    public /* synthetic */ jog(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f16856a = null;
        } else {
            this.f16856a = num;
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
        if (!(obj instanceof jog)) {
            return false;
        }
        jog jogVar = (jog) obj;
        return Intrinsics.d(this.f16856a, jogVar.f16856a) && Intrinsics.d(this.b, jogVar.b);
    }

    public final int hashCode() {
        Integer num = this.f16856a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("CyberFullScoreDetailResponse(scoreOpp1=", this.f16856a, ", scoreOpp2=", this.b, Separators.RPAREN);
    }
}
