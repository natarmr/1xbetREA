package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class wwp {
    public static final vwp Companion = new vwp();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new dfp(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f39895a;
    public final List b;

    public /* synthetic */ wwp(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f39895a = null;
        } else {
            this.f39895a = num;
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
        if (!(obj instanceof wwp)) {
            return false;
        }
        wwp wwpVar = (wwp) obj;
        return Intrinsics.d(this.f39895a, wwpVar.f39895a) && Intrinsics.d(this.b, wwpVar.b);
    }

    public final int hashCode() {
        Integer num = this.f39895a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f39895a, "FighterResultsResponse(count=", ", items=", Separators.RPAREN, this.b);
    }
}
