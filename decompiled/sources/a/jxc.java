package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jxc implements kxc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17299a;

    public jxc(int i) {
        this.f17299a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxc) && this.f17299a == ((jxc) obj).f17299a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17299a);
    }

    public final String toString() {
        return ua80.e(this.f17299a, "ScrollToPageWithSavedPosition(selectedPosition=", Separators.RPAREN);
    }
}
