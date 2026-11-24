package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jy60 extends ly60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17346a;

    public jy60(int i) {
        this.f17346a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jy60) && this.f17346a == ((jy60) obj).f17346a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17346a);
    }

    public final String toString() {
        return ua80.e(this.f17346a, "OnGameTypeChipClicked(typeId=", Separators.RPAREN);
    }
}
