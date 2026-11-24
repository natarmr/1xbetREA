package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class o9l implements s9l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24884a;

    public final boolean equals(Object obj) {
        if (obj instanceof o9l) {
            return this.f24884a.equals(((o9l) obj).f24884a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24884a.hashCode();
    }

    public final String toString() {
        return kng0.l("Champ(value=", this.f24884a, Separators.RPAREN);
    }
}
