package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class lbc0 {
    public static final kbc0 Companion = new kbc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19749a;
    public final Integer b;

    public /* synthetic */ lbc0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f19749a = null;
        } else {
            this.f19749a = str;
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
        if (!(obj instanceof lbc0)) {
            return false;
        }
        lbc0 lbc0Var = (lbc0) obj;
        return Intrinsics.d(this.f19749a, lbc0Var.f19749a) && Intrinsics.d(this.b, lbc0Var.b);
    }

    public final int hashCode() {
        String str = this.f19749a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "PromoCmsGetPromotionPointTypeResponse(typeName=" + this.f19749a + ", typeId=" + this.b + Separators.RPAREN;
    }
}
