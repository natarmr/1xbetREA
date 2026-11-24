package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sf8 implements tf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csr f32104a;
    public final je8 b;

    public sf8(csr csrVar, je8 je8Var) {
        this.f32104a = csrVar;
        this.b = je8Var;
    }

    @Override // a.tf8
    public final csr a() {
        return this.f32104a;
    }

    @Override // a.tf8
    public final je8 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf8)) {
            return false;
        }
        sf8 sf8Var = (sf8) obj;
        return this.f32104a.equals(sf8Var.f32104a) && this.b == sf8Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32104a.hashCode() * 31);
    }

    public final String toString() {
        return "WildFreeBetBonus(gameBonus=" + this.f32104a + ", bonusFilterType=" + this.b + Separators.RPAREN;
    }
}
