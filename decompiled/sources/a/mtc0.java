package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mtc0 implements otc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22364a;

    public final boolean equals(Object obj) {
        if (obj instanceof mtc0) {
            return this.f22364a == ((mtc0) obj).f22364a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22364a);
    }

    public final String toString() {
        return ua80.e(this.f22364a, "Title(value=", Separators.RPAREN);
    }
}
