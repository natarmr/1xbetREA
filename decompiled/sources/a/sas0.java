package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class sas0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31900a;
    public final String b;
    public final fas0 c;
    public final int d;
    public final boolean e;

    public sas0(long j, String str, fas0 fas0Var, int i, boolean z) {
        this.f31900a = j;
        this.b = str;
        this.c = fas0Var;
        this.d = i;
        this.e = z;
    }

    public static sas0 a(sas0 sas0Var, fas0 fas0Var, boolean z, int i) {
        long j = sas0Var.f31900a;
        String str = sas0Var.b;
        if ((i & 4) != 0) {
            fas0Var = sas0Var.c;
        }
        fas0 fas0Var2 = fas0Var;
        int i2 = sas0Var.d;
        if ((i & 16) != 0) {
            z = sas0Var.e;
        }
        sas0Var.getClass();
        return new sas0(j, str, fas0Var2, i2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sas0)) {
            return false;
        }
        sas0 sas0Var = (sas0) obj;
        return this.f31900a == sas0Var.f31900a && this.b.equals(sas0Var.b) && this.c.equals(sas0Var.c) && this.d == sas0Var.d && this.e == sas0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + twn.a(this.d, (this.c.hashCode() + ua80.b(Long.hashCode(this.f31900a) * 31, 31, this.b)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f31900a, "TournamentsProvidersState(tournamentId=", ", tournamentTitle=", this.b);
        sbO.append(", contentState=");
        sbO.append(this.c);
        sbO.append(", lottieTypeId=");
        sbO.append(this.d);
        return f140.n(sbO, ", hasPendingParticipateAction=", this.e, Separators.RPAREN);
    }
}
