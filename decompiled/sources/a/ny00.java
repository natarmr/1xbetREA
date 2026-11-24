package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ny00 implements yy00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24308a;

    public final boolean equals(Object obj) {
        if (obj instanceof ny00) {
            return this.f24308a.equals(((ny00) obj).f24308a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24308a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnMatchClick(value=", this.f24308a, Separators.RPAREN);
    }
}
