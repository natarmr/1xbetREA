package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class bts0 {
    public static final ats0 Companion = new ats0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new xns0(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f3199a;
    public final List b;

    public /* synthetic */ bts0(int i, Double d, List list) {
        if ((i & 1) == 0) {
            this.f3199a = null;
        } else {
            this.f3199a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bts0)) {
            return false;
        }
        bts0 bts0Var = (bts0) obj;
        return Intrinsics.d(this.f3199a, bts0Var.f3199a) && Intrinsics.d(this.b, bts0Var.b);
    }

    public final int hashCode() {
        Double d = this.f3199a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TvBetJackpotDataResponse(jackpotSum=" + this.f3199a + ", weeksInfo=" + this.b + Separators.RPAREN;
    }
}
