package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class atp {
    public static final zsp Companion = new zsp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1441a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ atp(int i, Integer num, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f1441a = null;
        } else {
            this.f1441a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atp)) {
            return false;
        }
        atp atpVar = (atp) obj;
        return Intrinsics.d(this.f1441a, atpVar.f1441a) && Intrinsics.d(this.b, atpVar.b) && Intrinsics.d(this.c, atpVar.c) && Intrinsics.d(this.d, atpVar.d);
    }

    public final int hashCode() {
        Integer num = this.f1441a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(h97.n(this.f1441a, "FightResultResponse(endRound=", ", method=", this.b, ", endTime="), this.c, ", winnerCorner=", this.d, Separators.RPAREN);
    }
}
