package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class low {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20410a;
    public final boolean b;
    public final boolean c;
    public final gow d;

    public low(boolean z, boolean z2, boolean z3, gow gowVar) {
        this.f20410a = z;
        this.b = z2;
        this.c = z3;
        this.d = gowVar;
    }

    public static low a(low lowVar, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            z2 = lowVar.b;
        }
        boolean z3 = (i & 4) != 0 ? lowVar.c : true;
        gow gowVar = lowVar.d;
        lowVar.getClass();
        return new low(z, z2, z3, gowVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof low)) {
            return false;
        }
        low lowVar = (low) obj;
        return this.f20410a == lowVar.f20410a && this.b == lowVar.b && this.c == lowVar.c && this.d.equals(lowVar.d);
    }

    public final int hashCode() {
        return this.d.f11654a.hashCode() + brm0.e(brm0.e(Boolean.hashCode(this.f20410a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("HorseRacesStatisticState(isLoading=", ", isError=", ", isEmpty=", this.f20410a, this.b);
        sbQ.append(this.c);
        sbQ.append(", horseRacesStatisticModel=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
