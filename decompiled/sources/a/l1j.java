package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class l1j implements n1j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19256a;

    public l1j(int i) {
        this.f19256a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1j) && this.f19256a == ((l1j) obj).f19256a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19256a);
    }

    public final String toString() {
        return ua80.e(this.f19256a, "OnButtonSkipClick(currentPage=", Separators.RPAREN);
    }
}
