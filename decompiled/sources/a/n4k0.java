package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class n4k0 implements p4k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22902a;

    public final boolean equals(Object obj) {
        if (obj instanceof n4k0) {
            return this.f22902a == ((n4k0) obj).f22902a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22902a);
    }

    public final String toString() {
        return ua80.e(this.f22902a, "Background(value=", Separators.RPAREN);
    }
}
