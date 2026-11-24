package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cuv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5004a;
    public final Integer b;

    public cuv0(Integer num, List list) {
        list.getClass();
        this.f5004a = list;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuv0)) {
            return false;
        }
        cuv0 cuv0Var = (cuv0) obj;
        return Intrinsics.d(this.f5004a, cuv0Var.f5004a) && Intrinsics.d(this.b, cuv0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f5004a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "XBottomSheetEnterExitPlan(blocks=" + this.f5004a + ", handleIndex=" + this.b + Separators.RPAREN;
    }
}
