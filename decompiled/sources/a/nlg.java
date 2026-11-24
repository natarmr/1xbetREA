package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nlg implements plg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23725a;

    public nlg(long j) {
        this.f23725a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nlg) && this.f23725a == ((nlg) obj).f23725a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23725a);
    }

    public final String toString() {
        return axq.h(this.f23725a, "OnChampLineGamesClick(champId=", Separators.RPAREN);
    }
}
