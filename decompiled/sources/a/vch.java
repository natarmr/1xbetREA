package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vch implements cdh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f37187a;

    public final boolean equals(Object obj) {
        if (obj instanceof vch) {
            return this.f37187a.equals(((vch) obj).f37187a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37187a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("FirstTeamScore(value=", this.f37187a, Separators.RPAREN);
    }
}
