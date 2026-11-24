package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class uu7 implements dv7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36286a;

    public uu7(String str) {
        this.f36286a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uu7) && this.f36286a.equals(((uu7) obj).f36286a);
    }

    public final int hashCode() {
        return this.f36286a.hashCode();
    }

    public final String toString() {
        return kng0.l("BetExistsError(data=", this.f36286a, Separators.RPAREN);
    }
}
