package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class klk {
    public static final jlk Companion = new jlk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f18493a;
    public final Integer b;

    public /* synthetic */ klk(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f18493a = null;
        } else {
            this.f18493a = num;
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
        if (!(obj instanceof klk)) {
            return false;
        }
        klk klkVar = (klk) obj;
        return Intrinsics.d(this.f18493a, klkVar.f18493a) && Intrinsics.d(this.b, klkVar.b);
    }

    public final int hashCode() {
        Integer num = this.f18493a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("DiceRoundScoreResponse(diceFirst=", this.f18493a, ", diceSecond=", this.b, Separators.RPAREN);
    }
}
