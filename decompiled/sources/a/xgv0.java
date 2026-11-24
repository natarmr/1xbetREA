package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xgv0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f40858a;

    public final boolean equals(Object obj) {
        if (obj instanceof xgv0) {
            return this.f40858a.equals(((xgv0) obj).f40858a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40858a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("FirstTeamWinRate(value=", this.f40858a, Separators.RPAREN);
    }
}
