package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class k9n0 {
    public static final j9n0 Companion = new j9n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17923a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final Boolean e;
    public final Boolean f;

    public /* synthetic */ k9n0(int i, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, String str2) {
        if ((i & 1) == 0) {
            this.f17923a = null;
        } else {
            this.f17923a = str;
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
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9n0)) {
            return false;
        }
        k9n0 k9n0Var = (k9n0) obj;
        return Intrinsics.d(this.f17923a, k9n0Var.f17923a) && Intrinsics.d(this.b, k9n0Var.b) && Intrinsics.d(this.c, k9n0Var.c) && Intrinsics.d(this.d, k9n0Var.d) && Intrinsics.d(this.e, k9n0Var.e) && Intrinsics.d(this.f, k9n0Var.f);
    }

    public final int hashCode() {
        String str = this.f17923a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SubscriptionStatisticInfoResponse(gameId=", this.f17923a, ", stageId=", this.b, ", stageType=");
        rz4.y(sbN, this.c, ", status=", this.d, ", hasLineUps=");
        sbN.append(this.e);
        sbN.append(", hasStadiumInfo=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
