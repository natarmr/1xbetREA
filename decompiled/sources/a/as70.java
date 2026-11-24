package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class as70 implements cs70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1379a;

    public as70(int i) {
        this.f1379a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof as70) && this.f1379a == ((as70) obj).f1379a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1379a);
    }

    public final String toString() {
        return ua80.e(this.f1379a, "OnRatingStarClicked(ratingValue=", Separators.RPAREN);
    }
}
