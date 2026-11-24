package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ep6 implements ip6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8171a;

    public ep6(String str) {
        this.f8171a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep6) && this.f8171a.equals(((ep6) obj).f8171a);
    }

    public final int hashCode() {
        return this.f8171a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f8171a, Separators.RPAREN);
    }
}
