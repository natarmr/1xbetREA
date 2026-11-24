package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class nij {
    public static final mij Companion = new mij();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f23590a;
    public final String b;
    public final Long c;
    public final Boolean d;

    public /* synthetic */ nij(int i, Integer num, String str, Long l, Boolean bool) {
        if ((i & 1) == 0) {
            this.f23590a = null;
        } else {
            this.f23590a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nij)) {
            return false;
        }
        nij nijVar = (nij) obj;
        return Intrinsics.d(this.f23590a, nijVar.f23590a) && Intrinsics.d(this.b, nijVar.b) && Intrinsics.d(this.c, nijVar.c) && Intrinsics.d(this.d, nijVar.d);
    }

    public final int hashCode() {
        Integer num = this.f23590a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f23590a, "DayInfoResponse(number=", ", status=", this.b, ", seconds=");
        sbN.append(this.c);
        sbN.append(", currentDay=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
