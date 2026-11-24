package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rf8 implements tf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csr f30373a;
    public final je8 b;
    public final pbv c;

    public rf8(csr csrVar, je8 je8Var, pbv pbvVar) {
        this.f30373a = csrVar;
        this.b = je8Var;
        this.c = pbvVar;
    }

    @Override // a.tf8
    public final csr a() {
        return this.f30373a;
    }

    @Override // a.tf8
    public final je8 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf8)) {
            return false;
        }
        rf8 rf8Var = (rf8) obj;
        return this.f30373a.equals(rf8Var.f30373a) && this.b == rf8Var.b && this.c.equals(rf8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f30373a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BonusGameName(gameBonus=" + this.f30373a + ", bonusFilterType=" + this.b + ", gp=" + this.c + Separators.RPAREN;
    }
}
