package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i9k implements k9k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14391a;

    public i9k(String str) {
        this.f14391a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i9k) && this.f14391a.equals(((i9k) obj).f14391a);
    }

    public final int hashCode() {
        return this.f14391a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenErrorDialogWithMessage(message=", this.f14391a, Separators.RPAREN);
    }
}
