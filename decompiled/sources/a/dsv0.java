package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dsv0 implements esv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6633a;

    public dsv0(float f) {
        this.f6633a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dsv0) && Float.compare(this.f6633a, ((dsv0) obj).f6633a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6633a);
    }

    public final String toString() {
        return rw2.j(this.f6633a, "FractionOfHost(fraction=", Separators.RPAREN);
    }
}
