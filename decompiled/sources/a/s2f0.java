package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s2f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31499a;

    public s2f0(int i) {
        this.f31499a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2f0) && this.f31499a == ((s2f0) obj).f31499a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31499a);
    }

    public final String toString() {
        return ua80.e(this.f31499a, "OnBonusSelected(selectedBonusId=", Separators.RPAREN);
    }
}
