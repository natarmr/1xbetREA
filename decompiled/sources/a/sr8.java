package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sr8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32662a;

    public sr8(int i) {
        this.f32662a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sr8) && this.f32662a == ((sr8) obj).f32662a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32662a);
    }

    public final String toString() {
        return ua80.e(this.f32662a, "ColumnConfigurationCache(horizontalPageOffsetValue=", Separators.RPAREN);
    }
}
