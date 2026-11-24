package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ev70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8455a;

    public ev70(String str) {
        this.f8455a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ev70) && this.f8455a.equals(((ev70) obj).f8455a);
    }

    public final int hashCode() {
        return this.f8455a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpaqueKey(key=", this.f8455a, Separators.RPAREN);
    }
}
