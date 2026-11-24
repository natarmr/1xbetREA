package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ung implements vng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35959a;

    public final boolean equals(Object obj) {
        if (obj instanceof ung) {
            return this.f35959a.equals(((ung) obj).f35959a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35959a.hashCode();
    }

    public final String toString() {
        return kng0.l("TableBackground(value=", this.f35959a, Separators.RPAREN);
    }
}
