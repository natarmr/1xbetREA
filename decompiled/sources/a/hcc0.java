package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hcc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12816a;
    public final int b;

    public hcc0(String str, int i) {
        str.getClass();
        this.f12816a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcc0)) {
            return false;
        }
        hcc0 hcc0Var = (hcc0) obj;
        return Intrinsics.d(this.f12816a, hcc0Var.f12816a) && this.b == hcc0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f12816a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "PromoCmsPromotionInfoPointTypeModel(typeName=", this.f12816a, ", typeId=", Separators.RPAREN);
    }
}
