package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class oya0 implements aza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26053a;

    public oya0(int i) {
        this.f26053a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oya0) && this.f26053a == ((oya0) obj).f26053a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26053a);
    }

    public final String toString() {
        return ua80.e(this.f26053a, "OnSaveSeenBanner(bannerId=", Separators.RPAREN);
    }
}
