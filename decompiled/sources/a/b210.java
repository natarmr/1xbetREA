package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b210 implements f210 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1835a;

    public final boolean equals(Object obj) {
        if (obj instanceof b210) {
            return this.f1835a == ((b210) obj).f1835a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1835a);
    }

    public final String toString() {
        return ua80.e(this.f1835a, "TabMapClick(value=", Separators.RPAREN);
    }
}
