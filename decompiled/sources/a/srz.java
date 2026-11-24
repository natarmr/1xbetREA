package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class srz implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32702a;

    public srz(int i) {
        this.f32702a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof srz) && this.f32702a == ((srz) obj).f32702a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32702a);
    }

    public final String toString() {
        return ua80.e(this.f32702a, "LimitTitleUiModel(stringResId=", Separators.RPAREN);
    }
}
