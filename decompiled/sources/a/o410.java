package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class o410 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24611a;
    public final String b;

    public o410(String str, String str2) {
        this.f24611a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o410)) {
            return false;
        }
        o410 o410Var = (o410) obj;
        return this.f24611a.equals(o410Var.f24611a) && this.b.equals(o410Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24611a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("LolStatisticMatchesMatchTeamPlayerItemModel(name=", this.f24611a, ", image=", this.b, Separators.RPAREN);
    }
}
