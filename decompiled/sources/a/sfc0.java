package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sfc0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32113a;
    public final String b;

    public sfc0(String str, String str2) {
        this.f32113a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfc0)) {
            return false;
        }
        sfc0 sfc0Var = (sfc0) obj;
        return this.f32113a.equals(sfc0Var.f32113a) && this.b.equals(sfc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32113a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PromoCodeUiModel(promoCode=", this.f32113a, ", promoCodeInfo=", this.b, Separators.RPAREN);
    }
}
