package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class sbr {
    public static final qbr Companion = new qbr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f31949a;
    public final Integer b;

    public /* synthetic */ sbr(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f31949a = null;
        } else {
            this.f31949a = num;
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
        if (!(obj instanceof sbr)) {
            return false;
        }
        sbr sbrVar = (sbr) obj;
        return Intrinsics.d(this.f31949a, sbrVar.f31949a) && Intrinsics.d(this.b, sbrVar.b);
    }

    public final int hashCode() {
        Integer num = this.f31949a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("FullScoreDetailResponse(scoreOpp1=", this.f31949a, ", scoreOpp2=", this.b, Separators.RPAREN);
    }
}
