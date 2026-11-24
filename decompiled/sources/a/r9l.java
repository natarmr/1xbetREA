package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class r9l implements s9l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30088a;

    public final boolean equals(Object obj) {
        if (obj instanceof r9l) {
            return this.f30088a.equals(((r9l) obj).f30088a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30088a.hashCode();
    }

    public final String toString() {
        return kng0.l("Time(value=", this.f30088a, Separators.RPAREN);
    }
}
