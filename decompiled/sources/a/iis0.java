package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iis0 implements pis0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14843a;

    public iis0(String str) {
        this.f14843a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iis0) && this.f14843a.equals(((iis0) obj).f14843a);
    }

    public final int hashCode() {
        return this.f14843a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPlayerClick(playerName=", this.f14843a, Separators.RPAREN);
    }
}
