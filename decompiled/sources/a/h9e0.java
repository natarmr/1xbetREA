package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class h9e0 implements i9e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12672a;

    public h9e0(int i) {
        this.f12672a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9e0) && this.f12672a == ((h9e0) obj).f12672a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12672a);
    }

    public final String toString() {
        return ua80.e(this.f12672a, "Rated(value=", Separators.RPAREN);
    }
}
