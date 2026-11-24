package a;

import android.gov.nist.core.Separators;
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hl50 {
    public static final String b = wv00.h("NetworkRequestCompat");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13241a;

    public hl50(NetworkRequest networkRequest) {
        this.f13241a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hl50) && Intrinsics.d(this.f13241a, ((hl50) obj).f13241a);
    }

    public final int hashCode() {
        Object obj = this.f13241a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f13241a, "NetworkRequestCompat(wrapped=", Separators.RPAREN);
    }
}
