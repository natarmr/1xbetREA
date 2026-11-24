package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class th10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33941a;
    public final String b;

    public th10(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f33941a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th10)) {
            return false;
        }
        th10 th10Var = (th10) obj;
        return Intrinsics.d(this.f33941a, th10Var.f33941a) && Intrinsics.d(this.b, th10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33941a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("LoyaltyProgramCurrencyModel(currencyCode=", this.f33941a, ", currencySymbol=", this.b, Separators.RPAREN);
    }
}
