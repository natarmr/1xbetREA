package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class js8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17038a;

    public js8(int i) {
        this.f17038a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof js8) && this.f17038a == ((js8) obj).f17038a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17038a);
    }

    public final String toString() {
        return ua80.e(this.f17038a, "ColumnConfigurationCache(horizontalPageOffsetValue=", Separators.RPAREN);
    }
}
