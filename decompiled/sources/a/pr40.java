package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class pr40 {
    public static final or40 Companion = new or40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f27448a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Long e;
    public final Boolean f;

    public /* synthetic */ pr40(int i, Integer num, String str, String str2, Integer num2, Long l, Boolean bool) {
        if ((i & 1) == 0) {
            this.f27448a = null;
        } else {
            this.f27448a = num;
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
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr40)) {
            return false;
        }
        pr40 pr40Var = (pr40) obj;
        return Intrinsics.d(this.f27448a, pr40Var.f27448a) && Intrinsics.d(this.b, pr40Var.b) && Intrinsics.d(this.c, pr40Var.c) && Intrinsics.d(this.d, pr40Var.d) && Intrinsics.d(this.e, pr40Var.e) && Intrinsics.d(this.f, pr40Var.f);
    }

    public final int hashCode() {
        Integer num = this.f27448a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f27448a, "MortalKombatRoundResponse(round=", ", winnerName=", this.b, ", finishType=");
        axq.x(this.d, this.c, ", typeOfWin=", ", time=", sbN);
        sbN.append(this.e);
        sbN.append(", firstTeamWin=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
