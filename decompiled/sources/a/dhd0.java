package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dhd0 implements khd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6085a;

    public dhd0(String str) {
        this.f6085a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhd0) && this.f6085a.equals(((dhd0) obj).f6085a);
    }

    public final int hashCode() {
        return this.f6085a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowCodeAlreadySentError(message=", this.f6085a, Separators.RPAREN);
    }
}
