package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rod implements sod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gdp0 f30831a;
    public final gdp0 b;
    public final s5h0 c;
    public final j83 d;

    public rod(gdp0 gdp0Var, gdp0 gdp0Var2, s5h0 s5h0Var, j83 j83Var) {
        this.f30831a = gdp0Var;
        this.b = gdp0Var2;
        this.c = s5h0Var;
        this.d = j83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rod)) {
            return false;
        }
        rod rodVar = (rod) obj;
        return this.f30831a.equals(rodVar.f30831a) && this.b.equals(rodVar.b) && this.c.equals(rodVar.c) && this.d.equals(rodVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f30831a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SpreadSheetScore(teamOne=" + this.f30831a + ", teamTwo=" + this.b + ", score=" + this.c + ", matchInfo=" + ((Object) this.d) + Separators.RPAREN;
    }
}
