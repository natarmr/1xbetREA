package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lic0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20097a;
    public final int b;
    public final Boolean c;

    public lic0(int i, int i2, Boolean bool) {
        this.f20097a = i;
        this.b = i2;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lic0)) {
            return false;
        }
        lic0 lic0Var = (lic0) obj;
        return this.f20097a == lic0Var.f20097a && this.b == lic0Var.b && Intrinsics.d(this.c, lic0Var.c);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, Integer.hashCode(this.f20097a) * 31, 31);
        Boolean bool = this.c;
        return iA + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return defpackage.c.e(dw9.t("PromoGamePageKey(bonusId=", this.f20097a, ", skip=", ", test=", this.b), this.c, Separators.RPAREN);
    }
}
