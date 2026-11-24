package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ibc0 {
    public static final hbc0 Companion = new hbc0();
    public static final a8z[] h = {null, null, maz.a(wez.f39042a, new cbc0(1)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f14480a;
    public final Long b;
    public final List c;
    public final Integer d;
    public final String e;
    public final Integer f;
    public final xbc0 g;

    public /* synthetic */ ibc0(int i, Long l, Long l2, List list, Integer num, String str, Integer num2, xbc0 xbc0Var) {
        if ((i & 1) == 0) {
            this.f14480a = null;
        } else {
            this.f14480a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = xbc0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibc0)) {
            return false;
        }
        ibc0 ibc0Var = (ibc0) obj;
        return Intrinsics.d(this.f14480a, ibc0Var.f14480a) && Intrinsics.d(this.b, ibc0Var.b) && Intrinsics.d(this.c, ibc0Var.c) && Intrinsics.d(this.d, ibc0Var.d) && Intrinsics.d(this.e, ibc0Var.e) && Intrinsics.d(this.f, ibc0Var.f) && Intrinsics.d(this.g, ibc0Var.g);
    }

    public final int hashCode() {
        Long l = this.f14480a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        xbc0 xbc0Var = this.g;
        return iHashCode6 + (xbc0Var != null ? xbc0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f14480a, this.b, "PromoCmsGetPromotionInfoValueResponse(startDate=", ", endDate=", ", stages=");
        sbO.append(this.c);
        sbO.append(", currencyId=");
        sbO.append(this.d);
        sbO.append(", currencyCode=");
        axq.x(this.f, this.e, ", templateId=", ", templateInfo=", sbO);
        sbO.append(this.g);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
