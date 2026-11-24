package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class h06 {
    public static final g06 Companion = new g06();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new o85(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12218a;
    public final Integer b;
    public final List c;

    public /* synthetic */ h06(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f12218a = null;
        } else {
            this.f12218a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h06)) {
            return false;
        }
        h06 h06Var = (h06) obj;
        return Intrinsics.d(this.f12218a, h06Var.f12218a) && Intrinsics.d(this.b, h06Var.b) && Intrinsics.d(this.c, h06Var.c);
    }

    public final int hashCode() {
        String str = this.f12218a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(axq.p(this.b, "BaseOpponentResponse(fullName=", this.f12218a, ", countryId=", ", opps="), this.c, Separators.RPAREN);
    }
}
