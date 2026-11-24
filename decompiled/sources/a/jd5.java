package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class jd5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16314a;

    public jd5(int i) {
        this.f16314a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jd5) && this.f16314a == ((jd5) obj).f16314a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16314a);
    }

    public final String toString() {
        return ua80.e(this.f16314a, "BackgroundStateModel(backgroundImageUrl=, placeholderRes=", Separators.RPAREN);
    }
}
