package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sg30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg30 f32141a;

    public final boolean equals(Object obj) {
        if (obj instanceof sg30) {
            return this.f32141a == ((sg30) obj).f32141a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32141a.hashCode();
    }

    public final String toString() {
        return "OnMatchTypeClick(matchType=" + this.f32141a + Separators.RPAREN;
    }
}
