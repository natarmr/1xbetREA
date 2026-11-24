package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b2p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1864a;
    public final String b;

    public b2p0(String str, String str2) {
        this.f1864a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2p0)) {
            return false;
        }
        b2p0 b2p0Var = (b2p0) obj;
        return this.f1864a.equals(b2p0Var.f1864a) && this.b.equals(b2p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1864a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TeamBetStatisticSubTeamModel(title=", this.f1864a, ", image=", this.b, Separators.RPAREN);
    }
}
