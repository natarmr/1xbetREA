package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ksn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18823a;
    public final String b;
    public final String c;
    public final String d;

    public ksn0(String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f18823a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksn0)) {
            return false;
        }
        ksn0 ksn0Var = (ksn0) obj;
        return Intrinsics.d(this.f18823a, ksn0Var.f18823a) && Intrinsics.d(this.b, ksn0Var.b) && Intrinsics.d(this.c, ksn0Var.c) && Intrinsics.d(this.d, ksn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f18823a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("SwipexBetSettingsUiModel(betSum=", this.f18823a, ", balanceValue=", this.b, ", currencySymbol="), this.c, ", replenishPlaceHolder=", this.d, Separators.RPAREN);
    }
}
