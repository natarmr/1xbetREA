package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nmd extends qmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23765a;

    public nmd(int i) {
        this.f23765a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nmd) && this.f23765a == ((nmd) obj).f23765a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23765a);
    }

    public final String toString() {
        return ua80.e(this.f23765a, "PeriodSizeChanged(compressedPeriodInfoUiModelListSize=", Separators.RPAREN);
    }
}
