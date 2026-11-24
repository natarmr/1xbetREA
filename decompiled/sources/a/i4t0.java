package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class i4t0 implements l4t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14162a;

    public i4t0(String str) {
        this.f14162a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4t0) && this.f14162a.equals(((i4t0) obj).f14162a);
    }

    public final int hashCode() {
        return this.f14162a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstTeamWin(teamId=", this.f14162a, Separators.RPAREN);
    }
}
