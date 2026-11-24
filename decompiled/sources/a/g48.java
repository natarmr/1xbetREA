package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g48 implements k48 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10651a;

    public g48(int i) {
        this.f10651a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g48) && this.f10651a == ((g48) obj).f10651a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10651a);
    }

    public final String toString() {
        return ua80.e(this.f10651a, "OnPhotoChanged(position=", Separators.RPAREN);
    }
}
