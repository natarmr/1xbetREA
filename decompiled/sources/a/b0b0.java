package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b0b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1759a;
    public final boolean b;
    public final uhc0 c;

    public b0b0(boolean z, boolean z2, uhc0 uhc0Var) {
        this.f1759a = z;
        this.b = z2;
        this.c = uhc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0b0)) {
            return false;
        }
        b0b0 b0b0Var = (b0b0) obj;
        return this.f1759a == b0b0Var.f1759a && this.b == b0b0Var.b && Intrinsics.d(this.c, b0b0Var.c);
    }

    public final int hashCode() {
        int iE = brm0.e(Boolean.hashCode(this.f1759a) * 31, 31, this.b);
        uhc0 uhc0Var = this.c;
        return iE + (uhc0Var == null ? 0 : uhc0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PromoEntitiesState(isLoading=", ", isError=", ", promoEntitiesModel=", this.f1759a, this.b);
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
