package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rcc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f30232a;
    public final Date b;

    public rcc0(Boolean bool, Date date) {
        this.f30232a = bool;
        this.b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcc0)) {
            return false;
        }
        rcc0 rcc0Var = (rcc0) obj;
        return Intrinsics.d(this.f30232a, rcc0Var.f30232a) && Intrinsics.d(this.b, rcc0Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.f30232a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Date date = this.b;
        return iHashCode + (date != null ? date.hashCode() : 0);
    }

    public final String toString() {
        return "PromoCmsPromotionInfoUserDataModel(isConfirmed=" + this.f30232a + ", confirmationDate=" + this.b + Separators.RPAREN;
    }
}
