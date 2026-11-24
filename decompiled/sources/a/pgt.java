package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class pgt implements vgt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26967a;

    public final boolean equals(Object obj) {
        if (obj instanceof pgt) {
            return this.f26967a == ((pgt) obj).f26967a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26967a);
    }

    public final String toString() {
        return ua80.e(this.f26967a, "OnTimeSelectionClick(timeSelected=", Separators.RPAREN);
    }
}
