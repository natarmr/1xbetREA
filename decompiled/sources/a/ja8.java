package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ja8 implements qa8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16177a;

    public final boolean equals(Object obj) {
        if (obj instanceof ja8) {
            return this.f16177a == ((ja8) obj).f16177a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16177a);
    }

    public final String toString() {
        return ua80.e(this.f16177a, "BlockBetImage(value=", Separators.RPAREN);
    }
}
