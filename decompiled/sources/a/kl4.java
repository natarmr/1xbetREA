package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kl4 implements xl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18468a;

    public kl4(boolean z) {
        this.f18468a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kl4) && this.f18468a == ((kl4) obj).f18468a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18468a);
    }

    public final String toString() {
        return defpackage.c.d("SetActivatePhoneNecessarily(isActivatePhoneNecessarily=", Separators.RPAREN, this.f18468a);
    }
}
