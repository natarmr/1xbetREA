package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class z410 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43746a;
    public final String b;
    public final boolean c;

    public z410(String str, String str2, boolean z) {
        this.f43746a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z410)) {
            return false;
        }
        z410 z410Var = (z410) obj;
        return this.f43746a.equals(z410Var.f43746a) && this.b.equals(z410Var.b) && this.c == z410Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f43746a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("LolStatisticMatchesMatchTeamPlayerRuneModel(name=", this.f43746a, ", image=", this.b, ", selected="), this.c, Separators.RPAREN);
    }
}
