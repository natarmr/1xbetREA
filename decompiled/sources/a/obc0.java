package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class obc0 {
    public static final nbc0 Companion = new nbc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24971a;
    public final Integer b;

    public /* synthetic */ obc0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f24971a = null;
        } else {
            this.f24971a = str;
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
        if (!(obj instanceof obc0)) {
            return false;
        }
        obc0 obc0Var = (obc0) obj;
        return Intrinsics.d(this.f24971a, obc0Var.f24971a) && Intrinsics.d(this.b, obc0Var.b);
    }

    public final int hashCode() {
        String str = this.f24971a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "PromoCmsGetPromotionSpinTypeResponse(typeName=" + this.f24971a + ", typeId=" + this.b + Separators.RPAREN;
    }
}
