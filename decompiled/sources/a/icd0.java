package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class icd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14532a;
    public final aue0 b;

    public icd0(long j, aue0 aue0Var) {
        aue0Var.getClass();
        this.f14532a = j;
        this.b = aue0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icd0)) {
            return false;
        }
        icd0 icd0Var = (icd0) obj;
        return this.f14532a == icd0Var.f14532a && this.b == icd0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f14532a) * 31);
    }

    public final String toString() {
        return "PromoShop(bonusGameId=" + this.f14532a + ", registrationDefaultBonus=" + this.b + Separators.RPAREN;
    }
}
