package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class esf {
    public static final dsf Companion = new dsf();
    public static final a8z[] b = {maz.a(wez.f39042a, new dpf((byte) 10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8324a;

    public /* synthetic */ esf(int i, List list) {
        if ((i & 1) == 0) {
            this.f8324a = null;
        } else {
            this.f8324a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof esf) && Intrinsics.d(this.f8324a, ((esf) obj).f8324a);
    }

    public final int hashCode() {
        List list = this.f8324a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f8324a, "Cs2TeamMapsResponse(mapStatistic=", Separators.RPAREN);
    }
}
