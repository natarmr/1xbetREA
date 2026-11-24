package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gxh implements ixh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12077a;

    public gxh(String str) {
        this.f12077a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxh) && this.f12077a.equals(((gxh) obj).f12077a);
    }

    public final int hashCode() {
        return this.f12077a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPlayerClicked(playerId=", this.f12077a, Separators.RPAREN);
    }
}
