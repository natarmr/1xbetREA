package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ehr0 implements ghr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7821a;

    public ehr0(int i) {
        this.f7821a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ehr0) && this.f7821a == ((ehr0) obj).f7821a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7821a);
    }

    public final String toString() {
        return ua80.e(this.f7821a, "OnTotoBetTypeChangedFromBottomSheet(typeId=", Separators.RPAREN);
    }
}
