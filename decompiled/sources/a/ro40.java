package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ro40 implements uo40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30819a;

    public ro40(int i) {
        this.f30819a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ro40) && this.f30819a == ((ro40) obj).f30819a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30819a);
    }

    public final String toString() {
        return ua80.e(this.f30819a, "OnLimitValueSelect(index=", Separators.RPAREN);
    }
}
