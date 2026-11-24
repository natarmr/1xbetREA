package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gqd {
    public static final ek5 d = new ek5(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11727a;
    public final zmk0 b;
    public final zmk0 c;

    public gqd(String str, zmk0 zmk0Var, zmk0 zmk0Var2) {
        this.f11727a = str;
        this.b = zmk0Var;
        this.c = zmk0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqd)) {
            return false;
        }
        gqd gqdVar = (gqd) obj;
        return this.f11727a.equals(gqdVar.f11727a) && this.b.equals(gqdVar.b) && this.c.equals(gqdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + axq.b(this.b, this.f11727a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CompressedPeriodInfoUiModel(period=" + this.f11727a + ", teamOneScore=" + this.b + ", teamTwoScore=" + this.c + Separators.RPAREN;
    }
}
