package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class o9g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24878a;

    public o9g(int i) {
        this.f24878a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o9g) && this.f24878a == ((o9g) obj).f24878a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24878a);
    }

    public final String toString() {
        return ua80.e(this.f24878a, "DrawRowIndex(value=", Separators.RPAREN);
    }
}
