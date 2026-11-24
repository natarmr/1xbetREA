package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pm9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27219a;
    public final String b;
    public final float c;
    public final float d;
    public final float e;

    public pm9(String str, String str2, float f, float f2, float f3) {
        this.f27219a = str;
        this.b = str2;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm9)) {
            return false;
        }
        pm9 pm9Var = (pm9) obj;
        return this.f27219a.equals(pm9Var.f27219a) && this.b.equals(pm9Var.b) && Float.compare(this.c, pm9Var.c) == 0 && Float.compare(this.d, pm9Var.d) == 0 && Float.compare(this.e, pm9Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + defpackage.c.a(defpackage.c.a(ua80.b(this.f27219a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CalendarTournamentDotaHeroModel(name=", this.f27219a, ", imageS3=", this.b, ", winPercentage=");
        vqd.v(sbN, this.c, ", pickPercentage=", this.d, ", banPercentage=");
        return kng0.o(sbN, this.e, Separators.RPAREN);
    }
}
