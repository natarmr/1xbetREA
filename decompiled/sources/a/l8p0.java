package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class l8p0 implements m8p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19617a;

    public l8p0(String str) {
        this.f19617a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l8p0) && this.f19617a.equals(((l8p0) obj).f19617a);
    }

    public final int hashCode() {
        return this.f19617a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnTransferPlayerClick(playerName=", this.f19617a, Separators.RPAREN);
    }
}
