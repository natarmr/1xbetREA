package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vjn0 implements xjn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37537a;

    public final boolean equals(Object obj) {
        if (obj instanceof vjn0) {
            return this.f37537a == ((vjn0) obj).f37537a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37537a);
    }

    public final String toString() {
        return ua80.e(this.f37537a, "SubTitleResId(value=", Separators.RPAREN);
    }
}
