package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class t0p {
    public static final s0p Companion = new s0p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f33129a;
    public final Integer b;
    public final String c;
    public final String d;

    public /* synthetic */ t0p(int i, Integer num, Integer num2, String str, String str2) {
        if ((i & 1) == 0) {
            this.f33129a = null;
        } else {
            this.f33129a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0p)) {
            return false;
        }
        t0p t0pVar = (t0p) obj;
        return Intrinsics.d(this.f33129a, t0pVar.f33129a) && Intrinsics.d(this.b, t0pVar.b) && Intrinsics.d(this.c, t0pVar.c) && Intrinsics.d(this.d, t0pVar.d);
    }

    public final int hashCode() {
        Integer num = this.f33129a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(hne.q("FatalFuryRoundResponse(roundNumber=", this.f33129a, ", roundTime=", this.b, ", nameOfWinner="), this.c, ", typeOfWin=", this.d, Separators.RPAREN);
    }
}
