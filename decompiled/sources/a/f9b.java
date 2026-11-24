package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class f9b implements i9b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9147a;

    public f9b(int i) {
        this.f9147a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f9b) && this.f9147a == ((f9b) obj).f9147a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9147a);
    }

    public final String toString() {
        return ua80.e(this.f9147a, "IconCellData(width=", Separators.RPAREN);
    }
}
