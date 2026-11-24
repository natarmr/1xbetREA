package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class i81 implements t81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14320a;

    public i81(String str) {
        this.f14320a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i81) && this.f14320a.equals(((i81) obj).f14320a);
    }

    public final int hashCode() {
        return this.f14320a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowGameUrlError(description=", this.f14320a, Separators.RPAREN);
    }
}
