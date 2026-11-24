package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class kn9 {
    public static final jn9 Companion = new jn9();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new ej8(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18573a;
    public final Long b;
    public final List c;

    public /* synthetic */ kn9(int i, Long l, String str, List list) {
        if ((i & 1) == 0) {
            this.f18573a = null;
        } else {
            this.f18573a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
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
        if (!(obj instanceof kn9)) {
            return false;
        }
        kn9 kn9Var = (kn9) obj;
        return Intrinsics.d(this.f18573a, kn9Var.f18573a) && Intrinsics.d(this.b, kn9Var.b) && Intrinsics.d(this.c, kn9Var.c);
    }

    public final int hashCode() {
        String str = this.f18573a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(kng0.s(this.b, "CalendarTournamentPrizeDistributionResponse(place=", this.f18573a, ", prize=", ", teams="), this.c, Separators.RPAREN);
    }
}
