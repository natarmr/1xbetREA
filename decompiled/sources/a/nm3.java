package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nm3 implements pm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23753a;

    public final boolean equals(Object obj) {
        if (obj instanceof nm3) {
            return this.f23753a == ((nm3) obj).f23753a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23753a);
    }

    public final String toString() {
        return ua80.e(this.f23753a, "Continue(progress=", Separators.RPAREN);
    }
}
