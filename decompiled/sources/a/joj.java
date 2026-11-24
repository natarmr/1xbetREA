package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class joj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16860a;
    public final aue0 b;

    public joj(long j, aue0 aue0Var) {
        aue0Var.getClass();
        this.f16860a = j;
        this.b = aue0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joj)) {
            return false;
        }
        joj jojVar = (joj) obj;
        return this.f16860a == jojVar.f16860a && this.b == jojVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + rw2.b(Boolean.hashCode(false) * 31, 31, this.f16860a);
    }

    public final String toString() {
        return "PromoShop(hasBackStack=false, bonusGameId=" + this.f16860a + ", registrationDefaultBonus=" + this.b + Separators.RPAREN;
    }
}
