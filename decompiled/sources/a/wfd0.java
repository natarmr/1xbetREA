package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wfd0 implements xfd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39067a;

    public wfd0(String str) {
        this.f39067a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wfd0) && this.f39067a.equals(((wfd0) obj).f39067a);
    }

    public final int hashCode() {
        return this.f39067a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowTokenExpiredDialog(message=", this.f39067a, Separators.RPAREN);
    }
}
