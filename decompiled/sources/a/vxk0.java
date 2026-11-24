package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class vxk0 {
    public static final uxk0 Companion = new uxk0();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new pdk0(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f38203a;
    public final Integer b;
    public final List c;

    public /* synthetic */ vxk0(int i, Long l, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f38203a = null;
        } else {
            this.f38203a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxk0)) {
            return false;
        }
        vxk0 vxk0Var = (vxk0) obj;
        return Intrinsics.d(this.f38203a, vxk0Var.f38203a) && Intrinsics.d(this.b, vxk0Var.b) && Intrinsics.d(this.c, vxk0Var.c);
    }

    public final int hashCode() {
        Long l = this.f38203a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(cs0.q(this.b, this.f38203a, "SpinAllResponse(freeSpinTimer=", ", freeSpinCounts=", ", prizes="), this.c, Separators.RPAREN);
    }
}
