package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class d380 {
    public static final s280 Companion = new s280();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new i280(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5391a;
    public final Integer b;
    public final List c;

    public /* synthetic */ d380(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f5391a = null;
        } else {
            this.f5391a = str;
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
        if (!(obj instanceof d380)) {
            return false;
        }
        d380 d380Var = (d380) obj;
        return Intrinsics.d(this.f5391a, d380Var.f5391a) && Intrinsics.d(this.b, d380Var.b) && Intrinsics.d(this.c, d380Var.c);
    }

    public final int hashCode() {
        String str = this.f5391a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(axq.p(this.b, "OpponentResponse(fullName=", this.f5391a, ", countryId=", ", opps="), this.c, Separators.RPAREN);
    }
}
