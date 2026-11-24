package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wpb0 implements ypb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39537a;

    public wpb0(int i) {
        this.f39537a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wpb0) && this.f39537a == ((wpb0) obj).f39537a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39537a);
    }

    public final String toString() {
        return ua80.e(this.f39537a, "Exactly(width=", Separators.RPAREN);
    }
}
