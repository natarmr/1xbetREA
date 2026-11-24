package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qli0 implements rli0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28936a;

    public final boolean equals(Object obj) {
        if (obj instanceof qli0) {
            return this.f28936a.equals(((qli0) obj).f28936a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28936a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowServerErrorDialog(message=", this.f28936a, Separators.RPAREN);
    }
}
