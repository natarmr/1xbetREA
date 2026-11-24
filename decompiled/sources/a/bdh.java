package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bdh implements cdh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f2399a;

    public final boolean equals(Object obj) {
        if (obj instanceof bdh) {
            return this.f2399a.equals(((bdh) obj).f2399a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2399a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("SecondTeamScore(value=", this.f2399a, Separators.RPAREN);
    }
}
