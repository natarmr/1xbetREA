package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ca80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3996a;

    public ca80(int i) {
        this.f3996a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ca80) && this.f3996a == ((ca80) obj).f3996a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3996a);
    }

    public final String toString() {
        return ua80.e(this.f3996a, "OrderedListAttribute(start=", Separators.RPAREN);
    }
}
