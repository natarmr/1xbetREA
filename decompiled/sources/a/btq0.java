package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class btq0 implements htq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3195a;

    public btq0(String str) {
        this.f3195a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof btq0) && this.f3195a.equals(((btq0) obj).f3195a);
    }

    public final int hashCode() {
        return this.f3195a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenBrowser(link=", this.f3195a, Separators.RPAREN);
    }
}
