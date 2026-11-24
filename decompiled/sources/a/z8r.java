package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z8r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43982a;
    public final uk10 b;

    public z8r(uk10 uk10Var, String str) {
        this.f43982a = str;
        this.b = uk10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8r)) {
            return false;
        }
        z8r z8rVar = (z8r) obj;
        return this.f43982a.equals(z8rVar.f43982a) && this.b == z8rVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43982a.hashCode() * 31);
    }

    public final String toString() {
        return "FruitBlastBonusModel(description=" + this.f43982a + ", bonusType=" + this.b + Separators.RPAREN;
    }
}
