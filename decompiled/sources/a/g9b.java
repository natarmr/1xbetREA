package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g9b implements i9b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10905a;

    public g9b(int i) {
        this.f10905a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g9b) && this.f10905a == ((g9b) obj).f10905a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10905a);
    }

    public final String toString() {
        return ua80.e(this.f10905a, "SpaceCellData(width=", Separators.RPAREN);
    }
}
