package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class uz implements yz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36513a;

    public uz(String str) {
        this.f36513a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uz) && this.f36513a.equals(((uz) obj).f36513a);
    }

    public final int hashCode() {
        return this.f36513a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowExpiredTokenError(message=", this.f36513a, Separators.RPAREN);
    }
}
