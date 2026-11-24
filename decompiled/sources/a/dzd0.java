package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class dzd0 {
    public static final czd0 Companion = new czd0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f6939a;
    public final String b;
    public final Integer c;
    public final String d;

    public /* synthetic */ dzd0(int i, Integer num, Integer num2, String str, String str2) {
        if ((i & 1) == 0) {
            this.f6939a = null;
        } else {
            this.f6939a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
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
        if (!(obj instanceof dzd0)) {
            return false;
        }
        dzd0 dzd0Var = (dzd0) obj;
        return Intrinsics.d(this.f6939a, dzd0Var.f6939a) && Intrinsics.d(this.b, dzd0Var.b) && Intrinsics.d(this.c, dzd0Var.c) && Intrinsics.d(this.d, dzd0Var.d);
    }

    public final int hashCode() {
        Integer num = this.f6939a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f6939a, "RainbowStatisticMatchesComparisonTeamBannedOperatorResponse(id=", ", name=", this.b, ", count=");
        sbN.append(this.c);
        sbN.append(", image=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
