package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j410 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15862a;
    public final String b;

    public j410(String str, String str2) {
        this.f15862a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j410)) {
            return false;
        }
        j410 j410Var = (j410) obj;
        return this.f15862a.equals(j410Var.f15862a) && this.b.equals(j410Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15862a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("LolStatisticMatchesMatchTeamBanModel(name=", this.f15862a, ", imageS3=", this.b, Separators.RPAREN);
    }
}
