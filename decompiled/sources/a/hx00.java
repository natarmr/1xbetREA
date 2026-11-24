package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hx00 implements jx00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13790a;

    public final boolean equals(Object obj) {
        if (obj instanceof hx00) {
            return this.f13790a == ((hx00) obj).f13790a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13790a);
    }

    public final String toString() {
        return ua80.e(this.f13790a, "LocalRes(value=", Separators.RPAREN);
    }
}
