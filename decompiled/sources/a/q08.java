package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class q08 {
    public static final p08 Companion = new p08();
    public static final a8z[] d = {maz.a(wez.f39042a, new os7(14)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27884a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ q08(int i, Integer num, Integer num2, List list) {
        if ((i & 1) == 0) {
            this.f27884a = null;
        } else {
            this.f27884a = list;
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
        if (!(obj instanceof q08)) {
            return false;
        }
        q08 q08Var = (q08) obj;
        return Intrinsics.d(this.f27884a, q08Var.f27884a) && Intrinsics.d(this.b, q08Var.b) && Intrinsics.d(this.c, q08Var.c);
    }

    public final int hashCode() {
        List list = this.f27884a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(cs0.r(this.b, "BigPigSeriesResponse(throws=", ", pointsOfSeries=", ", pointsOfGame=", this.f27884a), this.c, Separators.RPAREN);
    }
}
