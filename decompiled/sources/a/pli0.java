package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pli0 implements rli0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27183a;

    public final boolean equals(Object obj) {
        if (obj instanceof pli0) {
            return this.f27183a.equals(((pli0) obj).f27183a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27183a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f27183a, Separators.RPAREN);
    }
}
