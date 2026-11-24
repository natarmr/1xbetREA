package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class he00 implements pe00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12897a;

    public he00(String str) {
        this.f12897a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof he00) && this.f12897a.equals(((he00) obj).f12897a);
    }

    public final int hashCode() {
        return this.f12897a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenBrowser(link=", this.f12897a, Separators.RPAREN);
    }
}
