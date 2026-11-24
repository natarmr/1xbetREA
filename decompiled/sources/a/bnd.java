package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bnd extends ind {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2877a;

    public bnd(int i) {
        this.f2877a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bnd) && this.f2877a == ((bnd) obj).f2877a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2877a);
    }

    public final String toString() {
        return ua80.e(this.f2877a, "PeriodSizeChange(compressedPeriodInfoUiModelListSize=", Separators.RPAREN);
    }
}
