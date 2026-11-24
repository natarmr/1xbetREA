package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class die0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6134a;

    public die0(int i) {
        this.f6134a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof die0) && this.f6134a == ((die0) obj).f6134a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6134a) + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return ua80.e(this.f6134a, "RedCardCounterUiModel(isVisible=false, counter=", Separators.RPAREN);
    }
}
