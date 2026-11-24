package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z9x implements bax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44043a;

    public final boolean equals(Object obj) {
        if (obj instanceof z9x) {
            return this.f44043a == ((z9x) obj).f44043a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44043a);
    }

    public final String toString() {
        return ua80.e(this.f44043a, "IconResId(value=", Separators.RPAREN);
    }
}
