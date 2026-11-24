package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bo5 implements co5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2914a;

    public final boolean equals(Object obj) {
        if (obj instanceof bo5) {
            return this.f2914a == ((bo5) obj).f2914a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2914a);
    }

    public final String toString() {
        return ua80.e(this.f2914a, "ImageRes(value=", Separators.RPAREN);
    }
}
