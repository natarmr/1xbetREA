package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class u9o implements z9o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35293a;

    public u9o(int i) {
        this.f35293a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u9o) && this.f35293a == ((u9o) obj).f35293a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35293a);
    }

    public final String toString() {
        return ua80.e(this.f35293a, "ShowFavoriteError(message=", Separators.RPAREN);
    }
}
