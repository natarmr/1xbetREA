package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ob6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24962a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final String f;

    public ob6(int i, int i2, boolean z, int i3, long j, String str) {
        this.f24962a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = j;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob6)) {
            return false;
        }
        ob6 ob6Var = (ob6) obj;
        return this.f24962a == ob6Var.f24962a && this.b == ob6Var.b && this.c == ob6Var.c && this.d == ob6Var.d && this.e == ob6Var.e && this.f.equals(ob6Var.f);
    }

    public final int hashCode() {
        return Integer.hashCode(22) + twn.a(1357, ua80.b(rw2.b(twn.a(1, twn.a(this.d, brm0.e(twn.a(this.b, twn.a(this.f24962a, Integer.hashCode(10) * 31, 31), 31), 31, this.c), 31), 31), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("BestGamesParamsModel(count=10, fcountryId=", this.f24962a, ", countryId=", ", cutCoef=", this.b);
        ua80.q(this.d, ", cfViewTypeId=", ", refId=1, userId=", sbT, this.c);
        kng0.z(sbT, this.e, ", lang=", this.f);
        sbT.append(", groupId=1357, whence=22)");
        return sbT.toString();
    }
}
