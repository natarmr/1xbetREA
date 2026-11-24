package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class muq {
    public static final luq Companion = new luq();
    public static final a8z[] d = {maz.a(wez.f39042a, new v9q(21)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22423a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ muq(int i, Integer num, Integer num2, List list) {
        if ((i & 1) == 0) {
            this.f22423a = null;
        } else {
            this.f22423a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muq)) {
            return false;
        }
        muq muqVar = (muq) obj;
        return Intrinsics.d(this.f22423a, muqVar.f22423a) && Intrinsics.d(this.b, muqVar.b) && Intrinsics.d(this.c, muqVar.c);
    }

    public final int hashCode() {
        List list = this.f22423a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(cs0.r(this.b, "ForecastResponse(forecastList=", ", scoreOne=", ", scoreTwo=", this.f22423a), this.c, Separators.RPAREN);
    }
}
