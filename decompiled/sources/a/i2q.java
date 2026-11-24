package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i2q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14063a;
    public final int b;
    public final djk0 c;

    public i2q(boolean z, int i, djk0 djk0Var) {
        this.f14063a = z;
        this.b = i;
        this.c = djk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2q)) {
            return false;
        }
        i2q i2qVar = (i2q) obj;
        return this.f14063a == i2qVar.f14063a && this.b == i2qVar.b && this.c.equals(i2qVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Boolean.hashCode(this.f14063a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbT = ohs0.t(this.b, "Social(isRequired=", ", socialTypeId=", ", socialRegistrationModel=", this.f14063a);
        sbT.append(this.c);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
