package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30220a;

    public rc3(int i) {
        this.f30220a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rc3) && this.f30220a == ((rc3) obj).f30220a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30220a);
    }

    public final String toString() {
        return ua80.e(this.f30220a, "AppBarToolbarViewModelParams(pageType=", Separators.RPAREN);
    }
}
