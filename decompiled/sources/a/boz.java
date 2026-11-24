package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class boz implements foz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2955a;

    public final boolean equals(Object obj) {
        if (obj instanceof boz) {
            return this.f2955a == ((boz) obj).f2955a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2955a);
    }

    public final String toString() {
        return ua80.e(this.f2955a, "EndsAt(value=", Separators.RPAREN);
    }
}
