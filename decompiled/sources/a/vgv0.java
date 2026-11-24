package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vgv0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37401a;

    public final boolean equals(Object obj) {
        if (obj instanceof vgv0) {
            return this.f37401a == ((vgv0) obj).f37401a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37401a);
    }

    public final String toString() {
        return ua80.e(this.f37401a, "Background(value=", Separators.RPAREN);
    }
}
