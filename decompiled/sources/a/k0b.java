package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class k0b {
    public static final j0b Companion = new j0b();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new e0b(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f17457a;
    public final Double b;
    public final Double c;
    public final Long d;
    public final List e;

    public /* synthetic */ k0b(int i, Double d, Double d2, Double d3, Long l, List list) {
        if ((i & 1) == 0) {
            this.f17457a = null;
        } else {
            this.f17457a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0b)) {
            return false;
        }
        k0b k0bVar = (k0b) obj;
        return Intrinsics.d(this.f17457a, k0bVar.f17457a) && Intrinsics.d(this.b, k0bVar.b) && Intrinsics.d(this.c, k0bVar.c) && Intrinsics.d(this.d, k0bVar.d) && Intrinsics.d(this.e, k0bVar.e);
    }

    public final int hashCode() {
        Double d = this.f17457a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CashbackRules(limitInEuro=");
        sb.append(this.f17457a);
        sb.append(", regularPercentage=");
        sb.append(this.b);
        sb.append(", increasePercentage=");
        sb.append(this.c);
        sb.append(", resetDate=");
        sb.append(this.d);
        sb.append(", companyGamesChoice=");
        return dw9.r(sb, this.e, Separators.RPAREN);
    }
}
