package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wg90 extends xg90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39103a;

    public wg90(String str) {
        this.f39103a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wg90) && this.f39103a.equals(((wg90) obj).f39103a);
    }

    public final int hashCode() {
        return this.f39103a.hashCode();
    }

    public final String toString() {
        return kng0.l("RequestRequired(permission=", this.f39103a, Separators.RPAREN);
    }
}
