package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zzp0 {
    public static final zzp0 c = new zzp0(0, lg30.c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45266a;
    public final lg30 b;

    public zzp0(int i, lg30 lg30Var) {
        this.f45266a = i;
        this.b = lg30Var;
    }

    public static zzp0 a(zzp0 zzp0Var, int i, lg30 lg30Var, int i2) {
        if ((i2 & 1) != 0) {
            i = zzp0Var.f45266a;
        }
        if ((i2 & 2) != 0) {
            lg30Var = zzp0Var.b;
        }
        zzp0Var.getClass();
        return new zzp0(i, lg30Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzp0)) {
            return false;
        }
        zzp0 zzp0Var = (zzp0) obj;
        return this.f45266a == zzp0Var.f45266a && this.b == zzp0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f45266a) * 31);
    }

    public final String toString() {
        return "TennisWinLossFiltersModel(selectedSeason=" + this.f45266a + ", selectedMatchType=" + this.b + Separators.RPAREN;
    }
}
