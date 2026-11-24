package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class zgn {
    public static final ygn Companion = new ygn();
    public static final a8z[] b = {maz.a(wez.f39042a, new dcn(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44352a;

    public /* synthetic */ zgn(int i, List list) {
        if ((i & 1) == 0) {
            this.f44352a = null;
        } else {
            this.f44352a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zgn) && Intrinsics.d(this.f44352a, ((zgn) obj).f44352a);
    }

    public final int hashCode() {
        List list = this.f44352a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f44352a, "EarnedPointsResponse(earnedTableResponse=", Separators.RPAREN);
    }
}
