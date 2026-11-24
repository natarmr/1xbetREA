package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z2b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43662a;
    public final int b;
    public final double c;
    public final double d;
    public final String e;
    public final double f;
    public final int g;

    public z2b(double d, double d2, double d3, int i, int i2, String str, String str2) {
        this.f43662a = str;
        this.b = i;
        this.c = d;
        this.d = d2;
        this.e = str2;
        this.f = d3;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2b)) {
            return false;
        }
        z2b z2bVar = (z2b) obj;
        return this.f43662a.equals(z2bVar.f43662a) && this.b == z2bVar.b && Double.compare(this.c, z2bVar.c) == 0 && Double.compare(this.d, z2bVar.d) == 0 && this.e.equals(z2bVar.e) && Double.compare(this.f, z2bVar.f) == 0 && this.g == z2bVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + brm0.d(this.f, ua80.b(brm0.d(this.d, brm0.d(this.c, twn.a(this.b, this.f43662a.hashCode() * 31, 31), 31), 31), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "CategoriesModel(categoryNumber=", this.f43662a, ", guessed=", ", guessedInCurr=");
        sbP.append(this.c);
        ohs0.A(sbP, this.d, ", payoutOn1CurrUnit=", ", percent=");
        hne.A(sbP, this.e, ", prizeFund=", this.f);
        return vqd.p(sbP, ", pointsSum=", this.g, Separators.RPAREN);
    }
}
