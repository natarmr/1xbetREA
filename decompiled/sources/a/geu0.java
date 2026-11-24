package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class geu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eeu0 f11174a;
    public final eeu0 b;
    public final String c;
    public final String d;

    public geu0(eeu0 eeu0Var, eeu0 eeu0Var2, String str, String str2) {
        this.f11174a = eeu0Var;
        this.b = eeu0Var2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof geu0)) {
            return false;
        }
        geu0 geu0Var = (geu0) obj;
        return this.f11174a == geu0Var.f11174a && this.b == geu0Var.b && this.c.equals(geu0Var.c) && this.d.equals(geu0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b((this.b.hashCode() + (this.f11174a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VictoryFormulaZip(firstPlayerFormula=");
        sb.append(this.f11174a);
        sb.append(", secondPlayerFormula=");
        sb.append(this.b);
        sb.append(", firstPlayerNumbers=");
        return ua80.m(sb, this.c, ", secondPlayerNumbers=", this.d, Separators.RPAREN);
    }
}
