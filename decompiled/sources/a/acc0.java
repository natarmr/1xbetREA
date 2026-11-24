package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class acc0 {
    public static final zbc0 Companion = new zbc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f621a;
    public final Integer b;

    public /* synthetic */ acc0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f621a = null;
        } else {
            this.f621a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acc0)) {
            return false;
        }
        acc0 acc0Var = (acc0) obj;
        return Intrinsics.d(this.f621a, acc0Var.f621a) && Intrinsics.d(this.b, acc0Var.b);
    }

    public final int hashCode() {
        String str = this.f621a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "PromoCmsGetPromotionTicketTypeResponse(typeName=" + this.f621a + ", typeId=" + this.b + Separators.RPAREN;
    }
}
