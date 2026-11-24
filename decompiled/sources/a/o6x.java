package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class o6x implements r6x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24759a;

    public o6x(int i) {
        this.f24759a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6x) && this.f24759a == ((o6x) obj).f24759a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24759a);
    }

    public final String toString() {
        return ua80.e(this.f24759a, "Enabled(backgroundColor=", Separators.RPAREN);
    }
}
