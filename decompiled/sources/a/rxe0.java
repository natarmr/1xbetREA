package a;

/* JADX INFO: loaded from: classes5.dex */
public final class rxe0 implements zxe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31262a;
    public final int b;
    public final long c;
    public final boolean d;

    public rxe0(int i, int i2, long j, boolean z) {
        this.f31262a = i;
        this.b = i2;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxe0)) {
            return false;
        }
        rxe0 rxe0Var = (rxe0) obj;
        return this.f31262a == rxe0Var.f31262a && this.b == rxe0Var.b && this.c == rxe0Var.c && this.d == rxe0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(1357) + brm0.e(rw2.b(twn.a(this.b, Integer.hashCode(this.f31262a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("ShowChooseBonusDialog(selectedBonusId=", this.f31262a, ", countryId=", ", currencyId=", this.b);
        hne.t(this.c, ", showRules=", sbT, this.d);
        sbT.append(", groupId=1357)");
        return sbT.toString();
    }
}
