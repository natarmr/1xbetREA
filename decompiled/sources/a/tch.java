package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tch implements cdh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33719a;

    public final boolean equals(Object obj) {
        if (obj instanceof tch) {
            return this.f33719a == ((tch) obj).f33719a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33719a);
    }

    public final String toString() {
        return ua80.e(this.f33719a, "Background(value=", Separators.RPAREN);
    }
}
