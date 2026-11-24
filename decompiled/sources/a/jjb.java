package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jjb implements njb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16612a;

    public jjb(String str) {
        this.f16612a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jjb) && this.f16612a.equals(((jjb) obj).f16612a);
    }

    public final int hashCode() {
        return this.f16612a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnHeaderClick(id=", this.f16612a, Separators.RPAREN);
    }
}
