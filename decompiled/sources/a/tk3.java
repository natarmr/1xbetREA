package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tk3 implements xk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34074a;

    public final boolean equals(Object obj) {
        if (obj instanceof tk3) {
            return this.f34074a == ((tk3) obj).f34074a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34074a);
    }

    public final String toString() {
        return ua80.e(this.f34074a, "Download(process=", Separators.RPAREN);
    }
}
