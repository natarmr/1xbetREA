package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class h510 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12459a;
    public final String b;

    public h510(String str, String str2) {
        this.f12459a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h510)) {
            return false;
        }
        h510 h510Var = (h510) obj;
        return this.f12459a.equals(h510Var.f12459a) && this.b.equals(h510Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12459a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("LolStatisticMatchesMatchTeamPlayerTrinketModel(name=", this.f12459a, ", image=", this.b, Separators.RPAREN);
    }
}
