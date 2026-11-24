package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dx40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6830a;
    public final String b;
    public final String c;

    public dx40(String str, String str2, String str3) {
        this.f6830a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx40)) {
            return false;
        }
        dx40 dx40Var = (dx40) obj;
        return this.f6830a.equals(dx40Var.f6830a) && this.b.equals(dx40Var.b) && this.c.equals(dx40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f6830a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("MultiTeamsCompactLineEventCardModel(teamOneName=", this.f6830a, ", teamTwoName=", this.b, ", infoLabel="), this.c, Separators.RPAREN);
    }
}
