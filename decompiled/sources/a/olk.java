package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class olk {
    public static final nlk Companion = new nlk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f25459a;
    public final Integer b;
    public final rlk c;

    public /* synthetic */ olk(int i, Integer num, Integer num2, rlk rlkVar) {
        if ((i & 1) == 0) {
            this.f25459a = null;
        } else {
            this.f25459a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = rlkVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olk)) {
            return false;
        }
        olk olkVar = (olk) obj;
        return Intrinsics.d(this.f25459a, olkVar.f25459a) && Intrinsics.d(this.b, olkVar.b) && Intrinsics.d(this.c, olkVar.c);
    }

    public final int hashCode() {
        Integer num = this.f25459a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        rlk rlkVar = this.c;
        return iHashCode2 + (rlkVar != null ? rlkVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("DiceZipRoundResponse(roundNumber=", this.f25459a, ", playerNumber=", this.b, ", diceScore=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
