package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class kow {
    public static final jow Companion = new jow();
    public static final a8z[] b = {maz.a(wez.f39042a, new kdw(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18650a;

    public /* synthetic */ kow(int i, List list) {
        if ((i & 1) == 0) {
            this.f18650a = null;
        } else {
            this.f18650a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kow) && Intrinsics.d(this.f18650a, ((kow) obj).f18650a);
    }

    public final int hashCode() {
        List list = this.f18650a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f18650a, "HorseRacesStatisticResponse(statistics=", Separators.RPAREN);
    }
}
