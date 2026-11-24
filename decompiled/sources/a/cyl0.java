package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class cyl0 {
    public static final byl0 Companion = new byl0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new fzk0(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f5183a;
    public final List b;

    public /* synthetic */ cyl0(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f5183a = null;
        } else {
            this.f5183a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyl0)) {
            return false;
        }
        cyl0 cyl0Var = (cyl0) obj;
        return Intrinsics.d(this.f5183a, cyl0Var.f5183a) && Intrinsics.d(this.b, cyl0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f5183a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f5183a, "StadiumsResponse(sportId=", ", response=", Separators.RPAREN, this.b);
    }
}
