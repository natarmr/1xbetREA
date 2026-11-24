package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class dp0 {
    public static final cp0 Companion = new cp0();
    public static final a8z[] b = {maz.a(wez.f39042a, new mg0(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6437a;

    public dp0(int i, List list) {
        if ((i & 1) == 0) {
            this.f6437a = iun.f15405a;
        } else {
            this.f6437a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dp0) && Intrinsics.d(this.f6437a, ((dp0) obj).f6437a);
    }

    public final int hashCode() {
        List list = this.f6437a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f6437a, "AggregatorFilterResponse(filtersData=", Separators.RPAREN);
    }
}
