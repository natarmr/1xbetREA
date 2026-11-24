package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pcc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26753a;
    public final int b;

    public pcc0(String str, int i) {
        str.getClass();
        this.f26753a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcc0)) {
            return false;
        }
        pcc0 pcc0Var = (pcc0) obj;
        return Intrinsics.d(this.f26753a, pcc0Var.f26753a) && this.b == pcc0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f26753a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "PromoCmsPromotionInfoTicketTypeModel(typeName=", this.f26753a, ", typeId=", Separators.RPAREN);
    }
}
