package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class xf4 implements yf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40774a;

    public final boolean equals(Object obj) {
        if (obj instanceof xf4) {
            return this.f40774a == ((xf4) obj).f40774a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40774a);
    }

    public final String toString() {
        return ua80.e(this.f40774a, "ShowLoginBySocialDialog(social=", Separators.RPAREN);
    }
}
