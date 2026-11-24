package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class jm1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fvc0 f16741a;

    public jm1(fvc0 fvc0Var) {
        this.f16741a = fvc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jm1) && this.f16741a.equals(((jm1) obj).f16741a);
    }

    public final int hashCode() {
        return this.f16741a.hashCode();
    }

    public final String toString() {
        return "PromoScreen(promoTypeToOpen=" + this.f16741a + Separators.RPAREN;
    }
}
