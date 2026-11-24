package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class d510 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5482a;
    public final String b;

    public d510(String str, String str2) {
        this.f5482a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d510)) {
            return false;
        }
        d510 d510Var = (d510) obj;
        return this.f5482a.equals(d510Var.f5482a) && this.b.equals(d510Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5482a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("LolStatisticMatchesMatchTeamPlayerSpellModel(name=", this.f5482a, ", imageS3=", this.b, Separators.RPAREN);
    }
}
