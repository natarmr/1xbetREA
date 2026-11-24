package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class rlk {
    public static final qlk Companion = new qlk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f30701a;
    public final Integer b;

    public /* synthetic */ rlk(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f30701a = null;
        } else {
            this.f30701a = num;
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
        if (!(obj instanceof rlk)) {
            return false;
        }
        rlk rlkVar = (rlk) obj;
        return Intrinsics.d(this.f30701a, rlkVar.f30701a) && Intrinsics.d(this.b, rlkVar.b);
    }

    public final int hashCode() {
        Integer num = this.f30701a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("DiceZipRoundScoreResponse(diceFirst=", this.f30701a, ", diceSecond=", this.b, Separators.RPAREN);
    }
}
