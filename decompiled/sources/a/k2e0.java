package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class k2e0 implements l2e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17567a;

    public k2e0(int i) {
        this.f17567a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2e0) && this.f17567a == ((k2e0) obj).f17567a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17567a);
    }

    public final String toString() {
        return ua80.e(this.f17567a, "OnSelectRating(rating=", Separators.RPAREN);
    }
}
