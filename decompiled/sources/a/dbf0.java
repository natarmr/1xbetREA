package a;

/* JADX INFO: loaded from: classes5.dex */
public final class dbf0 implements lbf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5802a;
    public final int b;
    public final long c;
    public final boolean d;

    public dbf0(int i, int i2, long j, boolean z) {
        this.f5802a = i;
        this.b = i2;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbf0)) {
            return false;
        }
        dbf0 dbf0Var = (dbf0) obj;
        return this.f5802a == dbf0Var.f5802a && this.b == dbf0Var.b && this.c == dbf0Var.c && this.d == dbf0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(1357) + brm0.e(rw2.b(twn.a(this.b, Integer.hashCode(this.f5802a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("ShowChooseBonusDialog(selectedBonusId=", this.f5802a, ", countryId=", ", currencyId=", this.b);
        hne.t(this.c, ", showRules=", sbT, this.d);
        sbT.append(", groupId=1357)");
        return sbT.toString();
    }
}
