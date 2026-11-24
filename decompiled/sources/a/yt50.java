package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yt50 implements bu50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43201a;

    public yt50(int i) {
        this.f43201a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yt50) && this.f43201a == ((yt50) obj).f43201a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43201a);
    }

    public final String toString() {
        return ua80.e(this.f43201a, "OnCategoryAllClick(categoryId=", Separators.RPAREN);
    }
}
