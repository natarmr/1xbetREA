package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class fij {
    public static final eij Companion = new eij();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9591a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final cij e;

    public /* synthetic */ fij(int i, String str, String str2, Integer num, Integer num2, cij cijVar) {
        if ((i & 1) == 0) {
            this.f9591a = null;
        } else {
            this.f9591a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = cijVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fij)) {
            return false;
        }
        fij fijVar = (fij) obj;
        return Intrinsics.d(this.f9591a, fijVar.f9591a) && Intrinsics.d(this.b, fijVar.b) && Intrinsics.d(this.c, fijVar.c) && Intrinsics.d(this.d, fijVar.d) && Intrinsics.d(this.e, fijVar.e);
    }

    public final int hashCode() {
        String str = this.f9591a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        cij cijVar = this.e;
        return iHashCode4 + (cijVar != null ? cijVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DayExpressScoresResponse(fullScore=", this.f9591a, ", currentPeriodName=", this.b, ", opponentOneScore=");
        rz4.y(sbN, this.c, ", opponentTwoScore=", this.d, ", timer=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
