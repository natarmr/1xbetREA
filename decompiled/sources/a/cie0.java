package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class cie0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4409a;

    public cie0(int i) {
        this.f4409a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cie0) && this.f4409a == ((cie0) obj).f4409a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4409a) + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return ua80.e(this.f4409a, "RedCardCounterStateModel(isVisible=false, counter=", Separators.RPAREN);
    }
}
