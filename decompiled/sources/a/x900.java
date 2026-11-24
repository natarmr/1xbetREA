package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class x900 implements aa00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40487a;

    public x900(String str) {
        this.f40487a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x900) && this.f40487a.equals(((x900) obj).f40487a);
    }

    public final int hashCode() {
        return this.f40487a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPlayerItemClick(playerId=", this.f40487a, Separators.RPAREN);
    }
}
