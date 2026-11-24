package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class k96 implements o96 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4i f17900a;

    public final boolean equals(Object obj) {
        if (obj instanceof k96) {
            return this.f17900a.equals(((k96) obj).f17900a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17900a.hashCode();
    }

    public final String toString() {
        return rz4.l("LargeCardLargeTeamLogo(model=", this.f17900a, Separators.RPAREN);
    }
}
