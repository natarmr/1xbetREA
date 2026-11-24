package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class xmn {
    public static final wmn Companion = new wmn();
    public static final a8z[] b = {maz.a(wez.f39042a, new dcn(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41135a;

    public /* synthetic */ xmn(int i, List list) {
        if ((i & 1) == 0) {
            this.f41135a = null;
        } else {
            this.f41135a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xmn) && Intrinsics.d(this.f41135a, ((xmn) obj).f41135a);
    }

    public final int hashCode() {
        List list = this.f41135a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f41135a, "EditCouponResponse(betInfoResponses=", Separators.RPAREN);
    }
}
