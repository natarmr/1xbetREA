package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class glk {
    public static final flk Companion = new flk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f11495a;
    public final Integer b;
    public final klk c;

    public /* synthetic */ glk(int i, Integer num, Integer num2, klk klkVar) {
        if ((i & 1) == 0) {
            this.f11495a = null;
        } else {
            this.f11495a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = klkVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glk)) {
            return false;
        }
        glk glkVar = (glk) obj;
        return Intrinsics.d(this.f11495a, glkVar.f11495a) && Intrinsics.d(this.b, glkVar.b) && Intrinsics.d(this.c, glkVar.c);
    }

    public final int hashCode() {
        Integer num = this.f11495a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        klk klkVar = this.c;
        return iHashCode2 + (klkVar != null ? klkVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("DiceRoundResponse(roundNumber=", this.f11495a, ", playerNumber=", this.b, ", diceScore=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
