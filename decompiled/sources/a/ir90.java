package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ir90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15245a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;

    public ir90(boolean z, String str, String str2, boolean z2, boolean z3, String str3, String str4, String str5, boolean z4) {
        str.getClass();
        str2.getClass();
        this.f15245a = z;
        this.b = str;
        this.c = str2;
        this.d = z2;
        this.e = z3;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir90)) {
            return false;
        }
        ir90 ir90Var = (ir90) obj;
        return this.f15245a == ir90Var.f15245a && Intrinsics.d(this.b, ir90Var.b) && Intrinsics.d(this.c, ir90Var.c) && this.d == ir90Var.d && this.e == ir90Var.e && this.f.equals(ir90Var.f) && this.g.equals(ir90Var.g) && this.h.equals(ir90Var.h) && this.i == ir90Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ua80.b(ua80.b(ua80.b(brm0.e(brm0.e(ua80.b(ua80.b(Boolean.hashCode(this.f15245a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("PickerUiModel(hasSearch=", ", searchHint=", this.b, this.f15245a, ", title=");
        brm0.C(this.c, ", isOfferPhoneCodeVisible=", ", isEnterPhoneCodeVisible=", sbQ, this.d);
        f140.s(", searchValue=", this.f, ", phoneCodeByManuallyValue=", sbQ, this.e);
        f140.v(sbQ, this.g, ", phoneCodeByManuallyError=", this.h, ", isExpanded=");
        return rw2.p(sbQ, this.i, Separators.RPAREN);
    }
}
