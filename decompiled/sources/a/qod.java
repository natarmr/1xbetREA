package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qod implements sod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gdp0 f29069a;
    public final gdp0 b;
    public final j83 c;
    public final j83 d;

    public qod(gdp0 gdp0Var, gdp0 gdp0Var2, j83 j83Var, j83 j83Var2) {
        this.f29069a = gdp0Var;
        this.b = gdp0Var2;
        this.c = j83Var;
        this.d = j83Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qod)) {
            return false;
        }
        qod qodVar = (qod) obj;
        return this.f29069a.equals(qodVar.f29069a) && this.b.equals(qodVar.b) && this.c.equals(qodVar.c) && this.d.equals(qodVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.f(this.c, (this.b.hashCode() + (this.f29069a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "SimpleScore(teamOne=" + this.f29069a + ", teamTwo=" + this.b + ", score=" + ((Object) this.c) + ", matchInfo=" + ((Object) this.d) + Separators.RPAREN;
    }
}
