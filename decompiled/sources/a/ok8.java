package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ok8 implements sk8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25394a;

    public ok8(int i) {
        this.f25394a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ok8) && this.f25394a == ((ok8) obj).f25394a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25394a);
    }

    public final String toString() {
        return ua80.e(this.f25394a, "OnRefuseBonus(bonusId=", Separators.RPAREN);
    }
}
