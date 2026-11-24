package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class l5p0 {
    public static final k5p0 Companion = new k5p0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new fno0(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f19470a;
    public final List b;

    public /* synthetic */ l5p0(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f19470a = null;
        } else {
            this.f19470a = num;
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
        if (!(obj instanceof l5p0)) {
            return false;
        }
        l5p0 l5p0Var = (l5p0) obj;
        return Intrinsics.d(this.f19470a, l5p0Var.f19470a) && Intrinsics.d(this.b, l5p0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f19470a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f19470a, "TeamChampStatisticResponse(sportId=", ", response=", Separators.RPAREN, this.b);
    }
}
