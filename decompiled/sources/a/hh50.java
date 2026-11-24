package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class hh50 {
    public static final gh50 Companion = new gh50();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new ec40(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13046a;
    public final String b;
    public final Long c;
    public final List d;

    public /* synthetic */ hh50(int i, Long l, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f13046a = null;
        } else {
            this.f13046a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh50)) {
            return false;
        }
        hh50 hh50Var = (hh50) obj;
        return Intrinsics.d(this.f13046a, hh50Var.f13046a) && Intrinsics.d(this.b, hh50Var.b) && Intrinsics.d(this.c, hh50Var.c) && Intrinsics.d(this.d, hh50Var.d);
    }

    public final int hashCode() {
        String str = this.f13046a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("NearestGameDetailsOpponentResponse(fullNameEng=", this.f13046a, ", fullName=", this.b, ", countryId=");
        sbN.append(this.c);
        sbN.append(", opps=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
