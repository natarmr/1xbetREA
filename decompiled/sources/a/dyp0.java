package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dyp0 implements gyp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6905a;

    public dyp0(String str) {
        this.f6905a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dyp0) && this.f6905a.equals(((dyp0) obj).f6905a);
    }

    public final int hashCode() {
        return this.f6905a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSeasonFilterSelected(season=", this.f6905a, Separators.RPAREN);
    }
}
