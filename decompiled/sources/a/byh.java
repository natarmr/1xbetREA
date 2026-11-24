package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class byh {
    public static final ayh Companion = new ayh();
    public static final a8z[] h = {null, null, null, null, null, null, maz.a(wez.f39042a, new bmh(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3417a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final Long f;
    public final List g;

    public /* synthetic */ byh(int i, String str, String str2, String str3, Integer num, Integer num2, Long l, List list) {
        if ((i & 1) == 0) {
            this.f3417a = null;
        } else {
            this.f3417a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byh)) {
            return false;
        }
        byh byhVar = (byh) obj;
        return Intrinsics.d(this.f3417a, byhVar.f3417a) && Intrinsics.d(this.b, byhVar.b) && Intrinsics.d(this.c, byhVar.c) && Intrinsics.d(this.d, byhVar.d) && Intrinsics.d(this.e, byhVar.e) && Intrinsics.d(this.f, byhVar.f) && Intrinsics.d(this.g, byhVar.g);
    }

    public final int hashCode() {
        String str = this.f3417a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyclingValueResponse(id=", this.f3417a, ", tournamentTitle=", this.b, ", trackTitle=");
        axq.x(this.d, this.c, ", trackId=", ", status=", sbN);
        cs0.w(this.e, this.f, ", dateStartInSecondsUnixTime=", ", menu=", sbN);
        return dw9.r(sbN, this.g, Separators.RPAREN);
    }
}
