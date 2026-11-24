package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pk90 implements rk90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27126a;

    public pk90(int i) {
        this.f27126a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pk90) && this.f27126a == ((pk90) obj).f27126a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27126a);
    }

    public final String toString() {
        return ua80.e(this.f27126a, "Header(titleTextRes=", Separators.RPAREN);
    }
}
