package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tng implements vng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34232a;

    public final boolean equals(Object obj) {
        if (obj instanceof tng) {
            return this.f34232a.equals(((tng) obj).f34232a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34232a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondPlayerStatus(value=", this.f34232a, Separators.RPAREN);
    }
}
