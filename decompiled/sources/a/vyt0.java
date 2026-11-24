package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vyt0 implements zyt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38266a;

    public final boolean equals(Object obj) {
        if (obj instanceof vyt0) {
            return this.f38266a == ((vyt0) obj).f38266a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38266a);
    }

    public final String toString() {
        return ua80.e(this.f38266a, "TabMapClick(value=", Separators.RPAREN);
    }
}
