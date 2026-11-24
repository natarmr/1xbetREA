package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bhv0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f2627a;

    public final boolean equals(Object obj) {
        if (obj instanceof bhv0) {
            return this.f2627a.equals(((bhv0) obj).f2627a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2627a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("SecondTeamWinRate(value=", this.f2627a, Separators.RPAREN);
    }
}
