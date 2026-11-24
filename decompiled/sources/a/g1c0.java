package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class g1c0 implements o1c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10507a;

    public g1c0(int i) {
        this.f10507a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1c0) && this.f10507a == ((g1c0) obj).f10507a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10507a);
    }

    public final String toString() {
        return ua80.e(this.f10507a, "GenderDialog(selectedGenderId=", Separators.RPAREN);
    }
}
