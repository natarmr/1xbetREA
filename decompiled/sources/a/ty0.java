package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ty0 {
    public static final sy0 Companion = new sy0();
    public static final a8z[] b = {maz.a(wez.f39042a, new mg0(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34728a;

    public /* synthetic */ ty0(int i, List list) {
        if ((i & 1) == 0) {
            this.f34728a = null;
        } else {
            this.f34728a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ty0) && Intrinsics.d(this.f34728a, ((ty0) obj).f34728a);
    }

    public final int hashCode() {
        List list = this.f34728a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f34728a, "AggregatorGamesSearchResponse(games=", Separators.RPAREN);
    }
}
