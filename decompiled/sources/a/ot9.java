package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ot9 implements qt9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25818a;

    public ot9(int i) {
        this.f25818a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ot9) && this.f25818a == ((ot9) obj).f25818a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25818a);
    }

    public final String toString() {
        return ua80.e(this.f25818a, "OnRatingStarClicked(ratingValue=", Separators.RPAREN);
    }
}
