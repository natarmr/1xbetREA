package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ryw implements uyw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31332a;

    public final boolean equals(Object obj) {
        if (obj instanceof ryw) {
            return this.f31332a == ((ryw) obj).f31332a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31332a);
    }

    public final String toString() {
        return ua80.e(this.f31332a, "ColorImage(colorRes=", Separators.RPAREN);
    }
}
