package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b3t extends l3t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1926a;

    public b3t(String str) {
        str.getClass();
        this.f1926a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3t) && Intrinsics.d(this.f1926a, ((b3t) obj).f1926a);
    }

    public final int hashCode() {
        return this.f1926a.hashCode();
    }

    public final String toString() {
        return kng0.l("ChangeCurrency(currency=", this.f1926a, Separators.RPAREN);
    }
}
