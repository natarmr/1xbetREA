package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class t41 {
    public static final s41 Companion = new s41();
    public static final a8z[] b = {maz.a(wez.f39042a, new mg0(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f33296a;

    public /* synthetic */ t41(int i, List list) {
        if ((i & 1) == 0) {
            this.f33296a = null;
        } else {
            this.f33296a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t41) && Intrinsics.d(this.f33296a, ((t41) obj).f33296a);
    }

    public final int hashCode() {
        List list = this.f33296a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f33296a, "AggregatorJackpotsResponse(jackpots=", Separators.RPAREN);
    }
}
