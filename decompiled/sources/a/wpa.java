package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wpa extends dqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39534a;

    public wpa(int i) {
        this.f39534a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wpa) && this.f39534a == ((wpa) obj).f39534a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39534a);
    }

    public final String toString() {
        return ua80.e(this.f39534a, "PeriodSizeChange(periodInfoUiModelListSize=", Separators.RPAREN);
    }
}
