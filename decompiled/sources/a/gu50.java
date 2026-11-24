package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gu50 implements hu50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11913a;

    public gu50(int i) {
        this.f11913a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gu50) && this.f11913a == ((gu50) obj).f11913a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11913a);
    }

    public final String toString() {
        return ua80.e(this.f11913a, "PageSelected(selectedPageIndex=", Separators.RPAREN);
    }
}
