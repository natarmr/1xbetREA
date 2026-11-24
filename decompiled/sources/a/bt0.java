package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class bt0 {
    public static final at0 Companion = new at0();
    public static final a8z[] b = {maz.a(wez.f39042a, new mg0(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3158a;

    public /* synthetic */ bt0(int i, List list) {
        if ((i & 1) == 0) {
            this.f3158a = null;
        } else {
            this.f3158a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bt0) && Intrinsics.d(this.f3158a, ((bt0) obj).f3158a);
    }

    public final int hashCode() {
        List list = this.f3158a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f3158a, "AggregatorGameBrandsResponse(games=", Separators.RPAREN);
    }
}
