package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ekp0 implements gkp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7964a;

    public ekp0(String str) {
        this.f7964a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ekp0) && this.f7964a.equals(((ekp0) obj).f7964a);
    }

    public final int hashCode() {
        return this.f7964a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPlayerClicked(playerId=", this.f7964a, Separators.RPAREN);
    }
}
