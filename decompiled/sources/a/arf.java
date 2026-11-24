package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class arf implements brf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1344a;

    public final boolean equals(Object obj) {
        if (obj instanceof arf) {
            return this.f1344a == ((arf) obj).f1344a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1344a);
    }

    public final String toString() {
        return ua80.e(this.f1344a, "TextBackgroundColorIndicator(value=", Separators.RPAREN);
    }
}
