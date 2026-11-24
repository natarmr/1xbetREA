package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class x1f implements y1f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40119a;

    public x1f(int i) {
        this.f40119a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1f) && this.f40119a == ((x1f) obj).f40119a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40119a);
    }

    public final String toString() {
        return ua80.e(this.f40119a, "OnSegmentSelect(index=", Separators.RPAREN);
    }
}
