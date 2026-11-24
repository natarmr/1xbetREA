package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class q41 {
    public static final p41 Companion = new p41();
    public static final a8z[] b = {maz.a(wez.f39042a, new mg0(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f28075a;

    public /* synthetic */ q41(int i, List list) {
        if ((i & 1) == 0) {
            this.f28075a = null;
        } else {
            this.f28075a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q41) && Intrinsics.d(this.f28075a, ((q41) obj).f28075a);
    }

    public final int hashCode() {
        List list = this.f28075a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f28075a, "AggregatorJackpotsAmountResponse(jackpots=", Separators.RPAREN);
    }
}
