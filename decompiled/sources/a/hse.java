package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class hse implements ise {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13577a;

    public final boolean equals(Object obj) {
        if (obj instanceof hse) {
            return this.f13577a == ((hse) obj).f13577a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13577a);
    }

    public final String toString() {
        return ua80.e(this.f13577a, "TitleTextStyle(value=", Separators.RPAREN);
    }
}
