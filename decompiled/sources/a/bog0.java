package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bog0 implements fog0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2932a;

    public bog0(String str) {
        this.f2932a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bog0) && this.f2932a.equals(((bog0) obj).f2932a);
    }

    public final int hashCode() {
        return this.f2932a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenDeeplink(link=", this.f2932a, Separators.RPAREN);
    }
}
